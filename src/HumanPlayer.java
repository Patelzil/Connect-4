// CLASS: HumanPlayer
//
// Author: Patel Zil, 7876456
//
// REMARKS: Interacts with the GameLogic and the UI(from where we get the human's play)
//
//-----------------------------------------

public class HumanPlayer implements Human, Player
{
    //private int boardSize;
    private GameLogic game;
    private UI actualHuman; // ui to be used

    public HumanPlayer(){ actualHuman = new SwingGUI(); }

    /* setAnswer
     * purpose - sends the column chosen by the actual
     *           player to the GameLogic
     * @param col - the col played by the actual human
     *
     */
    public void setAnswer(int col)
    {
        game.setAnswer(col);
    }// end setAnswer

    /* lastMove
     * Purpose -
     * @param col - the column of the last move made by the opposite player
     *
     */
    public void lastMove(int col)
    {
        actualHuman.lastMove(col);
    }// end lastMove

    /* gameOver
     * Purpose - called when the game ends to show which player won
     * @param winner - gives the result of the game
     *
     */
    public void gameOver(Status winner)
    {
        actualHuman.gameOver(winner);
    }// end gameOver


    /* setInfo
     * Purpose - called for each player before the game starts
     *         sends player basic info about the game
     * @param size- dimension of the board with the size parameter
     * @param gl - for the Player to communicate with this class
     *
     */
    public void setInfo(int size, GameLogic gl)
    {
        game = gl;
        actualHuman.setInfo(this,size);
    }// end setInfo
}// class HumanPlayer
