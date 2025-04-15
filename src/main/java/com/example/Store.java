package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Store {

   public static void saveResults(String results){ {
      try{
         trySaveResults(results);
      }catch (IOException e)
      {
         System.out.println("Hiba a fájl írásakor: " + e.getMessage());
      }
      
   }}
   public static void trySaveResults(String results) throws IOException {
      
         FileWriter fw = new FileWriter("result.txt");
         fw.write(results + "\n");
         fw.close();
   }
}
