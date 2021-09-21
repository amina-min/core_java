
package static_Variable;

public class StaticVariable {

    String name;
    static String univercityName = "LU";

    StaticVariable(String n) {
        name = n;
    }
    
    void checkResult(){
        System.out.println("Name: "+name);
        System.out.println("univercityName: "+univercityName);

    }
}
