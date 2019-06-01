package 设计模式.model;

import 设计模式.interr.Observer;

public class ObserverImpl_mouse implements Observer {
    @Override
    public void response() {
        System.out.println("吱吱！！");

    }
}
