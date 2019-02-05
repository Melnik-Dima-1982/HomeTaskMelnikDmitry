package dmitry.melnik;

import dmitry.melnik.actionclasses.makearray.MakeArrayOfDouble;
import dmitry.melnik.actionclasses.makearray.MakeArrayOfInteger;
import dmitry.melnik.actionclasses.workwitharray.WorkWithArray;
import dmitry.melnik.actionclasses.workwitharray.WorkWithArrayOfDouble;
import dmitry.melnik.actionclasses.workwitharray.WorkWithArrayOfInteger;
import dmitry.melnik.projectexceptions.LengthOfArrayNull;
import dmitry.melnik.projectexceptions.NullLink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static final Logger logger = LogManager.getLogger(Run.class.getName());

    public static void main(String[] args) {
        logger.info("Start Application");
        runClassWorkWithArrayOfDouble();
//        runClassWorkWithArrayOfInteger();
        logger.info("Final");
    }

    public static void runClassWorkWithArrayOfDouble() {
        List<Double> elements = new MakeArrayOfDouble().makeArrayFromFile();
        try {
            WorkWithArray<Double> workWithArray = new WorkWithArrayOfDouble(elements);
            System.out.println("Start array - " + Arrays.toString(elements.toArray()));

            System.out.println("Min in array - " + workWithArray.searchMinInArray());
            System.out.println("Max  in array - " + workWithArray.searchMaxInArray());
            System.out.println("Sum of array - " + workWithArray.sumOfArray());
            System.out.println("Average in array - " + workWithArray.averageOfArray());

            workWithArray.sortArrayFromMinToMax();
            System.out.println("Array after sort - " + Arrays.toString(elements.toArray()));

            workWithArray.changeElementLessParametr(50.0);
            System.out.println("Array after change elements - " + Arrays.toString(elements.toArray()));
        } catch (NullLink nullLink) {
            logger.warn(nullLink);
            nullLink.printStackTrace();
        } catch (LengthOfArrayNull lengthOfArrayNull) {
            logger.warn(lengthOfArrayNull);
            lengthOfArrayNull.printStackTrace();
        }
    }

    public static void runClassWorkWithArrayOfInteger() {
        List<Integer> elements = new MakeArrayOfInteger().makeArrayFromFile();
        try {
            WorkWithArray<Integer> workWithArray = new WorkWithArrayOfInteger(elements);
            System.out.println("Start array - " + Arrays.toString(elements.toArray()));

            System.out.println("Min in array - " + workWithArray.searchMinInArray());
            System.out.println("Max  in array - " + workWithArray.searchMaxInArray());
            System.out.println("Sum of array - " + workWithArray.sumOfArray());
            System.out.println("Average in array - " + workWithArray.averageOfArray());

            workWithArray.sortArrayFromMinToMax();
            System.out.println("Array after sort - " + Arrays.toString(elements.toArray()));

            workWithArray.changeElementLessParametr(50);
            System.out.println("Array after change elements - " + Arrays.toString(elements.toArray()));
        } catch (NullLink nullLink) {
            logger.warn(nullLink);
            nullLink.printStackTrace();
        } catch (LengthOfArrayNull lengthOfArrayNull) {
            logger.warn(lengthOfArrayNull);
            lengthOfArrayNull.printStackTrace();
        }
    }
}
