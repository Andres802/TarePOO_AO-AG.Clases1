/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarepoo_ao.ag.clases;

import java.util.Scanner;

/**
 *
 * @author ochoa
 */
public class Auto {

    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindraje;
    Propietario owner;
    LugarMatriculacion lol;

    public String mostrarInfo() {

        var retorno = "El auto tiene placa "
                + this.placa + " es de marca " + this.marca + " y el propietario es: "
                + owner.nombre + ", el auto cuesta " + this.precio + " USD y es modelo: " + this.year
                + " El color es: " + this.color + " la direccion es:" + owner.direccion + ", la matricula se hace en la provincia de " + lol.provincia + " en la ciudad de "
                + lol.ciudad + " la descripcion es " + lol.descripcion + " su numero de telefono para la matricula es" + lol.telefono;

        return retorno;
    }

    public String getProvincia() {

        var retorno = "";
        var primeraLetra = "";
        primeraLetra = this.placa.substring(0, 1);

        switch (primeraLetra) {
            case "A":
                retorno = "Azuay";
                break;
            case "P":
                retorno = "Pichincha";
                break;
            case "G":
                retorno = "Guayas";
                break;
            case "U":
                retorno = "Canar";
                break;

            default:
                retorno = "no definido";

        }

        return retorno;
    }

    public String getPaisMarca() {

        var retorno = "";

        if (this.marca.equals("Chevrolet")) {
            retorno = "EEUU";

        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                if (this.marca.equals("Mercedes Benz")) {
                    retorno = "Alemania";
                } else {
                    if (this.marca.equals("FIAT")) {
                        retorno = "Italia ";
                    } else {
                        if (this.marca.equals("Jetour")) {
                            retorno = "China";
                        } else {
                            retorno = "no definido";
                        }
                    }
                }
            }
        }

        return retorno;
    }

    public int getNumeroContinente() {

        var retorno = 0;
        var marcaPais = this.getPaisMarca();

        switch (marcaPais) {

            case "EEUU":
                retorno = 2;
                break;
            case "Japon":
                retorno = 3;
                break;
            case "China":
                retorno = 4;
                break;
            case "Italia":
                retorno = 5;
                break;
            case "Alemania":
                retorno = 6;
                break;
            default:
                retorno = 0;

        }

        return retorno;
    }

    public double calcularIva() {
        var retorno = 0.0d;
        retorno = this.precio * 12;

        return retorno;
    }

    public int calcularEdad(int yearActual) {
        var retorno = 0;

        retorno = yearActual - this.year;

        return retorno;
    }

    // 10% por cada year // 
    //la depreciacion no puede exceder el precio//+
    public double calcularDepreciacion(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        retorno = edad * 0.1 * this.precio;

        return retorno;

    }

    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);

        return retorno;
    }

    public boolean sePuedeAsegurar(int yearActual) {
        var retorno = false;
        var edad = this.calcularEdad(yearActual);
        if (edad <= 5 && this.precio < 1000) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    public boolean esTaxi() {
        var retorno = false;

        if (this.color == "Amarillo") {
            retorno = true;
        } else {
        }

        return retorno;

    }

    public boolean esClasico(int yearActual, int yearClasic0) {

        var retorno = false;

        return retorno;
    }

    /*
    Edad >20 : tasa solidaria 0
    Edad 0-5 y cilindraje >1500 < 2000 : tasa solidaria 20%costo
    Edad 0-5 y cilindraje > 2000 : tasa solidaria 25% costo
    Edad 5-15 y cilindraje <1500 : tasa solidaria 10% costo
    Edad 5-15 y cilindraje >1500< 2000 : tasa solidaria 15% costo
    Edad 15-20 y cilindraje > 2000 : tasa solidaria 25% costo
     */
    public int calcularTasaSolidaria(int yearActual, double limitePrecio) {
        var retorno = 0;
        var edad = this.calcularEdad(yearActual);
        if (edad > 20) {
            var result = 0 * limitePrecio;
            System.out.println("--" + result);
        } else {

        }

        if (edad > 0 && 5 > edad) {
            if (this.cilindraje > 1500 && this.cilindraje < 2000) {
                var result1 = 0.25 * limitePrecio;
                System.out.println("--" + result1);

            } else {

            }

        } else {

        }

        return retorno;
    }

    public boolean esPlacaValida() {

        var retorno = false;
        var longitud = this.placa.length();
        if (longitud != 7) {
            var caracter1 = this.placa.charAt(0);
            var caracter2 = this.placa.charAt(1);
            var caracter3 = this.placa.charAt(2);
            var caracter4 = this.placa.charAt(3);
            var caracter5 = this.placa.charAt(4);
            var caracter6 = this.placa.charAt(5);

            if (Character.isDigit(caracter6) && Character.isDigit(caracter5) && Character.isDigit(caracter4) && Character.isDigit(caracter3) && Character.isDigit(caracter2) && Character.isLetter(caracter1)) {
                retorno = true;
            }

        } else {

        }

        return retorno;
    }
}
