package Praktikum8;

public class Warrior extends Character {
    
    public Warrior(){
        super(30, 25, 80);
    }

    @Override
    public boolean attack() {
        double chance = Math.random() * 10;
        if (chance <= 6){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void info() {
        System.out.println("=========== PLAYER ===========");
        super.info();
    }
}
