package by.pvt.mespattern;

public class Life extends Operator implements Observer{
    public Life(String message) {
        super(message);
    }
    private static String attention = "Отправлять сообщения чере каждые 10 минут об опасности купания: ";

    @Override
    public void generate(String message) {
        System.out.println(attention + message );
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Life! " + message);
    }
}
