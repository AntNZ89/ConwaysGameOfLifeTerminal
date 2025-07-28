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

                System.out.print(nachbarn);




            }
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
















}