package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static ArrayList<Student> mergingLists(ArrayList<Student> students1, ArrayList<Student> students2) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.addAll(students1);
        students.addAll(students2);
        return students;
    }

    public static void mergeSort(ArrayList<Student> students, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        ArrayList<Student> l = new ArrayList<Student>(mid);
        ArrayList<Student> r = new ArrayList<Student>(n - mid);

        for (int i = 0; i < mid; i++) {
            l.add(i,students.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(i-mid,students.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(students, l, r, mid, n - mid);
    }

    public static void merge(
            ArrayList<Student> students, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getNumberOfStudent() <= r.get(j).getNumberOfStudent()) {
                students.set(k++,l.get(i++));
            }
            else {
                students.set(k++,r.get(j++));
            }
        }
        while (i < left) {
            students.set(k++,l.get(i++));
        }
        while (j < right) {
            students.set(k++,r.get(j++));
        }
    }

    public static void showList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> students1 = new ArrayList<Student>();
        ArrayList <Student> students2 = new ArrayList<Student>();
        String[] names = new String[]{"Андрей", "Жанна", "Артем", "Ксения", "Антон"};
        String[] universities = new String[]{"МГУ", "МИРЭА", "ВШЭ"};

        for (int i = 0; i < 10; i++) {
            students1.add(new Student((int)(Math.random()*1_000_000), names[i % 5], 18 + (int)(Math.random()*6),
                    ((i % 2 == 0) ? 'М' : 'Ж'), universities[(int)(Math.random()*3)]));
            students2.add(new Student((int)(Math.random()*1_000_000), names[i % 5], 18 + (int)(Math.random()*6),
                    ((i % 2 == 0) ? 'М' : 'Ж'), universities[(int)(Math.random()*3)]));
        }
        showList(students1);
        System.out.println("--------------------");
        showList(students2);
        System.out.println("--------------------");

        ArrayList<Student> students = mergingLists(students1,students2);
        mergeSort(students, students.size());
        showList(students);
    }// вывести на экран список и проверить работоспособность методов
}
