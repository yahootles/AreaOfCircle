/*
 * Andrew Thompson
 * September 18, 2018
 * This program calculates the area of a circle
 */

package areaofcircle;

/**
 *
 * @author antho6229
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radius = 15;
        double area = 0;
        //calculate area
        area = Math.PI * radius * radius;
        System.out.println("The ara of a cirl with a radius of 15 cm is " + area + " cm squared.");
    }
    
}
