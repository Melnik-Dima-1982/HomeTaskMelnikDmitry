package dmitry.melnik.validationclasses;

import java.util.regex.Pattern;

public interface CheckIsType {

    Pattern makePatternOfType ();

    boolean checkIsType(String checkedString, Pattern pattern);
}
