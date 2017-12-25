package com.csci.grammar; // Java Package generated by the BNF Converter.

import com.csci.visitor.EvalVisitor;
import com.csci.visitor.PrintVisitor;

public class SInit extends Stm {

    public Type type_;
    public String id_;
    public Exp exp_;

    public SInit(Type p1, String p2, Exp p3) {
        type_ = p1;
        id_ = p2;
        exp_ = p3;
    }

    @Override
    public String accept(PrintVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public Object eval(EvalVisitor visitor) {
        return visitor.visit(this);
    }
}
