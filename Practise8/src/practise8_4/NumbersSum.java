package practise8_4;

public class NumbersSum {
    public static int Sum(int k, int s,int length,int sum) {
        if(length == k)
        {
            if(sum == s)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0);
        int result =0;
        for (int i = c; i < 10; i++) {
            result += Sum(k, s, length + 1,sum + i);
        }
        return result;
    }
}
