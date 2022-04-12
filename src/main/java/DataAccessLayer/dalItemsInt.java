package DataAccessLayer;

import Entities.Items;

public class dalItemsInt extends Items {

    public dalItemsInt(String dalItemName, String dalItemDescription, int itemId){
        super(Items);
        this.dalItems = dalItemsInt;
    }

    public static void main(String[] args){
        dalItemsInt obj = new dalItemsInt();
        obj.createItem();

    }

    public void createItem(String dalItemName, String dalItemDescription, int dalItemId){

    }



}
