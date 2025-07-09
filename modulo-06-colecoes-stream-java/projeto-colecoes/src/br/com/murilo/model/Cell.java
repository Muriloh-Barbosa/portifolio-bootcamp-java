package br.com.murilo.model;

public class Cell {
    private int value;
    private boolean fixed;

    public Cell() {
        this.value = 0;
        this.fixed = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(int value) {
        this.value = value;
        this.fixed = true;
    }

    public void setValue(int value) {
        if (!fixed) {
            this.value = value;
        }
    }

    public void clear() {
        if (!fixed) {
            this.value = 0;
        }
    }

    public boolean isEmpty() {
        return value == 0;
    }
}
