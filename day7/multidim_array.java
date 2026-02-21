public class multidim_array {
    public static void main(String[] args) {

        // int[][] flats = {
        // {101, 102, 103},
        // {204, 205, 206}
        // };

        // int [] marks; //A 1-D array
        int[][] flats; // A 2-D array
        flats = new int[2][6];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 204;
        flats[1][1] = 205;
        flats[1][2] = 206;

        // printing array using loop
        System.out.println("printing a 2-D array using loop:");

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }

    }
}
