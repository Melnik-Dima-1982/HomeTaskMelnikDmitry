package dmitry.melnik.actionclasses.makearray;

import dmitry.melnik.validationclasses.CheckIsType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static dmitry.melnik.Run.logger;

public interface MakeArray <T extends Number> {
    //Метод, который переопределяется при Имплементации
    List<T> makeArrayFromFile();
    //Строка, прочитанная из файла
    default String readStringFromFile(String fileName) {
        StringBuilder stringFromFile = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int count;
            while ((count = fileInputStream.read()) != -1) {
                stringFromFile.append((char) count);
            }
        } catch (FileNotFoundException e) {
            logger.warn(e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.warn(e);
            e.printStackTrace();
        }
        return stringFromFile.toString();
    }
    //Массив, возвращаемый после разделения
    default String[] splitFromString(String s, String reg) {
        return s.split(reg);
    }
    //Проверка на соответствие элементов массива из прошлого метода и создание множества
    default List<String> checkIsValid(String[] strings, CheckIsType checkIsType) {
        List<String> arrayOfNums = new ArrayList<>();
        for (String s : strings) {
            if (checkIsType.checkIsType(s, checkIsType.makePatternOfType())) {
                arrayOfNums.add(s);
            }
        }
        ((ArrayList<String>) arrayOfNums).trimToSize();
        return arrayOfNums;
    }
}
