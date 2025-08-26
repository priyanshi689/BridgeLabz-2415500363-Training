import java .util.*;
class Grades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double phy , chem , maths ,total_marks , total_per;
        System.out.println("Enter the marks of physics");
        phy = sc.nextDouble();
        System.out.println("Enter the marks of chemistry");
        chem = sc.nextDouble();
        System.out.println("Enter the marks of maths");
        maths = sc.nextDouble();
        total_marks = phy + chem + maths;
        total_per = (total_marks/300)*100;
        System.out.println("Total Percentage is "+total_per);
        if(total_per > 80)
        {
            System.out.println("Grade A");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
               }
        else if(total_per >= 70 && total_per <= 79){
            System.out.println("Grade B");
            System.out.println("Remarks : Level 3, at agency-normalized standards");
        }
        else if(total_per >= 60 && total_per <= 69){
            System.out.println("Grade C");
            System.out.println("Remarks : Level 2, below , but approaching agency-normalized standards");
        }
        else if(total_per >= 50 && total_per <= 59){
            System.out.println("Grade D");
            System.out.println("Remarks : Level 1, well below agency-normalized standards");
        }
        else if(total_per >= 40 && total_per <= 49){
            System.out.println("Grade E");
            System.out.println("Remarks : Level -1, too below agency-normalized standards");
        }
        else if(total_per <= 39){
        System.out.println("Grade R");
        System.out.println("Remarks : Remedial Standards");
        }

    }
}