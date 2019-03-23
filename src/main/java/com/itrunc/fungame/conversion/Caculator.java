package com.itrunc.fungame.conversion;

public abstract class Caculator<T> {

    protected Caculator<T> subCaculator;

    public void setSubCaculator(Caculator<T> subCaculator) {
        this.subCaculator = subCaculator;
    }

    public final T caculate(T obj) throws Exception {
        T tmpObj = this.doCaculation(obj);

        if (null != tmpObj) {
            if (null == subCaculator) {
                return tmpObj;
            } else {
                //Recursive caculation
                return subCaculator.caculate(tmpObj);
            }
        }

        return null;
    }

    protected abstract T doCaculation(T obj) throws Exception;
}