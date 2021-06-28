public class Television {
    String name;
    public Television(String ShowName)
    {

                this.name = ShowName;




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
            System.out.println(new ServiceCommunicator("http://api.tvmaze.com/singlesearch/shows?q=" + hyphenated).get());






    }

    public static void main(String[] args) {
        Television hmm = new Television("Looney Tunes");
        System.out.println(new ServiceCommunicator("http://api.tvmaze.com/singlesearch/shows?q=" + hmm.name).get());

        hmm.search();
    }
}
