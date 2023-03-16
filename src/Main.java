/*public class Main
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
*/
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Displaying alphabet pattern: ");
// Outer for loop.
        for(int i = 69; i >= 65; i--)
        {
            // Inner for loop.
            for(int j = 65; j <= i; j++) {
                char ch = (char)j;
                System.out.print(ch+ " ");
            }
            System.out.println(" ");
        }
    }
}