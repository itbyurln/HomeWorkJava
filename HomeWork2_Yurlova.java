/**
 * Java 1. HomeWork # 2
 *
 * @author Yurlova Natalia
 * @version 19.01.2022
 */

public class HomeWork2_Yurlova {
    
    public static void main(String[] args){
        trueorFalse();
        positiveNegative();
        positiveNegativeagain();
        doLinesNumbers();
    }
    
    public static boolean trueorFalse() {
        int a = 5;
        int b = 10;
        int sum = a + b; {
            if (sum >= 10 && sum <= 20) {
                return true;
            }
            return false;
            }
        }

    public static void positiveNegative() {
        int a = 5; {
        if (a >= 0) {
            System.out.println("Positive"); }
        else {
            System.out.println("Negative");
            }
        }
    }

    public static boolean positiveNegativeagain() {
        int a = 157;
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void doLinesNumbers() {
        String str = "Java";
        int a = 5;
        for (int i = 1; i <= a; i++) {
            System.out.println("[" + i + "]" + " " + str);
            }
        }
}