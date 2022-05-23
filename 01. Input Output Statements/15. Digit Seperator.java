import java.util.Scanner;

class digitSeperator {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a 4-digit number: ");
            int num = sn.nextInt();

            int u = num%10;
            int t = (num/10)%10;
            int h = (num/100)%10;
            int th = (num/1000)%10;

            System.out.println("\nDigits of "+num+": "+th+", "+h+", "+t+", and "+u+"\n");
        }
    }
}