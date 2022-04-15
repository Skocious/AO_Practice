package ServiceAccessLayer;
import DataAccessLayer.ItemsDAO;
import entities.Items;

import java.util.List;

public interface ItemsSO extends ItemsDAO {
    //create Items
    Items createItems(Items items);


    //select Items
    Items selectItemsById(int itemId);


    //select all Items
    List<Items> selectAllItems();


    // update Items
    Items updateItemsById(Items items);

    //delete Items
    int deleteItemsById(int itemId);

}
