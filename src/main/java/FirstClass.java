import java.util.Arrays;

public class FirstClass {

    public static void main(String[] args) {
        int a = 1,
                b = 2,
                c = 3,
                x,
                y,
                z;
        long l = 30_000_000_000L;
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
        System.out.println("e-- =" + (e--));
        System.out.println("--e =" + (--e));
        System.out.println("b == d =" + (b == d));
        System.out.println("c != e =" + (c != e));
        System.out.println("h && i && j = " + (h && i && j));
        System.out.println("i|| j&& k = " + (i || j && k) );
        System.out.println("!(j&& k) || h = " + (!(j && k) || k));
        System.out.println("byte >max = " + (e + d));
        System.out.println("byte <min = " + (e - 300));
        System.out.println("int + float = " + (c - g)); // int + float
        System.out.println("int + long = " + (b + l));
    }
}
