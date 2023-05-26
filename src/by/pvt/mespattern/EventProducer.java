package by.pvt.mespattern;

public interface EventProducer {
    void addObserver(Observer observer);
    void print(String message);
}
