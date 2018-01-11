
package boletin16;

import com.jose.Clase.Persoal;
import validarNota.validacion;

public class Boletin16 {


    public static void main(String[] args) {
        Persoal alum1 = new Persoal(311343,"sgsf");
        Academica alum2 = new Academica("paco",validacion.validarNota(),alum1);
        System.out.println(alum1.toString()+alum2.toString());
      
    }
    
}
