import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;


public class PrimeraLetraMinuscula {

	public static void main(String[] args) throws IOException {
		String rutaArchivo = "E:/dev/projects/titulacion/sources/dtf2/dtf-generator-maven-plugin/src/main/resources/command-lists/comandos-actionOptions";
		File ar = new File(rutaArchivo);
		List<String> lineas = FileUtils.readLines(ar);
		for (String linea : lineas) {
			String lineaUncap = WordUtils.capitalize(linea);
			System.out.println(lineaUncap);
		}
	}

}
