import java.util.Scanner;

class taxCalculator {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double usage, tax;
            String code;
            System.out.print("Enter usage code [H / C / I]: ");
            code = sn.next();
            System.out.print("Enter gallons of water used: ");
            usage = sn.nextDouble();

            if(code.toUpperCase().equals("H")){
                tax = 250 + 0.5 * usage;
            }
            else if(code.toUpperCase().equals("C")){
                tax = 1000 + 0.25 * (usage-1000);
            }
            else if(code.toUpperCase().equals("I")){
                if(usage < 4000){
                    tax = 1500;
                }
                else if(usage<=10000){
                    tax = 2000;
                }
                else {
                    tax = 3000;
                }
            }
            else{
                tax = 0;
                System.out.println("\nCheck code and try again!\n");
            }
            System.out.println("\nUSEAGE CODE: "+code+"\nWATER CONSUMED (usage): "+usage+"\nTAX AMOUNT: Rs "+tax+"\n");
        }
    }
}