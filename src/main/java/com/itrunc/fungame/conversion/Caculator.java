package com.itrunc.fungame.conversion;

public abstract class Caculator<T> {

    protected Caculator<T> subCalculator;

    public void setSubCalculator(Caculator<T> subCaculator) {
        this.subCalculator = subCaculator;
    }

    public final T caculate(T obj) throws Exception {
        T tmpObj = this.doCaculation(obj);

        if (null != tmpObj) {
            if (null == subCalculator) {
                return tmpObj;
            } else {
                return subCalculator.caculate(tmpObj);
            }
        }

        return null;
    }

    protected abstract T doCaculation(T obj) throws Exception;
}