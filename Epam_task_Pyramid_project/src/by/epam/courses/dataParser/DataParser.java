package by.epam.courses.dataParser;


import by.epam.courses.validator.PyramidValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.DoubleStream;

import static by.epam.courses.validator.PyramidValidator.DATA_POINTS;

public class DataParser {
    static final Logger logger = LogManager.getLogger();
    private static String delimiter = "//s+";

    public String parseData(final String dataPoints) {
        List<String> pointsCoordinate = new ArrayList<>();
        PyramidValidator pyramidValidator = new PyramidValidator();
        if (pyramidValidator.isValidPyramidData(dataPoints)) {
            Matcher matcher = DATA_POINTS.matcher(dataPoints);            // сопоставляет с каждым символом текста
            pointsCoordinate.add(matcher.group());                   // подходит-добавляем
        } else {
            logger.warn("Invalid  data");
        }
        DoubleStream arrayPointsCoordinates = pointsCoordinate.stream().mapToDouble(Double::parseDouble);  // преобразовываем в Double
        logger.debug("String parsed");
        return Arrays.toString(String.valueOf(arrayPointsCoordinates).split(delimiter));
    }

    public List<List<String>> parseData(List<String> readDataPoint) {
        return parseData(readDataPoint);
    }

}