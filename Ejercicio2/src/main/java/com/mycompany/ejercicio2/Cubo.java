/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author anamo
 */
public class Cubo extends FiguraGeometrica {
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    public double calcularVolumen() {
        return Math.pow(this.lado, 3.0);
    }
    
    public double calcularSuperficie() {
        return 6.0 * Math.pow(this.lado, 2.0);
    }   
}
