import java.util.Scanner;

public class stacy_numbers
{

    // int n, count;

    // public stacy_numbers(int num)
    // {
    //     n = num;
    // }

    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers chart you want");
        int n = sc.nextInt();
        System.out.println("How many multiples you want??");
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Number "+i+" : ");
            int count = 1;
            for (int j = 1; j <= m ; j++) {
                System.out.print(i*count+" ");
                count++;
            }
            System.out.println(" ");
        }
    }

}
