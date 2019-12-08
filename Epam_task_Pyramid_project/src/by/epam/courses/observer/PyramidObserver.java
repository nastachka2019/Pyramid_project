package by.epam.courses.observer;

import by.epam.courses.action.PyramidAction;
import by.epam.courses.action.PyramidSingleton;
import by.epam.courses.entity.Pyramid;
import by.epam.courses.warehouse.PyramidParameters;
import by.epam.courses.warehouse.Warehouse;

public class PyramidObserver implements Observer {
    @Override
    public void update(PyramidEvent event) {
        Pyramid pyramid = event.getSource(); // что бы знать, какой параметр вызвал событие
        PyramidSingleton pyramidSingleton = PyramidSingleton.getInstance(); // предоставляем объект
        PyramidAction pyramidAction = new PyramidAction();
        double square = pyramidAction.square(pyramid);
        double volume = pyramidAction.volume(pyramid);
        String id = pyramid.getPointID();
        PyramidParameters pyramidParameters = new PyramidParameters();
        pyramidParameters.setSquare(square);
        pyramidParameters.setVolume(volume);
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, pyramidParameters);
    }
}

