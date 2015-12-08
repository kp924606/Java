// 第一類:106-數學函數
public class JPD106 {
    public static void main(String[] args) {
        System.out.printf("f(-3.2) = %.4f\n", f(-3.2));
        System.out.printf("f(-2.1) = %.4f\n", f(-2.1));
        System.out.printf("f(0) = %.4f\n", f(0));
        System.out.printf("f(2.1) = %.4f\n", f(2.1));
    }
    static double f(double x) {
        return (3 * x * x * x + 2 * x - 1);
    }
}
