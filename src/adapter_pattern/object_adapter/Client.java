package adapter_pattern.object_adapter;


public class Client {
    public static void main(String[] args) {
        ITarget adapter = new Adapter(new Adaptee());

        adapter.operation();
    }
}
