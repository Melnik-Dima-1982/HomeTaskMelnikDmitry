package dmitry.melnik.actionclasses.workwitharray;

import dmitry.melnik.projectexceptions.LengthOfArrayNull;
import dmitry.melnik.projectexceptions.NullLink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class WorkWithArrayOfDouble extends WorkWithArray<Double> {

    public WorkWithArrayOfDouble(List<Double> arrayOfElements) throws NullLink, LengthOfArrayNull {
        super(arrayOfElements);
    }

    @Override
    public Double searchMinInArray() {
        Supplier supplier = () -> Collections.min(getArrayOfElements());
        return (Double) supplier.get();
    }

    @Override
    public Double searchMaxInArray() {
        Supplier supplier = () -> Collections.max(getArrayOfElements());
        return (Double) supplier.get();
    }

    @Override
    public Double sumOfArray() {
        Supplier supplier = () -> {
            List <Double> arrayOfDouble = getArrayOfElements();
            double summa = 0;
            for (double i : arrayOfDouble) {
                summa += i;
            }
            return summa;
        };
        return (Double) supplier.get();
    }

    @Override
    public double averageOfArray() {
        Supplier supplier = () -> {
            List <Double> arrayOfDouble = getArrayOfElements();
            double averageNum = 0;
            for (double i : arrayOfDouble) {
                averageNum +=  i;
            }
            return averageNum / arrayOfDouble.size();
        };
        return (Double) supplier.get();
    }

    @Override
    public void sortArrayFromMinToMax() {
        Arrays.sort(new List[]{getArrayOfElements()});
    }

    @Override
    public void changeElementLessParametr(Double parametr) {
        List <Double> arrayOfDouble = getArrayOfElements();
        for (int i = 0; i < arrayOfDouble.size(); i++) {
            if (arrayOfDouble.get(i) < parametr) {
                arrayOfDouble.set(i, parametr);
            }
        }
    }
}
