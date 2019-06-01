package 设计模式.Factory;

import 设计模式.inteffer.User;
import 设计模式.model.Administrator;
import 设计模式.model.Employee;
import 设计模式.model.Manager;

public class Factory {

    public User getUser(Integer permission){
        if(permission==null){
            return  null;
        }
        if (permission==1){
            return new Employee();

        }else
            if (permission==2){
                return new Manager();
            }else
                if (permission==3){
                    return new Administrator();
                }
                else  return null;
    }
}
