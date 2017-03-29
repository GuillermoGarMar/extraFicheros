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
                notas.set(i, x);
                fch.println(notas.get(i));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"error" + ex.getMessage());
        }finally{
            fch.close();
        }
    }
    
    public void leer(String nomFich){
        String linea;
        String mtrz[];
        try {
            sc = new Scanner(new File(nomFich));
           while(sc.hasNextLine()){
               linea = sc.nextLine();
               mtrz=linea.split(",");
               if(Integer.parseInt(mtrz[1])>=5){
               ap.add(new Alumnos(mtrz[0],Integer.parseInt(mtrz[1])));
               }
        }  
        } catch (Exception ex) {
            System.out.print("error" + ex.getMessage());
        } finally {
            sc.close();
                }
    }
}
