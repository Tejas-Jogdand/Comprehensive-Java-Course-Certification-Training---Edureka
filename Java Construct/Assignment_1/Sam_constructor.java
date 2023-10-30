import javax.sound.sampled.SourceDataLine;

class sam{

    int x;
    float y;
    
    public sam(int a)
    {
        x=a;
    }
    public sam(float b)
    {
        y=b;
    }
    public sam()
    {
        x=10;
    }

    public static void main(String args[])
    {
        sam s1 = new sam(20);
        sam s2 = new sam(2.1f);
        sam s3 = new sam();

        System.out.println("The integer number with parametric constructor is "+s1.x);
        System.out.println("The float number with parametric constructor is "+s2.y);
        System.out.println("The integer number without parametric constructor is "+s3.x);
    }

}