package day7;

import java.util.Random;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int quanity = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + quanity + " свободных мест");
        } else {
            System.out.println("Команды полные");
        }
    }


}



