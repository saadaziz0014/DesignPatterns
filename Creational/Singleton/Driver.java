package Singleton;

public class Driver {
    public static void main(String[] args) {
        Teacher teacher1 = Teacher.getEarlyObjTeacher();

        Teacher teacher2 = Teacher.getObject();

        System.out.println(teacher2.toString());

        System.out.println(teacher1.toString());
    }
}
