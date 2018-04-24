package florist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BouquetCollector {
    private ArrayList<Flowers>bouquetList =new ArrayList<>();
    private double summ=0;


    public void creationBouquet(Flowers flowers){
        bouquetList.add(flowers);
    }
    public void costCalculation(){
        System.out.println("Букет из :");
        for (Flowers item:bouquetList){
            System.out.print("   "+item.getName()+" - "+item.getFreshFlowers()+" - " +item.getPrice()+" - "+item.getLengthOfStem());
            System.out.println();
            summ=summ+item.getPrice();
        }
        System.out.println("Cумма букета - "+summ);
    }

    public void sortFlowers (){


    }
}
