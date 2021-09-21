
package re_javaproject.newpackage;


public class Teacher {
    private int t_id;
    private String t_name;
    private int t_salary;

    public Teacher(int t_id, String t_name, int t_salary) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_salary = t_salary;
    }

    public int getT_salary() {
        return t_salary;
    }

    public void setT_salary(int t_salary) {
        this.t_salary = t_salary;
        School.totalMoneySpend+=t_salary;
    }
    
    
}
