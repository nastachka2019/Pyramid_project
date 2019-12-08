package by.epam.courses.repository.comparator.sortingbysides;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.repository.comparator.PyramidComparator;

public class SortBySideD implements PyramidComparator {
    @Override
    public int compare(Pyramid pr1, Pyramid pr2) {
        return Double.compare(pr1.getSideD(), pr2.getSideD());
    }
}
