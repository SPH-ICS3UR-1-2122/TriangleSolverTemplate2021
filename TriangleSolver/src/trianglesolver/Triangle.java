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
    private double sideA;
    private double sideB;
    private double sideC;

    //Angles
    private double angleA;
    private double angleB;
    private double angleC;

    //Getters and Setters
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
        if (angleC > 0 && angleC < 180) {
            this.angleC = angleC;
        }
    }

    /**
     * Analyze all combinations of sides and angles and find the missing parts
     * if possible
     */
    public void solve() {
        //3 angles
        if (angleA != 0 && angleB != 0 && angleC != 0) {
            System.out.println("Not possible to solve this!");
            this.sideA = -1;
            this.sideB = -1;
            this.sideC = -1;
            return;
        }
        //2 angles, 1 side
        if (angleA > 0 && angleB > 0) {
            //find angle C
            if (sideA>0){
                //find side b
                //find side c
            }else if (sideB>0){
                //find side a
                //find side c
            }else if (sideC>0){
                //find side a
                //find side b
            }
        } else if (angleA > 0 && angleC > 0) {
            //find angle B
            if (sideA>0){
                //find side b
                //find side c
            }else if (sideB>0){
                //find side a
                //find side c
            }else if (sideC>0){
                //find side a
                //find side b
            }
        } else if (angleB > 0 && angleC > 0) {
            //find angle A
            if (sideA>0){
                //find side b
                //find side c
            }else if (sideB>0){
                //find side a
                //find side b
            }else if (sideC>0){
                //find side a
                //find side b
            }
        }
        //1 angle, 2 sides
        if (sideA > 0 && sideB > 0) {
            if (angleA>0){
                //find angle B
                //find angle C
                //find side c
            }else if (angleB>0){
                //find angle A
                //find angle C
                //find side c
            }else if (angleC>0){
                //find side c
                //find angle A
                //find angle B
            }
        }else if (sideA>0 && sideC>0){
            if (angleA>0){
                //find angle C
                //find angle B
                //find side B
            }else if (angleB>0){
                //find side B
                //find angle A
                //find angle C
            }else if (angleC>0){
                //find angle A
                //find angle B
                //find side B
            }
        }else if (sideB>0 && sideC>0){
            if (angleA>0){
                //find side A
                //find angle B
                //find angle C
            }else if (angleB>0){
                //find angle C
                //find angle A
                //find side A
            }else if (angleC>0){
                //find angle B
                //find angle A
                //find side A
            }
        }
        //3 sides
        if (sideA>0 && sideB>0&&sideC>0){
            //find angle A
            //find angle B
            //find angle C
        }
    }

    /**
     * Print out all angles and sides
     */
    public void printOut() {
        System.out.println("\nTriangle Measurements:\nAngles");
        System.out.println("\tA\t" + this.angleA);
        System.out.println("\tB\t" + this.angleB);
        System.out.println("\tC\t" + this.angleC);
        System.out.println("Sides");
        System.out.println("\ta\t" + this.sideA);
        System.out.println("\tb\t" + this.sideB);
        System.out.println("\tc\t" + this.sideC);
    }

    /**
     * Sin law to find an angle given a, b, A, return B
     */
    public double sinAngle(double a, double b, double A) {
        double B = 0;
        //A to radians
        //B = asin(sin(A)*b/a);
        //B to degrees
        return B;
    }

    /**
     * Sin law to find a side given a, A, B, return b
     */
    public double sinSide(double a, double A, double B) {
        double b = 0;
        //A to radians
        //B to radians
        //b = a*sin(B)/sin(A)
        return b;
    }

    /**
     * cos law to find an angle given a,b,c, return A
     */
    public double cosAngle(double a, double b, double c) {
        double A = 0;
        //A = acos((a^2-b^2-c^2)/(-2*b*c))
        //A to degrees
        return A;
    }

    /**
     * cos law to find a side given a, b, C, return c
     */
    public double cosSide(double a, double b, double C) {
        double c = 0;
        //C to radians
        //c = sqrt(a^2+b^2 - 2ab*cosC)
        return c;
    }

    /**
     * Interior angles. 180 - a - b. Return c
     */
    public double interiorAngle(double A, double B) {
        double C = 0;
        //C=180-A-B
        return C;
    }
}
