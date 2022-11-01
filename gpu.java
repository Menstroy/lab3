import java.util.Scanner;
public class gpu {
    public String gp_name;
    public int gp_year;
    public float gp_price;

    public gpu(String name, int year, float price) {
        gp_name = name;
        gp_year = year;
        gp_price = price;
    }
    public gpu(float price){
        gp_price = price;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название видеокарты");
        gp_name = in.nextLine();
        System.out.println("Введите год выпуска видеокарты");
        gp_year = in.nextInt();
        System.out.println("Введите цену видеокарты");
        gp_price = in.nextFloat();
    }

    public void output(){
        System.out.println(" название видеокарты: " + gp_name + " год выпуска: " + gp_year + " цена " + gp_price);
    }

}
