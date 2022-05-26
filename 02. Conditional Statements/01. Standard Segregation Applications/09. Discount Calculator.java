import java.util.Scanner;

class discountCalc {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double disc;
            System.out.print("Enter the purchase amount: Rs ");
            float amt = sn.nextFloat();
            System.out.print("Enter the type of Cloth [M / H]: ");
            String cloth = sn.nextLine();

            if(amt<=1000){
                disc = cloth=="M" || cloth=="m" ? 2 : 5;
            }
            else if(amt<=5000){
                disc = cloth=="M" || cloth=="m" ? 20 : 25;
            }
            else if(amt<=10000){
                disc = cloth=="M" || cloth=="m" ? 45 : 50;
            }
            else{
                disc = cloth=="M" || cloth=="m" ? 50 : 60;
            }
            double discount = (disc/100)*amt;
            double net = amt-discount;
            System.out.println("\n\n\t\t\tBombay Dying\n\tTax-Cum-Invoice for Cloth Sales"+
	"\n\nPurchase Amount\t\t:\tRs "+amt+
	"\nDiscount Enjoyed\t:\tRs "+(double)Math.round(discount*100)/100+
	"\nNet Payable Amount\t:\tRs "+(double)Math.round(net*100)/100+
	"\n\nTHANK YOU! Please VISIT US again!");
        }
    }
}