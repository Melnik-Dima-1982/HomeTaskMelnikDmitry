package dmitry.melnik.validationclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIsDouble implements CheckIsType {

    public static final String PATTERN_FOR_DOUBLE = "^-{0,1}([0-9]*)\\.[0-9]{0,}$";

    public boolean checkStringIsDouble(String checkedString) {
        Pattern doublePattern = Pattern.compile(PATTERN_FOR_DOUBLE);
        Matcher doubleMatcher = doublePattern.matcher(checkedString);
        return doubleMatcher.find();
    }

    @Override
    public Pattern makePatternOfType() {
        Pattern doublePattern = Pattern.compile(PATTERN_FOR_DOUBLE);
        return doublePattern;
    }

    @Override
    public boolean checkIsType(String checkedString, Pattern pattern) {
        Matcher doubleMatcher = pattern.matcher(checkedString);
        return doubleMatcher.find();
    }
}
