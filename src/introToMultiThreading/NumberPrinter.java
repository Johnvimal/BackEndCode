package introToMultiThreading;

public class NumberPrinter implements Runnable{
    int num;
    public NumberPrinter(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Printing " + num + "by Thread " + Thread.currentThread().getName()) ;
    }
}
