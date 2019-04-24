class decimal
{
    public static void main(int n)
    {
        int c=0;
        double d=0,r;
        while(n!=0)
        {
            r=n%10;
            d=d+r*Math.pow(2,c);
            n=n/10;
            c=c+1;
        }
        System.out.println("the decimal equivalent ="+(int)d);
    }
}