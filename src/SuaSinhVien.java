
import java.sql.Connection;
import java.sql.PreparedStatement;


public class SuaSinhVien {
    public static boolean updateData(String ht,String lop,int ns){
        try {
            Connection connection = Connect.getConnection();
            String query = "update sinhvien set hoten = ?,lop = ? where namsinh = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ht);
            preparedStatement.setString(2, lop);
            preparedStatement.setInt(3,ns);
            boolean result = preparedStatement.execute();
            connection.close();
            return result;
        }catch (Throwable e){
            e.printStackTrace();
        }
        return false;
    }
}
