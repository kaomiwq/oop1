public class Main {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        TrigMath trigMath = new TrigMath();

        System.out.println("Sum = " + simpleMath.getSum(3.5, 2.8));
        System.out.println("Circle square = " + trigMath.getCircleSquare(32));
    }
}