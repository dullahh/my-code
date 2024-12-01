import java.util.Scanner; 



public class Game {

    static String[] visitList = new String[10];
    static int amountOfVisitedAreas = 0;

    public static String visitCheck(Position pos){
        
        if (!(whatRoom(pos).equals("empty barren stretch of land"))){
            for (int i = 0; i < amountOfVisitedAreas; i++){
                if (visitList[i] != null && visitList[i].equals(whatRoom(pos))){
                    return "visited";
                }

            }
            return "unvisited";
        }
        return "irrelevant";
    }

    static boolean gameFinished = false;

    public static void main(String[] args) {
        start();
        Score playerScore = new Score(100);
    

        //String[] visitList = new String[10];
        String input = "";
        
        boolean ghoulsGone = false;
        Inventory inv = new Inventory();

        Scanner scanner = new Scanner(System.in);

        Position P0 = new Position(6, 2);//here is me declaring an assortment of random locations within my map
        Position P1 = new Position(5, 0);
        Position P2 = new Position(5, 3);
        Position P3 = new Position(6, 4);
        Position P4 = new Position(2, 2);
        Position P5 = new Position(1, 3);
        Position P6 = new Position(2, 5);
        Position P7 = new Position(6, 6);
        Position P8 = new Position(0, 6);
        Position P9 = new Position(0, 0);

        char symbol0 = '&';//here is me declaring an assortment of random symbols within my map thatll corrospond to the positions above
        char symbol1 = '`';
        char symbol2 = '@';
        char symbol3 = '#';
        char symbol4 = ':';
        char symbol5 = 'x';
        char symbol6 = '%';
        char symbol7 = '=';
        char symbol8 = '*';
        char symbol9 = '!';
        char player = '~';

        String Nopresence = "no item to get here";//here are all the details that i will use to associate the presence of items with
        String P2presence = "there's still some tomato puree here";
        String P3presence = "the last batch of grated cheese you made is still here";
        String P4presence = "there is an unused munitions box here";
        String P5presence = "there are gun parts here but no ammo";
        String P6presence = "there is some leftover dough here";
        String P8presence = "there seems to be an item, but theres no way you can get it with these ghouls around";
        String P9presence = "the only remaining item here is your childhood teddy";

        String P0D = "the factory still seems operational, could we still possibly make a gun";//here is the additional details of all the significant locations on my map
        String P1D = "a chef here appears out of no where. He weeps about the catastrophe that has fell on this town. He says 'if you could get me some dough, cheese and tomato sauce, I could make some pizza which would heal my broken heart'";
        String P2D = "the items here still seem fresh, we could get a thing or 2";
        String P3D = "its best if we picked whatever we can gather here before it spoils";
        String P4D = "It's eerie here but there could be items here that may be useful";
        String P5D = "Can't configure it here, if only there was a place we could configure it at";
        String P6D = "it looks suitable for pizza, you try to spin it on your finger but fail miserably";
        String P7D = "you encounter a mysterious machine here that says: 'fuse any 2 random and unrelated items.....at your own risk'";
        String P8D = "how will you deal with these hideous creatures??";
        String P9D = "you must leave here before it collapses";
        

        Room areas0 = new Room("Factory", "it looks like a gun factory", symbol0, P0);// here are the instances of each room/area on the map
        Room areas1 = new Room("pizzaTown", "You're at a pizza restaurant", symbol1, P1);
        Room areas2 = new Room("superMarket", "you used to shop here, but now its abandoned", symbol2, P2);
        Room areas3 = new Room("cheeseStall", "you used to work here but now its ran down", symbol3, P3);
        Room areas4 = new Room("battlefield", "a war broke out here very recently", symbol4, P4);
        Room areas5 = new Room("Camp", "it's a neglected military camp", symbol5,  P5);
        Room areas6 = new Room("Bakery", "this is your favourite bakery now torn to bits", symbol6, P6);
        Room areas7 = new Room("???", "you heard rumours about the government running a project here", symbol7, P7);
        Room areas8 = new Room("ghouls", "a haunted and dangerous place filled with ghouls", symbol8, P8);
        Room areas9 = new Room("Home", "you poor home is devasted and run down", symbol9, P9);
    
        int x = 0;
        int y = 0;

        Position playerPosition = new Position(x, y);

        
        Map gameMap = new Map(7, 7);//declaring a new map instance and then populating it accordingly
        gameMap.placeRoom( P0, symbol0);
        gameMap.placeRoom( P1, symbol1);
        gameMap.placeRoom( P2, symbol2);
        gameMap.placeRoom( P3, symbol3);
        gameMap.placeRoom( P4, symbol4);
        gameMap.placeRoom( P5, symbol5);
        gameMap.placeRoom( P6, symbol6);
        gameMap.placeRoom( P7, symbol7);
        gameMap.placeRoom( P8, symbol8);
        gameMap.placeRoom( P9, symbol9);

        Map OGMap = new Map(7, 7);
        OGMap.placeRoom( P0, symbol0);
        OGMap.placeRoom( P1, symbol1);
        OGMap.placeRoom( P2, symbol2);
        OGMap.placeRoom( P3, symbol3);
        OGMap.placeRoom( P4, symbol4);
        OGMap.placeRoom( P5, symbol5);
        OGMap.placeRoom( P6, symbol6);
        OGMap.placeRoom( P7, symbol7);
        OGMap.placeRoom( P8, symbol8);
        OGMap.placeRoom( P9, symbol9);


        
        


        

        while (!gameFinished){
            System.out.println("");
            String inp = scanner.nextLine();
            String currentRoom = whatRoom(playerPosition);
            switch (inp) {
                case "w":
                    if (visitCheck(playerPosition).equals("unvisited")) {//a series of switch statements regarding movement
                        visitList[amountOfVisitedAreas] = currentRoom;// for the movement ones, I run a checker to see if the player is visiting a new room, as thatll alter their score
                        amountOfVisitedAreas++;
                        playerScore.visitRoom();
                    }
                
                    playerPosition.y = (playerPosition.y == 0) ? 6 : playerPosition.y - 1;// on each movement switch statement, i implememented a warping effect such that when they attept to traverse an end of the map, theyre transferred to the opposite end
                    break;
                case "s":
                    if (visitCheck(playerPosition).equals("unvisited")) {
                        visitList[amountOfVisitedAreas] = currentRoom;
                        amountOfVisitedAreas++;
                        playerScore.visitRoom();
                    }

                    playerPosition.y = (playerPosition.y == 6) ? 0 : playerPosition.y + 1;
                    break;
                case "a":
                    if (visitCheck(playerPosition).equals("unvisited")) {
                        visitList[amountOfVisitedAreas] = currentRoom;
                        amountOfVisitedAreas++;
                        playerScore.visitRoom();
                    }

                    playerPosition.x = (playerPosition.x == 0) ? 6 : playerPosition.x - 1;
                    break;
                case "d":
                    if (visitCheck(playerPosition).equals("unvisited")) {
                        visitList[amountOfVisitedAreas] = currentRoom;
                        amountOfVisitedAreas++;
                        playerScore.visitRoom();
                    }
                
                    playerPosition.x = (playerPosition.x == 6) ? 0 : playerPosition.x + 1;
                    break;
                case "i":
                    String inven = inv.displayInventory();
                    System.out.println(inven);
                    break;
                case "m":
                    String currentChar = gameMap.exposeSpot(playerPosition);
                    char replacement = currentChar.charAt(0);
                    gameMap.placeRoom(playerPosition, player);
                    String mapVisual = (gameMap.display());//reveals the map and appropriateley inserts the player on it accordingly
                    System.out.println(mapVisual);// map is then re altered so that it maintains integrity and no landmarks are lost due to the player being 'on them'
                    gameMap.placeRoom(playerPosition, replacement);
                    
                    break;
                case "l":
                    //String currentRoom = whatRoom(playerPosition);
                    switch (currentRoom){
                        case "Factory":
                            System.out.println((areas0.getDescription()));
                            break;
                        case "pizzaTown":
                            System.out.println((areas1.getDescription()));
                            break;
                        case "superMarket":
                            System.out.println((areas2.getDescription()));
                            break;
                        case "cheeseStall":
                            System.out.println((areas3.getDescription()));
                            break;
                        case "battlefield":
                            System.out.println((areas4.getDescription()));
                            break;
                        case "Camp":
                            System.out.println((areas5.getDescription()));
                            break;
                        case "Bakery":
                            System.out.println((areas6.getDescription()));
                            break;
                        case "???":
                            System.out.println((areas7.getDescription()));
                            break;
                        case "ghouls":
                            System.out.println((areas8.getDescription()));
                            break;
                        case "Home":
                            System.out.println((areas9.getDescription()));
                            break;
                        default:
                            System.out.println("nothing to see here");
                    }
                    break;
 
                case ",":
                    //String currentRoom = whatRoom(playerPosition);
                    switch (currentRoom){
                        case "Factory":
                            System.out.println((areas0.getSymbol()));
                            break;
                        case "pizzaTown":
                            System.out.println((areas1.getSymbol()));
                            break;
                        case "superMarket":
                            System.out.println((areas2.getSymbol()));
                            break;
                        case "cheeseStall":
                            System.out.println((areas3.getSymbol()));
                            break;
                        case "battlefield":
                            System.out.println((areas4.getSymbol()));
                            break;
                        case "Camp":
                            System.out.println((areas5.getSymbol()));
                            break;
                        case "Bakery":
                            System.out.println((areas6.getSymbol()));
                            break;
                        case "???":
                            System.out.println((areas7.getSymbol()));
                            break;
                        case "ghouls":
                            System.out.println((areas8.getSymbol()));
                            break;
                        case "Home":
                            System.out.println((areas9.getSymbol()));
                            break;
                    default:
                        System.out.println(".");
                    }
                    break;
                case "n":
                    //String currentRoom = whatRoom(playerPosition);
                    switch (currentRoom){
                        case "Factory":
                            System.out.println((areas0.getName()));
                            break;
                        case "pizzaTown":
                            System.out.println((areas1.getName()));
                            break;
                        case "superMarket":
                            System.out.println((areas2.getName()));
                            break;
                        case "cheeseStall":
                            System.out.println((areas3.getName()));
                            break;
                        case "battlefield":
                            System.out.println((areas4.getName()));
                            break;
                        case "Camp":
                            System.out.println((areas5.getName()));
                            break;
                        case "Bakery":
                            System.out.println((areas6.getName()));
                            break;
                        case "???":
                            System.out.println((areas7.getName()));
                            break;
                        case "ghouls":
                            System.out.println((areas8.getName()));
                            break;
                        case "Home":
                            System.out.println((areas9.getName()));
                            break;
                        default:
                            System.out.println("");
                    }
                    break;
                case "f":
                    switch(currentRoom){
                        case "Factory":
                            System.out.println(Nopresence);
                            break;
                        case "pizzaTown":
                            System.out.println(Nopresence);
                            break;
                        case "superMarket":
                            System.out.println(P2presence);
                            break;
                        case "cheeseStall":
                            System.out.println(P3presence);
                            break;
                        case "battlefield":
                            System.out.println(P4presence);
                            break;
                        case "Camp":
                            System.out.println(P5presence);
                            break;
                        case "Bakery":
                            System.out.println(P6presence);
                            break;
                        case "???":
                            System.out.println(Nopresence);
                            break;
                        case "ghouls":
                            System.out.println(P8presence);
                            break;
                        case "Home":
                            System.out.println(P9presence);
                            break;
                        default:
                            System.out.println("no item here");
                    }
                    break;
                case "x":
                    switch(currentRoom){
                        case "Factory":
                            System.out.println(P0D);
                            break;
                        case "pizzaTown":
                            System.out.println(P1D);
                            break;
                        case "superMarket":
                            System.out.println(P2D);
                            break;
                        case "cheeseStall":
                            System.out.println(P3D);
                            break;
                        case "battlefield":
                            System.out.println(P4D);
                            break;
                        case "Camp":
                            System.out.println(P5D);
                            break;
                        case "Bakery":
                            System.out.println(P6D);
                            break;
                        case "???":
                            System.out.println(P7D);
                            break;
                        case "ghouls":
                            System.out.println(P8D);
                            break;
                        case "Home":
                            System.out.println(P9D);
                            break;
                        default:
                            System.out.println("nothing to see here");
                    }
                    break;
                case "h"://help option
                    System.out.println("help is here, below are what each key does:");
                    System.out.println("w is to move up, s is to move down, a is to move left, d is to move right");
                    System.out.println("i is to display you inventory, m is to display your map, l shows you a description of your area");
                    System.out.println("',' displays to you the current symbol representing your area, n displays to you the name of the area you're in");
                    System.out.println("p displays your current position on the map, f will display the item in your current area of there is one");
                    System.out.println("x will display extra detail about your current room or the object in your room, h will display this help text");
                    System.out.println("3 will display you your current score, q is to quit the game, r is to remove an item you select from your inventory");
                    System.out.println("c is to craft things (where you are at the right place and have the right items), v is to use special items");
                    System.out.println("p is to pick up items");

                    break;
                case "3":
                    double scoreDisplay = playerScore.getScore();
                    System.out.println(scoreDisplay);
                    //System.out.println(amountOfVisitedAreas);
                    break;
                
                case "q":
                    System.out.println("see you later!!");
                    gameFinished = true;
                    break;

                case "r":
                    System.out.println("what item would you like to remove?");
                    String removal = scanner.nextLine();
                    inv.removeItem(removal);
                    break;

                case "c"://select to craft if youre in the right place and have the right items
                    if (whatRoom(playerPosition) == "pizzaTown" ){
                        if ((inv.hasItem("Dough") != -1 ) && (inv.hasItem("Grated Cheese") != -1) && (inv.hasItem("Tomato Puree") != -1)){//making pizza, a special item in this game
                            playerScore.solvePuzzle();
                            System.out.println("You have solved a puzzle!!!, Congradulations!!!");
                            System.out.println("\n\n");
                            System.out.println("you present the pizza ingredients and the chef's eyes light up");
                            System.out.println("\n");
                            System.out.println("'could it be???, I can make pizza now? This will truly make my heart at rest'");
                            System.out.println("\n");
                            System.out.println("the chef deftly created a magnificent pizza before you with passion and hands it over to you");
                            System.out.println("\n");
                            System.out.println("Thank you so much for this, you saved me!");
                            inv.addItem("Amazing Pizza");
                            System.out.println("\n");
                            System.out.println("you inserted Amazing Pizza in your bag");
                            inv.removeItem("Tomato Puree");
                            inv.removeItem("Grated Cheese");
                            inv.removeItem("Dough");
                        } else{
                                System.out.println("I have no use of what you currently have. I cant really do much for you right now");
                                System.out.println("\n");
                                System.out.println("I wish someone can come and bring me dough, grated cheese and tomato puree so I can make just a simple pizza");
                                /*System.out.println((inv.hasItem("Dough") != -1 ));
                                System.out.println((inv.hasItem("Grated Cheese") != -1));
                                System.out.println((inv.hasItem("Tomato Puree") != -1));*/
                            }
                    }
                    else if(whatRoom(playerPosition).equals("Factory")){
                        if ((inv.hasItem("Munitions Box") != -1 ) && (inv.hasItem("Gun Parts") != -1)){
                            playerScore.solvePuzzle();
                            System.out.println("You have solved a puzzle!!!, Congradulations!!!");//making a gun, a special item in this game
                            System.out.println("\n");
                            System.out.println("you use the machinery in the factory");
                            System.out.println("\n\n\n\n");
                            System.out.println("........after lots of effort");
                            System.out.println("you finally made a gun!!");
                            inv.addItem("Gun");
                            System.out.println("you inserted a gun in your bag");
                            inv.removeItem("Munitions Box");
                            inv.removeItem("Gun Parts");
                        
                        } else {
                            System.out.println("you wander aroud in this factory");
                            System.out.println("no materials here");
                            System.out.println("you have nothing to do here");
                        }
                    }
                    else if(whatRoom(playerPosition).equals("???")){
                        if ((inv.hasItem("Gun") != -1 ) && (inv.hasItem("Amazing Pizza") != -1)){
                            playerScore.solvePuzzle();
                            System.out.println("You have solved a puzzle!!!, Congradulations!!!");
                            System.out.println("could this be the use of this secret government project??");
                            System.out.println("\n\n\n");
                            System.out.println("Mysteriously, your gun and pizza drift out of your bag and towards this mysterious machine");//making a pizza gun, another special item
                            System.out.println("\n\n");
                            System.out.println("they converge into a bright blinding light");
                            System.out.println("\n");
                            System.out.println("IMPOSSIBLE!!!!...... Could it be??");
                            System.out.println("a PIZZA GUN was made!!!!");
                            inv.addItem("Pizza Gun");
                            System.out.println("You insert the Pizza Gun in your bag");
                            inv.removeItem("Amazing Pizza");
                            inv.removeItem("Gun");
                        } else {
                            System.out.println("There lies a massive and mysterious Contraption before you");
                            System.out.println("Rumours say this could be used to save the world......or end it");
                            System.out.println("It seems sophisticated to use so its no use to us now");
                        }

                    } else{
                        System.out.println("Nothing to craft here");
                    }

                    break;

                case "v":
                    System.out.println((inv.hasItem("Amazing Pizza") != -1 ));//this section of code is responsible for game endings
                    System.out.println((inv.hasItem("Gun") != -1));
                    System.out.println((inv.hasItem("Pizza Gun") != -1));
                    System.out.println((whatRoom(playerPosition).equals("ghouls")));
                    if((whatRoom(playerPosition).equals("ghouls"))){
                        if((inv.hasItem("Amazing Pizza") != -1)){
                            ending2();
                        }
                        else if((inv.hasItem("Gun") != -1)){
                            ending1();
                        }
                        else if((inv.hasItem("Pizza Gun") != -1)){
                            ending3();
                        }
                    }
                    else {
                        /*System.out.println((inv.hasItem("Amazing Pizza") != -1 ));
                        System.out.println((inv.hasItem("Gun") != -1));*/
                        System.out.println((inv.hasItem("Pizza Gun") != -1));
                    }
                    break;

                case "p":
                    switch(currentRoom){//picking up items
                        case "superMarket":
                            inv.addItem("Tomato Puree");
                            System.out.println("you inserted Tomato Puree in your bag");
                            break;
                        
                        case "cheeseStall":
                            inv.addItem("Grated Cheese");
                            System.out.println("you inserted Grated Cheese in your bag");
                            break;
                        case "Camp":
                            inv.addItem("Gun Parts");
                            System.out.println("you inserted Gun Parts in your bag");
                            break;
                        case "Bakery":
                            inv.addItem("Dough");
                            System.out.println("you inserted dough in your bag");
                            break;
                        case "Home":
                            inv.addItem("Childhood Toy");
                            System.out.println("you inserted your ChildHood Toy in your bag");
                            break;
                        case "battlefield":
                            inv.addItem("Munitions Box");
                            System.out.println("you inserted a Munitions Box in your bag");
                            break;
                        case "ghouls":
                            
                            System.out.println("you cant access the item here, its far too dangerous");
                        
                            break;
                        default:
                            System.out.println("nothing to pick up here");
                    }
                    break;

                default:
                    System.out.println("that isnt valid");
            }
            
            
            //System.out.println(mapVisual);
            //break;
        }
        
    }

    static void start(){
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you wanna play, type 1 for yes or 2 for no");
        String isPlaying = scanner.nextLine();
        if (isPlaying.equals("1")){
            System.out.println("playing?? get ready....");
            System.out.println("the date is 11/11/2024 and things didnt go well for your OOP assignment");
            System.out.println("as a result, disaster has struck the world and its now a fallout here");
            System.out.println("very little remains out here now, you must venture out");
            System.out.println("What could be out there???");
        }
        else if (isPlaying.equals("2")){
            System.out.println("come again soon!!");
            gameFinished = true;
        }
        else{
            System.out.println("thats not valid!!!");
            start();
        }
    }

    static void ending1(){
        System.out.println("you open fire and begin taking out all the ghouls");
        System.out.println("\n\n");
        System.out.println("you barely had enough bullets but you managed to wipe them all out");
        System.out.println("you then approach to the large object they were concealing");
        System.out.println("Its a time machine!!!!! where will you go with it??");
        System.out.println(".......");
        System.out.println("you decide to go in the time machine back to the start of the fall out");
        System.out.println("you hated them ghouls so much, you want to wipe them out again");
        gameFinished = true;
    }

    static void ending2(){
        System.out.println("the ghouls ferociously swarm you");
        System.out.println("Despite you immense fear and anxiety you stand strong");
        System.out.println("\n");
        System.out.println("You reveal the Amazing Pizza in your bag");
        System.out.println("afterall, you have nothing to lose at this point");
        System.out.println("all of a sudden they became calm and friendly, the pizza has enticed them");
        System.out.println("You begin sharing it out with them and the all dance happily");
        System.out.println(".....");
        System.out.println("they gain your respect and now cleared a path for you to approach to the large object they veiled");
        System.out.println("Its a time machineee!!!! where will you go with it??");
        System.out.println(".......");
        System.out.println("you decide to travel back before the fallout so that you can focus on the OOP assignment and ensure this never happens");
        gameFinished = true;

    }

    static void ending3(){
        System.out.println("you have no idea what this weapon does or capable of");
        System.out.println("these ghouls begin hoarding you so its now the time to test it");
        System.out.println("\n");
        System.out.println("You begin shooting pizza discs, cutting through the monsters");
        System.out.println("After taking out a few, the rest feared you");
        System.out.println("they now bowed to you in fear, your now the boss here");
        System.out.println("in order to please you, they present to you what they were concealing");
        System.out.println("It was a time machine!!!!! where will you go with it?");
        System.out.println("......");
        System.out.println("after some consideration, you decide to pass and not use it");
        System.out.println("you accept that you live in the presense, not in the past not the future");
        gameFinished = true;
    }
    
    static String whatRoom(Position pos) {
        if (pos.x == 6 && pos.y == 2) {
            return "Factory";
        }
        else if (pos.x == 5 && pos.y == 0) {
            return "pizzaTown";
        }
        else if (pos.x == 5 && pos.y == 3) {
            return "superMarket";
        }
        else if (pos.x == 6 && pos.y == 4) {
            return "cheeseStall";
        }
        else if (pos.x == 2 && pos.y == 2) {
            return "battlefield";
        }
        else if (pos.x == 1 && pos.y == 3) {
            return "Camp";
        }
        else if (pos.x == 2 && pos.y == 5) {
            return "Bakery";
        }
        else if (pos.x == 6 && pos.y == 6) {
            return "???";
        }
        else if (pos.x == 0 && pos.y == 6) {
            return "ghouls";
        }
        else if (pos.x == 0 && pos.y == 0) {
            return "Home";
        }
        return "empty barren stretch of land";
    }
        
    

    
}
