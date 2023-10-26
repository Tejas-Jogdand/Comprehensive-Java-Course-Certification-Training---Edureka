class demo{
    int x, y;

    public demo()
    {
        x=10;
        y=11;
    }

    // public class2(int z){
    //     x=z;
    //     y=z;
    // }

}

public class Constructor{
   public static void main(String []args)
    {
        demo ob = new demo();
        // class2 ob = new class2(5);

        System.out.println(""+ob.x);

        
    }
}