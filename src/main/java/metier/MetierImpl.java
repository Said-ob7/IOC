package metier;
import dao.IDao;
public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(){

    }
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul(){
        double res = dao.GetData();
        res *= 356;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
