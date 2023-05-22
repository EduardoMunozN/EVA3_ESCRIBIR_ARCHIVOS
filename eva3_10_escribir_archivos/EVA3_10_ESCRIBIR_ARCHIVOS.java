/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_10_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class EVA3_10_ESCRIBIR_ARCHIVOS {
    public static void main(String[] args) {
       String ruta ="c:\\ARCHIVOS\\PRUEBA.txt";
       
       try{
        writeUsignFiles (ruta +"archivosFiles.txt", "Prueba de archivos");
        writeUsignFileWriter(ruta+ "archivosssss.txt", "aaa");
        writeUsingBufferedWriter(ruta + "archivoooos.text", "siuhh");
        
        } catch (IOException ex){
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public static void writeUsignFiles (String ruta, String datos) throws IOException{
    Path path = Paths.get (ruta);
    Files.write(path, datos.getBytes());
}
    public static void writeUsignFileWriter (String ruta, String datos)throws IOException{
    File file = new File (ruta);
    FileWriter fileWriter = new FileWriter (file);
    fileWriter.write(datos);
    fileWriter.close();
}
    public static void writeUsingBufferedWriter (String ruta, String datos) throws IOException{
   File file = new File (ruta);
   FileWriter fileWriter = new FileWriter (file);
   BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
   for(int i = 0; i < 900; i++){
       bufferedWriter.write(datos);
       bufferedWriter.write("\n");
}   
   bufferedWriter.close();
   fileWriter.close();
}
    
}



