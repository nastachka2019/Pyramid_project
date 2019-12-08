package by.epam.courses.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class PyramidValidator {
    private static final Logger logger = LogManager.getLogger();
    public static final Pattern DATA_POINTS = Pattern.compile("^[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+\\s[\\d]+[.][\\d]+$");

    public boolean isValidPyramidData(final String text) {
        final boolean result = DATA_POINTS.matcher(text).matches();   //matches() - сообщает, соответствует ли данная строка
        logger.debug("String is " + result);
        return result;
    }
}
