import java.util.*;
public class b
{
    public static void main(String args[])
    {
        int n,i,mini,maxi;
        Scanner d=new Scanner(System.in);
        System.out.println("How many students do you want to enter: ");
        n=d.nextInt();
        String name[]=new String[n];
        int marks[]=new int[n];
        for(i=0;i<n;i++)
        {
            d.nextLine();
            System.out.println("Student "+(i+1)+":");
            System.out.println("Enter student's name: ");
            name[i]=d.nextLine();
            System.out.println("Enter student's score (0-100): ");
            marks[i]=d.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(name[i]+" "+marks[i]);//Printing the names and marks of all the students
        }
        
        mini=smallest(marks);//Calling smallest function to store the index of the smallest value
        maxi=largest(marks);//Calling largest function to store the index of the largest value
        
        System.out.println(name[maxi]+" has the highest score => "+marks[maxi]+" and "+name[mini]+" has the lowest score => "+marks[mini]);
    }
    public static int smallest(int marks[])//Method 1
    {
        int i,min,ind,n;
        n=marks.length;//to store the length of the array
        min=marks[0];
        ind=0;
        for(i=0;i<n;i++)
        {
            if(marks[i]<min)//checking for the minimum value
            {
                min=marks[i];
                ind=i;//storing the index of the minimum value
            }
        }
        return ind;
    }
    public static int largest(int marks[])//Method 2
    {
        int i,max,ind,n;
        n=marks.length;//to store the length of the array
        max=marks[0];
        ind=0;
        for(i=0;i<n;i++)
        {
            if(marks[i]>max)//checking for the maximum value
            {
                max=marks[i];
                ind=i;//storing the index of the maximum value
            }
        }
        return ind;
    }
}
