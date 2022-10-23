import java.util.Scanner;

public class Main {
    public static void main(String... args){
     /*   Animal pipinder = new Animal("Pipinder", 40, 7);
        Animal sanya = new Animal("Sanya", 20, 2);

        pipinder.walk();
        pipinder.animalInfo();
        sanya.animalInfo();*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("ведите данные душу");
        boolean bool = scanner.nextBoolean();

        System.out.println("ведите данные силы");
        double d = scanner.nextDouble();

        System.out.println("ведите данные ккрасоты");
        int i = scanner.nextInt();

        Human alexa = new Human(bool, i, d);
        System.out.println(alexa.info());*/

        Nardi armeniansGame = new Nardi("Aleksan", "Ashot");

        int firstPlayerCounter = 0;
        int secondPlayerCounter = 0;
        int roundCounter = 0;

        for (int i = 0; i < 30; i++) {
            String str = armeniansGame.winnerName();
            if (str.equals("Ashot")){
                secondPlayerCounter++;
            } else {
                firstPlayerCounter++;
            }

            if (i % 10 == 0) {
                 firstPlayerCounter = 0;
                 secondPlayerCounter = 0;
                 roundCounter++;
            }

            System.out.println(armeniansGame.winnerName());
            System.out.println(String.format("Round %d Aleksan wins = %d, Ashot wins = %d",roundCounter,firstPlayerCounter,secondPlayerCounter));
        }



    }
}
