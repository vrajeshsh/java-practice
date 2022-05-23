import java.util.Scanner;
import java.lang.Math;

class roundOff {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a fractional number: ");
            float num = sn.nextFloat();
            System.out.print("Enter number of places to round off: ");
            int round = sn.nextInt();
            double integral = (int)((Math.pow(10, round)*num)+0.5)/(Math.pow(10, round));

            System.out.println("\nIntegral part: "+integral+"\n");
        }
    }
}