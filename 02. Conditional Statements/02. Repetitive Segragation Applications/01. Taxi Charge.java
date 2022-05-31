import java.util.Scanner;

class taxi {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double rate;
            System.out.print("Enter total distance travelled: ");
            float dist = sn.nextFloat();

            if (dist<=1){
                rate = 25;
            } 
            else if(dist<=6){
                rate = 25 + 10 * (dist - 1);
            } 
            else if(dist<=6){
                rate = 25 + (10 * 5) + 15 * (dist - 6);
            } 
            else if(dist<=6){
                rate = 25 + (10 * 5) + (15 * 6)  + 20 * (dist - 12); 
            } 
            else {
                rate = 25 + (10 * 5) + (15 * 6) + (20 * 6) + 25 * (dist - 18);
            }
            System.out.println("\tDISTANCE TRAVELLED\t\tCHARGE (Rs)\n"+
            "\t\t"+dist+"\t\t\t\t"+rate);
        }
    }
}