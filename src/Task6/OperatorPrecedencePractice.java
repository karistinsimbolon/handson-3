package Task6;
public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        int a = 10, b = 5, c = 2;

        // a + b * c → 10 + 5 * 2 → 10 + 10 = 20
        System.out.println("a + b * c = " + (a + b * c)); // Prediksi: 20 | Hasil: 20

        // (a + b) * c → (10 + 5) * 2 → 15 * 2 = 30
        System.out.println("(a + b) * c = " + ((a + b) * c)); // Prediksi: 30 | Hasil: 30

        // a * b + c / 2 → 10 * 5 + 2 / 2 → 50 + 1 = 51
        // Urutan: * dan / dievaluasi lebih dulu, lalu +
        System.out.println("a * b + c / 2 = " + (a * b + c / 2)); // Hasil: 51

        // a / b + c * 2 → 10 / 5 + 2 * 2 → 2 + 4 = 6
        // Step-by-step:
        // 1. a / b = 2
        // 2. c * 2 = 4
        // 3. 2 + 4 = 6
        System.out.println("a / b + c * 2 = " + (a / b + c * 2)); // Hasil: 6

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        int x = 15, y = 10, z = 20;

        // x + y > z - 5 → 15 + 10 > 20 - 5 → 25 > 15 → true
        System.out.println("x + y > z - 5 = " + (x + y > z - 5));

        // x > y + z / 4 → 15 > 10 + 20 / 4 → 15 > 10 + 5 → 15 > 15 → false
        System.out.println("x > y + z / 4 = " + (x > y + z / 4));

        // (x + y) > (z - 5) && x < z → 25 > 15 && 15 < 20 → true && true → true
        System.out.println("(x + y) > (z - 5) && x < z = " + ((x + y) > (z - 5) && x < z));

        // x * 2 + y > z && y < x + 5 → 30 + 10 > 20 && 10 < 20 → 40 > 20 && true → true
        System.out.println("x * 2 + y > z && y < x + 5 = " + (x * 2 + y > z && y < x + 5)); // Prediksi: true

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        boolean p = true, q = false, r = true;

        // p && q || r → (true && false) || true → false || true → true
        System.out.println("p && q || r = " + (p && q || r));

        // p || q && r → true || (false && true) → true || false → true
        System.out.println("p || q && r = " + (p || q && r));

        // !p && q || r → (!true && false) || true → false && false || true → false || true → true
        System.out.println("!p && q || r = " + (!p && q || r));

        // p && (q || r) → true && (false || true) → true && true → true
        System.out.println("p && (q || r) = " + (p && (q || r)));

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        int num1 = 25, num2 = 15, num3 = 30;

        // num1 > num2 + 5 && num3 / 2 < num1
        // 25 > 20 && 15 < 25 → true && true → true
        System.out.println("num1 > num2 + 5 && num3 / 2 < num1 = " + (num1 > num2 + 5 && num3 / 2 < num1));

        // num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // 40 > 30 || 5 < 10 && 15 > 10 → true || true && true → true
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 = " +
                (num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10));

        // (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // (true || true) && true → true && true → true
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 = " +
                ((num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10));

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        int value = 8;

        // ++value * 2 → 9 * 2 = 18 (karena ++ terjadi sebelum dikali)
        System.out.println("++value * 2 = " + (++value * 2));

        value = 8;

        // value++ * 2 → 8 * 2 = 16 (nilai lama digunakan, baru naik)
        System.out.println("value++ * 2 = " + (value++ * 2));

        value = 8;

        // 2 * ++value → 2 * 9 = 18
        System.out.println("2 * ++value = " + (2 * ++value));

        value = 8;

        // -value + 10 → -8 + 10 = 2
        System.out.println("-value + 10 = " + (-value + 10));

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        a = 5;
        b = 10;

        // a += b * 2 → a = a + (b * 2) = 5 + 20 = 25
        a += b * 2;
        System.out.println("a += b * 2 → a = " + a);

        a = 5;

        // a *= b + 3 → a = a * (b + 3) = 5 * 13 = 65
        a *= b + 3;
        System.out.println("a *= b + 3 → a = " + a);

        // a = b > 5 ? b * 2 : b / 2 → a = 10 > 5 ? 20 : 5 → 20
        a = b > 5 ? b * 2 : b / 2;
        System.out.println("a = b > 5 ? b * 2 : b / 2 → a = " + a);

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        a = 8;
        b = 4;
        c = 2;
        int d = 6;

        // a + b * c - d → 8 + 4 * 2 - 6 → 8 + 8 - 6 = 10
        System.out.println("a + b * c - d = " + (a + b * c - d));

        // (a + b) * (c - d) → (8 + 4) * (2 - 6) → 12 * -4 = -48
        System.out.println("(a + b) * (c - d) = " + ((a + b) * (c - d)));

        // a > b && c < d || a == b → 8 > 4 && 2 < 6 || 8 == 4 → true &&||
    }
}