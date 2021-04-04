package Factory;

import Person.User;

public abstract class AbstractFactory {
    public abstract User getPerson(String person);
}
