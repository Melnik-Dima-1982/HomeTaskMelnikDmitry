package dmitry.melnik.actionclasses.makearray;

import dmitry.melnik.validationclasses.CheckIsDouble;
import dmitry.melnik.validationclasses.CheckIsType;

import java.util.ArrayList;
import java.util.List;

public class MakeArrayOfDouble implements MakeArray <Double> {

    private static final String FILE_PATH = "dataFile.txt";
    private static final String SPLIT_PATTERN = "\\t| |\r|\n";

    @Override
    public List<Double> makeArrayFromFile() {

        String stringFromFile = readStringFromFile(FILE_PATH);
        String[] stringsAfterSplit = splitFromString(stringFromFile,SPLIT_PATTERN);

        CheckIsType checkIsDouble = new CheckIsDouble();
        List<String> arrayOfStrings = checkIsValid(stringsAfterSplit, checkIsDouble);

        List<Double> arrayOfDouble = new ArrayList<>(arrayOfStrings.size());
        for (String s : arrayOfStrings) {
            arrayOfDouble.add(Double.parseDouble(s));
        }
        return arrayOfDouble;
    }
}
