import java.util.Scanner;

class bill {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            int unit_cost;
            System.out.print("No. of computers purchased: ");
            int comps = sn.nextInt();
            System.out.print("Enter no. of years in business: ");
            int years = sn.nextInt();

            if(comps<20){
                unit_cost = 28000;
            }
            else if(comps<20){
                unit_cost = 25000;
            }
            else{
                unit_cost = 20000;
            }
            double tot = unit_cost*comps;
            double discount = years>5 ? 0.1*tot : 0;
            double net = tot-discount;
            System.out.println("\n\t\tHI-Tech Computer Solutions\n\tTax-Cum-Invoice for Computer Hardware Sales\n\nITEM DESC\t\tQNTY\tUNIT PRICE\nComputer PC\t\t"+
            comps+"\t"+unit_cost+"\n\nTotal Cost\t\t:\tRs "+(double)Math.round(comps*100)/100+
            "\nDiscount Enjoyed\t:\tRs "+(double)Math.round(discount*100)/100+
            "\nNet Payable Amount\t:\tRs "+(double)Math.round(net*100)/100+
            "\n\n\t\tTHANK YOU! Please VISIT US again!\n");
        }
    }
}