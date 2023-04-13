package Singleton;

public class Teacher {
    private String name;
    public static Teacher teacher = null; // lazy create
    public static final Teacher teacherEarly = new Teacher();

    private Teacher() {
        System.out.println("Teacher Created");
        this.name = "Saad";
    }

    // lazy
    public static Teacher getObject() {
        if (teacher == null) {
            teacher = new Teacher();
        }
        return teacher;
    }

    // early
    public static Teacher getEarlyObjTeacher() {
        return teacherEarly;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Teacher is " + this.name);
    }

}