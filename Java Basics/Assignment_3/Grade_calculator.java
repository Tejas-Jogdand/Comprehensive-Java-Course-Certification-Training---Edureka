//Below 40 percent -Poor 40 –59 percent -Average 60 –79 percent -Good 80 –89 percent -Very Good 90 percent and above -Excellent.

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Grade_calculator {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subjects (out of /100):");
        System.out.println("Maths:");
        int Maths = sc.nextInt();
        System.out.println("English:");
        int English = sc.nextInt();
        System.out.println("Hindi:");
        int Hindi = sc.nextInt();
        System.out.println("Science:");
        int Science = sc.nextInt();
        System.out.println("Social Science:");
        int SocialScience = sc.nextInt();

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
