package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private boolean damagedArmor;

    public Swordsman(boolean armored) {
        super(100,10,armored);
        damagedArmor = false;
    }

    @Override
    public void sufferDamage(int damage){
        if(damagedArmor){
            super.sufferDamage(damage);
        }
        else{
            damagedArmor = true;
        }
    }




}
