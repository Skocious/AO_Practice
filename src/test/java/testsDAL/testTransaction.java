package testsDAL;

import DataAccessLayer.TransactionImp;
import entities.Transaction;
import org.testng.annotations.Test;

public class testTransaction {
    TransactionImp transactionDAO = new TransactionImp();

    @Test
    public void createTransactionSuccess(){
        Transaction newTransaction = new Transaction()
    }


}
