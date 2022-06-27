package archivos;

import java.io.*;
public class Practica_1 {
    static FileOutputStream fescritura;// Es una manera de instanciar ?
    public static void main (String[] args){
        String nombre="LENNARD PALOMINO";
        File carpeta = new File("/home/lennard/IdeaProjects/ficherosPractica");
        try{
            //File carpeta = new File("/home/lennard/IdeaProjects/ficherosPractica");
            if(!carpeta.exists()){
                carpeta.mkdir();
            }
            File archivo= new File (carpeta,"DatosPractica.txt");
            fescritura= new FileOutputStream(archivo);
        }catch (IOException ioe){
            System.out.println("ERROR GRAVE EN EL SISTEMA DE E/S EN EL ACCESO");
        }
        if(carpeta.exists()){
            System.out.println("Nombre del archivo es: " + carpeta.getName());
            System.out.println("Tamaño: " + carpeta.length());
        }
        else System.out.println("No se encuentra el archivo...");
        try{
            fescritura.write(nombre.getBytes(),0,nombre.length());
            System.out.println("SE HA ESCRITO EN EL FICHERO");
        }catch (IOException ioe){
            System.out.println("ERROR DE ENTRADA SALIDA DE DATOS");
        }finally{
            if(fescritura !=null){
                try{
                    fescritura.close();
                }catch (IOException ioe){
                    System.out.println("ERROR GRAVE DE E/S DE DATOS");
                }
            }
        }
    }
}
