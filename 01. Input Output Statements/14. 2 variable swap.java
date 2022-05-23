import java.util.Scanner;

class threeVarSwap {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            float num1 = sn.nextFloat();
            System.out.print("Enter second number: ");
            float num2 = sn.nextFloat();
            System.out.println("\nValues before swap: "+num1+", "+num2);

            num1 = num1+num2;
            num2 = num1-num2;
            num1 = num1 - num2;

            System.out.println("\nValues after swap: "+num1+", "+num2);
        }
    }
}