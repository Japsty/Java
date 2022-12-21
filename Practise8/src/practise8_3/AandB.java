package practise8_3;

public class AandB {
    int Output(int A,int B)
    {
        if(A<B)
        {
            for(int i = A; i<= B; i++)
            {
                System.out.println(i);
            }
        }
        else {
            for(int i = B; i<= A; i++)
            {
                System.out.println(i);
            }
        }
        return 0;
    }
}
