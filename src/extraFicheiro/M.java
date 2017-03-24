/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraFicheiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class M {
    ArrayList<Alumnos> notas = new ArrayList();
    ArrayList<Alumnos> ap = new ArrayList();
    ArrayList<Alumnos> sus = new ArrayList();
    PrintWriter fch;
    File fichero;
    Scanner sc;
    
    public void Añad(String nomFich, Alumnos x) {
        try{
            fichero = new File(nomFich);
            fch = new PrintWriter(fichero);
            for (int i = 0; i < notas.size(); i++) {
                fch.println(notas.get(i));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"error" + ex.getMessage());
        }finally{
            fch.close();
        }
    }
    
    public void leer(String nomFich){

        try {
            sc = new Scanner(nomFich);
           while(sc.hasNext())
           for(int i=0;sc.hasNext()==false;i++){
               //notas.get(i).setNome();
           }
        } catch (Exception ex) {
            System.out.print("error" + ex.getMessage());
        } finally {
            sc.close();
                }
    }
}
