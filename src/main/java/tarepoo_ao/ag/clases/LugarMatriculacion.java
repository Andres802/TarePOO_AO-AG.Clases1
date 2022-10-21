/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarepoo_ao.ag.clases;

/**
 *
 * @author ochoa
 */
public class LugarMatriculacion {
    String descripcion;
    String telefono;
    String provincia;
    String ciudad;
    
    public String mostrarInfo(){
        
        var retorno =" La descripcion de la matricula es" + this.descripcion  + " el numero de telefono es " + this.telefono + " se puede matricular en la provincia de " + this.provincia + " en la ciudad de " + this.ciudad;
        
        
        return retorno;
    }
    
    
}
