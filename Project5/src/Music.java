public class Music {
    String name;
    public Music(String SongName)
    {

        this.name = SongName;




    }
    public void search(){

        String hyphenated;
//    for(int i =0; i<this.name.length() ; i++){
//        if(this.name.charAt(i) == ' '){
//            hyphenated[i] = '-';
//
//        }
//    }

        //Instructions in the project are weird, it seems the serach is ok with spaces and doesn't need to be hyphenated
        hyphenated = this.name.replace(' ','-');
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + hyphenated + "&limit=1").get());






    }

    public static void main(String[] args) {
        Music hmm = new Music("Slowly Surely");
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + hmm.name + "&limit=1").get());

        hmm.search();
    }
}
