package com.createO.protoType;

public class ConcretePrototype2 implements ProtoType{

    public ProtoType clone() {
        ProtoType protoType =  new ConcretePrototype2();
        //若有属性，再复制值
        return protoType;
    }
}
