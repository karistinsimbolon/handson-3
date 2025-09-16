package Task1;

public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;
        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int hasilPenjumlahan = num1 + num2;
        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int hasilPengurangan = num1 - num2;
        // - Hitung dan simpan hasil perkalian num1 dan num2
        int hasilPerkalian = num1 * num2;
        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int hasilPembagian = num1 / num2;
        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int hasilsisaBagi = num1 % num2;
        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Penjumlahan:"+ hasilPenjumlahan);
        System.out.println("Pengurangan:"+ hasilPengurangan);
        System.out.println("Perkalian:"+ hasilPerkalian);
        System.out.println("Pembagian:"+ hasilPembagian);
        System.out.println("Sisa bagi:"+ hasilsisaBagi);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");
        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int hasilInt = 17/5;
        double hasilDouble1 = 17.0/5;
        double hasilDouble2 = 27/5;

        System.out.println("Hasil pembagian integer 17/5:"+ hasilInt);
        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        System.out.println("Hasil pembagian floating-point 17.0/5:"+ hasilDouble1);
        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Hasil pembagian dengan casting 17/5:"+ hasilDouble2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // - Hitung keliling persegi panjang yang sama
        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalHarga = jumlahBarang * hargaBarang * (1 + pajak);
        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        double celcius = 25;
        double fahrenheit =(celcius * 9/5) + 32;
        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int totalHari = 50;
        int minggu = totalHari/7;
        int sisaHari = totalHari%7;
        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.printf("Total harga dengan pajak: $%.2f\n", totalHarga);
        System.out.printf("Suhu %.1f°C = %.1f°F\n", celcius , fahrenheit);
        System.out.println("50 hari = " + minggu + " minggu dan " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;
        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000;
        double sukuBunga = 0.05;
        int tahun = 3;
        double jumlah = pokok * Math.pow(1 + sukuBunga,tahun);
        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        int nilai1 = 85,nilai2 = 92,nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5)/5.0;
        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.printf("Jarak tempuh: %.2f km\n",jarak);
        System.out.printf("Jumlah uang setelah 3 tahun(bunga majemuk):$%.2f\n",jumlah);
        System.out.printf("Rata-rata nilai ujian:%2f\n",rataRata);
    }
}


