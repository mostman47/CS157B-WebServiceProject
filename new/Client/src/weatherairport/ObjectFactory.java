
package weatherairport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weatherairport package. 
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

    private final static QName _GetAirportInfoByCity_QNAME = new QName("http://WeatherAirport/", "getAirportInfoByCity");
    private final static QName _GetWeatherOfCityResponse_QNAME = new QName("http://WeatherAirport/", "GetWeatherOfCityResponse");
    private final static QName _CitiesOfCountry_QNAME = new QName("http://WeatherAirport/", "CitiesOfCountry");
    private final static QName _GetWeatherOfCity_QNAME = new QName("http://WeatherAirport/", "GetWeatherOfCity");
    private final static QName _GetAirportInfoByCountry_QNAME = new QName("http://WeatherAirport/", "getAirportInfoByCountry");
    private final static QName _CitiesOfCountryResponse_QNAME = new QName("http://WeatherAirport/", "CitiesOfCountryResponse");
    private final static QName _GetAirportInfoByCountryResponse_QNAME = new QName("http://WeatherAirport/", "getAirportInfoByCountryResponse");
    private final static QName _GetAirportInfoByCityResponse_QNAME = new QName("http://WeatherAirport/", "getAirportInfoByCityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weatherairport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAirportInfoByCityResponse }
     * 
     */
    public GetAirportInfoByCityResponse createGetAirportInfoByCityResponse() {
        return new GetAirportInfoByCityResponse();
    }

    /**
     * Create an instance of {@link GetAirportInfoByCountryResponse }
     * 
     */
    public GetAirportInfoByCountryResponse createGetAirportInfoByCountryResponse() {
        return new GetAirportInfoByCountryResponse();
    }

    /**
     * Create an instance of {@link CitiesOfCountryResponse }
     * 
     */
    public CitiesOfCountryResponse createCitiesOfCountryResponse() {
        return new CitiesOfCountryResponse();
    }

    /**
     * Create an instance of {@link GetAirportInfoByCountry }
     * 
     */
    public GetAirportInfoByCountry createGetAirportInfoByCountry() {
        return new GetAirportInfoByCountry();
    }

    /**
     * Create an instance of {@link GetWeatherOfCity }
     * 
     */
    public GetWeatherOfCity createGetWeatherOfCity() {
        return new GetWeatherOfCity();
    }

    /**
     * Create an instance of {@link CitiesOfCountry }
     * 
     */
    public CitiesOfCountry createCitiesOfCountry() {
        return new CitiesOfCountry();
    }

    /**
     * Create an instance of {@link GetWeatherOfCityResponse }
     * 
     */
    public GetWeatherOfCityResponse createGetWeatherOfCityResponse() {
        return new GetWeatherOfCityResponse();
    }

    /**
     * Create an instance of {@link GetAirportInfoByCity }
     * 
     */
    public GetAirportInfoByCity createGetAirportInfoByCity() {
        return new GetAirportInfoByCity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportInfoByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "getAirportInfoByCity")
    public JAXBElement<GetAirportInfoByCity> createGetAirportInfoByCity(GetAirportInfoByCity value) {
        return new JAXBElement<GetAirportInfoByCity>(_GetAirportInfoByCity_QNAME, GetAirportInfoByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherOfCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "GetWeatherOfCityResponse")
    public JAXBElement<GetWeatherOfCityResponse> createGetWeatherOfCityResponse(GetWeatherOfCityResponse value) {
        return new JAXBElement<GetWeatherOfCityResponse>(_GetWeatherOfCityResponse_QNAME, GetWeatherOfCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitiesOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "CitiesOfCountry")
    public JAXBElement<CitiesOfCountry> createCitiesOfCountry(CitiesOfCountry value) {
        return new JAXBElement<CitiesOfCountry>(_CitiesOfCountry_QNAME, CitiesOfCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherOfCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "GetWeatherOfCity")
    public JAXBElement<GetWeatherOfCity> createGetWeatherOfCity(GetWeatherOfCity value) {
        return new JAXBElement<GetWeatherOfCity>(_GetWeatherOfCity_QNAME, GetWeatherOfCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportInfoByCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "getAirportInfoByCountry")
    public JAXBElement<GetAirportInfoByCountry> createGetAirportInfoByCountry(GetAirportInfoByCountry value) {
        return new JAXBElement<GetAirportInfoByCountry>(_GetAirportInfoByCountry_QNAME, GetAirportInfoByCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitiesOfCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "CitiesOfCountryResponse")
    public JAXBElement<CitiesOfCountryResponse> createCitiesOfCountryResponse(CitiesOfCountryResponse value) {
        return new JAXBElement<CitiesOfCountryResponse>(_CitiesOfCountryResponse_QNAME, CitiesOfCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportInfoByCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "getAirportInfoByCountryResponse")
    public JAXBElement<GetAirportInfoByCountryResponse> createGetAirportInfoByCountryResponse(GetAirportInfoByCountryResponse value) {
        return new JAXBElement<GetAirportInfoByCountryResponse>(_GetAirportInfoByCountryResponse_QNAME, GetAirportInfoByCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportInfoByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WeatherAirport/", name = "getAirportInfoByCityResponse")
    public JAXBElement<GetAirportInfoByCityResponse> createGetAirportInfoByCityResponse(GetAirportInfoByCityResponse value) {
        return new JAXBElement<GetAirportInfoByCityResponse>(_GetAirportInfoByCityResponse_QNAME, GetAirportInfoByCityResponse.class, null, value);
    }

}
