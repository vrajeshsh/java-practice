import java.util.Scanner;

class discount {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");

        double discount;
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the purchase amount: Rs ");
            float amt = sn.nextFloat();
            if(amt<=2000){
                discount = 0.05*amt;
            }
            else if (amt<=5000){
                discount = 0.1*amt;
            }
            else if (amt<=10000){
                discount = 0.15*amt;
            }
            else{
                discount = 0.2*amt;
            }
            System.out.println("\nPurchase Amount: Rs "+amt+"\nDiscount enjoyed: Rs "+discount+"\n");
        }
    }
}