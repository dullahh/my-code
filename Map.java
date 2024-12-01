public class Map {

    public int width;
    public int height;
    final private char EMPTY = '.';
    public String[][] theMap;
    public String mapOutput;
    
    
    public Map(int width, int height){

        this.width = width;
        this.height = height;
        
        this.theMap = new String[width][height];
    
        
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                theMap[i][j] = Character.toString(EMPTY);
            }
        }
        
    }

    public void placeRoom(Position pos, char symbol){
        int x = pos.x;
        int y = pos.y;

        theMap[x][y] =  Character.toString(symbol);
    }

    public String exposeSpot(Position pos){// will use to reveal the characters alloacted to a given coordinate
        int x = pos.x;
        int y = pos.y;

        return theMap[x][y];
    }

    public String display(){
        mapOutput = "";
        for(int k = 0; k < height; k++) {
            for(int m = 0; m < width; m++){
                mapOutput += (theMap[m][k]);
            }
            mapOutput += ("\n");
        }
        return(mapOutput);
        
    }
    

}
