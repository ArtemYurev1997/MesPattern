package by.pvt.mespattern;

public class Velcom extends Operator implements Observer {
    public Velcom(String message) {
        super(message);
    }
    private static String attention = "Отправлять смски об опасности купания: ";

    @Override
    public void generate(String message) {
        System.out.println(attention + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Velcom! " + message);
    }
}
