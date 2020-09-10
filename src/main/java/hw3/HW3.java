package hw3;

import java.awt.*;

public class HW3 {
    public static void main(String[] args) {
        //hw3_1();
        //hw3_2();
        //hw3_3();
        //hw3_4(24, 24);
        hw3_6();
    }

    public static void hw3_1(){
        int i = 1;
        int x = i++; //x zal 1 zijn, i 2
        System.out.println("x is " + x + " en i is " + i );
        x = ++i; //x en i nu 3
        System.out.println("x is " + x + " en i is " + i );
    }

    public static void hw3_2(){
        int i = 2;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        //als i kleiner is dan 3 wordt i met 1 opgehoogd, en dat wordt opgeteld met i die is opgehoogd (dus 2x). Als i groter
        //is dan 3 dan wordt het met 1 verhoogde getal binair 1 geshift (dus als i 3 is wordt het 4, 0100 --> 0010 en dat is 2.
        System.out.println(j);
    }

    public static void hw3_3(){
        byte a = 0b1010;
        byte b = 0b100;
        System.out.println(a + b);
    }

    public static int[] hw3_4(int tijdNu, int urenLater){
        int dagenLater = (urenLater + tijdNu) /24;
        int tijdLater = (tijdNu + urenLater) % 24;
        int[] x = {dagenLater, tijdLater};
        //System.out.println("De tijd is nu: " + tijdLater + " uur, en er zijn " + dagenLater + " dagen verstreken.");
        return x;
    }

    /*
    hw3_5
    byte: -128 tot 127
    int: -2147483648 tot 2147483647
    long: -9,223,372,036,854,775,808 tot 9,223,372,036,854,775,807
    short: -32,768 tot 32,767
    double: -1.7*10^308 tot 1.7*10^308
    float: -3.40282346638528860e+38 tot 3.40282346638528860e+38
    char: 0 tot 65,535
     */

    public static void hw3_6(){
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.name = "Joris";

        System.out.println(client1);

    }

}
