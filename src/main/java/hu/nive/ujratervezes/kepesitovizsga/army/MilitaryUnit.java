package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean armored;

    public MilitaryUnit(int hitPoints, int damage, boolean armored) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armored = armored;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isArmored() {
        return armored;
    }

    public int doDamage(){
        return damage;
    }

    public void sufferDamage(int damage){
        if(isArmored()) {
            hitPoints -= damage/2;
        }
        else{
            hitPoints-= damage;
        }
    }

}
