/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author anamo
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, cubo, prisma;
    
    public VentanaPrincipal(){
        inicio();
        setTitle("Figuras");
        setSize(560,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    private void inicio(){
        contenedor = getContentPane();
        contenedor.setLayout(null); 
        
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 90, 23); 
        cilindro.addActionListener(this);
        
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(120, 50, 90, 23); 
        esfera.addActionListener(this);
        
        piramide = new JButton();
        piramide.setText("Pirámide");
        piramide.setBounds(220, 50, 100, 23);
        piramide.addActionListener(this);
        
        cubo = new JButton();
        cubo.setText("Cubo");
        cubo.setBounds(330, 50, 90, 23);
        cubo.addActionListener(this);
        
        prisma = new JButton();
        prisma.setText("Prisma");
        prisma.setBounds(430, 50, 90, 23);
        prisma.addActionListener(this);
        
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(cubo);
        contenedor.add(prisma);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == esfera){
            VentanaEsfera esfera = new VentanaEsfera();
            esfera.setVisible(true);
        }
        if (evento.getSource() == cilindro){
            VentanaCilindro cilindro = new VentanaCilindro();
            cilindro.setVisible(true);
        }
        if (evento.getSource() == piramide){
            VentanaPiramide piramide = new VentanaPiramide();
            piramide.setVisible(true);
        }
        if (evento.getSource() == cubo) {
            VentanaCubo cubo = new VentanaCubo();
            cubo.setVisible(true);
        }
        if (evento.getSource() == prisma) {
            VentanaPrisma prisma = new VentanaPrisma();
            prisma.setVisible(true);
        }
    }
}
