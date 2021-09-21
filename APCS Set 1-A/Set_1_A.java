/*
 * Dylan Wang
 * APCS
 * 09/20/2021
 * Problem Set 1-A
 */

import java.lang.Math;

public class Set_1_A{   
    public static void main(String[] args){
            //Quadratic Formula
       //ax^2 + bx + c
       double a = 1; 
       double b = 5; 
       double c = 6; 
        
       System.out.println("QUADRATIC FORMULA");
       System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c
       + " are " + (-b-Math.sqrt(b*b-4*a*c))/(2*a) + " and " + (-b+Math.sqrt(b*b-4*a*c))/(2*a) + ".\n");  
       
       
       
            //Slope Formula
       //First point (ax, ay)
       double ax= 0;
       double ay= 0;
       
       //Second point (bx, by)
       double bx= 2;
       double by= 3;
       
       //Slope (Rise/Run)
       double m = (by-ay)/(bx-ax);
      
       System.out.println("SLOPE FORMULA");
       System.out.println("A line connecting the points (" + ax + ", " + ay + ") and (" + bx + ", " + by + ") has a slope of " + m  + ".\n");

       
       
       
            //Midpoint
       //First point (cx, cy)
       double cx= 0;
       double cy= 0;
       
       //Second point (dx, dy)
       double dx= 2;
       double dy= 3;
       
       //Midpoint (mx, my)
       double mx = (ax+bx)/2; 
       double my = (ay+by)/2;
       
       System.out.println("MIDPOINT FORMULA");
       System.out.println("The midpoint between (" + cx + ", " + cy + ") and (" + dx + ", " + dy + ") is (" + mx + ", " + my + ")"  + ".\n");
       
       
       
            //Sum of Arithmetic Series
       //Input
       double a1 = 1; //First term
       double d = 1; //Common difference between each term
       double an = 5; //Number of terms
       
       //Calculation
       double SA = an/2*(2*a1+(an-1)*d); //Sum of the arithmetic series
       
       System.out.println("SUM OF ARITHMETIC SERIES");
       System.out.println("The sum of the first " + (int)an + " terms of an arithmetic series that starts with " + a1 + " and increases by " + d + " is " + SA  + ".\n");
       
       
       
            //Sum of Geometric Series
       //Input
       double g1 = 3; //First term
       double q = 2; //Common quotient between each term
       double gn = 3; //Number of terms
       
       //Calculation
       double SG = (g1*(1- Math.pow(q,gn)))/(1-q); //Sum of the arithmetic series
       
       System.out.println("SUM OF A FINITE ARITHMETIC SERIES");
       System.out.println("The sum of the first " + (int)gn + " terms of a finite geometric series that starts with " + g1 + " and increases by a rate of " + q + " is " + SG  + ".\n");
    } 
    }
