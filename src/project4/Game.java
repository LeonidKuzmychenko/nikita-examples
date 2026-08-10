package project4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Вася", "левша");
        Player player2 = new Player("John", "правша");
        Player player3 = new Player("Игорь", "правша");

        Player[] playerArray = {player1, player2, player3};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerIndex = -1;
        while (true) {
            playerIndex++;
            playerIndex = playerIndex % (playerArray.length);

            Player player = playerArray[playerIndex];
            System.out.println("Очередь: " + player);


            int patronChoice = random.nextInt(1, 6 + 1);
            System.out.println("Выбор игрока: " + patronChoice);

            int patron = random.nextInt(1, 6 + 1);
            System.out.println("Патрон в слоте: " + patron);

            if (patron == patronChoice) {
                System.out.println("Застрелился");
                return;
            }
            System.out.println("Пуф. Пустышка. Идем дальше");
            System.out.println();
        }
    }
}
