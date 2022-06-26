package Lesson_8_Tests;

import Lesson_8.HW_81_task1;
import org.testng.annotations.Test;
import org.testng.Assert;



public class HW_81_task1_Test {

 @Test
     public void abbrevNameTest(){
     Assert.assertEquals(HW_81_task1.abbrevName("Anna Smith"), "A.S");
     Assert.assertEquals(HW_81_task1.abbrevName("ella vita"), "E.V");
        }

        }






