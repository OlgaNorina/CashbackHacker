package ru.netology.unit

import org.testng.annotations.Test

import org.testng.Assert

class CashbackHackServiceTest  {

    @Test
    public void testRemain() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();
        int actual = service.remain(2000);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
