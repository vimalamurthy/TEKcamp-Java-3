package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void main(String[] args) {

        System.out.println("The following pattern ('\\d'){36} matches : ...");
        System.out.println("Matches the digits from (0-9), 36 times");

        String[] TEKmentors = {"Amir Yunas","Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski", "Dylan Fellows", "Emilios Papas", "Jonathan Diamond"};

        String[] tekMentors = new String[10];

        for (int i=0; i<TEKmentors.length; i++)
        {
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(TEKmentors[i]);
            matcher.find();
            tekMentors[i]=matcher.group();
            System.out.println(tekMentors[i]);
        }

        // 3. Find all the occurences of any form of 'book' in the following paragraph. use regex to match the occurences and store the count of books in an int.
        
        int bookCount = 0;
        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
        System.out.println(bookText);

        Pattern patternBook = Pattern.compile("book",Pattern.CASE_INSENSITIVE);
        Matcher matcher = patternBook.matcher(bookText);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Total count of word 'book' is : " +count);

        // 4.a Create an array of all the words besides the word 'sleepy'.  Each word does not have to be a separate element,
        // although you can split it that way if you wish.  We just want an array that everything that is not 'sleepy'.

        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy.  If you're sleepy and you know it, clap your hands.  Keep on being sleepy until you actually become sleepy";
        String[] words = null;
        System.out.println(sleepy);

        words = sleepy.replaceAll("sleepy", "").split(" ");

        System.out.println("Replacing sleepy: " );
        for (String s : words){
            System.out.print(s+" ");
        }
        System.out.println("\nString with punctuations :");
        // 4.b combine the array that you just created into a string
        //punctuation marks will be here

        String not_sleepy = Arrays.toString(words);
        System.out.println("String with no sleepy: " +not_sleepy);

        //4.c remove the punctuation marks from the notSleepy string.
        //no punctuation marks should be here.
        String notSleepy=not_sleepy.replaceAll("[,|.|']","");

        System.out.println("Remove punctuations : "+notSleepy);

        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  

        String happy = sleepy.replaceAll("sleepy", "happy");
        System.out.println("Adding happy " +happy);

        //BONUS : 
        //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of
        // unicode arrow symbols to aid you in your search.  Match all the codes that are arrows, and then print them out to the
        // console.  They should be printing out as the arrow images.

        String[] arrows = {"\u21FD", "\u26F7", "\u21FF", "\u21EF","\u21EC", "\u26F9","\u26FD","\u26D4","\u26A5","\u21FD","\u2190", "\u26A1","\u21BA","\u2196","\u2603","\u21FD"};
        for(String s : arrows){
            System.out.print("\t" +s);
        }
        matcher.reset();
        String patternString = "[u21F]";
        Pattern pattern = Pattern.compile(patternString,Pattern.UNICODE_CASE); //,Pattern.UNICODE_CASE);

        for (String s : arrows){
            matcher = pattern.matcher(s);
            while (matcher.find()){
                System.out.println("\nMatch String start(): " +matcher.start()+" to " +matcher.end());
            }
        }


        //matcher = pattern.matcher(arrowString);
        //while(matcher.find()) {
//            System.out.println("\nMatch String start(): " +matcher.start()+" to " +matcher.end());
  //      }

    }
}

