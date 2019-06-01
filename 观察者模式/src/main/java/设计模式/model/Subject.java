package 设计模式.model;

import 设计模式.interr.Observer;

import java.util.ArrayList;

public abstract  class Subject {
    protected ArrayList<Observer> observerArrayList=new ArrayList<>();

    public  void attach(Observer observer){
        observerArrayList.add(observer);
    }

    public  void detach(Observer observer){
        observerArrayList.remove(observer);
    }

    abstract  public  void   cry();
}
