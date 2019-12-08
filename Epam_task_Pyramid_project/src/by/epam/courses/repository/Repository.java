package by.epam.courses.repository;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.specification.Specification;

import java.util.List;

public interface Repository {
    void add(Pyramid pyramid);

    void remove(Pyramid pyramid);

    void update(Pyramid pyramid);

    List<Pyramid> query(Specification specification);
}
