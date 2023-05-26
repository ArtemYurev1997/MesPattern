package by.pvt.mespattern;

public class Operator {
    private String message;

    public Operator(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "message='" + message + '\'' +
                '}';
    }
}
