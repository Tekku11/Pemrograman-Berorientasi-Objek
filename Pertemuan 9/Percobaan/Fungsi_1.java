public class Fungsi_1 // Program yang tidak menggunakan fungsi/method
{
    public static void main(String args[])
    {
        int nilai=1;
        int data=4;
        if(data==0 || data==1)
        {
            nilai=1;
        }
        else
        {
            for(int i=1; i<=data; i++)
            {
                nilai*=i;
            }
        }
        System.out.println(data+"! = "+nilai);
    }
}