package project4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //MODEL - хранит данные (Player)
        //VIEW - инициатор (project14.Main)
        //CONTROLLER - обрабатывает данные (project14.Main)

        Player player1 = new Player("Вася", "левша");
        Player player2 = new Player("John", "правша");
        Player player3 = new Player("Игорь", "правша");

        List<Player> playerList = List.of(player1, player2, player3);

        Roulette roulette = new Roulette();
        roulette.startGame(playerList);
    }


}
