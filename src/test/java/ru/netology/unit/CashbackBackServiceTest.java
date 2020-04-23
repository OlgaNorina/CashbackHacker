package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackBackServiceTest {
    CashbackBackService service = new CashbackBackService();

    @Test
    public void shouldCashBackPlus() {
        assertEquals(service.remain(2000), 1000);
        assertEquals(service.remain(900), 100);
        assertEquals(service.remain(999), 1);
        assertEquals(service.remain(1001), 999);
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldCashBackNoMore(){
        assertEquals(service.remain(1000), 0);
    }
}
