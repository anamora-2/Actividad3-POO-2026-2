/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
/**
 *
 * @author anamo
 */
public class VentanaPiramide extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JLabel imagenFigura;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;
    
    public VentanaPiramide(){
        inicio();
        setTitle("Pirámide");
        setSize(280, 340);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        imagenFigura = new JLabel();
        URL rutaImagen = getClass().getResource("/imagenes/piramide.png");
        if (rutaImagen != null) {
            ImageIcon icono = new ImageIcon(rutaImagen);
            Image imagenEscalada = icono.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
            imagenFigura.setIcon(new ImageIcon(imagenEscalada));
        }
        imagenFigura.setBounds(95, 10, 90, 90);
        
        base = new JLabel();
        base.setText("Base (cms):");
        base.setBounds(20, 110, 135, 23);
        
        campoBase = new JTextField();
        campoBase.setBounds(120, 110, 135, 23);
        
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 140, 135, 23);
        
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 140, 135, 23);
        
        apotema = new JLabel();
        apotema.setText("Apotema (cms):");
        apotema.setBounds(20, 170, 135, 23);
        
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 170, 135, 23);
        
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120, 200, 135, 23);
        calcular.addActionListener(this);
        
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 230, 200, 23);
        
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 260, 200, 23);
        
        contenedor.add(imagenFigura);
        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    
    public void actionPerformed(ActionEvent event){
        Piramide piramide;
        boolean error = false;
        double base = 0;
        double altura = 0;
        double apotema = 0;
        try{
            base = Double.parseDouble(campoBase.getText());
            altura = Double.parseDouble(campoAltura.getText());
            apotema = Double.parseDouble(campoApotema.getText());
            piramide = new Piramide(base, altura, apotema);
            volumen.setText("Volumen (cm3): " + String.format("%.2f",piramide.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f",piramide.calcularSuperficie()));
        } catch (Exception e){
           error = true; 
        } finally {
            if (error){
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
