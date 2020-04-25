package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackBackServiceTest {
    CashbackBackService service = new CashbackBackService();

    @Test
    public void shouldCashBackPlus() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldCashBackBoundaryMoreThanThousand() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCashBackLessThanThousand() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldCashBackNoMore() {
        assertEquals(0, service.remain(1000));
    }
}
