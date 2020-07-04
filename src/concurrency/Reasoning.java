package concurrency;

class Reasoning extends Thread {
    public void distinguish() {
        System.out.println("1. A process is an executing program whereas, the thread is a small part of a process.\n" +
                "2. Each process has its own address space whereas, the threads of the same process share the address space as that of the process.");
        System.out.println("The run( ) method is defined in such a way to perform the action as the user wants.\n" +
                "The start( ) method is used to invoke the run( ) method.");
    }

    public void run() {
        distinguish();

    }
}

