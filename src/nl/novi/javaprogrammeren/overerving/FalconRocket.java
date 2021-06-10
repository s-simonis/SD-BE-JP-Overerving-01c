package nl.novi.javaprogrammeren.overerving;

import java.sql.SQLOutput;

public class FalconRocket extends Rocket {
    public int extraFuel = 10;


    public FalconRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public boolean hasEnoughFuel(int fuel) {
        if(fuel < currentFuel) {
            return true;
        }
        if(fuel < (currentFuel + extraFuel)) {
            return true;
        }
        return false;
    }

    @Override
    public void decreaseFuel(int fuel) {
        if (currentFuel < fuel) {
            extraFuel = extraFuel - (fuel - currentFuel);
            currentFuel = 0;
        }
        else {
            currentFuel = currentFuel - fuel;
        }
    }
}
