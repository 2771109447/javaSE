package 设计模式.model;

import 设计模式.inteffer.User;

public class Administrator implements User {
    @Override
    public void sameOperayion() {

    }

    @Override
    public void diffOperation() {
           System.out.println("administrator的权限");
    }
}
