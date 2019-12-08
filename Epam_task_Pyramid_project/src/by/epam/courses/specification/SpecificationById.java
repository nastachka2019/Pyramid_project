package by.epam.courses.specification;

import by.epam.courses.entity.Pyramid;

public class SpecificationById implements Specification {
    private String id;

    public SpecificationById(String id) {
        this.id = id;
    }

    @Override
    public boolean specified(Pyramid pyramid) {
        return this.id == pyramid.getPointID();
    }
}
