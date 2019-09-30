package ticTacToe;

import util.Input; //importing the getString and getInt methods from Input.java


public class ticTacToe {


    public static void main(String[] args) {

        //starts with player 1
        String playerTurn = "Player 1";

        showGrid();

        getInput(playerTurn);

        System.out.println("We've got a winner!");

    }

    public static String[][] grid = {
            {"", "A", "B", "C"},
            {"1", "---", "---", "---"},
            {"2", "---", "---", "---"},
            {"3", "---", "---", "---"}
    };

    public static void showGrid(){

        //displays the grid with 3 dashes at the respective indices of the grid array
        //the first column and row display the number and letter strings, respectively
        //number in the first bracket denotes the row, number in the second bracket denotes the column
        System.out.format("%-3s %-3s %-3s %-2s\n", grid[0][0], grid[0][1], grid[0][2], grid[0][3]);  //row 0 column 0, row 0 column 1/A, row 0 column 2/B, row 0 column 3/C
        System.out.format("%-3s %-3s %-3s %-3s\n", grid[1][0], grid[1][1], grid[1][2], grid[1][3]);  // row 1 column A, row 1 column B, row 1 column C
        System.out.format("%-3s %-3s %-3s %-3s\n", grid[2][0], grid[2][1], grid[2][2], grid[2][3]);  // row 2 column A, row 2 column B, row 3 column C
        System.out.format("%-3s %-3s %-3s %-3s\n", grid[3][0], grid[3][1], grid[3][2], grid[3][3]);  // row 3 column A, row 3 column B, row 3 column C
    }

    public static void getInput(String playerTurn){
        boolean playerWon = false;
        Input thisInput = new Input();

        do {
            int columnIndex = 0;
            System.out.format("Select your move %s, by choosing a letter for the column and a number for the row,", playerTurn + "!");
            System.out.println("Choose a column: A, B, or C? \n");
            String columnSelection = thisInput.getString();
            if (columnSelection.equalsIgnoreCase("a")) {
                columnIndex = 1;
            } else if (columnSelection.equalsIgnoreCase("b")) {
                columnIndex = 2;
            } else if (columnSelection.equalsIgnoreCase("c")) {
                columnIndex = 3;
            } else {
                System.out.println("Invalid selection. Please select a column: A, B, or C?");
                getInput(playerTurn);
            }

            System.out.println("Now choose a row:  1, 2, or 3?");
            int rowIndex = thisInput.getInt(1, 3); //starts at index 1 and ends at index 3

            if (playerTurn.equalsIgnoreCase("player 1")) {
                if (grid[rowIndex][columnIndex].equalsIgnoreCase("---")) {
                    grid[rowIndex][columnIndex] = "-X-";
                } else {
                    System.out.println("That space is taken. Try again");
                    getInput(playerTurn);
                }
                //as soon as the player makes a valid selection, the grid will display again, the checkWinner()
                //method will run and see if there are 3 x's in a row, will end. Else, it will be player 2's turn
                showGrid();
                playerWon = checkWinner("-X-");
                playerTurn = "Player 2";
            } else if (playerTurn.equalsIgnoreCase("player 2")) {
                if (grid[rowIndex][columnIndex].equalsIgnoreCase("---")) {
                    grid[rowIndex][columnIndex] = "-O-";
                } else {
                    System.out.println("That space is taken. Try again");
                    getInput(playerTurn);
                }
                showGrid();
                playerWon = checkWinner("-O-");
                playerTurn = "Player 1";
            }
        } while (!playerWon); //the conditions in the playerWon method determine if this do-while keeps looping

    }

    public static boolean checkWinner(String playerChar){
        boolean win = false;
        for(int i = 1; i <= 3; i++){
            if(grid[1][i].equalsIgnoreCase(playerChar) && grid[2][i].equalsIgnoreCase(playerChar) && grid[3][i].equalsIgnoreCase(playerChar)){
                win = true;
                //horizontal win
            } else if(grid[i][1].equalsIgnoreCase(playerChar) && grid[i][2].equalsIgnoreCase(playerChar) && grid[i][3].equalsIgnoreCase(playerChar)){
                win = true;
                //vertical win
            } else if(grid[1][1].equalsIgnoreCase(playerChar) && grid[2][2].equalsIgnoreCase(playerChar) && grid[3][3].equalsIgnoreCase(playerChar)){
                win = true;
                //diagonal win from top left, to bottome right
            } else if(grid[1][3].equalsIgnoreCase(playerChar) && grid[2][2].equalsIgnoreCase(playerChar) && grid[3][1].equalsIgnoreCase(playerChar)){
                win = true;
                //diagonal win from top right to bottom left
            }
        }
        return win;
    }

}
