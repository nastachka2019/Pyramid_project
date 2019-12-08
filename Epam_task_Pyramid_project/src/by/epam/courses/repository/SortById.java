package by.epam.courses.repository;

import by.epam.courses.entity.Pyramid;
import by.epam.courses.repository.comparator.PyramidComparator;

public class SortById implements PyramidComparator {
    @Override
    public int compare(Pyramid pr1, Pyramid pr2) {

        return pr1.getPointID().compareTo(pr2.getPointID());
    }
}
