public class arraypointer {
    public static void main(String[] args) 
    {
        int a[] = {0,0,0,1,0,0,1,1,0,1,0};
        int pointer1 = 0;
        int pointer2 =a.length-1;
        int[] result = new int [a.length];
        for(int i=0;i<a.length;i++)
        {
        if (a[i] == 0)
        {
        result[pointer1] = 0;
        pointer1++;
        }
        else
            {
                result[pointer2]=1;
                pointer2--;
            }
        }
        for(int i:result)
        {
            System.out.print(i + " ");
        }
    } }

