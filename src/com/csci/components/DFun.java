package com.csci.components;

import com.csci.components.exps.primitive.Id;
import com.csci.components.stms.Stm;

public class DFun extends Def {

    private Type type;
    private Id id;
    private Arg[] args;
    private Stm[] stms;

    public DFun(Type type, Id id, Arg[] args, Stm[] stms) {
        this.type = type;
        this.id = id;
        this.args = args;
        this.stms = stms;
    }

    public Type getType() {
        return type;
    }

    public Id getId() {
        return id;
    }

    public Arg[] getArgs() {
        return args;
    }

    public Stm[] getStms() {
        return stms;
    }

    public String toString() {
        return String.format("[ definition: %s ]", this.getId().getValue());
    }
}