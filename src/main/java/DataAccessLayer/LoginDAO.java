package DataAccessLayer;


import entities.Login;

public interface LoginDAO {

    Login selectProducerLoginId(int LoginId, String Username, String Password);

    Login selectCustomerLoginId(int LoginId, String Username, String Password);
}
