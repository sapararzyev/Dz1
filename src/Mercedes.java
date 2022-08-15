public class Mercedes extends Bmw{


    public Mercedes(String counter, String adres, int age, Color color) {
        super(counter, adres, age, color);
    }

    public void makeVois() {
        System.out.println("пип пип");
    }
    public void makeVois(String vois) {
        System.out.println(vois);

    }


}
