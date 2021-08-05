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
public class Helicoptero extends Vehiculo_aereo{
    private String tipo_de_helices, numero_de_helices, tipo_de_helicootero, capasidad_trasporte;

    public String getTipo_de_helices() {
        return tipo_de_helices;
    }

    public void setTipo_de_helices(String tipo_de_helices) {
        this.tipo_de_helices = tipo_de_helices;
    }

    public String getNumero_de_helices() {
        return numero_de_helices;
    }

    public void setNumero_de_helices(String numero_de_helices) {
        this.numero_de_helices = numero_de_helices;
    }

    public String getTipo_de_helicootero() {
        return tipo_de_helicootero;
    }

    public void setTipo_de_helicootero(String tipo_de_helicootero) {
        this.tipo_de_helicootero = tipo_de_helicootero;
    }

    public String getCapasidad_trasporte() {
        return capasidad_trasporte;
    }

    public void setCapasidad_trasporte(String capasidad_trasporte) {
        this.capasidad_trasporte = capasidad_trasporte;
    }
    
    
    
}
