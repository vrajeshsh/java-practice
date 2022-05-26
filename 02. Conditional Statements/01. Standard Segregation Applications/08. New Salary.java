import java.util.Scanner;

class salary {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            String interpret;
            double hike;
            System.out.print("Name of employee: ");
            String name = sn.nextLine();
            System.out.print("ID number: ");
            int id = sn.nextInt();
            System.out.print("Performance Rating: ");
            int rating = sn.nextInt();
            System.out.print("Current annual salary: Rs ");
            float curr_sal = sn.nextFloat();

            if(rating==1){
                interpret = "Excellent";
                hike = 0.1*curr_sal;
            }
            else if(rating==2){
                interpret = "Good";
                hike = 0.075*curr_sal;
            }
            else if(rating==3){
                interpret = "Average";
                hike = 0.005*curr_sal;
            }
            else if(rating==4){
                interpret = "Below Average";
                hike = 0.025*curr_sal;
            }
            else if(rating==5){
                interpret = "Poor";
                hike = 0;
            }
            else {
                interpret = "Not Applicable";
                hike = 0;
                System.out.println("\nPlease enter a rating between 1(best) and 5(worst)!\n");
            }
            if(rating>=1 && rating<=5){
                System.out.println("\n"+name+"'s (ID: "+id+") Performance Review:"+
                "\n\nPerformance Rating\t:\t"+rating+
                "\nInterpretation\t\t:\t"+interpret+
                "\nRaise in salary\t\t:\tRs "+hike+
                "\nNew raised salary\t:\tRs "+(curr_sal+hike)+"\n");
            }
        }
    }
}