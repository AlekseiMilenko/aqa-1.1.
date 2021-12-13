package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldTestZero() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemain() {
        int actual = service.remain(350);
        int expected = 650;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestLimit() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestOverLimit() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestUnderLimit() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
}