import java.util.Scanner;
import java.lang.Math;

class triangle {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter side 1: ");
            double a = sn.nextDouble();
            System.out.print("Enter side 2: ");
            double b = sn.nextDouble();
            System.out.print("Enter side 3: ");
            double c = sn.nextDouble();

            double peri = a + b + c;
            double s = peri/2;
            double area = (double)Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c))*100)/100;
            
            System.out.println("\nArea: " + area +
                    "\nPerimeter: " + peri+"\n");
        }
    }
}