//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.dextratech.dtf.layout.LayoutBuilder;

/**
 * Writes a new Excel file with the structure for a data set
 * 
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         17/07/2012
 */
public class DatasetExcelWriter {
	private static Log log = LogFactory.getLog(DatasetExcelWriter.class);

	private WritableWorkbook workbook;
	private String targetFile;
	private WritableCellFormat labelFormat;
	private WritableCellFormat format;

	public DatasetExcelWriter(String targetFilePath) {
		this.targetFile = targetFilePath;
		File file = new File(targetFile);

		try {
			File parent = file.getParentFile();
			if (parent != null) {
				// Creates parent folders if doesn't exist
				parent.mkdirs();
			}
			
			setFormats();
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			WorkbookSettings wbSettings = new WorkbookSettings();
			wbSettings.setLocale(Locale.getDefault());

			workbook = Workbook.createWorkbook(file, wbSettings);
			workbook.createSheet("DataPool", 0);
		} catch (FileNotFoundException e) {
			log.error("File not foud. Check if the file exists or if is used by another process.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a new dataset table layout from a list of keys
	 * 
	 * @param keys
	 * @throws Exception
	 */
	public void writeDataset(List<String> keys) throws Exception {
		int row = 0;
		int column = 0;
		String tableName = "dataTable";

		WritableSheet excelSheet = workbook.getSheet(0);

		addTableName(excelSheet, column, row, tableName);
		column++;

		// Aqui se crea el contenido del archivo
		for (String key : keys) {
			if (key != null) {
				// Comprueba si el contenido es un valor numerico para agregarun
				// un Number
				addLabel(excelSheet, column, row, key);
			} else {
				addLabel(excelSheet, column, row, "");
			}
			addLabelData(excelSheet, column, row + 1, "x");
			addLabelData(excelSheet, column, row + 2, "y");
			addLabelData(excelSheet, column, row + 3, "z");
			column++;
		}
		row += 4;

		addTableName(excelSheet, column, row, tableName);

		workbook.write();
		workbook.close();

	}

	private void addLabelData(WritableSheet sheet, int column, int row, String s)
			throws WriteException, RowsExceededException {
		Label label = new Label(column, row, s);
		sheet.addCell(label);
	}
	
	private void addLabel(WritableSheet sheet, int column, int row, String s)
			throws WriteException, RowsExceededException {
		Label label = new Label(column, row, s, labelFormat);
		sheet.addCell(label);
	}
	
	private void addTableName(WritableSheet sheet, int column, int row, String s)
			throws WriteException, RowsExceededException {
		Label label = new Label(column, row, s, format);
		sheet.addCell(label);
	}

	/**
	 * Creates cell formats for labels in the layout
	 * @throws WriteException
	 */
	private void setFormats() throws WriteException {
		// Lets create a format font
		WritableFont times10pt = new WritableFont(WritableFont.TIMES);
		times10pt.setColour(Colour.GRAY_25);
		// Define the cell format
		format = new WritableCellFormat(times10pt);
		// Lets automatically wrap the cells
		format.setWrap(false);
		
		// Create create a bold font with unterlines
		WritableFont times10ptBoldUnderline = new WritableFont(WritableFont.TIMES);
		times10ptBoldUnderline.setBoldStyle(WritableFont.BOLD);
		labelFormat = new WritableCellFormat(times10ptBoldUnderline);
		// Lets automatically wrap the cells
		labelFormat.setWrap(false);

		CellView cv = new CellView();
		cv.setFormat(format);
		cv.setFormat(labelFormat);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("valor1");
		list.add("valor2");
		list.add("valor3");
		list.add("valor4");
		list.add("valor5");
		try {
			new DatasetExcelWriter("C:/datos/midataset.xls").writeDataset(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
