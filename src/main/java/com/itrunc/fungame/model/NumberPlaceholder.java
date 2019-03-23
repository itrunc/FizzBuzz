package com.itrunc.fungame.model;

public class NumberPlaceholder {
    public int num;
    public String placeholder;

    public NumberPlaceholder(final int num) {
        this.num = num;
        this.placeholder = "";
    }

    @Override
    public String toString() {
        return "NumberPlaceholder [number=" + num + ", placeholder=" + placeholder + "]";
    }
}