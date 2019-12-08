package by.epam.courses.action;

import by.epam.courses.entity.Pyramid;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PyramidActionGroupTest {
    PyramidAction pyramidAction = new PyramidAction();
    Pyramid pyramid = new Pyramid(4.4, 4.4, 4.4);

    @Test(groups={"unit1"})
    public void testSquare() {
        double actual = pyramidAction.square(pyramid);
        double expected = 37.4231;
        Assert.assertEquals(actual, expected, 0.0001);
    }

    @Test (groups={"unit1"})
    public void testVolume() {
        double actual = pyramidAction.volume(pyramid);
        double expected = 31.857;
        Assert.assertEquals(actual, expected, 0.0001);
    }

    @Test(groups={"unit2"})
    public void testIsPyramid() {
        Assert.assertTrue(pyramidAction.isPyramid(pyramid));
    }

}