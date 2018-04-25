package florist;

import florist.Controller.BouquetCollector;
import florist.flowers.Rose;
import florist.flowers.Tulip;
import florist.flowers.Violet;

public class Main {
    public static void main(String[] args) {
        BouquetCollector bouquetCollector=new BouquetCollector();
        Tulip tulip2=new Tulip(500,FreshFlowers.OLD,150);
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        Tulip tulip=new Tulip(500,FreshFlowers.MEDIUM,150);
        Violet violet=new Violet(200,FreshFlowers.MEDIUM,165);
        Rose rose3=new Rose(200,FreshFlowers.OLD,175);
        Violet violet2=new Violet(200,FreshFlowers.FRESH,175);
        Violet violet3=new Violet(200,FreshFlowers.OLD,175);
        bouquetCollector.creationBouquet(violet);
        bouquetCollector.creationBouquet(rose);
        bouquetCollector.creationBouquet(tulip2);
        bouquetCollector.creationBouquet(tulip);
        bouquetCollector.creationBouquet(violet2);
        bouquetCollector.creationBouquet(violet3);
        bouquetCollector.creationBouquet(rose3);
        bouquetCollector.costCalculation();
        bouquetCollector.showBouquet();
        bouquetCollector.sortFlowers();
        System.out.println("_____");
        bouquetCollector.showBouquet();
        bouquetCollector.searchFlower();

    }
}
