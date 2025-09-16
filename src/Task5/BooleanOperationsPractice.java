package Task5;

public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        boolean canAccessAdminPanel = isLoggedIn && hasPermission;
        System.out.println("User can access admin panel: " + canAccessAdminPanel);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: Berlatih operator OR (||)

        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Is it day off? " + isDayOff);

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: Berlatih operator NOT (!)

        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("Is it sunny? " + isSunny);

        boolean doubleNot = !(!isRaining);
        System.out.println("Double NOT on isRaining: " + doubleNot);

        boolean notComparison = !(5 > 3);
        System.out.println("!(5 > 3) = " + notComparison);

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        boolean siswaOutstanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa outstanding: " + siswaOutstanding);

        boolean siswaMemuaskan = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("Siswa memuaskan: " + siswaMemuaskan);

        boolean perluPerbaikan = !attendanceGood || !behaviorGood;
        System.out.println("Perlu perbaikan: " + perluPerbaikan);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;
        boolean aksesNormal = hasKeyCard && knowsPassword && isAuthorizedTime;
        System.out.println("Akses normal: " + aksesNormal);

        boolean aksesDarurat = isEmergency || (hasKeyCard && isAuthorizedTime);
        System.out.println("Akses darurat: " + aksesDarurat);

        boolean aksesDitolak = !(aksesNormal || aksesDarurat);
        System.out.println("Akses ditolak: " + aksesDitolak);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca

        isRaining = false; // reuse variable
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean cuacaBagus = !isRaining && !isSnowing && temperature > 0;
        System.out.println("Cuaca bagus untuk outdoor: " + cuacaBagus);

        boolean butuhPayung = isRaining || (isCloudy && temperature > 20);
        System.out.println("Butuh payung: " + butuhPayung);

        boolean jalanBerbahaya = isSnowing || (isRaining && temperature < 5);
        System.out.println("Jalan mungkin berbahaya: " + jalanBerbahaya);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        int a = 5;
        int b = 0;

        boolean safeAnd = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2): " + safeAnd);

        boolean safeOr = (b == 0) || (a / b > 2);
        System.out.println("(b == 0) || (a / b > 2): " + safeOr);

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        System.out.println("expensiveCheck1 && expensiveCheck2 = " + (expensiveCheck1 && expensiveCheck2));

        System.out.println("expensiveCheck2 || expensiveCheck1 = " + (expensiveCheck2 || expensiveCheck1));

    }
}