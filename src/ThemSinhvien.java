
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ThemSinhvien {
public static boolean insertData(String ht,String lop,int ns){
        try {
            Connection connection = Connect.getConnection();
            String query = "insert into sinhvien values(null,?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //preparedStatement.setString(1,"null");
            preparedStatement.setString(1,ht);
            preparedStatement.setString(2,lop);
            preparedStatement.setInt(3, ns);
            boolean result = preparedStatement.execute();
            connection.close();
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return false;
    }
    
}


    

