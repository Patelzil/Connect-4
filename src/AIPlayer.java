public class AIPlayer implements Player
{
    private int boardSize;
    private GameLogic game;

    /* lastMove
     * Purpose - chooses the column to make a move and then sends to the GameLogic
     * @param col - the column of the last move made by the opposite player
     *
     */
    public void lastMove(int col)
    {
        int num = 0; // num chosen by the AI to play

        //todo: randomly select column where the AI will play

        game.setAnswer(num);
    }// end lastMove

    /* gameOver
     * Purpose - called when the game ends to show which player won
     * @param winner - gives the result of the game
     *
     */
    public void gameOver(Status winner)
    {

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
        boardSize = size;
        game = gl;
    }// end setInfo
}//class AIPlayer
