import java.util.Scanner;
public class BooleanExpressions {
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        boolean a , b, c,d,e,f;
        double x,y;

        System.out.print("Give me two numbers , First: ");
        x = k.nextDouble();

        System.out.print("Second: ");
        y = k.nextDouble();

        a = (x<y);
        b = (x<=y);
        c = (x==y);
        d = (x!=y);
        e = (x>y);
        f = (x>=y);

        System.out.println(x + " is LESS THAN " + y + ": "+a);
        System.out.println(x + " is LESS THAN " +y+ ": "+b);
        System.out.println(x + " is EQUAL TO " +y+": " + c );
        System.out.println(x+ " is NOT EQUAL To " + y + ": " +d);
        System.out.println(x + " is GREATER THAN " + y+ ": "+e);
        System.out.println(x + " is GREATER THAN / EQUAL TO " +y+": "+f);
        System.out.println();

        System.out.println(!(x<y) + " " + (x>=y));
        System.out.println(!(x <= y) + " " + (x > y));
        System.out.println(!(x == y) + " " + (x != y));
        System.out.println(!(x != y) + " " + (x == y));
        System.out.println(!(x > y) + " " + (x <= y));
        System.out.println(!(x >= y) + " " + (x < y));
        k.close();
    }
}
