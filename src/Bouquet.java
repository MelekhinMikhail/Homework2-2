import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {
    private Flower[] bouquet;

    public Bouquet() {
        bouquet = new Flower[0];
    }

    public void addFlower(Flower flower, int count) {
        if (bouquet.length != 0) {
            Flower[] array = new Flower[bouquet.length + count];
            for (int i = 0; i < bouquet.length; i++) {
                array[i] = bouquet[i];
            }
            for (int j = array.length - count; j < array.length; j++) {
                array[j] = flower;
            }
            bouquet = Arrays.copyOf(array, array.length);
        } else {
            Flower[] array = new Flower[bouquet.length + count];
            for (int i=0; i<array.length; i++) {
                array[i] = flower;
            }
            bouquet = Arrays.copyOf(array, array.length);
        }

    }

    public void deleteFlower(Flower flower, int count) {
        if (bouquet.length == 0) System.out.println("Букет пустой.");
        else if (count <=0) System.out.println("Количество не должно быть отрицательным или равно нулю.");
        else if (!Arrays.asList(bouquet).contains(flower)) System.out.println("Такого цветка в букете нет.");
        else if (areThereSoManyFlowers(flower, count)) System.out.println("В букете нет такого количества таких цветов.");
        else {
            Flower[] array = new Flower[bouquet.length - count];
            for (int i = 0; i < bouquet.length; i++) {
                if (count == 0) break;
                if (bouquet[i] == flower) {
                    bouquet[i] = null;
                    count--;
                }
            }
            int a = 0;
            for (int j = 0; j < bouquet.length; j++) {
                if (bouquet[j] != null) {
                    array[a] = bouquet[j];
                    a++;
                }
            }
            bouquet = Arrays.copyOf(array, array.length);
        }

    }

    public boolean areThereSoManyFlowers(Flower flower, int count) {
        int k = 0;
        for (int c=0; c<bouquet.length; c++) {
            if (bouquet[c] == flower) {
                k++;
            }
        }
        if (k <= count) return true;
        else return false;
    }

    public double getSumOfBouquet() {
        double sum = 0;
        for (Flower a:bouquet) {
            sum += a.getCost();
        }
        sum *= 1.1;
        return sum;
    }

    public int getLifeSpanOfBouquet() {
        int min = 10000;
        for (Flower a:bouquet) {
            if (a.getLifeSpan() < min) min = a.getLifeSpan();
        }
        return min;
    }

    public void printBouquet() {
        for (Flower a:bouquet) {
            System.out.println(a);
        }
        System.out.println(bouquet.length);
    }

    public void infoBouquet() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(this.getSumOfBouquet());
        System.out.println("Букет стоит: "+result+" руб.   Срок стояния букета: "+this.getLifeSpanOfBouquet()+" дней.");
    }
}
