//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:00:02 PM PDT 
//
package generated.City;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the generated package.
 * <p>An ObjectFactory allows you to programatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cities_QNAME = new QName("", "Cities");
    private final static QName _TableCity_QNAME = new QName("", "TableCity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: generated
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cities }
     *
     */
    public Cities createCitiesType() {
        return new Cities();
    }

    /**
     * Create an instance of {@link TableCity }
     *
     */
    public TableCity createTableCityType() {
        return new TableCity();
    }

    @XmlElementDecl(namespace = "", name = "Cities")
    public JAXBElement<Cities> createCities(Cities value) {
        return new JAXBElement<Cities>(_Cities_QNAME, Cities.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "TableCity")
    public JAXBElement<TableCity> createTableCity(TableCity value) {
        return new JAXBElement<TableCity>(_TableCity_QNAME, TableCity.class, null, value);
    }
}
