import java.util.Scanner;

class discount {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter price of a computer: Rs ");
            float lap_price = sn.nextFloat();
            System.out.print("Enter number of computers purchased: ");
            int lap_count = sn.nextInt();
            System.out.print("Enter price of a printer: Rs ");
            float print_price = sn.nextFloat();
            System.out.print("Enter number of printers purchased: ");
            int print_count= sn.nextInt();

            float total_cost = (lap_count * lap_price) + (print_count * print_price);
            double discount = 0.15 * (lap_count * lap_count) + 0.1 * (print_count * print_price);
            
            System.out.println("\nTotal cost: Rs "+total_cost+"\nDiscount enjoyed: Rs "+(double)Math.round(discount*100)/100+
            "\nPayable Amount: Rs "+(total_cost-discount)+"\n");

        }
    }
}