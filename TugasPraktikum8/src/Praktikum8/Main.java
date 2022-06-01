package Praktikum8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama    : Apriandhita Aries Prayoga");
        System.out.println("NIM     : 215150607111019");
        System.out.println("Kelas   : PTI-C");
        System.out.println("");

        Titan villain = new Titan();
        int hero = 0;

        System.out.println("======== Welcome To Fight or Die Game ========");
        System.out.print("Please input your name : ");
        String playerName = input.nextLine();
        
        boolean running = true; 
        while(running){
            System.out.println("Choose your character : ");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");

            try {
                System.out.print("Selected character role : ");
                hero = input.nextInt();
                running = false;
            } catch (Exception e) {
                running = true;
                input.next();
                System.out.println("Wrong input, please choose the role according to the number");
            }

            if (hero == 1) {
                System.out.println();
                System.out.println("Welcome " + playerName + " !");
                System.out.println();
                Magician hero1 = new Magician();
                hero1.info();
                boolean fight = true;
                
                for(int i = 0; fight; i++){
                    if(villain.getHP() > 0 && hero1.getHP()>0){
                        System.out.println("=========== TURN " + (i + 1) + " ===========");

                        if(hero1.attack()){
                            hero1.receiveDamage(villain);
                        } else if(villain.attack()){
                            villain.receiveDamage(hero1);
                        }

                        System.out.println(playerName +"'s HP : "+ hero1.getHP());
                        System.out.println("Enemy's HP : " + villain.getHP());
                    } else {
                        fight = false;
                    }
                }

                System.out.println("");
                if(villain.getHP() == 0){
                    System.out.println("     " + playerName + " WIN this fight     ");
                } else if(hero1.getHP() == 0){
                    System.out.println("     Villain WIN this fight     ");
                }
                System.out.println("");
                hero1.info();
                villain.info();
                System.out.println("------------------------------");
                System.out.println("");
                
            } else if(hero == 2){
                System.out.println();
                System.out.println("Welcome " + playerName + " !");
                System.out.println();
                Healer hero2 = new Healer();
                hero2.info();
                boolean fight = true;
                
                for(int i = 0; fight; i++){
                    if(villain.getHP() > 0 && hero2.getHP()>0){
                        System.out.println("=========== TURN " + (i + 1) + " ===========");
                        if(i % 2 == 1){
                            hero2.heal();
                        } else if(hero2.attack()) {
                            hero2.receiveDamage(villain);
                        } else if(villain.attack()) {
                            villain.receiveDamage(hero2);
                        }
                        System.out.println(playerName + "'s HP : " + hero2.getHP());
                        System.out.println("Enemy's HP : " + villain.getHP());
                    } else {
                        fight = false;
                    }
                }

                System.out.println("");
                if(villain.getHP() == 0){
                    System.out.println("     " + playerName +" WIN this fight     ");
                } else if(hero2.getHP() == 0){
                    System.out.println("     Villain WIN this fight     ");
                }
                System.out.println("");
                hero2.info();
                villain.info();
                System.out.println("------------------------------");
                System.out.println("");
                
            } else if(hero == 3){
                System.out.println();
                System.out.println("Welcome " + playerName + " !");
                System.out.println();
                Warrior hero3 = new Warrior();
                hero3.info();
                boolean fight = true;
                
                for(int i = 0; fight; i++){
                    if(villain.getHP() > 0 && hero3.getHP()>0){
                        System.out.println("=========== TURN " + (i + 1) + " ===========");
                        if(hero3.attack()){
                            hero3.receiveDamage(villain);
                        } else if(villain.attack()){
                            villain.receiveDamage(hero3);
                        }
                        System.out.println(playerName + "'s HP : " + hero3.getHP());
                        System.out.println("Enemy's HP : " + villain.getHP());
                    } else {
                        fight = false;
                    }
                }
                System.out.println("");
                if(villain.getHP() == 0){
                    System.out.println("     " + playerName +" WIN this fight     ");
                } else if(hero3.getHP() == 0){
                    System.out.println("     Villain WIN this fight     ");
                }
                System.out.println("");
                hero3.info();
                villain.info();
                System.out.println("------------------------------");
                System.out.println("");

            } else {
                System.out.println("Character role not available");
                running = true;
            }
        }
        input.close();
    }
}

