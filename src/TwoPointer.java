public class TwoPointer {
    public static void main(String args[])
    {
        int a[] = {0,0,0,1,0,0,1,1,0,1,0};
        int pointer1 = 0;
        int pointer2 = a.length-1;
        while (pointer1<pointer2)
        {
            while (a[pointer1] == 0 && pointer1< pointer2)
            {
                pointer1++;
            }
            while (a[pointer2] == 1 && pointer1 < pointer2)
            {
                pointer2--;
            }
            if (pointer1<pointer2)

        {
            int temp = a[pointer1];
            a[pointer1] = a[pointer2];
            a[pointer2] = temp;
        }

        for  (int i: a)
        {
            System.out.print(i + " ");
        }

        }        

    }
    
}

