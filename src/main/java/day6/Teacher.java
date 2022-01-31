package day6;

import java.util.Random;

public class Teacher {
    private String teachName;
    private String subject;

    public Teacher(String teachName, String subject) {
        this.teachName = teachName;
        this.subject = subject;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(String stName) {
        String stScore = null;
        Random random = new Random();
        int score = random.nextInt(4) + 2;
        switch (score) {
            case 2:
                stScore = "неудовлетворительно";
                break;
            case 3:
                stScore = "удовлетворительно";
                break;
            case 4:
                stScore = "хорошо";
                break;
            case 5:
                stScore = "отлично";
                break;
            //default:
        }

        System.out.println("Преподаватель " + teachName + " оценил студента " + stName + " по предмету " + subject + " на оценку " + stScore);
    }
}
