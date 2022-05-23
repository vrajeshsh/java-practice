import java.util.Scanner;

class fractions {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a fractional number: ");
            float real_num = sn.nextFloat();

            int int_part = (int)real_num;
            float frac_part = real_num-int_part;

            System.out.println("\nIntegral part: "+int_part+
            "\nFractional part: "+frac_part+"\n");
        }
    }
}