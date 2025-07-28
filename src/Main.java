public class Main {
    public static void main(String[] args) {


        int[][] gameField = new int[10][10];

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameField[c][r] = 0;

            }
        }

        gameField[1][1] = 1;
        gameField[5][5] = 5;




        printGameField(gameField);







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
















}