import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDAOImpl extends DAOImpl<PasswordInfo, String> {
    final static String DB_FILE_NAME = "passwords.db";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PasswordDAOImpl(String dbTableName) {
        super(dbTableName);
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            final String table = " (url text PRIMARY KEY, id text, password text)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + dbTableName);
            statement.executeUpdate("CREATE TABLE " + dbTableName + table);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Statement getStatement(){
        return statement;
    }
    public String getInsertValueStr(PasswordInfo data){
        String fmt = "'%s', '%s', '%s'";
        String q = String.format(fmt, data.getKey(), data.getId(), data.getPassword());
        return q;
    }
    public PasswordInfo getNewData(ResultSet rs){
        PasswordInfo p = null;
        if(rs != null){
            try {
                p = new PasswordInfo(rs.getString("URL"), rs.getString("id"),
                        rs.getString("password"));
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return p;
    }
    public String getKeyColumnName(){
        return "URL";
    }
    public String getUpdateValueStr(PasswordInfo data){
        String fmt = "id = '%s', password = '%s'";
        String q = String.format(fmt, dbTableName, data.getId(), data.getPassword());
        return q;
    }
}
