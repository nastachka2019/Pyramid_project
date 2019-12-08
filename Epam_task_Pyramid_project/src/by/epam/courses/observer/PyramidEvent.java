package by.epam.courses.observer;

import by.epam.courses.entity.Pyramid;

import java.util.EventObject;

public class PyramidEvent extends EventObject {

    public PyramidEvent(Object source) {
        super(source);
    }

    @Override
    public Pyramid getSource() {
        return (Pyramid) super.getSource();
    }
}
