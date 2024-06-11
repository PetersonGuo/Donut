import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
	private static int size = 2000;
    public static void main(String[] args) throws InterruptedException {
        int k;
        double A = 0, B = 0, i, j;
        double[] z = new double[size];
        char[] output = new char[size];
        //clear screen
        System.out.print("\u001b[2J");
        for(; ; ) {
            Arrays.fill(output, ' ');
            Arrays.fill(z, 0);
            for(j = 0; 6.28 > j; j += 0.07)
                for(i = 0; 6.28 > i; i += 0.02) {
                    double c = Math.sin(i), d = Math.cos(j), e = Math.sin(A), f = Math.sin(j), g = Math.cos(A), h = d + 2, D = 1 / (c * h * e + f * g + 5), l = Math.cos(i), m = Math.cos(B), n = Math.sin(B), t = c * h * g - f * e;
                    int x = (int) (40 + 30 * D * (l * h * m - t * n)), y = (int) (12 + 15 * D * (l * h * n + t * m)), o = x + 80 * y, N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (y < 22 && y > 0 && x > 0 && x < 80 && D > z[o]) 
                    {
                        z[o] = D;
                        output[o] = new char[]{'.', ',', '-', '~', ':', ';', '=', '!', '*', '#', '$', '@'}[Math.max(N, 0)];
                    }
                }
            //move cursor to top
            System.out.print("\u001b[H");

            //print array b
            for(k = 0; k < size; k++) System.out.print(k % 80 != 0 ? output[k] : 10);
            A += 0.04;
            B += 0.02;
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}
