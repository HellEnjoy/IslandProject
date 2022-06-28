package Animals;

import java.util.ArrayList;

public interface Animal {
    //Location = new Location
    //ArrayList<Animal> animalArrayList = new ArrayList<>();

    void Action();

    //Мы не знаем!
    default Location getLocation(){
        return Location;
    }
}
