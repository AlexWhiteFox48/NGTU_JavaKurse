/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author DELL
 */

public enum Deister {
      SUM(1){
        double DeistM(double arg1, double arg2){
        return arg1+arg2;
        }
    },
    SUB(2){
        double DeistM(double arg1, double arg2){
        return arg1-arg2;
        }
    }, MULTI(3){
        double DeistM(double arg1, double arg2){
        return arg1*arg2;
        }
    }, DIVIDE(4){
         double DeistM(double arg1, double arg2) {
                   return arg1/arg2;
        }          
};

double value;
Deister(int v){
this.value=v;
}
abstract double DeistM(double arg1, double arg2 );
}
