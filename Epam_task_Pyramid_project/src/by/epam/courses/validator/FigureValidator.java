package by.epam.courses.validator;
import by.epam.courses.action.PyramidAction;
import by.epam.courses.entity.Point;
import by.epam.courses.entity.Pyramid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class FigureValidator {

    static final Logger logger = LogManager.getLogger();
    public boolean isValidSides(Pyramid pyramid) { //проверяем стороны

            if (pyramid.getSideB() <= 0 || pyramid.getSideC()<=0|| pyramid.getSideD()<=0) {
                logger.debug("Pyramid's sides can't be <=0");
            }
               return false;
            }
}