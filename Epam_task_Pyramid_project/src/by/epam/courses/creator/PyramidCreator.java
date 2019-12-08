package by.epam.courses.creator;

import by.epam.courses.dataParser.DataParser;
import by.epam.courses.exception.DataReaderException;
import by.epam.courses.reader.DataReader;
import by.epam.courses.validator.PyramidValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PyramidCreator {

    private static final Logger logger = LogManager.getLogger();
    private final DataReader dataReader;
    private final PyramidValidator pyramidValidator;
    private final DataParser dataParser;

    public PyramidCreator(DataReader dataReader, PyramidValidator pyramidValidator, DataParser dataParser) {
        this.dataReader = dataReader;
        this.pyramidValidator = pyramidValidator;
        this.dataParser = dataParser;
    }

    public List<String> createPyramidList(String path) throws DataReaderException {
        List<String> pyramidList = new ArrayList<>();
        List<String> data = dataReader.readDataPoint(path);
        for (String line : data) {
            if (pyramidValidator.isValidPyramidData(line)) {                //проверяем всю строку на валидность,создаем переменную, добавляем в лист
                String pyramid = dataParser.parseData(line);
                if (pyramid == null) {
                    continue;
                }
                pyramidList.add(line);
            }
        }

        if (pyramidList.size() == 0) {
            logger.error("Error in creating");
        }
        return pyramidList;
    }
}
