package circleapp;

import java.util.Scanner;

public class CircleApp {
    
    /*here we have to create 3 objects or classes to display inform of three circles
    lets try this.
    */

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        //circle one 
          System.out.println("Circle One  information ");
        System.out.print("Enter x center coordinate for circle  : ");
        int x1 = input.nextInt();
         System.out.print("Enter y center coordinate for circle  : ");
        int y1 = input.nextInt();
        System.out.print("Enter the radius of circle one : ");
        float radius1 = input.nextFloat();
       //object for first cirle
       Circle_one circle1 = new Circle_one();
       circle1.setx1(x1);
       circle1.sety1(y1);
       circle1.setradius1(radius1);
       
       //circle 2 
       System.out.println("Circle Two information ");
         System.out.print("Enter x center coordinate for circle  : ");
        int x2 = input.nextInt();
         System.out.print("Enter y center coordinate for circle  : ");
        int y2 = input.nextInt();
        System.out.print("Enter the radius of circle : ");
        float radius2 = input.nextFloat();
        
        //object for second circle
         Circle_two circle2 = new Circle_two();
         circle2.setx2(x2);
       circle2.sety2(y2);
       circle2.setradius2(radius2);
       
       //circle 3
         System.out.println("Circle Third information ");
         System.out.print("Enter x center coordinate for circle  : ");
        int x3 = input.nextInt();
         System.out.print("Enter y center coordinate for circle  : ");
        int y3 = input.nextInt();
        System.out.print("Enter the radius of circle one : ");
        float radius3 = input.nextFloat();
        
        //object for third circle
        Circle_three circle3 = new Circle_three();
         circle3.setx3(x3);
       circle3.sety3(y3);
       circle3.setradius3(radius3);
       
       
       
       
       
      //display information for circle1
      System.out.println("1.FIRST CIRCLE INFORMATION ");
      System.out.println("The center of the circle : ("+circle1.getx1()+","+circle1.gety1()+")");
      System.out.println("The radius of circle  : "+circle1.getradius1());
      System.out.println("The area of circle : "+circle1.calculateArea());
   System.out.println("The circumference of circle : "+circle1.calculateCircumference());
   System.out.println("The area of circle : "+circle1.calculateDiameter());
   System.out.println();
   
    //display information for circle2
      System.out.println("2. SECOND CIRCLE INFORMATION ");
      System.out.println("The center of the circle : ("+circle2.getx2()+","+circle2.gety2()+")");
      System.out.println("The radius of circle  : "+circle2.getradius2());
      System.out.println("The area of circle : "+circle2.calculateArea());
   System.out.println("The circumference of circle : "+circle2.calculateCircumference());
   System.out.println("The area of circle : "+circle2.calculateDiameter());
   System.out.println();
   
   //display information for circle 3
    System.out.println("3.THIRD CIRCLE INFORMATION ");
      System.out.println("The center of the circle : ("+circle3.getx3()+","+circle3.gety3()+")");
      System.out.println("The radius of circle  : "+circle3.getradius3());
      System.out.println("The area of circle : "+circle3.calculateArea());
   System.out.println("The circumference of circle : "+circle3.calculateCircumference());
   System.out.println("The area of circle : "+circle3.calculateDiameter());
   System.out.println();
        
      
    
}}
