package Arraylist;

public class Student {
    private int sNum;
    private String name;
    private int age;

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
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


    public String getaClass() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public Student() {
    }

    public Student(int sNum, String name, int age, String aClass) {
        this.sNum = sNum;
        this.name = name;
        this.age = age;
        Class = aClass;
    }

    private String Class;
}
