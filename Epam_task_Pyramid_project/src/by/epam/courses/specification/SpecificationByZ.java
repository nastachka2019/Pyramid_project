package by.epam.courses.specification;

import by.epam.courses.entity.Pyramid;

public class SpecificationByZ implements Specification {
    private double z;

    public SpecificationByZ(double z) {
        this.z = z;
    }

    @Override
    public boolean specified(Pyramid pyramid) {
        return z == pyramid.getSideA().getZ();
    }
}
