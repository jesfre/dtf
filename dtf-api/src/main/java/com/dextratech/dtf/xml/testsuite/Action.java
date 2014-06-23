//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.23 a las 01:33:20 AM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Clase Java para Action complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="errorStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action")
@XmlSeeAlso({
    com.dextratech.dtf.xml.testsuite.ActionOption.AddLocationStrategy.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AddScript.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AddSelection.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AllowNativeXpath.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AnswerOnNextPrompt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AssignId.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Break.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Check.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ChooseCancelOnNextConfirmation.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ChooseOkOnNextConfirmation.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Close.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.CreateCookie.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DeleteAllVisibleCookies.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DeleteCookie.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DeselectPopUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DragAndDrop.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DragAndDropToObject.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Dragdrop.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.FireEvent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Focus.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Highlight.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.IgnoreAttributesWithoutValue.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Open.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.OpenWindow.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Pause.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.RemoveAllSelections.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.RemoveScript.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.RemoveSelection.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Rollup.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.RunScript.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Select.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SelectFrame.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SelectPopUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SelectWindow.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SetBrowserLogLevel.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SetCursorPosition.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SetMouseSpeed.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SetSpeed.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.SetTimeout.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Submit.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Type.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.TypeKeys.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Uncheck.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.UseXpathLibrary.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Click.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ClickAndWait.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ClickAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DoubleClick.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.DoubleClickAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ContextMenu.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ContextMenuAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseDownAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseDownRight.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseDownRightAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseMove.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseMoveAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseOut.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseOver.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseUpAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseUpRight.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MouseUpRightAt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.GoBack.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Refresh.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.WindowFocus.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.WindowMaximize.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.Store.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAlert.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAlertPresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllButtons.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllFields.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllLinks.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllWindowIds.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllWindowNames.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAllWindowTitles.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAttribute.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreAttributeFromAllWindows.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreBodyText.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreChecked.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreConfirmation.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreConfirmationPresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreCookie.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreCookieByName.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreCookiePresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreCursorPosition.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreEditable.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementHeight.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementIndex.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementPositionLeft.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementPositionTop.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementPresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreElementWidth.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreEval.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreExpression.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreHtmlSource.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreLocation.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreMouseSpeed.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StorePrompt.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StorePromptPresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedId.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedIds.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedIndex.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedIndexes.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedLabel.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedLabels.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedValue.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectedValues.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSelectOptions.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSomethingSelected.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreSpeed.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreTable.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreText.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreTextPresent.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreTitle.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreValue.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreVisible.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.StoreXpathCount.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AltKeyDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.AltKeyUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ControlKeyDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ControlKeyUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MetaKeyDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.MetaKeyUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ShiftKeyDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.ShiftKeyUp.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.KeyDown.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.KeyPress.class,
    com.dextratech.dtf.xml.testsuite.ActionOption.KeyUp.class
})
public class Action implements ToString
{

    @XmlAttribute(name = "errorStep")
    protected Boolean errorStep;

    /**
     * Obtiene el valor de la propiedad errorStep.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isErrorStep() {
        if (errorStep == null) {
            return false;
        } else {
            return errorStep;
        }
    }

    /**
     * Define el valor de la propiedad errorStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorStep(Boolean value) {
        this.errorStep = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theErrorStep;
            theErrorStep = ((this.errorStep!= null)?this.isErrorStep():false);
            strategy.appendField(locator, this, "errorStep", buffer, theErrorStep);
        }
        return buffer;
    }

}
