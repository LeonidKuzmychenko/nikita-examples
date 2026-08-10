package project4;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public void startGame(List<Player> playerList){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый начинает " + playerList.get(0));
        System.out.println("Выбери слот от 1 до 6: ");
        int userSlot = scanner.nextInt();

        while (userSlot < 1 || userSlot > 6) {
            System.out.println("Дурак, в барабане всего 6 слотов");
            System.out.println("Выбери слот от 1 до 6: ");
            userSlot = scanner.nextInt();
        }

        int randomShoot;
        do {
            for (Player player : playerList) {
                randomShoot = random.nextInt(1, 6 + 1);
                System.out.println("Крутит барабан " + player + "\nВыстрел....");
                if (randomShoot == userSlot) {
                    System.out.println("Игрок " + player + " застрелился");
                    return;
                }
                System.out.println("Повезло. Следующий");
                System.out.println("------------------------------");

            }
        } while (true);
    }
}
