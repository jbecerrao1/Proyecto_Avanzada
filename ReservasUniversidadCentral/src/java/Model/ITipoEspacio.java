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
public interface ITipoEspacio {
    
    
    public String getCaracteristicas();
    public String getCapacidad();
    public boolean getDisponibilidad();
    public void clonar();
    
}
