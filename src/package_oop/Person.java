package package_oop;

import java.util.Calendar;

public class Person {
    public String name;
    public String code;
    public int birthday;

    //    constructor
//    public Person(String name, String code, int birthday) {
//        this.name = name;
//        this.code = code;
//        this.birthday = birthday;
//    }

    //    getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    //    Show person info
    public void showInfo() {
        System.out.println("Birthday: "+this.getBirthday());
        System.out.println("Name: "+this.getName());
        System.out.println("Code: "+this.getCode());
        System.out.println("Age: "+this.getAge());
    }

    //    Calculate the age
    public int getAge() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }
}
