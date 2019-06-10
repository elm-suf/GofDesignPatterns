package adapter_pattern.class_adapter;

public class Adapter extends Adaptee implements ITarget {

    @Override
    public void operation() {
        System.out.print("operation:\n-\t");
        this.specificOperation();
    }
}
