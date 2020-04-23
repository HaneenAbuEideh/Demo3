public class commonint {
    public static int gcd(int a, int b)
    {
        if(a==0) return b;
        if(b==0)return a;
        else return gcd(b,a%b);

    }
    public static String comn(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
            temp=gcd(temp,arr[i]);
        if (temp>1)
            return "YES";
        else
            return "NO";
    }

}
