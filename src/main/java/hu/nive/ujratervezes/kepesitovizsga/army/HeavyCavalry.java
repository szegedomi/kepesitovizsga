package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int numOfAttack;

    public HeavyCavalry() {
        super(150,20,true);
        numOfAttack = 0;
    }

    @Override
    public int doDamage(){
        if(numOfAttack == 0){
            numOfAttack++;
            return getDamage()*3;
        }
        else{
            numOfAttack++;
            return getDamage();
        }
    }



}
