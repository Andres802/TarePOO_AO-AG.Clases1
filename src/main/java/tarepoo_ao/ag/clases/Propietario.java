/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarepoo_ao.ag.clases;

/**
 *
 * @author ochoa
 */
public class Propietario {
    
    String nombre;
    String telefono; 
    String direccion;
    int yearNacimiento;
    
    
    public String mostrarInfo(){
        
        return "El propietario se llama: "+ this.nombre + "  " + this.telefono  + "" + this.direccion + "" + this.yearNacimiento; 
        
    }
     public int calcularEdad(int yearActual) {
        var retorno = 0;

        retorno = yearActual - this.yearNacimiento;

        return retorno;
    }
    
}
