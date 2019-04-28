class armstrong_series
{
    public static void main()
    {
        int i,n,num,a,s;s=0;
        for(i=100;i<=1000;i++)
        {
            n=i;
            num=n;s=0;
            while(n>0)
            {
                a=n%10;
                s=s+a*a*a;
                n=n/10;
            }
            if(num==s)
            System.out.println("the number"+num+"is an armstrong number");
        }
    }
}