package abstract_factory_pattern;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractProduct product = factory.createProduct();
        System.out.println(product.getClass());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        product = factory1.createProduct();
        System.out.println(product.getClass());
    }
}
