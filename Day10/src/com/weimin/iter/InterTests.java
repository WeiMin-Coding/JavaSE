package com.weimin.iter;

public class InterTests {
    public static void main(String[] args) {
        // Inter i = new Inter();
        Inter i = new InterImpl();
        i.eat();
        i.play();

        InterImpl i2 = new InterImpl();
        i2.eat();
        i2.play();
    }
}
