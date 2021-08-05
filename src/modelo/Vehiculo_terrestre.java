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
public class Vehiculo_terrestre extends Vehiculo {
    private String peso, tipo_de_gasolina,llantas;

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo_de_gasolina() {
        return tipo_de_gasolina;
    }

    public void setTipo_de_gasolina(String tipo_de_gasolina) {
        this.tipo_de_gasolina = tipo_de_gasolina;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
    
    
    
}
