/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework1;

/**
 *
 * @author DELL
 */
public class Arraysort_1_and_2 extends Thread {
        @Override
    public void run() {
        int mas1[],mas2[];
        int y;
        long time12_1 = System.currentTimeMillis();
        mas1= new int[10000];
        mas2= new int[10000];
        for (int i=0;i < 10000 ;i++){
        mas1[i]=(int) ((Math.random() * 10001));
        }
        for (int i=0;i < 10000 ;i++){
        mas2[i]=(int) ((Math.random() * 10001));
        }
        for(int j=0; j<10000; j++){
            y=mas1[j];
          for(int i=0; i<10000; i++){
         if(mas1[j]<mas1[i]){
            mas1[j]=mas1[i];
            mas1[i]=y;
            y=mas1[j];
               }
             }
           }
        for(int j=0; j<10000; j++){
            y=mas2[j];
          for(int i=0; i<10000; i++){
         if(mas2[j]<mas2[i]){
            mas2[j]=mas2[i];
            mas2[i]=y;
            y=mas2[j];
               }
             }
           }
        long time12_2 = System.currentTimeMillis();
        System.out.println("Time for first and second arrays =" + (time12_2 - time12_1));
         // for(int i=0; i<10000; i++){
       //System.out.println(mas1[i] + " " + mas2[i]); }
    }
}