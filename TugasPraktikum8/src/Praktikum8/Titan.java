package Praktikum8;

public class Titan extends Character {

    public Titan(){
        super(0, 45, 200);
    }
    
    @Override
    public boolean attack() {
        double chance = Math.random() * 10;
        if (chance <= 4){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void info() {
        System.out.println("=========== ENEMY ===========");
        super.info();
    }
}
