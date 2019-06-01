package 设计模式.model;

import 设计模式.inteffer.User;

public class Employee implements User {
    @Override
    public void sameOperayion() {

    }

    @Override
    public void diffOperation() {
        System.out.println("Employee的权限");
    }
}
