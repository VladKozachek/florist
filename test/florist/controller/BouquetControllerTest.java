package florist.controller;

import florist.model.accessories.Color;
import florist.model.accessories.Tape;
import florist.model.flowers.FreshFlowers;
import florist.model.flowers.Rose;
import florist.model.flowers.Violet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BouquetControllerTest  {
    @Test
    void addFlowersTest() {   //проверяем добавился элемент а в лист
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        BouquetController bouquetController=new BouquetController();
        bouquetController.addFlowers(rose);
        assertTrue(bouquetController.bouquetList.size()!=0);
    }

    @Test
    void addAccessoriesTest() {  //проверяем добавился элемент в лист
        Tape tape=new Tape(Color.GREEN,15);
        BouquetController bouquetController=new BouquetController();
        bouquetController.addAccessories(tape);
        assertTrue(bouquetController.accessoriesList.size()!=0);
    }

    @Test
    void costCalculationTest() {  //проеряем правильно ли считает сумму букета
        BouquetController bouquetController=new BouquetController();
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        Tape tape=new Tape(Color.GREEN,15);
        bouquetController.addFlowers(rose);
        bouquetController.addAccessories(tape);
        bouquetController.costCalculation();
        double n=bouquetController.price;
        assertEquals(315,n);
    }

    @Test
    void searchFlower() {
        BouquetController bouquetController=new BouquetController();
        Rose rose=new Rose(300,FreshFlowers.FRESH,200);
        Violet violet3=new Violet(200,FreshFlowers.OLD,175);
        Tape tape=new Tape(Color.GREEN,15);
        bouquetController.addFlowers(rose);
        bouquetController.addAccessories(tape);
        bouquetController.searchFlower();
    }

}