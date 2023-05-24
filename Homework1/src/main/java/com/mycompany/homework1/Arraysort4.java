/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework1;

/**
 *
 * @author DELL
 */
public class Arraysort4  extends Thread{
     @Override
    public void run() {
        int mas4[];
        int y;
        long time4_1 = System.currentTimeMillis();
        mas4= new int[10000];
        for (int i=0;i < 10000 ;i++){
        mas4[i]=(int) ((Math.random() * 10001));
        }
        for(int j=0; j<10000; j++){
            y=mas4[j];
          for(int i=0; i<10000; i++){
         if(mas4[j]<mas4[i]){
            mas4[j]=mas4[i];
            mas4[i]=y;
            y=mas4[j];
               }
             }
           }
        long time4_2 = System.currentTimeMillis();
         System.out.println("Time for fourth array =" + (time4_2 - time4_1));
         //for(int i=0; i<10000; i++){
       //System.out.println(mas4[i]); }
    }
}

