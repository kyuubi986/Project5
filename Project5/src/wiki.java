public class wiki {
    String EntryName;
    public wiki(String wikiEntry)
    {

        this.EntryName = wikiEntry;




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
        hyphenated = this.EntryName.replace(' ','-');
        System.out.println(new ServiceCommunicator("https://en.wikipedia.org/w/api.php?action=query&list=search&srsearch=" + hyphenated +"&format=json").get());






    }

    public static void main(String[] args) {
        wiki hmm = new wiki("Looney Tunes");
        //System.out.println(new ServiceCommunicator("http://api.tvmaze.com/singlesearch/shows?q=" + hmm.EntryName).get());

        hmm.search();
    }
}
