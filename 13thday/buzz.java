import java.io.*;
class buzz
{
    void number()throws IOException
    {
        int ch;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("1-to check a buzz number");
        System.out.println("2-to composite number");
        System.out.println("Enter your choise");
        ch=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
            int n;
            System.out.println("enter a number");
            n=Integer.parseInt(in.readLine());
            if(n%7==0||n%10==7)
            System.out.println(n+"is a buzz number");
            else
            System.out.println(n+"is not a buzz number");
            break;
            case 2:
            int a,c=0,i;
            System.out.println("enter a number");
            a=Integer.parseInt(in.readLine());
            for(i=2;i<a;i++)
            {
                if(a%i==0)
                c=c+1;
            }
        
        if(c>1)
        System.out.println(a+"is a composite number");
        else
        System.out.println(a+"is not a composite number");
        break;
        default:
        System.out.println("wrong choise!!");
    }
}
}