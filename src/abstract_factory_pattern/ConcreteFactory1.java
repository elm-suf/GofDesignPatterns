package abstract_factory_pattern;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProduct1();
    }
}
