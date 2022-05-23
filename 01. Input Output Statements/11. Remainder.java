import java.util.Scanner;

class remainder {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the numerator: ");
            int num = sn.nextInt();
            System.out.print("Enter the denominator: ");
            int denom = sn.nextInt();

            double rem =  num-((num/denom)*denom);

            System.out.println("\n"+num+" % "+denom+" : "+rem+"\n");
        }
    }
}