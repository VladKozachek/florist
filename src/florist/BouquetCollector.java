package florist;
import java.util.*;

public class BouquetCollector {

    private ArrayList<Flowers>bouquetList =new ArrayList<>();
    private double summ=0;

    public void creationBouquet(Flowers flowers){ //добавляем цветы в букет
        bouquetList.add(flowers);
    }
    public void costCalculation(){  // считаем стоимость и выодим на экран
        System.out.println("Букет из :");
        for (Flowers item:bouquetList){
            System.out.print("   "+item.getName()+" - "+item.getFreshFlowers()+" - " +item.getPrice()+" - "+item.getLengthOfStem());
            System.out.println();
            summ=summ+item.getPrice();
        }
        System.out.println("Cумма букета - "+summ);
    }

    public void sortFlowers () {  //сортируем цветы в букете по свежести
            Collections.sort(bouquetList, new Comparator<Flowers>() {
                @Override
                public int compare(Flowers f1, Flowers f2) {
                    return f1.getFreshFlowers().compareTo(f2.getFreshFlowers());
                }
            });
        }

        public void  searchFlower(){ //ищем цветок соответствующий заданному диапазону длин стеблей
            double temp = 0;
            System.out.println("Введите диапазон длины стебля : ");
            Scanner sc=new Scanner(System.in);
            int lenghtA=sc.nextInt();
            int lenghtB=sc.nextInt();
            int arr [] =new int[lenghtB-lenghtA];
            int i=0;
            for (int j=0;i<arr.length;i++){
                for (Flowers item:bouquetList){
                    if(item.getLengthOfStem()== arr[i]){
                        temp=item.getLengthOfStem();
                    }
                }
            }
            System.out.println(temp);
        }
    }

