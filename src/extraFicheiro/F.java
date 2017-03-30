/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraFicheiro;

/**
 *
 * @author ggarciamartinez
 */
public class F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Alumnos z = new Alumnos("fran",5);
        String fichero = "notas.dat";
        M a = new M();
        a.init();
        a.Añad(fichero);
        a.leer(fichero);
     }
    
}
