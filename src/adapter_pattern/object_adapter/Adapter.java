package adapter_pattern.object_adapter;

public class Adapter implements ITarget {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation() {
        System.out.print("operation:\n-\t");
        this.adaptee.specificOperation();
    }
}
