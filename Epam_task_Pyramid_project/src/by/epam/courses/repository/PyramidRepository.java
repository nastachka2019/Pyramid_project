package by.epam.courses.repository;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class PyramidRepository implements Repository {
    private List<Pyramid> pyramidList;

    public PyramidRepository() {
        pyramidList = new ArrayList<>();
    }

    public List<Pyramid> pyramidList() {
        return pyramidList;
    }

    @Override
    public void add(Pyramid pyramid) {
        pyramidList.add(pyramid);
    }

    @Override
    public void remove(Pyramid pyramid) {
        pyramidList.remove(pyramid);
    }

    @Override
    public void update(Pyramid pyramid) {
        if (!pyramidList.contains(pyramid)) {
            pyramidList.add(pyramid);
        }
    }

    @Override
    public List<Pyramid> query(Specification specification) {
        List<Pyramid> findOfPyramid = new ArrayList<>();

        if (!pyramidList.isEmpty()) {
            for (Pyramid pr : pyramidList) {
                if (specification.specified(pr)) {
                    findOfPyramid.add(pr);
                }
            }
        }
        return findOfPyramid;
    }
}
