import java.util.Scanner;

class coins {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter number of 50p coins: ");
            int a = sn.nextInt();
            System.out.print("Enter number of 1re coins: ");
            int b = sn.nextInt();
            System.out.print("Enter number of 2rs coins: ");
            int c = sn.nextInt();
            System.out.print("Enter number of 5rs coins: ");
            int d = sn.nextInt();
            System.out.print("Enter number of 10rs coins: ");
            int e = sn.nextInt();
            System.out.print("Enter number of 20rs coins: ");
            int f = sn.nextInt();
            int total_coins = a+b+c+d+e+f;
            double total_amt = (a*0.5)+b+(c*2)+(d*5)+(e*10)+(f*20);

            System.out.println("\nTotal number of coins: "+total_coins+
            "\nTotal amount: Rs "+total_amt+"\n");
        }
    }
}