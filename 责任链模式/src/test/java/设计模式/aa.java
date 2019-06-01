package 设计模式;

import org.junit.Test;

public class aa {
    @Test
    public void test1(){
        LeaveRequest request=new LeaveRequest("病假",1);
        Leader leader1=new Director("张三");
        Leader leader2=new Manager("李四");
        Leader leader3=new GeneralManager("王五");
        leader1.setSuccessor(leader2);
        leader2.setSuccessor(leader3);
        leader1.headleRequest(request);
    }
}
