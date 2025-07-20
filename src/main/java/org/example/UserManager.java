package org.example;

public class UserManager {
    final private UserRepository userRepository;

    UserManager( UserDatabase userDatabase ){
        this.userRepository = userDatabase;
    }

    public String getUserDetails(){
        return userRepository.getUserDetails();
    }
}
