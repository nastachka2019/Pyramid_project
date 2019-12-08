package by.epam.courses.specification;

import by.epam.courses.entity.Pyramid;

public class SpecificationByX implements Specification {
    private double x;

    public SpecificationByX(double x) {
        this.x = x;
    }

    @Override
    public boolean specified(Pyramid pyramid) {
        return x == pyramid.getSideA().getX();
    }
}
