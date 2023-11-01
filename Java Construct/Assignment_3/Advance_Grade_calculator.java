import java.util.Scanner;

public class Advance_Grade_calculator {

    static int getNumberFrom0To100()
    {
        Scanner sc = new Scanner(System.in);
        int result;
        do{
            result = sc.nextInt();
        } while(result < 0 || result > 100);
        return result;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subjects (out of /100):");
        System.out.println("Maths:");
        int Maths = getNumberFrom0To100();
        System.out.println("English:");
        int English = getNumberFrom0To100();
        System.out.println("Hindi:");
        int Hindi = getNumberFrom0To100();
        System.out.println("Science:");
        int Science = getNumberFrom0To100();
        System.out.println("Social Science:");
        int SocialScience = getNumberFrom0To100();

        float total = Maths + English + Hindi + Science + SocialScience;

        float percentage = (total/500)*100;

        System.out.println("Percentage : " + percentage +"\nGrade : " );

        if(percentage<40){
            System.out.println("Poor");
        }
        else if(percentage<60 && percentage>=40){
            System.out.println("Average");
        }
        else if(percentage<80 && percentage>=60){
            System.out.println("Good");
        }
        else if(percentage<90 && percentage>=80){
            System.out.println("Very Good");
        }
        else if(percentage>=90){
            System.out.println("Excellent");
        }
    }
}
