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
public class Salon implements ITipoEspacio{
    
    private int idSalon;
    private int numero;
    private int capacidad;
    
    
    public Salon(){}
    
    @Override
    public boolean getDisponibilidad(){
 
        return true;
    }

    @Override
    public String getCaracteristicas() {
       
        return "";
    }

    @Override
    public String getCapacidad() {

        return "";
    }

    @Override
    public void clonar() {
        
        
    }
    
    
}
