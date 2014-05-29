//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @author adanbalderas
 * Modified by Jorge Ruiz Aquino / 23-06-2012
 */
public class DatasetExcelParser {

	/**
	 * Generate a list of data sets from the Excel data source
	 * @param xlFilePath path to the Excel data source
	 * @param sheetName
	 * @param tableName
	 * @return
	 * @throws Exception
	 */
	public static List<Map<String, String>> getTableArray(String xlFilePath,
			String sheetName, String tableName) throws Exception {
		List<Map<String, String>> dataSetList = new ArrayList<Map<String, String>>();
		String[][] tabArray = null;

		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, row, column;
		Cell tableStart = sheet.findCell(tableName);
		startRow = tableStart.getRow();
		startCol = tableStart.getColumn();

		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1,
				100, 64000, false);

		endRow = tableEnd.getRow();
		endCol = tableEnd.getColumn();
		String[] columnNames = new String[endCol - startCol - 1];

		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		row = 0;

		int colPos = 0;
		for (int j = startCol + 1; j < endCol; j++, colPos++) {
			columnNames[colPos] = sheet.getCell(j, startRow).getContents();
		}

		for (int i = startRow + 1; i < endRow; i++, row++) {
			column = 0;
			Map<String, String> keyPairs = new HashMap<String, String>();
			for (int j = startCol + 1; j < endCol; j++, column++) {
				tabArray[row][column] = sheet.getCell(j, i).getContents();
				keyPairs.put(columnNames[column], tabArray[row][column]);
			}
			dataSetList.add(keyPairs);
		}

		return dataSetList;
	}

	/**
	 * Generate a list of data sets from the Excel data source
	 * @param xlFilePath path to the Excel data source
	 * @return
	 * @throws Exception
	 */
	public static List<Map<String, String>> getTableArray(String xlFilePath) throws Exception {
		return getTableArray(xlFilePath, "DataPool", "dataTable");
	}
}
