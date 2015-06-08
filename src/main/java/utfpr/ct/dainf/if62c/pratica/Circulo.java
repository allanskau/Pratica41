/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author allan
 */
public class Circulo extends Elipse {

    public double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        super(raio, raio);
    }
    
    public double getRaio() {
        return super.getSemi_eixo_h();
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    // P = 2 * Pi * r
    @Override
    public double getPerimetro() {
        return (2 * Math.PI * getRaio());
    }
}
