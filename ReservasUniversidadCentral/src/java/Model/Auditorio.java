/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javier
 */
public class Auditorio implements ITipoEspacio{
    
    private int idAuditorio;
    private String nombre;
    private String capacidad;
    
    
    

    @Override
    public String getCaracteristicas() {
        
        return "";
    }

    @Override
    public String getCapacidad() {
       
        return "";
    }

    @Override
    public boolean getDisponibilidad() {
         
        return true;
    }

    @Override
    public void clonar() {
      
        
    }
    
}
