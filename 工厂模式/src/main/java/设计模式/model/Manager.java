package 设计模式.model;

import 设计模式.inteffer.User;

public class Manager implements User {
    @Override
    public void sameOperayion() {

    }

    @Override
    public void diffOperation() {
        System.out.println("Manager的权限");
    }
}
