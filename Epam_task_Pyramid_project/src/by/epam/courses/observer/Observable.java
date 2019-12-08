package by.epam.courses.observer;

public interface Observable {
    void addObserver(Observer observer); // добавить наблюдателя

    void removeObserver(Observer observer); // удалить

    void notifyObserver(); //уведомить
}
