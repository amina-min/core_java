
package re_javaproject.newpackage;


public class Student {
    private int st_id;
    private String st_name;
    private String grade;
    private int paidFees;
    private int totalFees;

    public Student(int st_id, String st_name, String grade) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.grade = grade;
    }
    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_name() {
        return st_name;
    }

    public int getSt_id() {
        return st_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setPaidFees(int paidFees) {
        this.paidFees = paidFees;
        School.totalMoneyEarned+=paidFees;
        totalFees+=paidFees;
    }


    public int getTotalFees() {
        return totalFees;
    }
    
    
    
    
    
    public void stNameShow(){
        System.out.println("student's :" );
    }

   
    
}
