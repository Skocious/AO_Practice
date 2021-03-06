package DataAccessLayer;

import entities.Items;
import utilities.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//        int item_id;
//        int producer_id;
//        String item_name;
//        String item_description;
//        int price;

public class ItemsImp implements ItemsDAO{

    public ItemsImp() {super();}

    @Override
    public Items createItems(Items items) {
        try (Connection connection = DataBaseConnection.createConnection()) {
            String sql = "insert into items values(default, ?, ?, ?, ?) returning item_id";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(2, items.getItem_name());
            ps.setString(3, items.getItem_description());
            //ps.setInt(0, items.getItem_id());
            ps.setFloat(4, items.getPrice());
            ps.setInt(1, items.getProducer_id());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            items.setItem_id(rs.getInt("item_id"));
            return items;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Items selectItemsById(int itemId) {
        try (Connection connection = DataBaseConnection.createConnection()) {
            String sql = "select * from items where item_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, itemId);
            ResultSet rs = ps.executeQuery();
            rs.next();
            Items items = new Items(
                rs.getInt("item_id"),
                rs.getInt("producer_id"),
                rs.getString("item_name"),
                rs.getString("item_description"),
                rs.getFloat("price")
            );
            return items;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Items> selectAllItems() {
        try (Connection connection = DataBaseConnection.createConnection()) {
            String sql = "select * from items";
            Statement s = connection.createStatement();
            s.execute(sql);
            ResultSet rs = s.getResultSet();
            List<Items> items = new ArrayList<>();
            while (rs.next()) {
                Items itemList = new Items(
                        rs.getInt("item_id"),
                        rs.getInt("producer_id"),
                        rs.getString("item_name"),
                        rs.getString("item_description"),
                        rs.getFloat("price")
                );
                items.add(itemList);
            }
            return items;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Items updateItemsById(Items items) {
        try (Connection connection = DataBaseConnection.createConnection()) {
            String sql = "update items set item_name = ? item_description = ? item_price = ? where item_id = ? * ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, items.getItem_name());
            ps.setString(2, items.getItem_description());
            ps.setFloat(3, items.getPrice());
            ps.setInt(4, items.getItem_id());
            if (ps.executeUpdate() != 0) {
                return items;
            } else {
                return null;
            }
        } catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int deleteItemsById(int itemId) {

        try (Connection connection = DataBaseConnection.createConnection()) {
            String sql = "delete from items where item_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, itemId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

}