package helper;

import constants.AccountStatus;

import java.util.List;

public class Account {
    String name;
    String email;
    String phoneNumber;
    String userName;
    String password;

    List<Address> shippingAdresses;

    AccountStatus accountStatus;
}
