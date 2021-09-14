/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMonthNum() {
        Assertions.assertEquals(App.monthName(1), "January");
        Assertions.assertEquals(App.monthName(2), "February");
        Assertions.assertEquals(App.monthName(3), "March");
        Assertions.assertEquals(App.monthName(4), "April");
        Assertions.assertEquals(App.monthName(5), "May");
        Assertions.assertEquals(App.monthName(6), "June");
        Assertions.assertEquals(App.monthName(7), "July");
        Assertions.assertEquals(App.monthName(8), "August");
        Assertions.assertEquals(App.monthName(9), "September");
        Assertions.assertEquals(App.monthName(10), "October");
        Assertions.assertEquals(App.monthName(11), "November");
        Assertions.assertEquals(App.monthName(12), "December");
    }
}