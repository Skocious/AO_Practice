package ServiceAccessLayer;

import DataAccessLayer.CustomerDAO;
import DataAccessLayer.CustomerImp;
import entities.Customer;

public interface CustomerSO extends CustomerDAO {

    Customer getCustomerId(int customerId);

    }

