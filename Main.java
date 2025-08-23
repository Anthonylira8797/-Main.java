public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        System.out.println("Do I like running?" + Main.isALike("running"));
        System.out.println("Do I like playing video games?" + Main.isALike("video games"));

        Main.printAboutMe();
    }

    public static void printAboutMe() {
        System.out.println("I love to play video games, lift weights, and sleep.");
    }

    public static boolean isALike(String topic) {
        String myLikes = "I love to play video games, lift weights, and sleep";


        return myLikes.contains(topic);
     
    }
    
}