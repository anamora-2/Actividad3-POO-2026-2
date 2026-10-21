/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author anamo
 */
public class Prisma extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Prisma(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    public double calcularVolumen() {
        return Math.pow(this.base, 2.0) * this.altura;
    }
    
    public double calcularSuperficie() {
        double áreaBase = 2.0 * Math.pow(this.base, 2.0);
        double áreaLados = 4.0 * this.base * this.altura;
        return áreaBase + áreaLados;
    }
}
