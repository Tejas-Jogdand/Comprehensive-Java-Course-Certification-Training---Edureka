import java.util.Scanner;

class Michael_Bruce{
    public static void main(String[] args) {

        long michael, bruce;

        Scanner sc = new Scanner(System.in);

        System.out.println("Michael Enter your Number here:");
        michael = sc.nextInt();
        System.out.println("Bruce Enter your Number here");
        bruce = sc.nextInt();

        if(michael>bruce){
            System.out.println("Michael Wins the race");
        }
        else if(bruce>michael){
            System.out.println("Bruce Wins the race");
        }
        else{
            System.out.println("Its a tie please try again");
        }
    }
}