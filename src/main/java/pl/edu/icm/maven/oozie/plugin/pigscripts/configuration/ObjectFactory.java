//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.12 at 07:16:43 PM CET 
//


package pl.edu.icm.maven.oozie.plugin.pigscripts.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.icm.maven.oozie.plugin.pigscripts.configuration package. 
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

    private final static QName _OozieMavenPlugin_QNAME = new QName("", "oozie-maven-plugin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.icm.maven.oozie.plugin.pigscripts.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScriptHandlingType }
     * 
     */
    public ScriptHandlingType createScriptHandlingType() {
        return new ScriptHandlingType();
    }

    /**
     * Create an instance of {@link IncludesType }
     * 
     */
    public IncludesType createIncludesType() {
        return new IncludesType();
    }

    /**
     * Create an instance of {@link MainProjectPigType }
     * 
     */
    public MainProjectPigType createMainProjectPigType() {
        return new MainProjectPigType();
    }

    /**
     * Create an instance of {@link OozieMavenPluginType }
     * 
     */
    public OozieMavenPluginType createOozieMavenPluginType() {
        return new OozieMavenPluginType();
    }

    /**
     * Create an instance of {@link DepsProjectPigType }
     * 
     */
    public DepsProjectPigType createDepsProjectPigType() {
        return new DepsProjectPigType();
    }

    /**
     * Create an instance of {@link ExcludesType }
     * 
     */
    public ExcludesType createExcludesType() {
        return new ExcludesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OozieMavenPluginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "oozie-maven-plugin")
    public JAXBElement<OozieMavenPluginType> createOozieMavenPlugin(OozieMavenPluginType value) {
        return new JAXBElement<OozieMavenPluginType>(_OozieMavenPlugin_QNAME, OozieMavenPluginType.class, null, value);
    }

}
