package package_oop;

public class main {
    public static void main(String[] args) {
       Person personObj = new Person();
       personObj.showInfo();

       Student studentObj = new Student();
       studentObj.setName("Bach");
       studentObj.showInfo();

       Teacher teacherObj = new Teacher();
       teacherObj.setName("Harry");
       teacherObj.showInfo();
    }
}
