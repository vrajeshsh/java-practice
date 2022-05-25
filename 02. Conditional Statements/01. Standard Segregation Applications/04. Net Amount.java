import java.util.Scanner;

class netAmount {
    public static void main(String args[]){
        
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double discount;
            System.out.print("Enter the purchase amount: Rs ");
            float amt = sn.nextFloat();
            if(amt<=500){
                discount = 500;
            }
            else if(amt<=1000){
                discount = 0.1*amt;
            }
            else if(amt<=2000){
                discount = 0.15*amt;
            }
            else{
                discount = 0.2*amt;
            }
            double net = amt-discount;
            System.out.println("\nGross Amount: Rs "+amt+
            "\nDiscount enjoyed: Rs "+discount+
            "\nNet amount payable: Rs "+net+"\n");
        }
    }
}