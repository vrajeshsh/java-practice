import java.util.Scanner;

class ring {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter outer radius: ");
            float outer = sn.nextFloat();
            System.out.print("Enter inner radius: ");
            float inner = sn.nextFloat();

            double circum = (44/7)*(outer-inner);
            double area = (22/7)*((outer*outer)-(inner*inner));

            System.out.println("\nCircumference: "+(double)Math.round(circum*100)/100+
        "\nArea: "+(double)Math.round(area*100)/100+"\n");
        }
    }
}