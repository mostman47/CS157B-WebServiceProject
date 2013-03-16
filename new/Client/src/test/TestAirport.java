package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mr.nam
 */
public class TestAirport {

    public String getAirportByCountry(String Country) throws FileNotFoundException {
        String s = "";
        s = getAirportInfoByCountry(Country);
        
        return getAirport(s);
    }
 public String getAirportByCity(String city) throws FileNotFoundException {
        String s = "";
        s = getAirportInfoByCity(city);
        return getAirport(s);
    }
    private String getAirport(String s) throws FileNotFoundException {
if(s.contains("Data Not Found"))
        {
            System.out.println("Data Not Found");
            return null;
        }

        s = s.replaceAll("<NewDataSet", "<Airport xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
                + "xsi:noNamespaceSchemaLocation=\"airport.xsd\"");
        s = s.replaceAll("</NewDataSet", "</Airport");
        //s = s.replaceAll("<Airport", "<Airport xsi:noNamespaceSchemaLocation=\"airport.xsd\" ");
        s = s.replaceAll("<Table>", "<TableAirport>");
        s = s.replaceAll("</Table>", "</TableAirport>");

        if (!s.startsWith("<?xml")) {
            s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + s;
        }
        try {
            // Create file 
            FileWriter fstream = new FileWriter("airport.xml");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(s);
            //Close the output stream
            out.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        File xx = new File("airport.xml");
        JAXBUnMarshaller jaxbUnmarshaller = new JAXBUnMarshaller();
        jaxbUnmarshaller.unMarshallAirport(xx);
        return null;
    }

    private static String getAirportInfoByCity(java.lang.String city) {
        weatherairport.WeatherAirportWS_Service service = new weatherairport.WeatherAirportWS_Service();
        weatherairport.WeatherAirportWS port = service.getWeatherAirportWSPort();
        return port.getAirportInfoByCity(city);
    }

    private static String getAirportInfoByCountry(java.lang.String country) {
        weatherairport.WeatherAirportWS_Service service = new weatherairport.WeatherAirportWS_Service();
        weatherairport.WeatherAirportWS port = service.getWeatherAirportWSPort();
        return port.getAirportInfoByCountry(country);
    }
}
