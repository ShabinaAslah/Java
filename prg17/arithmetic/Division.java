package arithmetic;

public class Division implements Operation {
    public void calculate(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Division = " + (a / b));
        }
    }
}
