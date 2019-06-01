package 设计模式;

public class GeneralManager extends Leader {
    //调用父类构造器
    public   GeneralManager(String name){
        super(name);
    }

    @Override //重写父类抽象方法
    public void headleRequest(LeaveRequest request) {
        if(request.getLeaveDays()>=5&&request.getLeaveDays()<30){
            System.out.println("总经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天。");

        }else {
            if(successor!=null)
            {
                successor.headleRequest(request);
            }
        }
    }


}
