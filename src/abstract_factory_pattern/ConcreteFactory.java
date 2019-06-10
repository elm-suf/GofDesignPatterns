package abstract_factory_pattern;

public class ConcreteFactory extends AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProduct();
    }
}
