package oop.inheritance;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3){
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >=1 && course <= 4) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >=1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo(){
        System.out.println("Имя: " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}
