import java.io.*;
class series
{
    int sum(int a)
    {
        int i,s=0;
        for(i=1;i<a;i++)
        s=s+(i*(i+1));
        return(s);
    }
    public static void main()throws IOException
    {
        int p,n;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("enter the value of n:");
        n=Integer.parseInt(in.readLine());
        series ob=new series();
        p=ob.sum(n);
        System.out.println("the sum of the series is "+p);
    }
}