package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio();
    }

    @Test
    public void Radio1(){
        Radio radio1 = new Radio(0,5,10,
                0,100,0,9);
    }
    @Test
    public void Radio(){
        Radio radio2 = new Radio(8,99);

        assertEquals(8,radio2.getCurrentStation());
        assertEquals(99,radio2.getCurrentVolume());
    }
}