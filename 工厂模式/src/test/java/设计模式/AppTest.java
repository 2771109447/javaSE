package 设计模式;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import 设计模式.Factory.Factory;
import 设计模式.inteffer.User;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getUser()
    {
        Factory factory=new Factory();
        User user1=factory.getUser(1);
        user1.diffOperation();
        User user2=factory.getUser(2);
        user2.diffOperation();
        User user3= factory.getUser(4);
        User user4=factory.getUser(3);
        user4.diffOperation();
        User user5=factory.getUser(-1);
    }

}
