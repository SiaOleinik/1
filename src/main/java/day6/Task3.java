package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иванов");
        Teacher teacher = new Teacher("Васечкин", "философия");
        teacher.evaluate(student.getStName());

    }
}
