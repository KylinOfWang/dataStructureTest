package com.wdj.partone;

/**
 * Created by DingJin Wang on 2019-5-8
 * TIME 14:28.
 */
public class eightPage {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write("37");
        String val = (String) m.read();
        System.out.println("Contents are: " + val);
    }

    public static class MemoryCell {
        private Object storedValue;

        public Object read() {
            return storedValue;
        }

        public void write(Object x) {
            storedValue = x;
        }
    }
}
