import java.util.Scanner;

public class HittheLottery996A
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int ans=0;

        int arr[]={100,20,10,5,1};
        while(num>0)
        {
            int i=0;
            float a=(float) num/arr[i];
            while(a<1)
            {
                i++;
                a=(float) num/arr[i];
            }
            ans+=num/arr[i];
            num=num%arr[i];


        }
        System.out.println(ans);
    }
}
