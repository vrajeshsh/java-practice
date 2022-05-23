import java.util.Scanner;

class binary {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a binary digit: ");
            int bin = sn.nextInt();

            int comp = 1-bin;
            System.out.println("\nComplement of "+bin+" is: "+comp+"\n");
        }
    }
}