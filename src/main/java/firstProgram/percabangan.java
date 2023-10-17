package firstProgram;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password: ");
        String validPassword = "password";
        if (password.equals(validPassword)) {
            System.out.println("Selamat datang bos!");
        } else {
            System.out.println("Password Salah, coba lagi!");
        }
        System.out.println("Terimakasih sudah menggunakan aplikasi kami");
    }
    // Fungsi prompt untuk membaca input dari pengguna
    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}