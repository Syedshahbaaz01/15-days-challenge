import java.io.*;
class morphic
{
    int digits(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c=c+1;
        }
        return(c);
    }
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int m,n,b,p;
        double r;r=0;
        morphic ob=new morphic();
        System.out.println("Enter your number:");
        n=Integer.parseInt(in.readLine());
        m=n;
        p=m*m;
        b=ob.digits(n);
        r=p%(Math.pow(10,b));
        if(m==r)
        System.out.println(m+"is an automorphic number");
        else
        System.out.println(m+"is not an automorphic number");
    }
}