import com.workintech.burgercompany.DeluxeBurger;
import com.workintech.burgercompany.Hamburger;
import com.workintech.burgercompany.HealthyBurger;

public class Main {
    public static void main(String[] args) {
       Hamburger hamburger1=new DeluxeBurger("KİNG CHİCKEN","ET","YUVARLAK SUSAMLI","kola",true,3);
        hamburger1.setAddition2Name("marul",10);
        hamburger1.setAddition3Name("turşu",15);

        System.out.println(hamburger1.totalHamburger());
        System.out.println("*************");

        Hamburger healhyHamburger=new HealthyBurger("healthyBurger","et","sandviç",64.7);
        healhyHamburger.setAddition1Name("marul",7);
        System.out.println(healhyHamburger.totalHamburger());
    }
}