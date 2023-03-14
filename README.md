# Patterns
## Monday Patterns Assessment

## 1.Square Pattern
```
public class Main {
  public static void main(String[] args) {
    // size of the square
    int size = 5;
    // outer loop
    for (int i = 0; i < size; i++) {
      // inner loop
      for (int j = 0; j < size; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

```
![inp](ja1.png)

## 2.Inverted Equilateral Triangle
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    sc.close();
}
}

```
![inp](ja2.png)

## 3.Left Pascal Triangle
```
public class Main {
  public static void main(String[] args) {
    int size = 5;
    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= size - 1; i++) {
      for (int j = 0; j < size - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
```

![inp](ja3.png)
