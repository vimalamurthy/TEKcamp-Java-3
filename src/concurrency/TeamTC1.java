package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable{

    List<String> team = new ArrayList<>();

    @Override
    public void run() {
        team.add("Dylan Fellow");
        team.add("George Torres");
        team.add("Jeramie Andrews");
        team.add("Jessica Ulysse");
        team.add("John Kol");
        team.add("Katherine Kim");
        team.add("Kevin Ibanez");
        team.add("Matthew Castiglione");
        team.add("Nancy Golden");
        team.add("Norita Sieffert");
        team.add("Sabitha Radhakrishnan");
        team.add("Vani Muppuru");
        team.add("Victor Betts");
        team.add("Vimala Murthy");
        for (String name : team){
            System.out.println("Semi-Colon: " +name);
        }
    }

    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List  After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.  
}