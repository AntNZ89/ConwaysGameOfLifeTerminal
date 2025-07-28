public class Main {
    public static void main(String[] args) {


        int[][] gameField = new int[10][10];

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameField[c][r] = 0;

            }
        }

        gameField[5][5] = 1;
        gameField[5][6] = 1;
        gameField[5][7] = 1;



        printGameField(gameField);


        int[][] gameFieldUpdate = new int[gameField.length][gameField.length];

        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                gameFieldUpdate[c][r] = 0;

            }
        }






        int nachbarn;


        for (int c = 0 ; c < gameField.length ; c++){
            for (int r = 0 ; r < gameField.length ; r++){

                nachbarn = 0;

                for (int x = Math.max(c-1,0) ; x <= Math.min(c+1, gameField.length-1) ; x++){
                    for (int y = Math.max(r-1,0); y <= Math.min(r+1, gameField.length-1) ; y++){


                        nachbarn += gameField[x][y];



                    }
                }

                nachbarn -= gameField[c][r];


                if (gameField[c][r] == 1){

                    if (nachbarn == 2 || nachbarn == 3){
                        gameFieldUpdate[c][r] = 1;
                    }
                    else if (nachbarn < 2){
                        gameFieldUpdate[c][r] = 0;
                    }
                    else if (nachbarn > 3){
                        gameFieldUpdate[c][r] = 0;
                    }
                }
                else if (gameField[c][r] == 0){

                    if (nachbarn == 3){
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