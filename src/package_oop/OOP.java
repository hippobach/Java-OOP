package package_oop;

public class OOP {
    public static void main(String[] args) {
        System.out.println("OOP Programming");

        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.birthday = 1994;
        studentOne.name = "John Shelby";
        studentOne.code = "S01";

        System.out.println("Birthday: "+studentOne.birthday);
        System.out.println("Name: "+studentOne.name);
        System.out.println("Code: "+studentOne.code);

        Teacher teacherOne = new Teacher();
        Teacher teacherTwo = new Teacher();
    }
}
