package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackBackServiceTest {
    CashbackBackService service = new CashbackBackService();

    @Test
    public void shouldCashBackPlus() {
        assertEquals(1000, service.remain(2000));
        assertEquals(100, service.remain(900));
        assertEquals(1, service.remain(999));
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCashBackNoMore(){
        assertEquals(0, service.remain(1000));
    }
}
