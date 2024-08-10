package ca1;

public class Records {
    int id;
    String name;
    String surName;
    String position;
    int age;
    int phoneNumber;

    public Records(int id, String name, String surName, String position, int age, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }  

    @Override
    public String toString() {
        return "Records{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", position=" + position + ", age=" + age + ", phoneNumber=" + phoneNumber + '}';
    }
}
