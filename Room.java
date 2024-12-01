public class Room {
    public String name;
    public String description;
    public char symbol;
    public Position position;
    public String extraDetail;
    public String itemPresence;
    
    

    
    public Room(String name, String description, char symbol, Position position){
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.itemPresence = itemPresence;
        this.extraDetail = extraDetail;
    }

    public String getName(){
        return(name);
    }

    public String getDescription(){
        return(description);
    }

    public char getSymbol(){
        return(symbol);
    }

    public Position getPosition(){
        return(position);
    }


    
    
}
