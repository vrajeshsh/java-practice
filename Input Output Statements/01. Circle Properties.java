import java.util.Scanner;

class circle {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.print("Enter radius of circle: ");
        try (Scanner sn = new Scanner(System.in)) {
            float radius = sn.nextFloat();

            float area = (float) Math.PI * radius * radius;
            float peri = (float) 6.28 * radius;
            float diam = 2 * radius;
            System.out.println("\nArea: " + area +
                    "\nPerimeter: " + peri
                    + "\nDiameter: " + diam + "\n");
        }
    }
}