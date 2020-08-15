import java.util.*;

class DeathBattle {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void Fraction(int num1, int den1,
                                   int num2, int den2)
    {
        int den3 = gcd(den1, den2);
        den3 = (den1 * den2) / den3;
        int num3 = (num1) * (den3 / den1) +
                (num2) * (den3 / den2);

        int common_factor = gcd(num3, den3);
        den3 = den3 / common_factor;
        num3 = num3 / common_factor;
        System.out.print(num3+"/"+den3);
    }
    public static int P(int x)
    {
        int p=1;
        for(int i=x;i>=1;i--) {
            p *= i;
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int H=in.nextInt();
        int L1=in.nextInt();
        int L2=in.nextInt();
        int M=in.nextInt();
        int C=in.nextInt();
        int index=0;
        if(H>(A+C)*M)
        {
            System.out.print("RIP");
        }
        else
        {
            int m=A+C;
            for(int i=1;i<=M;i++)
            {
                m+=(A+C);
                if(m>=H)
                {
                    index=i;
                    break;
                }
            }
            int num1=P(M)*(int)Math.pow(L1,index)*(L2-L1);
            int den1=P(index)*(int)Math.pow(L2,index)*(L2);
            int num2=(int)Math.pow(L1,M);
            int den2=(int)Math.pow(L2,M);
            Fraction(num1,den1,num2,den2);
        }

    }
}
