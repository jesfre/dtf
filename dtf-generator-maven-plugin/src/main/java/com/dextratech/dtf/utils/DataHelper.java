//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import nl.flotsam.xeger.Xeger;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.xml.testsuite.Function;
import com.dextratech.dtf.xml.testsuite.FunctionType;

/**
 * This class is used to generate default data for tests.
 * @author by <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino</a>
 *         07/05/2013
 *         Based on DataHelper from Appfuse
 */
public class DataHelper {
	private static final Log log = LogFactory.getLog(DataHelper.class);
	private static final int DEFAULT_MAXLENGTH = 5;
	private static final String DEFAULT_DATE_PATTERN = "dd/MM/yyyy";
	/**
	 * @see <a href="http://www.mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/">Email Address Regular Expression</a>
	 */
	private static final String DEFAULT_EMAIL_PATTERN = "([_A-Za-z0-9-]+){5}@[A-Za-z0-9-]{5}(\\.[A-Za-z]{2,})$";
	private static final String DEFAULT_PHONE_PATTERN = "\\d{3}-\\d{7}";

	/**
	 * Generates a random value according to the type of the function evaluated.
	 * @param function
	 * @return
	 */
	public static String getTestValue(Function function) {
		FunctionType fnType = function.getType();
		if (function.getValue() != null) {
			return function.getValue();
		}
		String finalValue = "";
		Integer length = function.getLength();
		Double minValueDbl = function.getMinValue();
		Double maxValueDbl = function.getMaxValue();
		String pattern = function.getPattern();
		String dateFormat = function.getDateFormat();
		String customDateFormat = function.getCustomDateFormat();
		Date date = null;

		switch (fnType) {
		case INTEGER:
		case FLOAT:
			finalValue = getNumber(fnType, length, minValueDbl, maxValueDbl);
			break;
		case STRING:
			if (length != null) {
				finalValue = generateStringValue(length);
			} else if (pattern != null) {
				finalValue = generateStringByPattern(pattern);
			}
			break;
		case TODAY:
			date = new Date();
			break;
		case DATE:
		case DATE_TIME:
			date = randomDate();
			break;
		}

		switch (fnType) {
		case TODAY:
		case DATE:
		case DATE_TIME:
			String datePattern = null;
			if (customDateFormat != null) {
				datePattern = customDateFormat;
			} else if (dateFormat != null) {
				datePattern = dateFormat;
			} else {
				datePattern = DEFAULT_DATE_PATTERN;
			}
			finalValue = dateToString(date, datePattern);
		}

		return finalValue;
	}

	/**
	 * @param fnType
	 * @param finalValue
	 * @param length
	 * @param minValueDbl
	 * @param maxValueDbl
	 * @return
	 */
	private static String getNumber(FunctionType fnType, Integer length, Double minValueDbl, Double maxValueDbl) {
		String stringValue = "";
		if (length != null) {
			// If length=6, evaluates a random number from 0 to 999999
			String maxString = StringUtils.rightPad("", length, '9');
			BigDecimal max = new BigDecimal(maxString);
			double dblRnd = Math.random();
			BigDecimal rnd = new BigDecimal(dblRnd);
			// If fnType=INTEGER, convert value to an integer
			if (fnType == FunctionType.INTEGER) {
				BigInteger val = max.multiply(rnd).toBigInteger();
				stringValue = val.toString();
			} else {
				BigDecimal val = max.multiply(rnd);
				stringValue = val.toString();
			}
		} else if (minValueDbl != null && maxValueDbl != null) {
			Double toEvaluate = maxValueDbl.doubleValue() - minValueDbl.doubleValue();
			double dblRnd = Math.random();
			Double val = toEvaluate * dblRnd;
			val += minValueDbl.doubleValue();
			BigDecimal big = new BigDecimal(val);
			// If fnType=INTEGER, convert value to an integer
			if (fnType == FunctionType.INTEGER) {
				stringValue = big.toBigInteger().toString();
			} else {
				stringValue = big.toString();
			}
		}
		return stringValue;
	}

	/**
	 * Generate a random value in a format that match a pattern and length.
	 * When a pattern and length params are not null, pattern will be primary.
	 * @param function a enum function value to determine the data type for generation (required)
	 * @param valueOrPattern a value/pattern to generate data
	 *        Required for EXPLICIT
	 *        Optional for DATE, EMAIL, PHONE, STRING
	 * @param length the length of the data value to generate
	 *        Required for STRING, but not when a pattern exists
	 *        Optional for INTEGER, FLOAT
	 * @return a generated string for the particular type
	 */
	private static String getTestValue(FunctionType fnType, String valueOrPattern, int length) {
		StringBuffer result = new StringBuffer();

		switch (fnType) {
		// case EMAIL:
		// if (valueOrPattern == null) {
		// valueOrPattern = DEFAULT_EMAIL_PATTERN;
		// }
		// String emailString = generateStringByPattern(valueOrPattern);
		// result.append(emailString);
		// break;
		// case PHONE:
		// if (valueOrPattern == null) {
		// valueOrPattern = DEFAULT_PHONE_PATTERN;
		// }
		// String phoneString = generateStringByPattern(valueOrPattern);
		// result.append(phoneString);
		// break;
		}

		return result.toString();
	}

	/**
	 * Generate a string with maxlength defined
	 * If maxlength is > 5000, then maxlength will be 5000.
	 * If maxlength is <= 0, then maxlength will be 5 by default.
	 * @param maxlength
	 * @return
	 */
	private static String generateStringValue(int maxlength) {
		if (maxlength > 5000) {
			log.warn("Length greater than 5000 characters, setting maxlength to 5000.");
			maxlength = 5000;
		} else if (maxlength <= 0) {
			maxlength = DEFAULT_MAXLENGTH;
		}

		StringBuffer result = new StringBuffer("");
		for (int i = 0; (i < maxlength); i++) {
			int j = 0;
			if (i % 2 == 0) {
				j = (int) ((Math.random() * 26) + 65);
			} else {
				j = (int) ((Math.random() * 26) + 97);
			}
			result.append(Character.toString((char) j));
		}

		return result.toString();
	}

	/**
	 * Reverse engineering generated value with a regex pattern.
	 * @param pattern
	 * @return
	 */
	private static String generateStringByPattern(String pattern) {
		Xeger generator = new Xeger(pattern);
		String result = generator.generate();
		assert result.matches(pattern);
		return result;
	}

	private static String dateToString(Date aDate, String pattern) {
		if (pattern == null) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		SimpleDateFormat df;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(pattern);
			returnValue = df.format(aDate);
		}

		return returnValue;
	}

	/**
	 * Generates a random date from the year 1900 to the current year.
	 * @return
	 */
	private static Date randomDate() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int minYear = 1900;
		int maxYear = currentYear;

		int year = randomIntBetween(minYear, maxYear);
		int month = randomIntBetween(0, 11);

		GregorianCalendar gc = new GregorianCalendar(year, month, 1);
		// Gets a random day from the allowed days by the "month".
		int day = randomIntBetween(1, gc.getActualMaximum(gc.DAY_OF_MONTH));
		gc.set(year, month, day);
		return gc.getTime();
	}

	/**
	 * Generates an integer value in the range between start and end inputs.
	 * @param start
	 * @param end
	 * @return
	 */
	private static int randomIntBetween(int start, int end) {
		int mult = end - start;
		int randomOutRange = (int) Math.round(Math.random() * mult);
		int randomInRange = start + randomOutRange;
		return randomInRange;
	}
}
