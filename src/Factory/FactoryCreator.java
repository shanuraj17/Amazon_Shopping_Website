package Factory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Person")){
            return new PersonFactory();
        }
        return null;
    }
}
