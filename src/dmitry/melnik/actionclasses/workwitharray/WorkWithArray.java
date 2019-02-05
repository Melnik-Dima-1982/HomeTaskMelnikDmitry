package dmitry.melnik.actionclasses.workwitharray;

import dmitry.melnik.projectexceptions.LengthOfArrayNull;
import dmitry.melnik.projectexceptions.NullLink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public abstract class WorkWithArray<T extends Number>{ //

    private List<T> arrayOfElements;

    public WorkWithArray(List<T> arrayOfElements) throws NullLink, LengthOfArrayNull {
        if (arrayOfElements == null) {
            throw new NullLink();
        }
        if (arrayOfElements.isEmpty()) {
            throw new LengthOfArrayNull();
        }
        this.arrayOfElements = arrayOfElements;

        this.arrayOfElements = arrayOfElements;
    }

    public List<T> getArrayOfElements() {
        return arrayOfElements;
    }

    public abstract T searchMinInArray();

    public abstract T searchMaxInArray();

    public abstract T sumOfArray();

    public abstract double averageOfArray();

    public abstract void sortArrayFromMinToMax();

    public abstract void changeElementLessParametr(T v);
}
