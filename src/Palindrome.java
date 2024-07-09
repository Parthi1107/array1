public class Palindrome {
    public static void main(String args[])
    {
        char [] a = {'M', 'A', 'D', 'A', 'M'};
        int pointer1 = 0;
        int pointer2 = a.length-1;
        while (pointer1<pointer2)
        {
            for (int i= 0; i<a.length; i++)
            {
            if (pointer1 == pointer2)
            pointer1++;
            pointer2--;
            }
        if (pointer1 == pointer2)
        {
        System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        } 

   
}
    }
}

