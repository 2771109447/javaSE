package 设计模式;

//定义父类为抽象(abstract)类，便于子类重写父类的抽象(abstract)方法
public abstract class Leader {

    protected  String name;

    //创建责任链的下一个接收者(使用聚合)
    protected  Leader successor;

    public Leader(String name) {
        this.name=name;
    }


    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    //抽象(abstract)方法，便于子类重写该方法
    abstract public  void headleRequest(LeaveRequest request);
}
