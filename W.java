import java.util.*;
class W
{
public static void main(String[] str)
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2==0)
        {
        System.out.print("Even");
        }
            if((a%2!=0)&&(a>0))
            {
                System.out.print("Odd");
            }
        if(a<0)
        {
        System.out.print("invalid");
        }
    }
}
