public class Score {
    private int startingScore;
    private int roomsVisited = 0;
    private int puzzlesSolved = 0;
    private int score;
    private final int PUZZLE_VALUE = 10;
    
    
    //String[] visitedRooms = new String[10];
    
    public Score(int startingScore){
        this.startingScore = startingScore;
    }
    public void visitRoom(){
        roomsVisited = roomsVisited + 1;
    }

    public void solvePuzzle(){
        puzzlesSolved = puzzlesSolved + 1;
    }

    public double getScore(){
        score = startingScore + (puzzlesSolved * PUZZLE_VALUE) - (roomsVisited);
        return (score);
    }

    

        
}
