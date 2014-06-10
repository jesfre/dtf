//
// Developed by Dextra Technologies www.dextratech.com
//
package com.dextratech.dtf.exception;

import java.text.MessageFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dextratech.dtf.common.SeleniumCommand;

/**
 * @author <a href="mailto:jorge.ruiz.aquino@gmail.com">Jorge Ruiz Aquino<a>
 *         06/12/2012
 */
public class NoErrorOccurredException extends DextraSeleniumException {
	private static Log log = LogFactory.getLog(NoErrorOccurredException.class);

	private static final long serialVersionUID = 1L;

	public NoErrorOccurredException(SeleniumCommand[] expectedToFailCommands, SeleniumCommand testingCommand) {
		super("");
		setExceptionMessage(expectedToFailCommands, testingCommand);
	}

	/**
	 * @param message
	 * @param screenshotFile
	 * @param cmd
	 * @param args
	 */
	protected void setExceptionMessage(SeleniumCommand[] expectedToFailCommands, SeleniumCommand testingCommand) {
		String commonMessage = getCommonMessage(testingCommand);
		StringBuilder sb = new StringBuilder(commonMessage);
		sb.append("<br/>");
		sb.append("<table>");
		sb.append("	<tr>");
		sb.append("		<td>");
		sb.append("			<b>Unsuccessful test case expected but finished without errors.</b><br/>");
		sb.append("			The commands that expecting to be failed are listed below:");
		sb.append("		</td>");
		sb.append("	</tr>");
		sb.append("	<tr style='font-weight:normal;background-color:yellow;'>");
		sb.append("		<td>{0}</td>");
		sb.append("	</tr>");
		sb.append("</table>");
		StringBuilder expectedErrorSteps = new StringBuilder();
		for (SeleniumCommand com : expectedToFailCommands) {
			expectedErrorSteps.append("&nbsp;&nbsp;&nbsp;&nbsp;" + "Command [ " + com.getName() + ", " + com.getTarget() + ", " + com.getValue() + " ]" + "<br/>");
		}
		String tmpl = sb.toString();
		String html = MessageFormat.format(tmpl, expectedErrorSteps.toString());
		log.debug(html);
		this.exceptionMessage = html;
	}

	@Override
	public String getMessage() {
		return exceptionMessage;
	}

	public void setMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
