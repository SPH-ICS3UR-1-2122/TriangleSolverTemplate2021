/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglesolver;

/**
 *
 * @author SPH_SHSM
 */
public class Triangle {
    //attributes
    
    //Sides
    public double sideA;
    private double sideB;
    private double sideC;
    
    //Angles
    private double angleA;
    private double angleB;
    private double angleC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public void setAngleC(double angleC) {
        if (angleC>0&&angleC<180){
            this.angleC = angleC;
        }
    }
    
    //Sin law to find an angle given a, b, A, return B
    public double sinAngle(double a, double b, double A){
        return 0;
    }
}
