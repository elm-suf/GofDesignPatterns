package adapter_pattern.class_adapter;

class Adaptee {
    public void specificOperation() {
        System.out.println("Specific operation inside: " + getClass().getSimpleName());
    }
}
