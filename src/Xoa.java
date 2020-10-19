
import java.sql.Connection;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Xoa {
       public static boolean deleteData(String hoten){
        try {
            Connection connection = Connect.getConnection();
            Statement statement = connection.createStatement();
            String query = "delete from sinhvien where hoten='"+hoten+"';";
            boolean result = statement.execute(query);
            return result;
        }catch (Throwable e){
            e.printStackTrace();
        }
        return false;
    }
}
