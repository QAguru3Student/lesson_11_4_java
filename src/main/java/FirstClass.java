import java.util.Arrays;

public class FirstClass {

    public static void main(String[] args) {
        int a = 1,
                b = 2,
                c = 3,
                x,
                y,
                z;
        byte d = 127,
                e = 21,
                f = 1;
        float g = 38.3F;
        boolean h = true,
                i = false,
                j = true,
                k = false;
        y = e + f;
        System.out.println("y"+ "=" + y);
        z = d + e;
        System.out.println("z"+ "=" + z);
        x = a + b;
        System.out.println("x" + "=" + x );
        System.out.println(e + d);
        System.out.println("e-- =" + (e--));
        System.out.println("--e =" + (--e));
        System.out.println("b == d =" + (b == d));
        System.out.println("c != e =" + (c != e));
        System.out.println("c - g = " + (c - g));
        System.out.println("h && i && j = " + (h && i && j));
        System.out.println("i|| j&& k = " + (i || j && k) );
        System.out.println("!(j&& k) || h = " + (!(j && k) || k));
    }

}
