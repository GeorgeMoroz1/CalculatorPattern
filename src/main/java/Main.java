public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(4, 2));
        System.out.println(intsCalc.sum(10, 26));
        System.out.println(intsCalc.mult(5, 7));
        System.out.println(intsCalc.pow(3, 12));
    }
}
