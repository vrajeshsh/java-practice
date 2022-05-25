import java.util.Scanner;

class gift {
    public static void main(String args[]){
        String gift;
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the purchase amount: Rs ");
            float amt = sn.nextFloat();
            if(amt<1){
                gift = "Nothing";
            }
            else if(amt<1000){
                gift = "Pen";
            }
            else if(amt<2000){
                gift = "Pen";
            }
            else if(amt<5000){
                gift = "Leather Bag";
            }
            else {
                gift = "Watch";
            }
            System.out.println("\nPurchase Amount: Rs "+amt+"\nGift enjoyed: "+gift+"\n");
        }
    }
}