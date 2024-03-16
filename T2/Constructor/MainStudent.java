import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        
        // contoh objek menggunakan constructor dengan parameter nilai
        System.out.println("===================");
        Student jhon = new Student(75.0, 75.0, 75.0);
        jhon.displayMessage();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = input.nextInt(); input.nextLine();
        Student[] siswa = new Student[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            siswa[i] = new Student();

            System.out.print("Masukkan nama siswa : ");
            siswa[i].setName(input.nextLine());
            System.out.print("Masukkan alamat siswa : ");
            siswa[i].setAddress(input.nextLine());
            System.out.print("Masukkan umur siswa : ");
            siswa[i].setAge(input.nextInt()); input.nextLine();
            System.out.print("Masukkan nilai matematika : ");
            siswa[i].setMath(input.nextInt()); input.nextLine();
            System.out.print("Masukkan nilai bahasa inggris : ");
            siswa[i].setEnglish(input.nextInt()); input.nextLine();
            System.out.print("Masukkan nilai science : ");
            siswa[i].setScience(input.nextInt()); input.nextLine();
            System.out.println("===================");
            siswa[i].displayMessage();
            System.out.println("===================");
        }
        input.close();
    }
}