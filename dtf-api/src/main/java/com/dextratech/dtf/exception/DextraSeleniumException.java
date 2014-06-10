//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.exception;

import java.text.MessageFormat;

import org.apache.commons.lang.StringUtils;

import com.dextratech.dtf.common.SeleniumCommand;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         06/12/2012
 */
public class DextraSeleniumException extends Throwable {
	private static final long serialVersionUID = 1L;

	protected String exceptionMessage = null;

	public DextraSeleniumException(String message) {
		super(message);
		exceptionMessage = message;
	}

	public DextraSeleniumException(Exception e) {
		super(e);
		exceptionMessage = "";
	}

	public DextraSeleniumException(String message, String testName, String screenshotFile, String cmd, String target, String value, SeleniumCommand testingCommand) {
		super(message);
		setExceptionMessage(message, screenshotFile, cmd, target, value, testingCommand);
	}

	public DextraSeleniumException(Throwable e, String testName, String screenshotFile, String cmd, String target, String value, SeleniumCommand testingCommand) {
		super(e.getMessage());
		String message = null;
		if (e.getMessage() != null && !e.getMessage().equals("null")) {
			message = e.getMessage();
		} else {
			message = e.toString();
		}
		setExceptionMessage(message, screenshotFile, cmd, target, value, testingCommand);
	}

	/**
	 * @param message
	 * @param screenshotFile
	 * @param cmd
	 * @param target
	 * @param value
	 */
	private void setExceptionMessage(String message, String screenshotFile, String cmd, String target, String value, SeleniumCommand testingCommand) {
		String commonMessage = getCommonMessage(testingCommand);
		StringBuilder sb = new StringBuilder(commonMessage);
		sb.append("<br/>");
		sb.append("<table style='font-weight:bold;'>");
		sb.append("	<tr>");
		sb.append("		<td colspan='4'>{0}</td>");
		sb.append("	</tr>");
		sb.append("	<tr style='font-weight:normal;'>");
		sb.append("		<td>When running command</td>");
		sb.append("		<td>on element</td>");
		sb.append("		<td>with value</td>");
		sb.append("		<td></td>");
		sb.append("	</tr>");
		sb.append("	<tr style='background-color:yellow;'>");
		sb.append("		<td>{2}</td><td>{3}</td><td>{4}</td>");
		sb.append("		<td><a href=\"{1}\" alt=\"{1}\" target='_blank'>Screenshot</a></td>");
		sb.append("	</tr>");
		sb.append("</table>");
		String tmpl = sb.toString();
		String html = MessageFormat.format(tmpl, message, screenshotFile, cmd, target, value);
		System.out.println(html);
		this.exceptionMessage = html;
	}

	protected String getCommonMessage(SeleniumCommand testingCommand) {
		if (StringUtils.isBlank(testingCommand.getName()))
			return "";
		StringBuilder sb = new StringBuilder();
		sb.append("<br/><span style='margin-left:5px;'>");
		sb.append("Error when testing the field and value: <b><i>");
		// TODO mostrar el nombre del campo que esta siendo validado en este paso, en vez del target del comando.
		sb.append(testingCommand.getTarget());
		sb.append(" | ");
		sb.append(testingCommand.getValue());
		sb.append("</span></i></b>");
		return sb.toString();
	}

	@Override
	public String getMessage() {
		return exceptionMessage;
	}

	public void setMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
