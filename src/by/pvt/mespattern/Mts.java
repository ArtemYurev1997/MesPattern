package by.pvt.mespattern;

public class Mts extends Operator implements Observer{
    public Mts(String message) {
        super(message);
    }
    private static String attention = "Отправлять уведомление об опасности купания на все смартфоны: ";

    @Override
    public void generate(String message) {
        System.out.println(attention + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Mts! " + message);
    }
}
