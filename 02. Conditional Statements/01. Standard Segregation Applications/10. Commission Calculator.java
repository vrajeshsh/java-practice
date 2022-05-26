import java.util.Scanner;

class commission {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double comm;
            System.out.print("Enter gender [M/F]: ");
            String gen = sn.nextLine();
            System.out.print("Enter sale for the month: ");
            float sales = sn.nextFloat();

            if(sales<=150000){
                comm = gen=="M" || gen=="m" ? 0.1*sales : 0.12*sales;
            }
            else if(sales<=200000){
                comm = gen=="M" || gen=="m" ? 0.14*sales : 0.16*sales;
            }
            else{
                comm = gen=="M" || gen=="m" ? 0.18*sales : 0.2*sales;
            }
            double tot = sales <= 100000 ? 0.1*sales :  5000+comm;
            System.out.println("\nCommission\t\t\t\t:\tRs "+ comm+
                "\nTotal Monthly Salary\t:\tRs "+tot+"\n");
        }
    }
}