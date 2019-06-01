package 设计模式.model;

import 设计模式.interr.Observer;

public class SubjectExtend_cat extends Subject{
    @Override
    public void cry() {
        System.out.println("喵喵");
        for(Observer obs:observerArrayList)
        {
            obs.response();
        }
    }

}
