package com.csci.components.stms;

import com.csci.components.exps.Exp;

public class SReturn extends Stm {

    private Exp exp;

    public SReturn(Exp exp) {
        this.exp = exp;
    }

    public Exp getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return String.format("[ return %s ]", this.getExp().toString());
    }
}
