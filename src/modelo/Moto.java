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
public class Moto extends Vehiculo_terrestre {
    private String velocidades, tipo_cadena, tipo_llantas;

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    public String getTipo_cadena() {
        return tipo_cadena;
    }

    public void setTipo_cadena(String tipo_cadena) {
        this.tipo_cadena = tipo_cadena;
    }

    public String getTipo_llantas() {
        return tipo_llantas;
    }

    public void setTipo_llantas(String tipo_llantas) {
        this.tipo_llantas = tipo_llantas;
    }
    
    
    
}
