public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(mathMagic(5));
    }
    public static int mathMagic(int num) {
        int temp = num;
        num *= 2;
        System.out.println(num);
        num += 6;
        System.out.println(num);
        num /= 2;
        System.out.println(num);
        num -= temp;
        System.out.println("final result: " + num);
        return num;
    }
}
