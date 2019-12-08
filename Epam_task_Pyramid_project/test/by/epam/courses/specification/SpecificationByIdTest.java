package by.epam.courses.specification;

import by.epam.courses.entity.Pyramid;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SpecificationByIdTest {
    private Specification specification;
    private Pyramid pyramid;

    @BeforeMethod
    public void setUp() {
        pyramid = new Pyramid();
    }

    @AfterMethod
    public void tearDown() {
        pyramid = null;
    }

    @Test
    public void testSpecifiedPositive() {
        specification = new SpecificationById(pyramid.getPointID());
        boolean actual = specification.specified(pyramid);
        assertTrue(actual);
    }

    @Test
    public void testSpecifiedNegative() {
        specification = new SpecificationById("045tg");
        boolean actual = specification.specified(pyramid);
        assertFalse(actual);
    }
}