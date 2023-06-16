/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

/**
 *
 * @author DELL
 */
public class IsklID extends Exception{
    @Override
    public String getMessage(){
        return "This id already used in the table ";
    }
}
