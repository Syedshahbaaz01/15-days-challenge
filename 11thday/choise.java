import java.io.*;
class choise
{
    void num_cal (int num,char ch)
    {
        if(ch=='s')
        System.out.println("the square of the number="+(num*num));
        else
        System.out.println("the cube of the number="+(num*num*num));
    }
    void num_cal (int a,int b,char ch)
    {
        if(ch=='p')
        System.out.println("the product of the number="+(a*b));
        else
        System.out.println("the sum of the number="+(a+b));
    }
    void num_cal (String str1,String str2)
    {
        if(str1.equals(str2))
        System.out.println("two strings are equal");
        else
        System.out.println("two strings are not equal ");
    }
}