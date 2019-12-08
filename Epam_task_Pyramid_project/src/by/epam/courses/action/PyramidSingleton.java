package by.epam.courses.action;

public class PyramidSingleton {
    private static PyramidSingleton instance;

    private PyramidSingleton() {
    }

    public static PyramidSingleton getInstance() {
        if (instance == null) {
            instance = new PyramidSingleton();
        }
        return instance;
    }
}

