/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 *
 * @author Valentina
 */
public class Triangle implements Figure{
    private double base;
    private double height;
    
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    private double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    @Override
    public double calculatePerimeter() {
        return base + height + calcularHipotenusa(); 
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }
}
