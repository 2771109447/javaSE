package 设计模式;

public class Manager extends Leader {
    //调用父类构造器
    public   Manager(String name){
        super(name);
    }

    @Override    //重写父类抽象方法
    public void headleRequest(LeaveRequest request) {
        if(request.getLeaveDays()>=3&&request.getLeaveDays()<5){
            System.out.println("经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天。");

        }else {
            if(successor!=null)
            {
                successor.headleRequest(request);
            }
        }

    }


}
