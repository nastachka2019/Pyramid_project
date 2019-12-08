package by.epam.courses.repository.comparator.sortingbycoordinate;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.repository.comparator.PyramidComparator;

public class SortSideAbyZ implements PyramidComparator {
    @Override
    public int compare(Pyramid pr1, Pyramid pr2) {
        return Double.compare(pr1.getSideA().getZ(), pr2.getSideA().getZ());
    }
}
