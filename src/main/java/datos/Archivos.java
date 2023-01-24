/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class Archivos {
    public static void crearArchivo(String nombre){
      File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            
        } catch (FileNotFoundException ex) {
            
        
        }
    
    }
    
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try { //Se que el fichero existe
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) { //El fichero no existe --> Excepcion
            Logger.getLogger(datos.Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally { //Este bloque siempre se ejecuta
            salida.close();
        }
}
    
    //Este método agrega contenido en el archivo, pero no lo sobreescribe
    public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            Logger.getLogger(datos.Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            salida.close();
        }
    }
    
    public static void leerArchivo(String nombre){
        //Declaramos el file
        File archivo = new File(nombre);
        try {
            //Creamos el descriptor de lectura del fichero
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        } catch (FileNotFoundException ex) {
         ex.printStackTrace(System.out);
        }
    }
    
}
