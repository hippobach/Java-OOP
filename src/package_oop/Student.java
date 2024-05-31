package package_oop;

import java.util.Calendar;

public class Student {
    public String name;
    public String code;
    public int birthday;

//    constructor
    public Student() {
        this.name = "SV Name";
        this.code = "SV Code";
        this.birthday = 2000;
    }

    public Student(String vName) {
        this.name = vName;
    }

    public Student(String vName, String vCode) {
        this.name = vName;
        this.code = vCode;
    }

    public Student(String name, String code, int birthday) {
        this.name = name;
        this.code = code;
        this.birthday = birthday;
    }

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

    //    Overloading method
    public void setCode() {
        this.code = "S001";
    }

    public void setCode(int number) {
        this.code = "S" + number;
    }

    public void setCode(String str, int number) {
        this.code = str + number;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

//    Show student info
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
