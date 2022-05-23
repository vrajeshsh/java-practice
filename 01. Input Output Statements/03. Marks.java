import java.util.Scanner;

class marks {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter marks 1: ");
            float a = sn.nextFloat();
            System.out.print("Enter marks 2: ");
            float b = sn.nextFloat();
            System.out.print("Enter marks 3: ");
            float c = sn.nextFloat();
            
            System.out.println("\nTotal: " + (a+b+c) +
                    "\nAverage: " + (a+b+c)/3+"\n");
        }
    }
}