import java.io.*;
class arrange
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j,t;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("enter numbers");
            m[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<(9-i);j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("the numbers are arranged in ascending order are");
        for(i=0;i<10;i++)
        System.out.println(m[i]);
    }
}