/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author DELL
 */
public class Cafedra extends Instituite {
    String leader_name, subleader_name;
    Cafedra(String constleader_name,double constmoney,int constteacher ){
        this.leader_name= constleader_name;
        this.money= constmoney;
        this.iteacher= constteacher;
    }

    
   @Override
    public double metod3 (double money){
        return (money/3);
    }
}
