package 设计模式.model;

import 设计模式.interr.Observer;

public class ObserverImpl_dog implements Observer {

    @Override
    public void response() {
        System.out.println("汪汪！！");
    }
}
