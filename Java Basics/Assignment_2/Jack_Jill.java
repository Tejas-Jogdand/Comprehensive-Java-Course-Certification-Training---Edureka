import java.util.Scanner;

class Jack_Jill
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter card number(1-10):");
        int choice = sc.nextInt();

        System.out.println("Your card task is:");

        switch(choice)
        {
            case 1 : System.out.print("Spin 7 times right and 2 times left");
            break;

            case 2 : System.out.print("Jump 10 times");
            break;

            case 3 : System.out.print("Roll 5 times");
            break;

            case 4: System.out.print("Talk for next 5 min nonstop");
            break;

            case 5: System.out.print("Dance on Perfect song");
            break;

            case 6 : System.out.print("Sing Shape of you song");
            break;

            case 7 : System.out.print("Tell your darkest truth");
            break;

            case 8 : System.out.print("Clap 10 times");
            break;

            case 9: System.out.print("Wite a poem on tree");
            break;

            case 10: System.out.print("Do garba");
            break;

            default: System.out.println("Please choose between 1 to 10");
        }
    }
}