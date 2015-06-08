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
public class Elipse {
    private double semi_eixo_h;
    private double semi_eixo_v;
    
    public Elipse() {
    }

    public Elipse(double semi_eixo_h, double semi_eixo_v) {
        this.semi_eixo_h = semi_eixo_h;
        this.semi_eixo_v = semi_eixo_v;
    }
    
    public double getSemi_eixo_h() {
        return semi_eixo_h;
    }

    public void setSemi_eixo_h(double semi_eixo_h) {
        this.semi_eixo_h = semi_eixo_h;
    }

    public double getSemi_eixo_v() {
        return semi_eixo_v;
    }

    public void setSemi_eixo_v(double semi_eixo_v) {
        this.semi_eixo_v = semi_eixo_v;
    }

    //A = π * r * s 
    public double getArea() {
        return Math.PI * semi_eixo_h * semi_eixo_v;
    }
    
    // P= π [ 3(r+s)−√( (3r+s)(r+3s) ) ] 
    public double getPerimetro() {
        return Math.PI * (3 * (semi_eixo_h+semi_eixo_v) - Math.sqrt( (3*semi_eixo_h + semi_eixo_v) * (semi_eixo_h + 3*semi_eixo_v) ));
    }
}
