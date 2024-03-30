package dao;

public class DaoImplV2 implements IDao{
    @Override
    public double GetData() {
        System.out.println("Version Capteurs");
        double t = 6000;
        return t;
    }
}
