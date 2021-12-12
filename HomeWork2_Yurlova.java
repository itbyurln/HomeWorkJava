/**
 * Java 1. Homework #2
 *
 * @author Yurlova Natalia
 * @version 12/12/2021
 */
public class HomeWork2_Yurlova {

    public static boolean checkTrueandfalse(int a, int b) {
        if ((a + b) > 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }
}

    public static void checkPositivNegative(int a) {
        if (a >= 0) {
            System.out.println("Number is posotive");
        } 
            else {
            System.out.println("Number is negative");
        }
    }
}

    public static boolean checkReturn(int a) {
        if (a > 10) {
            return true;
        }
        return false;
    }

    public static void printWord (String word, int times) {
        for (int i = 1; i < times; i++) {
            System.out.println(word);
            }
	}
}

