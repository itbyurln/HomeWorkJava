public class HomeWork1_Yurlova {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 20; {
        System.out.println("Result is " +(a + b >= 0? "positive" : "negative")); 
        }
    }
    public static void printColor() {
        int value = 5;
        if (value <= 0) {
        System.out.println("Red"); }
            
        if (value > 0 && value <= 100) {
        System.out.println("Yellow"); }
        
        if (value > 100) {
        System.out.println("Green"); }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 20; {
            if (a >= b) {
                System.out.println("a >= b"); }
            else if (a < b) {
                System.out.println("a < b");}
        }
    }
}