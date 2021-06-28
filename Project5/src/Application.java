import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ZipCode testing = new ZipCode("95112");
        Television nostalgia = new Television("Proud Family");
        Music jill = new Music("Slowly Surely");
        testing.search();
        nostalgia.search();
        jill.search();

        System.out.println("Would you like to search something on the web? Please answer yes or no");
        Scanner take = new Scanner(System.in);
        String userInput = take.next();
        while(userInput.equalsIgnoreCase("yes")){
            if(userInput.equalsIgnoreCase("yes")){
                System.out.println("We can search for information on any place(Zipcode), TV show, Song or wiki Page entry you would like?");
                System.out.println("Please enter one of the four options, zip,TV,music, or wiki to continue");

                String recentInput = take.next();
                switch (recentInput.toLowerCase(Locale.ROOT)){
                    case "zip":
                        System.out.println("Please enter the 5 digit US zip code you wish to search");
                        recentInput = take.next();
                        ZipCode targetLocation = new ZipCode(recentInput);
                        targetLocation.search();
                        break;
                    case "tv":
                        System.out.println("Please enter the Television show you wish to search");
                        recentInput = take.next();
                        Television myShow = new Television(recentInput);
                        myShow.search();
                        break;
                    case "music":
                        System.out.println("Please enter the song you wish to search");
                        recentInput = take.next();
                        Music mySong = new Music(recentInput);
                        mySong.search();
                        break;
                    case "wiki":
                        System.out.println("Please enter the wiki Article you wish to search for");
                        recentInput = take.next();
                        wiki myWiki = new wiki(recentInput);
                        myWiki.search();
                        break;
                    default:
                        System.out.println("I'm sorry you have entered an invalid input");


                }


            }
            System.out.println("Would you like to search something on the web? Please answer yes or no");
            userInput = take.next();;


        }
    }


}
