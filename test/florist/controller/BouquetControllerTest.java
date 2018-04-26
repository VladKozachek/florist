package florist.controller;

import florist.Main;
import florist.model.flowers.Flowers;
import florist.model.flowers.FreshFlowers;
import florist.model.flowers.Rose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BouquetControllerTest  {
    @Test
    void addFlowersTest() {
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        BouquetController bouquetController=new BouquetController();
        bouquetController.addFlowers(rose);
        for (Flowers item:bouquetController.bouquetList){
            assertTrue(bouquetController.bouquetList.size()!=0);
        }
    }

    @Test
    void addAccessories() {
    }

    @Test
    void costCalculation() {
    }

    @Test
    void showBouquet() {
    }

    @Test
    void sortFlowers() {
    }

    @Test
    void searchFlower() {
    }

}