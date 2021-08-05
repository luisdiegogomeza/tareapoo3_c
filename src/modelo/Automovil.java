/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LUIS
 */
public class Automovil extends Vehiculo_terrestre {
    private String capasidad, tipo_automovil, tipo_licencia;

    public String getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(String capasidad) {
        this.capasidad = capasidad;
    }

    public String getTipo_automovil() {
        return tipo_automovil;
    }

    public void setTipo_automovil(String tipo_automovil) {
        this.tipo_automovil = tipo_automovil;
    }

    public String getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }
    
    
    
}
