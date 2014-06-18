//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.17 a las 10:41:31 PM CDT 
//


package com.dextratech.dtf.xml.testsuite;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dextratech.dtf.xml.testsuite package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidationFunctions_QNAME = new QName("http://www.dextratech.com/testsuite", "validationFunctions");
    private final static QName _Components_QNAME = new QName("http://www.dextratech.com/testsuite", "components");
    private final static QName _Testsuite_QNAME = new QName("http://www.dextratech.com/testsuite", "testsuite");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dextratech.dtf.xml.testsuite
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Components }
     * 
     */
    public Components createComponents() {
        return new Components();
    }

    /**
     * Create an instance of {@link ValidationRules }
     * 
     */
    public ValidationRules createValidationRules() {
        return new ValidationRules();
    }

    /**
     * Create an instance of {@link Testsuite }
     * 
     */
    public Testsuite createTestsuite() {
        return new Testsuite();
    }

    /**
     * Create an instance of {@link ValidationFunction }
     * 
     */
    public ValidationFunction createValidationFunction() {
        return new ValidationFunction();
    }

    /**
     * Create an instance of {@link GenericCommand }
     * 
     */
    public GenericCommand createGenericCommand() {
        return new GenericCommand();
    }

    /**
     * Create an instance of {@link Function }
     * 
     */
    public Function createFunction() {
        return new Function();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link ValidFieldValue }
     * 
     */
    public ValidFieldValue createValidFieldValue() {
        return new ValidFieldValue();
    }

    /**
     * Create an instance of {@link Validation }
     * 
     */
    public Validation createValidation() {
        return new Validation();
    }

    /**
     * Create an instance of {@link FunctionRef }
     * 
     */
    public FunctionRef createFunctionRef() {
        return new FunctionRef();
    }

    /**
     * Create an instance of {@link Assertion }
     * 
     */
    public Assertion createAssertion() {
        return new Assertion();
    }

    /**
     * Create an instance of {@link Testcase }
     * 
     */
    public Testcase createTestcase() {
        return new Testcase();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link ValidationFunctionRef }
     * 
     */
    public ValidationFunctionRef createValidationFunctionRef() {
        return new ValidationFunctionRef();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ActionOption }
     * 
     */
    public ActionOption createActionOption() {
        return new ActionOption();
    }

    /**
     * Create an instance of {@link Onload }
     * 
     */
    public Onload createOnload() {
        return new Onload();
    }

    /**
     * Create an instance of {@link CaptureScreenshot }
     * 
     */
    public CaptureScreenshot createCaptureScreenshot() {
        return new CaptureScreenshot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dextratech.com/testsuite", name = "validationFunctions")
    public JAXBElement<ValidationRules> createValidationFunctions(ValidationRules value) {
        return new JAXBElement<ValidationRules>(_ValidationFunctions_QNAME, ValidationRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Components }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dextratech.com/testsuite", name = "components")
    public JAXBElement<Components> createComponents(Components value) {
        return new JAXBElement<Components>(_Components_QNAME, Components.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Testsuite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dextratech.com/testsuite", name = "testsuite")
    public JAXBElement<Testsuite> createTestsuite(Testsuite value) {
        return new JAXBElement<Testsuite>(_Testsuite_QNAME, Testsuite.class, null, value);
    }

}
