/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Tugas3_DoubleLinkedListMain {
    public static void menu() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);
        int menu = 0;

        Tugas3_DoubleLinkedList dll = new Tugas3_DoubleLinkedList();

        while (menu != 4) {
            menu();
            menu = sc.nextInt();
            System.out.println("=====================================");
            try {
                switch (menu) {
                    case 1:
                        System.out.println("-----------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("-----------------------------");
                        System.out.print("Nomor Antrian: ");
                        int no = sc.nextInt();
                        System.out.print("Nama Penerima: ");
                        String nama = sss.nextLine();
                        dll.Enqueue(no, nama);
                        System.out.println("-------------------");
                        dll.print();
                        break;
                    case 2:
                        dll.Dequeue();
                        dll.print();
                        break;
                    case 3:
                        dll.print();
                        break;
                    case 4:
                        System.out.println("KELUAR");
                        break;
                }
                System.out.println();
            } catch (Exception e) {

            }
        }
    }
}
