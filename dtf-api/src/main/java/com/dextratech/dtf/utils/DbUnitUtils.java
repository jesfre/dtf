//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.dextratech.dtf.common.Constants;

/**
 * A util class with convenience methods for perform database unit testing operations.
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 * 10/12/2012
 */
public class DbUnitUtils {
	private static ApplicationContext ctx = new ClassPathXmlApplicationContext(Constants.APPLICATION_CONTEXT_XML);
	
	public static void cleanInsert() throws Exception {
		operation(DatabaseOperation.CLEAN_INSERT);
	}
	
	public static void operation(DatabaseOperation operation) throws Exception {
		operation.execute(getConnection(), getDataSet());
	}
	
	public static void export() throws FileNotFoundException, IOException, SQLException, DatabaseUnitException {
		IDataSet dataset = getConnection().createDataSet();
		String datasetFile = getProperty(Constants.PROP_DATASET_FILE);
		File file = new File(datasetFile);
		XmlDataSet.write(dataset, new FileOutputStream(file));
	}

	private static IDataSet getDataSet() throws Exception {
		String datasetFile = getProperty(Constants.PROP_DATASET_FILE);
		
		Resource res = ctx.getResource("file:"+datasetFile);
		InputStream inputStream = res.getInputStream();
		IDataSet dataset = new XmlDataSet(inputStream);
		return dataset;
	}

	private static IDatabaseConnection getConnection() throws SQLException, DatabaseUnitException  {
		Connection jdbcConnection = getDataSource().getConnection();
		IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
		return connection;
	}

	private static BasicDataSource getDataSource() {
		BasicDataSource ds = ctx.getBean("dataSource", BasicDataSource.class);
		return ds;
	}
	
	private static String getProperty(String property) throws IOException {
		Properties properties = new Properties();
		Resource res = ctx.getResource("classpath:"+Constants.CONFIGURATION_PROPERTIES);
		InputStream inputStream = res.getInputStream();
		properties.load(inputStream);
		String prop = properties.getProperty(Constants.PROP_DATASET_FILE);
		return prop;
	}
}
