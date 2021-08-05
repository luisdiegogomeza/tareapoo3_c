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
public class Avion extends Vehiculo_aereo {
    private String tipo_de_avion, tipo_de_clases,numero_de_turbunas,puerta_emergencia;

    public String getTipo_de_avion() {
        return tipo_de_avion;
    }

    public void setTipo_de_avion(String tipo_de_avion) {
        this.tipo_de_avion = tipo_de_avion;
    }

    public String getTipo_de_clases() {
        return tipo_de_clases;
    }

    public void setTipo_de_clases(String tipo_de_clases) {
        this.tipo_de_clases = tipo_de_clases;
    }

    public String getNumero_de_turbunas() {
        return numero_de_turbunas;
    }

    public void setNumero_de_turbunas(String numero_de_turbunas) {
        this.numero_de_turbunas = numero_de_turbunas;
    }

    public String getPuerta_emergencia() {
        return puerta_emergencia;
    }

    public void setPuerta_emergencia(String puerta_emergencia) {
        this.puerta_emergencia = puerta_emergencia;
    }
    
    
    
}
