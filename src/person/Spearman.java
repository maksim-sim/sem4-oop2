package person;

import behavior.CoordXY;

public class Spearman extends InfantryBase {

    private static final int HEALTH = 1000;
    private static final int POWER = 80;
    private static final int AGILITY = 10;
    private static final int DEFENCE = 12;
    private static final int DISTANCE = 1;

    public Spearman(String name, CoordXY pos)
    {
        super(name, 2, HEALTH, POWER, AGILITY, DEFENCE, DISTANCE, pos);
    }

    @Override
    public String toString() {
        return String.format("[Копейщик] %s", name  + " " + position.toString());
    }

}