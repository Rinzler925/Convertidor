/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aldo Vazquez Figueroa 215862068 <your.name at your.org>
 */
public class Menu {
    
    public Menu() {
        getData();
    }    
    
    public static Void getData(){
        String cadEntrada = "";
        
        System.out.println("Introduzca la expresion de entrada:");
        try {
            cadEntrada = leerCadena();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return null;
    }
    
    private static String leerCadena() throws IOException
    {
        BufferedReader brEntrada = new BufferedReader(
            new InputStreamReader(System.in));
        return brEntrada.readLine();
    }
}
