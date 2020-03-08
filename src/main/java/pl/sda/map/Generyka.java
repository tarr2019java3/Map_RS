package pl.sda.map;

public class Generyka <T> {

    private T field;
    public Generyka(T field){
        this.field=field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }


}
