package dmitry.melnik.actionclasses.makearray;

import dmitry.melnik.validationclasses.CheckIsInteger;
import dmitry.melnik.validationclasses.CheckIsType;

import java.util.ArrayList;
import java.util.List;

public class MakeArrayOfInteger implements MakeArray <Integer> {

    private static final String FILE_PATH = "dataFile.txt";
    private static final String SPLIT_PATTERN = "\\t| |\r|\n";

    @Override
    public List<Integer> makeArrayFromFile() {
        String stringFromFile = readStringFromFile(FILE_PATH);
        String[] stringsAfterSplit = splitFromString(stringFromFile,SPLIT_PATTERN);

        CheckIsType checkIsInteger = new CheckIsInteger();
        List<String> arrayOfStrings = checkIsValid(stringsAfterSplit, checkIsInteger);

        List<Integer> arrayOfInteger = new ArrayList<>(arrayOfStrings.size());
        for (String s : arrayOfStrings) {
            arrayOfInteger.add(Integer.parseInt(s));
        }
        return arrayOfInteger;
    }
}
