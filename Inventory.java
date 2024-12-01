public class Inventory {
    private int i = 0;
    public String item;
    final int MAX_ITEMS = 10;
    String bag[];

    
    public Inventory(){
        bag = new String[MAX_ITEMS];
    }

    public void addItem(String item){
        if(i < (MAX_ITEMS)){
            bag[i] = item;
            i = i + 1;
        }else{
            System.out.println("your bag is full");
        }
    }


    
    
    public int hasItem(String item){
        for(int j = 0; j < MAX_ITEMS; j++){
            if(bag[j] != null && bag[j].equals(item)){
                return (j);
            }
        }
        return (-1);
    }

    public void removeItem(String item){
        for(int j = 0; j < MAX_ITEMS; j++){
            if(bag[j] != null && bag[j].equals(item)){
                bag[j] = null;
                System.out.println("no longer in your bag");
                return;
            }
        }
    }

    public String displayInventory(){
        String bagDisplay = "";
        for(int k = 0; k < bag.length; k++){
            if (bag[k] != null){
                bagDisplay = bagDisplay + bag[k];
                bagDisplay = bagDisplay + " ";
            }
        }
        return(bagDisplay);
        
        
    }
   
}
