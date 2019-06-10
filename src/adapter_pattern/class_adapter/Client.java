package adapter_pattern.class_adapter;

public class Client {

    public static void main(String[] args) {
        ITarget adapter = new Adapter();
        adapter.operation();
    }
}
