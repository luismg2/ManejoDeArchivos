/*
 * Nuesta clase ManejoDeArchivos va a contener los siguientes metodos
*- Crear Archivo
*- Guardar la informacion de un Archivo
*- Eliminar la informacion de un Archivo
*- Eliminar Archivo
 */
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {

    
    /*public static void main(String[] args) {
        // TODO code application logic here
    }*/
    
    public static void crearArchivo(String name){
        File archivo=new File(name);
        try{
            PrintWriter salida=new PrintWriter(archivo);
            salida.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida=null;
        File archivo=new File(nombre);
        try {//Se que el fcihero existe
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo!!!");
        } catch (FileNotFoundException ex) {//El fichero no existe => Excep.
            ex.printStackTrace(System.out);
        } finally {//Este bloque siempre se ejecuta
            salida.close();
        }
        
    }
    public static void agregarArchivo(String nombre,String contenido){
        File archivo=new File(nombre);
        PrintWriter salida=null;
        //PrintWriter salida=new PrintWriter(new FileWriter(nombre,true)); pero con el statement
        try {
            salida = new PrintWriter(new FileWriter(nombre,true));
            salida.println(contenido);
        } catch (IOException ex) {
            
        }finally{
            salida.close();
        }
    }
    public static void leerArchivo(String nombre){
        File archivo=new File(nombre);
        //BufferedReader entrada=new BufferedReader(new FileReader(archivo)); con el statement
        try {
            //Crear el descriptor de lectura del fichero
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            //Recorremos lectura hasta final
            while(lectura!=null){
                System.out.println(lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void leerArchivoPorPalabra(String nombre){
        File archivo =new File(nombre);
        try {
            Scanner entrada=new Scanner(archivo);
            int cont=0;
            //Recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra=entrada.next();
                System.out.println(palabra);
                cont=cont+1;
            }
            System.out.println("Numero de palabras de mi fichero= "+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
