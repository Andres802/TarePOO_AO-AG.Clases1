/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarepoo_ao.ag.clases;

/**
 *
 * @author ochoa
 */
public class TarePOO_AOAGClases {

    public static void main(String[] args) {

        var propietario = new Propietario();
        propietario.nombre = "Juan Perez";
        propietario.direccion = "Paris y Olso";
        propietario.telefono = "0988669544";
        propietario.yearNacimiento = 1981;

        var propietario1 = new Propietario();
        propietario1.nombre = "Luis Messi";
        propietario1.direccion = "24 Mayo";
        propietario1.telefono = "098655654";
        propietario1.yearNacimiento = 1991;

        var propietario2 = new Propietario();
        propietario2.nombre = "Luis Enrique";
        propietario2.direccion = "Calle boston";
        propietario2.telefono = "0333444444";
        propietario2.yearNacimiento = 1988;

        var matri = new LugarMatriculacion();
        matri.ciudad = "Azogues";
        matri.descripcion = "Camioneta";
        matri.provincia = "Canar";
        matri.telefono = "0995884884";
        var matri1 = new LugarMatriculacion();
        matri1.ciudad = "Quito";
        matri1.descripcion = "Camiones";
        matri1.provincia = "Pichincha";
        matri1.telefono = "0995883333";
        var matri2 = new LugarMatriculacion();
        matri2.ciudad = "Cuenca";
        matri2.descripcion = "Carro";
        matri2.provincia = "Azuay";
        matri2.telefono = "0995884884";

        var auto = new Auto();
        auto.color = "Amarillo";
        auto.cilindraje = 1600;
        auto.marca = "Toyota";
        auto.placa = "AUB222";
        auto.precio = 10000;
        auto.year = 2002;
        auto.owner = propietario;
        auto.lol = matri;

        var auto1 = new Auto();
        auto1.color = "Azul";
        auto1.cilindraje = 1540;
        auto1.marca = "Jetour";
        auto1.placa = "FUB222";
        auto1.precio = 45000;
        auto1.year = 2010;
        auto1.owner = propietario1;
        auto1.lol = matri1;

        var auto2 = new Auto();
        auto2.color = "Rojo";
        auto2.cilindraje = 2000;
        auto2.marca = "Chevrolet";
        auto2.placa = "BCU222";
        auto2.precio = 39000;
        auto2.year = 2008;
        auto2.owner = propietario2;
        auto2.lol = matri2;

        System.out.println("auto = " + auto.mostrarInfo());
        System.out.println("auto1 = " + auto1.mostrarInfo());
        System.out.println("auto2 = " + auto2.mostrarInfo());
    }
}
