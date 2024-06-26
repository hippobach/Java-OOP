package package_oop;

import java.util.Calendar;

public class Student extends Person{
    public double score;

//    public Student(String name, String code, int birthday) {
//        super(name, code, birthday);
//    }

    //    getters & setters
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
