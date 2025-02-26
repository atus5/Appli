package DAO;

import Model.ff;
import Model.ff1;
import java.sql.*;
import java.util.ArrayList;

public class ConnectionSQL {

    protected Connection connection;

    public ConnectionSQL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CoffeeManagementJava;user=sa;password=123;encrypt=true;trustServerCertificate=true;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DAO.ConnectionSQL();
    }

    ///////////////////////////// Write data to datebase SQL
    public boolean addUserToDb(ff1 user) {
        try {
            String sql = "INSERT INTO dbo.UserTable(userName, passWord,email,phone)" + "VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassWord());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhoneNumber());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    ////////////////// Read data from database SQL
    public ArrayList<ff1> getListUser() {
        ArrayList<ff1> userList = new ArrayList<>();

        try {

            String sql = "SELECT * FROM dbo.UserTable";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ff1 user = new ff1();
                user.setUserName(rs.getString("userName"));
                user.setPassWord(rs.getString("passWord"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNumber(rs.getString("phone"));
                System.out.println("userName: " + user.getUserName());
                System.out.println("password: " + user.getPassWord());
                System.out.println("email   : " + user.getEmail());
                System.out.println("phone number: " + user.getPhoneNumber());

                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;

    }

    ////////////////////Update data to user table
    public boolean updateData(String userName, String newpassword) {
        try {
            String sql = "UPDATE dbo.UserTable SET passWord = ? WHERE userName = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(2, userName);
            ps.setString(1, newpassword);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//////////////////////// add food to dâtabase
    public boolean addFoodToSQL(ff food) {
        String sql = "INSERT INTO dbo.FoodTable(id,category,food,price)" + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, food.getId());
            ps.setString(2, food.getCategory());
            ps.setString(3, food.getFood());
            ps.setFloat(4, food.getPrice());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    //////////////////////////////// Read data from database
    public ArrayList<ff> getListFood() {
        ArrayList<ff> foodList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.FoodTable";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ff food = new ff();
                food.setId(rs.getInt("id"));
                food.setCategory(rs.getString("category"));
                food.setFood(rs.getString("food"));
                food.setPrice(rs.getFloat("price"));
                foodList.add(food);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }
////// update to food table
    public void updateDataFood(ff food){
        String sql = "UPDATE dbo.FoobTable SET category = '"+food.getCategory()+"', food = '"+food.getFood()+"', price = '"+food.getPrice()+"' where id = '"+food.getId()+"' ";
        //PreparedStatement ps = connection.prepareStatement(sql);
        //ps.setString(2, food.setCategory());
        
    }
    ////////////////delete row from database
    public void delete(String id) {
        String sql = "DELETE FROM dbo.FoodTable WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id);  
            ps.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }
}
