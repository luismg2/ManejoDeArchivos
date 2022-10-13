/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import manejodearchivos.ManejoDeArchivos;

/**
 *
 * @author Alumno Mañana
 */
public class PPal {
    public static void main(String[] args) {
        String nombreArchivo="prueba.txt";
        String content="Lorem Ipsum es simplemente un texto ficticio de la industria de la impresión y la composición tipográfica. \n"
                + "Lorem Ipsum ha sido el texto ficticio estándar de la industria desde el año 1500, cuando un impresor desconocido tomó una \n"
                + "galera de tipos y la codificó para hacer un libro de muestras tipográficas. Ha sobrevivido no solo cinco siglos, sino también \n"
                + "el salto a la composición tipográfica electrónica, permaneciendo esencialmente sin cambios.";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
        ManejoDeArchivos.escribirArchivo(nombreArchivo, content);
        ManejoDeArchivos.agregarArchivo(nombreArchivo, "\nVizca Barca");
        //ManejoDeArchivos.leerArchivo(nombreArchivo);
        ManejoDeArchivos.leerArchivoPorPalabra(nombreArchivo);
    }
}
