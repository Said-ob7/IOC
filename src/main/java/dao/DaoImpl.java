package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    public double GetData(){
        System.out.println("Version base donnee");
        double t = 23;
        return t;
    }

}
