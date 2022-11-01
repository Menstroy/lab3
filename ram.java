import java.util.Scanner;
public class ram {
    public String rm_name;
    public int rm_volume;
    public float rm_price;

    public ram(String name, int volume, float price) {
        rm_name = name;
        rm_volume = volume;
        rm_price = price;
    }
    public ram(float price){
        rm_price = price;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название ОЗУ");
        rm_name = in.nextLine();
        System.out.println("Введите объем ОЗУ");
        rm_volume = in.nextInt();
        System.out.println("Введите цену ОЗУ");
        rm_price = in.nextFloat();
    }

    public void output(){
        System.out.println(" название ОЗУ: " + rm_name + " объем: " + rm_volume + " цена " + rm_price);
    }

}