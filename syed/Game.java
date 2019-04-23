import java.io.*;
class Game
{
    int c1,c2,s1=0,s2=0,p=0;
    String name1,num1,name2,num2;
    void accept()throws Exception
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter name and number of first player");
        name1=in.readLine();
        num1=in.readLine();
        System.out.println("Enter name and number of second player");
        name2=in.readLine();
        num2=in.readLine();
    }
    void display()
    {
        System.out.println("Name of the first player:"+name1);
        System.out.println("Number of the first player:"+name1);
        System.out.println("Name of the second player:"+name2);
        System.out.println("Number of the second player:"+name2);
        if(c1==c2)
        System.out.println("Games ended in a draw");
        if(c1<c2)
        System.out.println("first player wins");
        if(c1>c2)
        System.out.println("second player wins");
    }
    void calculate()
    {
        while(s1<=20)
        {
            p=(int)(Math.random()*6)+1;
            s1=s1+p;
            c1=c1+1;
        }
        while(s2<=20)
        {
            p=(int)(Math.random()*6)+1;
            s2=s2+p;
            c2=c2+1;
        }
    }
    public static void main()throws Exception
    {
        Game ob=new Game();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}