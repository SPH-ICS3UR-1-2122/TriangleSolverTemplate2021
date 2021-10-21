/*
 * This is the main program for the Triangle Solver. 
 * You do not need to modify anything in this program. It will read in the measurements,
 * set up the triangle, and call the solve and print methods.
 * It is up to you to get the Triangle class fully solved.
 */
package trianglesolver;

import java.util.*;

/**
 *
 * @author SPH_SHSM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Triangle t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read in three measurements
        t=new Triangle();
        String[] ord={"first","second","third"};
        System.out.println("Welcome to the Triangle Solver!\n");
        System.out.println("Do you want to see the instructions? y/n");
        char choice = in.nextLine().toLowerCase().charAt(0);
        if (choice=='y'){
            Instructions();
        }
        for (int i=0;i<3;i++){
            System.out.println("Enter the "+ord[i]+" line:");
            StringTokenizer line = new StringTokenizer(in.nextLine());
            if (!Update(line.nextToken(), Double.parseDouble(line.nextToken()))){
                i--;
            }
        }
        
        t.solve();
        t.printOut();

    }
    
    public static void Instructions(){
        System.out.println("\nIn order to solve a triangle, you need exactly 3 measurements");
        System.out.println("The possibilities are A, B, C for angles and a, b, c for sides.");
        System.out.println("Enter a letter, a space and a decimal number");
        System.out.println("For example:\n\tA 55\n\tb 4\n\tc 5\n");
        System.out.println("If you enter three angles, you will not get a valid response.");
    }
    
    public static boolean Update(String name, double value){
        switch (name){
            case "a":
                if (t.getSideA()!=0){
                    System.out.println("Side a already set");
                    return false;
                }
                t.setSideA(value);
                break;
            case "b":
                if (t.getSideB()!=0){
                    System.out.println("Side b already set");
                    return false;
                }
                t.setSideB(value);
                break;
            case "c":
                if (t.getSideC()!=0){
                    System.out.println("Side c already set");
                    return false;
                }
                t.setSideC(value);
                break;
            case "A":
                if (t.getAngleA()!=0){
                    System.out.println("Angle A already set");
                    return false;
                }
                t.setAngleA(value);
                break;
            case "B":
                if (t.getAngleB()!=0){
                    System.out.println("Angle B already set");
                    return false;
                }
                t.setAngleB(value);
                break;
            case "C":
                if (t.getAngleC()!=0){
                    System.out.println("Angle C already set");
                    return false;
                }
                t.setAngleC(value);
                break;
            default:
                System.out.println("That was not a valid measurement");
                return false;
        }
        return true;
    }
}
