
package static_Variable;

public class TestStaticVariable1 {

    public static void main(String[] args) {
        //for non-static variable must be create obj

        //StaticVariable1 obj=new StaticVariable1();
        // String uName=obj.univercityName;
        //System.out.println("Univercity Name is : "+uName);
        //static variable use class name
        String uName = StaticVariable1.univercityName;
        System.out.println("Univercity Name is : " + uName);
    }
}
