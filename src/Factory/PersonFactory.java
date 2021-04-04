package Factory;

import Person.Buyer;
import Person.Seller;
import Person.User;

public class PersonFactory extends AbstractFactory {

    @Override
    public User getPerson(String person) {
        if(person==null)
            return null;
        else if(person == "Seller")
            return new Seller();
        else if(person == "Buyer")
            return new Buyer();
        return null;
    }
}
