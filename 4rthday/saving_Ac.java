import java.io.*;
class saving_Ac
{
    int acno;
    double money=33245.25,depo=0,draw=0,balance=0;
    String name;
    public void withdrawl()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Welcome to state bank of India !!");
        System.out.println("Enter the account no");
        acno=Integer.parseInt(in.readLine());
        System.out.println("Enter the name of the A/c holder");
        name=in.readLine();
        System.out.println("The present balance in your account is Rs."+(money+depo-draw));
        System.out.println("How much money do you want to withdraw ?");
        draw=Float.parseFloat(in.readLine());
    }
    public void deposit()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Welcome to state bank of India !!");
        System.out.println("Enter the account no");
        acno=Integer.parseInt(in.readLine());
        System.out.println("The present balance in your account is Rs"+(money+depo-draw));
        System.out.println("How much money do you want to deposit ?");
        depo=Float.parseFloat(in.readLine());
    }
    public void display()
    {
        System.out.println("Welcome to state bank of India !!");
        System.out.println("the A/c no:"+acno);
        System.out.println("the name of the A/c holder:"+name);
        System.out.println("the balance in your account is Rs"+(money+depo-draw));
        System.out.println("Thank You. Visit Again !!");
    }
}