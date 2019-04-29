class magicnumber
{
    public static void main(int n)
    {
        int d,s;
        s=n;
        while(s>9)
        {
            n=s;s=0;
            while(n>0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
        }
        if(s==1)
        System.out.println("magic number");
        else
        System.out.println("not a magic number");
    }
}