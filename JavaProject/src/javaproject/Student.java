package javaproject;

public class Student {

    private int id;
    private String St_Name;
    private int grade;
    private int FeesPaid;
    private int FeesTotal;

    public Student(int id, String St_Name, int grade) {

        this.id = id;
        this.St_Name = St_Name;
        this.grade = grade;
    }
    //not going to alter student's name,studen' id

    public void setFeesPaid(int FeesPaid) {
        this.FeesPaid = FeesPaid;
        School.totalMoneyEarned += FeesPaid;
        FeesTotal += FeesPaid;
    }

    public int getFeesTotal() {
        return FeesTotal;
    }

}
