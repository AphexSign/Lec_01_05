import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class WhiteBoxTest {

    @Before
    public void setUp() throws Exception {
        wb = new WhiteBox();
    }

    private WhiteBox wb;


    //Попытка найти среди всех элементов массива 5
    //В случае успеха выдает - 0
    //Массив содержит только 5
    @Test
    public void testValueFound() {
        int[] arr={5,5,5,5,5};
        int length=5;
        int value=5;
        int result=this.wb.find(arr,length,value);
        Assert.assertEquals(0,result);
    }

    //Попытка не найти среди всего массива 5, где этого значения нет
    @Test
    public void testValueNotFound() {
        int[] arr={3,7,5,9,20};
        int length=5;
        int value=5;
        int result=this.wb.find(arr,length,value);
        Assert.assertEquals(-1,result);
    }

    //Попытка подсунуть программе Null-массив и искать значения
    //Ловим ожидаемый exception
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        int[] arr=null;
        int length=5;
        int value=5;
        int result=this.wb.find(arr,length,value);
        Assert.assertEquals(0,result);
    }

//    //По легенде нужно пробегаться по всему массиву
//    //Если есть элемент выдавать 0
//    //Если элемента вообще нет, то выдавать -1
      //Программа работает неправильно

    @Test
    public void testErrorNotFound() {
        int[] arr={5,1,5,5,5};
        int length=5;
        int value=5;
        int result=this.wb.find(arr,length,value);
        Assert.assertEquals(0,result);
    }




//    //72% - 8/11строк
//    @Test
//    public void combineMinTest(){
//        testValueFound();
//        testValueNotFound();
//    }
//
//
//    //100% line coverage - with error
//    @Test(expected = IllegalArgumentException.class)
//    public void combineErrorTest(){
//        testValueFound();
//        testValueNotFound();
//        testIllegalArgumentException();
//        testErrorNotFound();
//    }
//    //100% line coverage - without seems Errors
//    @Test(expected = IllegalArgumentException.class)
//    public void combineNoErrorTest(){
//        testValueFound();
//        testIllegalArgumentException();
//    }

}
