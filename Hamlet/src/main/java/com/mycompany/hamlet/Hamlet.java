/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hamlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class Hamlet {

    public static void main(String[] args) throws IOException {
       int a=0, b=0;
              Path PathHamlet = Paths.get("hamlet.txt");
           BufferedReader bfr = Files.newBufferedReader(PathHamlet);
               while(bfr.ready()){
                   String sTemp1 = bfr.readLine();
                   String sTemp = sTemp1.toLowerCase();
                   for (int i=0;i < sTemp.length() ;i++){
                       if (sTemp.charAt(i) == 'a'){
                           a++;
                       }
                   }
                       StringTokenizer objhamlet = new StringTokenizer(sTemp, "a");
                      if(objhamlet.countTokens() != 0){
                       b = b + objhamlet.countTokens()-1;
                      }
               }
               bfr.close();
       System.out.println(a);
       System.out.println(b);
}
}