
package abstractclassandmethod;

public class Main {

    public static void main(String[] args) {
        Bike b1 = new Bike() {
            @Override
            public void BikeSpeed() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

    }
}