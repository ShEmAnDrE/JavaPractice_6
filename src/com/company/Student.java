package com.company;

public class Student {
    private int numberOfStudent;
    private String name;
    private int age;
    private char gender;
    private String university;

    public Student(int numberOfStudent, String name, int age, char gender, String university) {
        this.numberOfStudent = numberOfStudent;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void studying() {
        System.out.println(name + " is studying now");
    }

    @Override
    public String toString() {
        return "Студент: " + "Имя = " + name + ", номер студента = " + numberOfStudent + ", возраст = " + age +
                ", пол = " + gender + ", ВУЗ = " + university;
    }
}
