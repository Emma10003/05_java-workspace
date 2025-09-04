package edu.collection.pack2.model;

public class Person {
    // 필드
    private String name;
    private int age;
    private char gender;

    // 기본생성자
    public Person() {
    }
    // 파라미터 생성자
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter, setter
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

    @Override
    public String toString() {
        return "Person [name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ']';
    }
}
