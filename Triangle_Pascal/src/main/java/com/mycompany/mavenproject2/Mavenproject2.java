/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author DELL
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int a [][];
        int i;
        int j;
        a= new int[10][];
        for(i=0; i<10; i++){
            a[i]= new int[i+1];
        }
        for(i=0; i<10; i++){
            a[i][0]=1;
        }
        for(j=0; j<10; j++){
          for(i=0; i<10; i++){
             if(j==i){
                 a[i][i]= 1;
             } 
          }
        }
        for(j=1; j<10; j++){
           for(i=1; i<10; i++){
              if(i<j){
         a[j][i]=a[j-1][i-1]+a[j-1][i];
         }
          }
        }
         for(j=0; j<10; j++){
          for(i=0; i<10; i++){
              if (i<=j){
         System.out.print(a[j][i]+" ");
         }
          }     
          System.out.println();
        }    
    }
}
