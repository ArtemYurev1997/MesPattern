package by.pvt.mespattern;

public class Beltelecom extends Operator implements Observer{
    public Beltelecom(String message) {
        super(message);
    }
    private static String attention = "Звонить всем абонентам и уведомлять об опасности купания: ";

    @Override
    public void generate(String message) {
        System.out.println(attention + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение отправлено от Beltelecom! " + message);
    }
}
