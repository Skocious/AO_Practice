package testsDAL;
import entities.Login;
import DataAccessLayer.LoginImp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testLogin {

    LoginImp loginDAO = new LoginImp();

    @Test
    public void selectProducerLoginId(){
    Login login = loginDAO.selectProducerLoginId(1,"John", "cat");
    Assert.assertEquals(login.getLoginId(), 1);
    }

    @Test
    public void selectCustomerLoginId(){
        Login login = loginDAO.selectCustomerLoginId(1,"John", "cat");
        Assert.assertEquals(login.getLoginId(), 1);
    }


}
