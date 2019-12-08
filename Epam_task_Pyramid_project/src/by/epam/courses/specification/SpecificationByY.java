package by.epam.courses.specification;

import by.epam.courses.entity.Pyramid;

public class SpecificationByY implements Specification {
    private double y;

    public SpecificationByY(double y) {
        this.y = y;
    }

    @Override
    public boolean specified(Pyramid pyramid) {
        return y == pyramid.getSideA().getY();
    }
}
