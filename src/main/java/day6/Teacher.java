package day6;

import java.util.Random;

public class Teacher {
    private String teachersName;
    private String subject;
    Random ran = new Random();

    public Teacher(String teachersName, String subject) {
        this.teachersName = teachersName;
        this.subject = subject;
    }

    public void evaluate(String student) {
        int grade = ran.nextInt(4) + 2;
        String stGrade;
        switch (grade) {
            case 2:
                stGrade = "Неудовлетворительно";
                break;
            case 3:
                stGrade = "Удовлетворительно";
                break;
            case 4:
                stGrade = "Хорошо";
                break;
            default:
                stGrade = "Отлично";
        }
        System.out.println("Преподаватель " + teachersName + " оценил студента с именем " + student + " по предмету " + subject + " на оценку " + stGrade);
    }
//47 строка разобраться почему нельзя заменить student на getStName
}
