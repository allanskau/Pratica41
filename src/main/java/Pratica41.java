
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse elipse1 = new Elipse(10, 5);
        Circulo circulo1 = new Circulo(5);
        
        System.out.println("Area elipse = " + elipse1.getArea());
        System.out.println("Perimetro elipse = " + elipse1.getPerimetro());
        System.out.println("Area circulo = " + circulo1.getArea());
        System.out.println("Perimetro circulo = " + circulo1.getPerimetro());
        
        
        
    }
}
