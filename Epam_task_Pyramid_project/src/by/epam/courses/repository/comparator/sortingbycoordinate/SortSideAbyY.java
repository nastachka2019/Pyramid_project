package by.epam.courses.repository.comparator.sortingbycoordinate;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.repository.comparator.PyramidComparator;

public class SortSideAbyY implements PyramidComparator {

    @Override
    public int compare(Pyramid pr1, Pyramid pr2) {
        return Double.compare(pr1.getSideA().getY(), pr2.getSideA().getY());
    }
}
