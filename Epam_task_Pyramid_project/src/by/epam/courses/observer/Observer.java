package by.epam.courses.observer;

public interface Observer<T> {
    void update(PyramidEvent event);  //обработать событие
}
