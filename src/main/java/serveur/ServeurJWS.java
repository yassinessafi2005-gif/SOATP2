package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {
        String adresse = "http://localhost:8080/calculatrice";

        Endpoint.publish(adresse, new Calculatrice());

        System.out.println("Service SOAP publie !");
        System.out.println("WSDL : " + adresse + "?wsdl");
        System.out.println("Laisse cette fenetre ouverte pendant le test.");
    }
}
