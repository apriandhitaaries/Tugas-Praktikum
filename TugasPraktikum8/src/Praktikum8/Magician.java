package Praktikum8;

public class Magician extends Character {
    
    public Magician(){
        super(10, 60, 100);
    }

    @Override
    public boolean attack() {
        double chance = Math.random() * 10;
        if (chance <= 3.5){
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
