package Praktikum8;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public Character(int defense, int attack, int HP){
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(Character role){
        if(role.attack > this.defense){
            this.HP = this.HP - (role.attack - this.defense);
            if(this.HP <= 0){
                this.HP = 0;
            }
        }
    }

    public void info(){
        System.out.println("----------- STATUS -----------");
        System.out.println("Role    : " + this.getClass().getSimpleName());
        System.out.println("HP      : " + this.HP);
        System.out.println("Attack  : " + this.attack);
        System.out.println("Defense : " + this.defense);
    }
}
