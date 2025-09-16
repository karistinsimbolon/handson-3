package Taks2;

public class UnaryOperatorsPractice {
    public static void main(String[] args) {

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("======OPERATOR INCREMENT DAN DECREMENT ======");

        //Latihan 1: Increment dan decrement dasar
        int counter = 5;

        System.out.println("Pre-increment: " + (++counter));
        System.out.println("Post-increment: " + (counter++));
        counter = 5;
        System.out.println("Pre-decrement: " + (--counter));
        System.out.println("Post-decrement: " + (counter--));

        //PERILAKU PRE vs POST INCREMENT
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10, b = 10;

        int result1 = ++a;
        System.out.println("a = " + a + ", result1 = " + result1);

        int result2 = b++;
        System.out.println("b = " + b + ", result2 = " + result2);

        //PERILAKU PRE vs POST DECREMENT
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8, y = 8;

        System.out.println("Pre-decrement --x: " + (--x));
        System.out.println("x sekarang: " + x);

        System.out.println("Post-decrement y--: " + (y--));
        System.out.println("y sekarang: " + y);

        //UNARY PLUS DAN MINUS
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive;
        int backToPositive = -negative;
        int unchanged = +positive;

        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("backToPositive = " + backToPositive);
        System.out.println("unchanged (unary plus) = " + unchanged);

        //OPERATOR BOOLEAN NOT
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;

        System.out.println("isReady = " + isReady);
        System.out.println("isNotReady = " + isNotReady);

        int number = 5;
        System.out.println("Number != 0 ? " + (number != 0));

        System.out.println("Double NOT !!isReady = " + (!!isReady));

        //APLIKASI PRAKTIS
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Percobaan login & lives
        int attempts = 0;
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        int lives = 3;
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        // Latihan 7: Loop counters
        int i = 1;
        while (i <= 5) {
            System.out.println("Loop counter: " + i);
            i++;
        }

        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        //SKENARIO MENANTANG
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int complex1 = value++ + ++value;
        System.out.println("value++ + ++value = " + complex1 + ", value sekarang: " + value);

        value = 5;
        int complex2 = --value + value--;
        System.out.println("--value + value-- = " + complex2 + ", value sekarang: " + value);

        // Latihan 9: Unary in method call
        int score = 10;
        System.out.println("Math.max(++score,12) = " + Math.max(++score, 12));
        System.out.println("Score sekarang: " + score);

        score = 10;
        System.out.println("Math.max(score++,12) = " + Math.max(score++, 12));
        System.out.println("Score sekarang: " + score);
    }
}
