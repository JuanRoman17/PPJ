/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicapruebaj;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Juan Diego Roman
 */
public class PanelPaint extends JPanel implements MouseListener {

    private int px1 = 0;
    private int py1 = 0;
    private int px2 = 0;
    private int py2 = 0;
    private int dimx = 0;
    private int dimy = 0;
    private int nrof = 0;
    private Color colorlinea = Color.red;

    public PanelPaint() {
        this.addMouseListener(this);

    }

    public void dimenciones(String e1, String e2) {

        this.dimx = Integer.valueOf(e1).intValue();
        this.dimy = Integer.valueOf(e2).intValue();

    }

    public void figuara(String fi) {

        if (fi.equalsIgnoreCase("Circulo")) {
            this.nrof = 0;
        }
        if (fi.equalsIgnoreCase("Cuadrado")) {
            this.nrof = 1;
        }

    }

    @Override
    public void paint(Graphics g) {
        System.out.println(nrof);
        System.out.println(dimx);
        System.out.println(dimy);
        System.out.println(px1);
        System.out.println(py1);
        super.paint(g);

        if (this.nrof == 0) {
            g.setColor(this.colorlinea);
            g.drawOval(px1, py1, dimx, dimy);
        }
        if (this.nrof == 1) {
            g.setColor(this.colorlinea);
            g.drawRect(px1, py1, dimx, dimy);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        this.px1 = e.getX();
        this.py1 = e.getY();
        super.repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public int getPx1() {
        return px1;
    }

    public void setPx1(int px1) {
        this.px1 = px1;
    }

    public int getPy1() {
        return py1;
    }

    public void setPy1(int py1) {
        this.py1 = py1;
    }

    public int getPx2() {
        return px2;
    }

    public void setPx2(int px2) {
        this.px2 = px2;
    }

    public int getPy2() {
        return py2;
    }

    public void setPy2(int py2) {
        this.py2 = py2;
    }

    public Color getColorlinea() {
        return colorlinea;
    }

    public void setColorlinea(Color colorlinea) {
        this.colorlinea = colorlinea;
    }

}
