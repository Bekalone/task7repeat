package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String superPowersType) {
        super(health, damage, superPowersType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность: Heal Points");
    }
    public String info (){
        return super.info();
    }
}
