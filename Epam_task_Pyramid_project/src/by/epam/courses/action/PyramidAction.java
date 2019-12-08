package by.epam.courses.action;

import by.epam.courses.entity.Point;
import by.epam.courses.entity.Pyramid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PyramidAction {
    private static final Logger logger = LogManager.getLogger();

    public double square(Pyramid pyramid) {
        double square;
        square = 1.5 * pyramid.getSideB() * pyramid.getSideC() + Math.sqrt(3) / 4 * Math.pow(pyramid.getSideD(), 2);
        return square;
    }

    public double volume(Pyramid pyramid) {
        double volume;
        volume = pyramid.getSideD() * 2 * Math.pow(pyramid.getSideB(), 2) / 12 * Math.sqrt(3);
        return volume;
    }

    public boolean isPyramid(Pyramid pyramid) {
        boolean result = false;
        if (pyramid.getSideB() == pyramid.getSideC() && pyramid.getSideB() == pyramid.getSideD()) {
            result = true;
            logger.info("It is a regular pyramid");
        }
        return result;
    }

    public boolean isOnCoordinatePlane(Pyramid pyramid) {
        boolean result = false;
        Point[] points = pyramid.getPoints();
        double[] pointA1 = points[1].getCoordinates();
        double[] pointB = points[4].getCoordinates();
        for (int i = 0; i < 2; i++) {
            if (pointA1[i] == 0 || pointB[i] == 0) {
                result = true;
                logger.info("One of the bases of the pyramid lies on the coordinate plane");
            }

        }
        return result;
    }

    public double ratioBetweenVolumes(Pyramid pyramid) {

        Point[] points = pyramid.getPoints();
        double ratio = 0;
        for (int i = 0; i < 3; i++) {
            double[] coordinates1 = points[i].getCoordinates();
            for (int j = i + 1; j < 10; j++) {
                double[] coordinates2 = points[j].getCoordinates();
                double half1 = coordinates1[i];
                double half2 = coordinates2[i];
                ratio = half1 / half2;
            }
        }
        return ratio;
    }
}
