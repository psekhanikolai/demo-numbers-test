package by.itacademy.nikolaipsekha;

public class ChahgeOfNumbers {
    public static String numbersOfChange(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            return String.format("a = %s, b=%s, c=%s excellent", a, b, c);
        } else if (a > 0 && b > 0 && c < 0) {
            return String.format("a = %s, b=%s, c=%s good", a, b, c);
        } else if (a > 0 && b < 0 && c < 0) {
            return String.format("a = %s, b=%s, c=%s fine", a, b, c);
        } else if (a < 0 && b < 0 && c < 0) {
            return String.format("a = %s, b=%s, c=%s bad", a, b, c);
        }
        return " ";
    }
}


