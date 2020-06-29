package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    public void distinguish() {
        //print to the console the difference between a thread and a process
        System.out.println("1. A process is an executing program whereas, the thread is a small part of a process.\n" +
                "2. Each process has its own address space whereas, the threads of the same process share the address space as that of the process.");
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method
        // of a thread.
        System.out.println("The run( ) method is defined in such a way to perform the action as the user wants.\n" +
                "The start( ) method is used to invoke the run( ) method.");
    }

    public void run() {
        distinguish();
    }
}

