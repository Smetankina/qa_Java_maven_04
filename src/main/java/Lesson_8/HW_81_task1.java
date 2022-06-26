package Lesson_8;

import java.util.Locale;

public class HW_81_task1 {
/*
* Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F*/

    String name;


    public String getName() {
        return name;
    }

    public HW_81_task1(String name) {
        this.name = name;

    }

public static String abbrevName(String name) {
    String[] arr = name.split(" ");
    String result  = arr[0].charAt(0)+"."+arr[1].charAt(0);

    return result.toUpperCase();
}


}
