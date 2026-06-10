public class movietest {
    public static void main(String[] args) {
        movie one = new movie();
        one.title = "Your name";
        one.genre = "romcom";
        one.rating = 8;
        movie two = new movie();
        two.title = "Six of crows";
        two.genre = "Fantasy/Fiction";
        two.rating = 8;
        two.playIt();
        movie three = new movie();
        three.title = "Last of us";
        three.genre = "Dark psycology";
        three.rating = 9;
    }
}