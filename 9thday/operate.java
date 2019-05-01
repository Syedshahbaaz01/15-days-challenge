class operate
{
    String s;
    void input(String st)
    {
        s=st;
    }
    void checkprint()
    {
        int l=s.length();
        int t1=0,t2=0,t3=0,t4=0,t5=0,t6=0;
        char c;
        for(int i=0;i<1;i++)
        {
            c=s.charAt(i);
            if(Character.isLetter(c))
            t1++;
            if(Character.isDigit(c))
            t2++;
            if(Character.isLetterOrDigit(c))
            t3++;
            if(Character.isWhitespace(c))
            t4++;
            if(Character.isUpperCase(c))
            t5++;
            if(Character.isLowerCase(c))
            t6++;
            System.out.println("the input string:"+s);
            System.out.println("number of letters:"+t1);
            System.out.println("number of digits:"+t2);
            System.out.println("number of letters or digits:"+t3);
            System.out.println("number of whitespaces:"+t4);
            System.out.println("number of uppercases:"+t5);       
            System.out.println("number of lowercases:"+t6);
        }
    }
}