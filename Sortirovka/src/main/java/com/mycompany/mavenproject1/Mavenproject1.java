/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author DELL
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int a [];
        int y;
        a= new int[1000];
        for (int i=0;i < 1000 ;i++){
        a[i]=(int) ((Math.random() * 101));
        }
        for(int j=0; j<1000; j++){
            y=a[j];
          for(int i=0; i<1000; i++){
         if(a[j]<a[i]){
            a[j]=a[i];
            a[i]=y;
            y=a[j];
         }
        }
                 }
         for(int i=0; i<1000; i++){
       System.out.println(a[i]);
}           
    }
}

