package testsDAL;
import entities.Login;
import DataAccessLayer.LoginImp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testLogin {

    LoginImp loginDAO = new LoginImp();

    @Test
    public void selectLoginId(){
    Login login = loginDAO.selectLoginId(1,"John", "cat");
    Assert.assertEquals(login.getLoginId(), 1);
    }
}
