import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle{
    public static void main(String[] args){

        Hero h=new Hero();
        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        System.out.println();

        Honda h1=new Honda();
        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());
        h1.cdplayer();

        System.out.println();

        Logan l=new Logan();
        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println(l.speed());
        System.out.println("GPS : "+l.gps());

        System.out.println();

        Ford f=new Ford();
        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println(f.speed());
        System.out.println("Temperature : "+f.tempControl());
    }
}