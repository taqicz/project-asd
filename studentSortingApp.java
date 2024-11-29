package projek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentSortingApp {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorting sorting = new Sorting();
        List<Student> students = new ArrayList<>();

        System.out.println("\n==========================");
        System.out.print("Jumlah Input Siswa: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("==========================\n");


        for (int i = 0; i < n; i++) {
            int urutan = i +1;
            System.out.print(urutan+". Nama siswa : ");
            String name = scanner.nextLine();
            System.out.print("   Nilai "+ name + " : ");
            int score = scanner.nextInt();
            scanner.nextLine();
            students.add(new Student(name, score));
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pilih metode pengurutan:");
        System.out.println("1. Nilai Paling Rendah");
        System.out.println("2. Nilai Paling Tinggi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int choice = scanner.nextInt();
        System.out.println("==\n");

        switch (choice) {
            case 1:
                sorting.selectionSort(students);
                System.out.println("--------------------| Nilai Terendah |------------------");
                System.out.println("---------------< Selection Sort | Ascending >--------------");
                break;
            case 2:
                sorting.bubbleSortDescending(students);
                System.out.println("--------------------| Nilai Tertinggi |------------------");
                System.out.println("---------------< Bubble Sort | Descending >--------------");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}
