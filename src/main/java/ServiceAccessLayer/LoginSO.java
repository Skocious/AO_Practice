package ServiceAccessLayer;

import DataAccessLayer.LoginDAO;
import entities.Login;

public interface LoginSO extends LoginDAO {

    Login selectProducerLoginId(int LoginId, String Username, String Password);

    Login selectCustomerLoginId(int LoginId, String Username, String Password);

}
