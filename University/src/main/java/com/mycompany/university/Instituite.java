/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author DELL
 */
public class Instituite extends University implements NewInterface {
double money;
int room;
    @Override
    public int metod1(int arg1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public int metod2(int istudent, int iteacher){
        return (this.istudent/this.iteacher);}
    @Override
       public double metod3 (double money){
        return (money/this.room);}
  
    }

