import java.util.*;
public class arr
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int i,n;
        System.out.println("Enter size of the array");
        n=d.nextInt();
        int a[]=new int[n];//declaring an array of size n
        System.out.println("Enter "+ n+" values");
        for(i=0;i<n;i++)
        {
            a[i]=d.nextInt();//Inputing n values from the user
        }
        System.out.println("Original Array :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");//Displaying the original array
        }
        System.out.println();
        a=reverse(a,n);//Calling the reverse function
        //We pass the array and its size as the parameters while calling the function
        System.out.println("Reversed Array :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");//Displaying the reversed array
        }
    }
    public static int[] reverse(int a[],int n)//Reverse Function
    {
        int i,t;
        for(i=0;i<n/2;i++)
        {
            //swapping the left value with the right value
            t=a[i];//temporarily storing the left value
            a[i]=a[n-1-i];//Replacing the left value with the right value
            a[n-1-i]=t;//Replacing the right value with the temporary variable
        }
        return a;//Returning the reversed array
    }
}
