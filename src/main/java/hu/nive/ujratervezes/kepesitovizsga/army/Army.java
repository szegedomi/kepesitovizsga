package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        units.add(militaryUnit);
    }

    public int getArmySize(){
        return units.size();
    }

    public void damageAll(int damage){
        List<MilitaryUnit> remainings = new ArrayList<>();
        for(MilitaryUnit unit : units){
            unit.sufferDamage(damage);
            if(unit.getHitPoints() > 25){
                remainings.add(unit);
            }
        }
        units = remainings;
    }

    public int getArmyDamage(){
        int result = 0;
        for(MilitaryUnit unit : units){
            result += unit.doDamage();
        }
        return result;
    }


}
