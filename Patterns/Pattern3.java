public class Pattern3 {
    public static void main(String[] args) {
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        pattern3(N);
    }
    static void pattern3(int N)
    {
        // This is the outer loop which will loop for the rows.
        for (int i = 1; i <=N; i++)
        {
            // This is the inner loop which here, loops for the columns
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+ " ");
            }

            // As soon as N stars are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
