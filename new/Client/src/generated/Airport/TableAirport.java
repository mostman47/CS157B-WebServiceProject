//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:58:47 PM PDT 
//


package generated.Airport;

import generated.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AirportCode"/>
 *         &lt;element ref="{}CityOrAirportName"/>
 *         &lt;element ref="{}Country"/>
 *         &lt;element ref="{}CountryAbbrviation"/>
 *         &lt;element ref="{}CountryCode"/>
 *         &lt;element ref="{}GMTOffset"/>
 *         &lt;element ref="{}RunwayLengthFeet"/>
 *         &lt;element ref="{}RunwayElevationFeet"/>
 *         &lt;element ref="{}LatitudeDegree"/>
 *         &lt;element ref="{}LatitudeMinute"/>
 *         &lt;element ref="{}LatitudeSecond"/>
 *         &lt;element ref="{}LatitudeNpeerS"/>
 *         &lt;element ref="{}LongitudeDegree"/>
 *         &lt;element ref="{}LongitudeMinute"/>
 *         &lt;element ref="{}LongitudeSeconds"/>
 *         &lt;element ref="{}LongitudeEperW"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TableAirport {

    @XmlElement(name = "AirportCode", required = true)
    protected String airportCode;
    @XmlElement(name = "CityOrAirportName", required = true)
    protected String cityOrAirportName;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "CountryAbbrviation", required = true)
    protected String countryAbbrviation;
    @XmlElement(name = "CountryCode")
    protected short countryCode;
    @XmlElement(name = "GMTOffset")
    protected byte gmtOffset;
    @XmlElement(name = "RunwayLengthFeet")
    protected short runwayLengthFeet;
    @XmlElement(name = "RunwayElevationFeet")
    protected short runwayElevationFeet;
    @XmlElement(name = "LatitudeDegree")
    protected byte latitudeDegree;
    @XmlElement(name = "LatitudeMinute")
    protected byte latitudeMinute;
    @XmlElement(name = "LatitudeSecond")
    protected byte latitudeSecond;
    @XmlElement(name = "LatitudeNpeerS", required = true)
    protected String latitudeNpeerS;
    @XmlElement(name = "LongitudeDegree")
    protected byte longitudeDegree;
    @XmlElement(name = "LongitudeMinute")
    protected byte longitudeMinute;
    @XmlElement(name = "LongitudeSeconds")
    protected byte longitudeSeconds;
    @XmlElement(name = "LongitudeEperW", required = true)
    protected String longitudeEperW;

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the cityOrAirportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrAirportName() {
        return cityOrAirportName;
    }

    /**
     * Sets the value of the cityOrAirportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrAirportName(String value) {
        this.cityOrAirportName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryAbbrviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAbbrviation() {
        return countryAbbrviation;
    }

    /**
     * Sets the value of the countryAbbrviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAbbrviation(String value) {
        this.countryAbbrviation = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     */
    public short getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     */
    public void setCountryCode(short value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the gmtOffset property.
     * 
     */
    public byte getGMTOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     */
    public void setGMTOffset(byte value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the value of the runwayLengthFeet property.
     * 
     */
    public short getRunwayLengthFeet() {
        return runwayLengthFeet;
    }

    /**
     * Sets the value of the runwayLengthFeet property.
     * 
     */
    public void setRunwayLengthFeet(short value) {
        this.runwayLengthFeet = value;
    }

    /**
     * Gets the value of the runwayElevationFeet property.
     * 
     */
    public short getRunwayElevationFeet() {
        return runwayElevationFeet;
    }

    /**
     * Sets the value of the runwayElevationFeet property.
     * 
     */
    public void setRunwayElevationFeet(short value) {
        this.runwayElevationFeet = value;
    }

    /**
     * Gets the value of the latitudeDegree property.
     * 
     */
    public byte getLatitudeDegree() {
        return latitudeDegree;
    }

    /**
     * Sets the value of the latitudeDegree property.
     * 
     */
    public void setLatitudeDegree(byte value) {
        this.latitudeDegree = value;
    }

    /**
     * Gets the value of the latitudeMinute property.
     * 
     */
    public byte getLatitudeMinute() {
        return latitudeMinute;
    }

    /**
     * Sets the value of the latitudeMinute property.
     * 
     */
    public void setLatitudeMinute(byte value) {
        this.latitudeMinute = value;
    }

    /**
     * Gets the value of the latitudeSecond property.
     * 
     */
    public byte getLatitudeSecond() {
        return latitudeSecond;
    }

    /**
     * Sets the value of the latitudeSecond property.
     * 
     */
    public void setLatitudeSecond(byte value) {
        this.latitudeSecond = value;
    }

    /**
     * Gets the value of the latitudeNpeerS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeNpeerS() {
        return latitudeNpeerS;
    }

    /**
     * Sets the value of the latitudeNpeerS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeNpeerS(String value) {
        this.latitudeNpeerS = value;
    }

    /**
     * Gets the value of the longitudeDegree property.
     * 
     */
    public byte getLongitudeDegree() {
        return longitudeDegree;
    }

    /**
     * Sets the value of the longitudeDegree property.
     * 
     */
    public void setLongitudeDegree(byte value) {
        this.longitudeDegree = value;
    }

    /**
     * Gets the value of the longitudeMinute property.
     * 
     */
    public byte getLongitudeMinute() {
        return longitudeMinute;
    }

    /**
     * Sets the value of the longitudeMinute property.
     * 
     */
    public void setLongitudeMinute(byte value) {
        this.longitudeMinute = value;
    }

    /**
     * Gets the value of the longitudeSeconds property.
     * 
     */
    public byte getLongitudeSeconds() {
        return longitudeSeconds;
    }

    /**
     * Sets the value of the longitudeSeconds property.
     * 
     */
    public void setLongitudeSeconds(byte value) {
        this.longitudeSeconds = value;
    }

    /**
     * Gets the value of the longitudeEperW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeEperW() {
        return longitudeEperW;
    }

    /**
     * Sets the value of the longitudeEperW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeEperW(String value) {
        this.longitudeEperW = value;
    }

}
