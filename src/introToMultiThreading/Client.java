package introToMultiThreading;

public class Client {
    public static void main(String[] args) {
        for( int i=0; i<10; i++ ) {
            new Thread(new NumberPrinter(i)).start();
        }
    }
}
