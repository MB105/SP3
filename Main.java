package src;

public class Main {




    public static void main(String[] args) {
        Menu menu = new Menu();
       menu.startMenu();

        FileIO io = new FileIO();
        //System.out.println(io.scanMediaCategories("100bedstefilm.txt", "Drama"));


        //MovieSearch method
        String filepath="C:/Users/Marle/Desktop/100bedstefilm.txt";

        menu.movieSearch(io,filepath);



    }
}
