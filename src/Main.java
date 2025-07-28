import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] gameField = initialize();

        playGame(gameField);

    }



    public static void playGame(int[][] gameField){


        printGameField(gameField);

        int[][] gameFieldUpdate = new int[gameField.length][gameField.length];

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameFieldUpdate[c][r] = 0;

            }
        }

        int neighbours;

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                neighbours = 0;

                for (int x = Math.max(c-1,0) ; x <= Math.min(c+1, gameField.length-1) ; x++){
                    for (int y = Math.max(r-1,0); y <= Math.min(r+1, gameField.length-1) ; y++){

                        neighbours += gameField[x][y];

                    }
                }

                neighbours -= gameField[c][r];

                if (gameField[c][r] == 1){

                    if (neighbours == 2 || neighbours == 3){
                        gameFieldUpdate[c][r] = 1;
                    }
                    else if (neighbours < 2){
                        gameFieldUpdate[c][r] = 0;
                    }
                    else if (neighbours > 3){
                        gameFieldUpdate[c][r] = 0;
                    }
                }
                else if (gameField[c][r] == 0){

                    if (neighbours == 3){
                        gameFieldUpdate[c][r] = 1;
                    }
                    else {
                        gameFieldUpdate[c][r] = 0;
                    }
                }
            }
        }

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameField[c][r] = gameFieldUpdate[c][r];

            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue? y/n");
        String answer = scanner.next();

        if (answer.toUpperCase().equals("Y")){
            playGame(gameField);
        }
    }

    public static void printGameField(int[][] gameField){

        String string = "[\n";

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                string += gameField[c][r];

            }
            string += "\n";
        }

        string += "]";

        System.out.println(string);

    }

    public static int[][] initialize(){


        int[][] gameField = new int[10][10];

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameField[c][r] = 0;

            }
        }

        gameField[1][4] = 1;
        gameField[2][4] = 1;
        gameField[3][4] = 1;
        return gameField;

    }
}