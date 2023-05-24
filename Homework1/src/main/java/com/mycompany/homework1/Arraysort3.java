/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework1;

/**
 *
 * @author DELL
 */
public class Arraysort3 extends Thread {
   
    @Override
    public void run() {
        int mas3[];
        int y;
        long time3_1 = System.currentTimeMillis();
        mas3= new int[10000];
        for (int i=0;i < 10000 ;i++){
        mas3[i]=(int) ((Math.random() * 10001));
        }
        for(int j=0; j<10000; j++){
            y=mas3[j];
          for(int i=0; i<10000; i++){
         if(mas3[j]<mas3[i]){
            mas3[j]=mas3[i];
            mas3[i]=y;
            y=mas3[j];
                 }
               }
             }
        long time3_2 = System.currentTimeMillis();
        System.out.println("Time for third array =" + (time3_2 - time3_1));
         // for(int i=0; i<10000; i++){
      // System.out.println(mas3[i]); }
    }
}
