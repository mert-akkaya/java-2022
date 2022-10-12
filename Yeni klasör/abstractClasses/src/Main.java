public class Main {

    public static void main(String[] args) {
        GameCalculater[] gameCalculater = new GameCalculater[]{new ManGameCalculater(),new WomenGameCalculater(),new KidsGameCalculater()};

        for (GameCalculater gameCalculaters :gameCalculater){
            gameCalculaters.hesapla();

        }
        // tek çağırmak için
        GameCalculater gameCalculater1 = new WomenGameCalculater();
        gameCalculater1.hesapla();


    }
}
