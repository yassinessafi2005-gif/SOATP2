package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(
        name = "ICalculatrice",
        targetNamespace = "http://service.calculatrice/"
)
public interface ICalculatrice {

    @WebMethod(operationName = "somme")
    double somme(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod(operationName = "multiplication")
    double multiplication(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod(operationName = "soustraction")
    double soustraction(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod(operationName = "division")
    double division(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );
}
