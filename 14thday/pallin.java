import java.io.*;
class pallin
{
    int reverse(int n)
    {
        int d,r;r=0;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        return (r);
    }
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int k,a,r,d,c;r=0;
        pallin ob=new pallin();
        System.out.println("Enter your no.");
        a=Integer.parseInt(in.readLine());
        c=a;
        k=ob.reverse(a);
        if(k==c)
        System.out.println("the number "+c+"is a palindrome");
        else
        System.out.println("the number "+c+"is not a palindrome");
    }
}