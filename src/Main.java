public class Main {
    public static void main(String[] args) {


        int[][] spielfeld = new int[10][10];

        for (int c = 0 ; c < spielfeld.length ; c++){
            for (int r = 0 ; r < spielfeld.length ; r++){

                spielfeld[c][r] = 0;

            }
        }

        spielfeld[1][1] = 1;
        spielfeld[5][5] = 5;




        String string = "[\n";


        for (int c = 0 ; c < spielfeld.length ; c++){
            for (int r = 0 ; r < spielfeld.length ; r++){

                string += spielfeld[c][r];

            }
            string += "\n";
        }

        string += "]";

        System.out.println(string);










    }
}