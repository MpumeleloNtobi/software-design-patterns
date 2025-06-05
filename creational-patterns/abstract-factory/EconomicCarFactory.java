public class EconomicCarFactory implements AbstractFactory {
    @override
    public Car getInstance(int price) {
        if (price <= 300000) {
            return new EconomicCar1();
        } 
        else if (price > 300000) {
            return new EconomicCar2();
        }
        return null;
    }
}