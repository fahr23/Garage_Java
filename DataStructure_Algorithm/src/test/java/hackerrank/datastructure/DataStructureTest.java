package hackerrank.datastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataStructureTest {

    private DataStructure dataStructure;

    @Before
    public void init() {
        dataStructure = new DataStructure();
    }

    @Test
    public void java1darray() {

        int[] arrayInteger = {1, 3, 5, 6};

        dataStructure.java1darray(arrayInteger);

    }

    @Test
    public void java2darray() {

        int inputArray[][] = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println();
        Assert.assertEquals(19, dataStructure.java2dArray(inputArray));

    }

    @Test
    public void javasubarray() {


        int length = 5;
        int[] inputArray = {1, -2, 4, -5, 1};

        Assert.assertEquals(9, dataStructure.javasubarray(length, inputArray));

    }


    @Ignore
    public void javaArrayList() {
        dataStructure.javaArrayList();
    }

    @Ignore
    public void javaHashset() {
        Set set = new HashSet<>();
        set.add("34" + " " + "34");
        set.size();
    }

    @Ignore
    public void genereic() {

    }


    @Test
    public void printNumbers() {
        List<String> list = new ArrayList<>();
        list.add("A");

        list.addAll(new ArrayList<>());
        System.out.println("fa");

    }

    @Ignore
    public void sort() {
        List list = new ArrayList();

    }


}
