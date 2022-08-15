public class Main {
    public static void main(String[] args) {



       Mercedes mercedes = new Mercedes( " германия ", " гамбурк ",10,Color.RET);
        System.out.println(mercedes.getInfo());
        mercedes.makeVois();
        mercedes.makeVois("пуп пуп");

        System.out.println("********=********");
        Toyota toyota = new Toyota("japon","Токио",2,Color.BROWN);
        System.out.println(toyota.getInfo());
        toyota.makeVois();
        toyota.makeVois("выйу");
        System.out.println("*********=*********");

        Bmw bmw =new Bmw(" германия " ," штутгард ", 13 ,Color.BLEK );
        System.out.println(bmw.getInfo());
        bmw.makeVois();
        bmw.makeVois("р р");
    }
}