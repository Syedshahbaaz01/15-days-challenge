import java.io.*;
class temperature
{
    double max,min,f1,f2;
    void getdata(double m,double n)
    {
        max=m;
        min=n;
    }
    void compute()
    {
        f1=9*max/5+32;
        f2=9*min/5+32;
    }
    void display()
    {
        System.out.println("the maximum temperature in fahrenheit:"+f1);
        System.out.println("the minimum temperature in fahrenheit:"+f2);
    }
    public static void main()throws IOException
    {
        temperature ob=new temperature();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        double m,n;
        System.out.println("enter maximum and minimum temperature in celsius:");
        m=Double.parseDouble(in.readLine());
        n=Double.parseDouble(in.readLine());
        ob.getdata(m,n);
        ob.compute();
        ob.display();
    }
}