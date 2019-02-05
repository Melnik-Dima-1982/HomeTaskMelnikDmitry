package dmitry.melnik.actionclasses.workwitharray;

import dmitry.melnik.projectexceptions.LengthOfArrayNull;
import dmitry.melnik.projectexceptions.NullLink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class WorkWithArrayOfInteger extends WorkWithArray <Integer> {

    public WorkWithArrayOfInteger(List<Integer> arrayOfElements) throws NullLink, LengthOfArrayNull {
        super(arrayOfElements);
    }

    @Override
    public Integer searchMinInArray() {
        Supplier supplier = () -> Collections.min(getArrayOfElements());
        return (Integer) supplier.get();
    }

    @Override
    public Integer searchMaxInArray() {
        Supplier supplier = () -> Collections.max(getArrayOfElements());
        return (Integer) supplier.get();
    }

    @Override
    public Integer sumOfArray() {
        Supplier supplier = () -> {
            List <Integer> arrayOfInteger = getArrayOfElements();
            int summa = 0;
            for (int i : arrayOfInteger) {
                summa += i;
            }
            return summa;
        };
        return (Integer) supplier.get();
    }

    @Override
    public double averageOfArray() {
        Supplier supplier = () -> {
            List <Integer> arrayOfInteger = getArrayOfElements();
            double averageNum = 0;
            for (int i : arrayOfInteger) {
                averageNum += (double) i;
            }
            return  averageNum / (double) arrayOfInteger.size();
        };
        return (double) supplier.get();
    }

    @Override
    public void sortArrayFromMinToMax() {
        Arrays.sort(new List[]{getArrayOfElements()});
    }

    @Override
    public void changeElementLessParametr(Integer parametr) {
        List <Integer> arrayOfInteger = getArrayOfElements();
        for (int i = 0; i < arrayOfInteger.size(); i++) {
            if (arrayOfInteger.get(i) < parametr) {
                arrayOfInteger.set(i, parametr);
            }
        }
    }
}
