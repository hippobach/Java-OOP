package package_oop;

public class OOP {
    public static void main(String[] args) {
        System.out.println("OOP Programming");

        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.setBirthday(1994);
        studentOne.setName("John Shelby");
        studentOne.setCode("S01");

        studentOne.showInfo();
    }
}
