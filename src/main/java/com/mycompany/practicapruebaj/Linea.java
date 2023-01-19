/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapruebaj;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Juan Diego Roman
 */
public class Linea extends JPanel implements MouseListener {

    private int px3 = 0;
    private int py4 = 0;
    private int x = 0;
    private int y = 0;
    private int px5 = 0;
    private int py6 = 0;

    public Linea() {
        this.addMouseListener(this);
    }
    //capturar el valor

    /*public Linea(int px3, int py4) {
        this.px3 = x;
        this.py4 = y;

    }*/
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        x=px3;
        y=py4;
        System.out.println(px5);
        System.out.println(x);
        System.out.println(px3);
        System.out.println(py4);

        g.drawLine(x, y, px5, py6);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //arrastrar el raton
        this.px5 = e.getX();
        this.py6 = e.getY();
        super.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        this.px3 = e.getX();
        this.py4 = e.getY();
        super.repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
