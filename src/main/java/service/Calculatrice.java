package service;

import jakarta.jws.WebService;

@WebService(
        serviceName = "CalculatriceWS",
        portName = "CalculatriceWSPort",
        endpointInterface = "service.ICalculatrice",
        targetNamespace = "http://service.calculatrice/"
)
public class Calculatrice implements ICalculatrice {

    @Override
    public double somme(double a, double b) {
        return a + b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double soustraction(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "La division par zero est impossible."
            );
        }
        return a / b;
    }
}