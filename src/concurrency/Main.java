package concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        Reasoning reasoning = new Reasoning();
        reasoning.start();
        Thread tc1 = new Thread(new TeamTC1());
        tc1.start();
    }
}