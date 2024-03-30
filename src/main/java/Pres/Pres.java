package Pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.MetierImpl;
public class Pres {
    public static void main(String[] args){
        IDao d = new DaoImplV2();
        MetierImpl m = new MetierImpl(d);
        System.out.println("resultat==>" + m.calcul());

    }
}
