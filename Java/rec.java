import java.util.*;
public class rec
{
    public static void main(String args[])
    {
        disp(10);
    }

    public static void disp(int a)
    {
        if(a<=0)
        return ;
        else
        {
            //System.out.println(a);
            disp(a-1);
            System.out.println(a);
        }
    }
}
