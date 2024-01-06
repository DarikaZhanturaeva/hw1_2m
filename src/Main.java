public class Main {
    public static void main(String[] args) {
        Home home = new Home("Tokombaeva 23");
        Grandfather grandfather = new Grandfather("Den", 76, home, HobbyEnum.GARDENING);
        System.out.println(grandfather.getInfo());
        System.out.println("----------");
        Father father = new Father("Sam", 40, home, HobbyEnum.READING_BOOKS, "teacher");
        System.out.println(father.getInfo());
        father.goWork();
        father.goWork("в 8 утра");
        System.out.println("----------");
        Son son = new Son("Nurs", 18, home, HobbyEnum.PAINTING, "waiter", "KSLA");
        System.out.println(son.getInfo());
        son.goWork("after university");
        System.out.println("----------");
        Son son1 = new Son("Aiba", 20, home, HobbyEnum.PLAYING_BOARD_GAMES, "courier", "KNU");
        System.out.println(son1.getInfo());
        son1.goWork("after university");
    }
}