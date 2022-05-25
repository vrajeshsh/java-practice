import java.util.Scanner;

class grades {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        String grade;
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter name of student: ");
            String name = sn.nextLine();
            System.out.print("Marks in Physics: ");
            float phy = sn.nextFloat();
            System.out.print("Marks in Chemistry: ");
            float chem = sn.nextFloat();
            System.out.print("Marks in Biology: ");
            float bio = sn.nextFloat();
            
            double avg = (phy+chem+bio)/3;
            if (avg<40){
                grade = "Promotion not granted!";
            }
            else if(avg<45){
                grade = "Pass";
            }
            else if(avg<60){
                grade = "Second Division";
            }
            else if(avg<80){
                grade = "First Division";
            }
            else{
                grade = "Distinction";
            }
            System.out.println("\nNAME: "+name+
            "\nAVERAGE (%) MARKS: "+
            (double)Math.round(avg*100)/100+
            "\nGRADE OBTAINED: "+grade+"\n");
        }
    }
}