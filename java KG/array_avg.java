
import java.util.Scanner;

public class array_avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elemennts:");
        int size = input.nextInt();

        int [] num = new int[size];
       

        int i=0;
        while(i<size)
        {
            System.out.print("enter element number: " + (i+1) + ": ");
            num[i] = input.nextInt();
            i++;
        } 

        long sum = sum(num);
        int avg = average(num);

        System.out.println("sum : "+ sum);
        System.out.println("average: "+ avg);
    }
        public static long sum(int[] num)
        {
            long sum=0;
           for(int i=0;i<num.length;i++)
            {
                sum+=num[i];
            }
            return sum;
        }

        public static int average(int[] num)
        {
            long sum = sum(num);
            return (int) (sum/num.length);
        }
    
}
