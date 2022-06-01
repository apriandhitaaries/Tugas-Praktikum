package Praktikum8;

public class Healer extends Character {
    
    public Healer(){
        super(10, 10, 70);
    }

    public void heal(){
        this.setHP(this.getHP() + 25);
        System.out.println(">>>>> Skill Heal Activated <<<<");
    }

    @Override
    public boolean attack() {
        double chance = Math.random() * 10;
        if (chance <= 8.5){
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
