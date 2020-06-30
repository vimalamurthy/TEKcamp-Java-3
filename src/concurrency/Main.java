package concurrency;

public class Main {
   
    public static void main(String[] args) {

        Reasoning reasoning = new Reasoning();
        reasoning.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        Thread tc1 = new Thread(new TeamTC1());
        tc1.setName("\n\nSEMI COLON ;");
        System.out.println(tc1.getName());
        tc1.start();
    }
}