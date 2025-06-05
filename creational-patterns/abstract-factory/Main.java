public class Main {
    public static main(String args[]) {
        AbstractFactoryProducer abstractFactoryProducerObj = new AbstractFactoryProducer();
        AbstractFactory abstractfactoryObj = abstractFactoryProducerObj.getFactoryInstance("Premium");
        Car carObj = abstractfactoryObj.getInstance(1000000);
        System.out.println(carObj.getTopSpeed());
    }
}