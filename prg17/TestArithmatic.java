import arithmetic.*;

public class TestArithmatic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        add.calculate(a, b);
        sub.calculate(a, b);
        mul.calculate(a, b);
        div.calculate(a, b);
    }
}
