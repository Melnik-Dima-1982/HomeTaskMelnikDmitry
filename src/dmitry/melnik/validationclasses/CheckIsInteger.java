package dmitry.melnik.validationclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIsInteger implements CheckIsType {
    public static final String PATTERN_FOR_INTEGER = "^-{0,1}([0-9]{1,})$";

    @Override
    public Pattern makePatternOfType() {
        Pattern integerPattern = Pattern.compile(PATTERN_FOR_INTEGER);
        return integerPattern;
    }

    @Override
    public boolean checkIsType(String checkedString, Pattern pattern) {
        Matcher integerMatcher = pattern.matcher(checkedString);
        return integerMatcher.find();
    }
}
