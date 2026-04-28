package ch09_collection_generic.basic.ch13.sec02.exam01;

public class Product<t,k> {
    public t kind;
    public k model;

    public t getKind() {
        return kind;
    }

    public void setKind(t kind) {
        this.kind = kind;
    }

    public k getModel() {
        return model;
    }

    public void setModel(k model) {
        this.model = model;
    }
}
