package Abstraction_Packages_EH.Interfaces.live;

import Abstraction_Packages_EH.Interfaces.music.Playable;
import Abstraction_Packages_EH.Interfaces.music.string.Veena;
import Abstraction_Packages_EH.Interfaces.music.wind.Saxophone;;

public class Test{
    public static void main(String[] args){
        Veena v=new Veena();
        v.play();

        Saxophone s=new Saxophone();
        s.play();

        Playable p;

        p=new Veena();
        p.play();

        p=new Saxophone();
        p.play();
    }
}