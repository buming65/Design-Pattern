package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
    }
}
