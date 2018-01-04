import java.sql.*;

public class Test {
    private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=cyfirst";
    private static final String USER = "sa";
    private static final String PWD = "cy971110";

    private static Connection conn = null;
    private static PreparedStatement pstat = null;

    public static void connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("loading..");
        }catch(ClassNotFoundException e) {
            System.out.println("未发现类..");
        }

        try {
            conn = DriverManager.getConnection(URL,USER,PWD);
            System.out.println("connecting..");
        }catch (SQLException e) {
            System.out.println("无法连接数据库..");
        }
    }

    public static void insertData(int id, String pwd) {
        try {
            String seek = "insert into cymanagement values(?,?);";
            pstat = conn.prepareStatement(seek);
            pstat.setInt(1,id);
            pstat.setString(2,pwd);

            int res = pstat.executeUpdate();

            System.out.println(res > 0?"插入数据成功！":"插入数据失败！");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(int id) {
        try {
            String seek = "delete from cymanagement where id = ?";
            pstat = conn.prepareStatement(seek);
            pstat.setInt(1,id);

            int res = pstat.executeUpdate();

            System.out.println(res > 0?"删除数据成功！":"删除数据失败！");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateData(int id,String pwd) {
        try {
            String seek = "update cymanagement set pwd = ? where id = ?";
            pstat = conn.prepareStatement(seek);
            pstat.setString(1,pwd);
            pstat.setInt(2,id);

            int res = pstat.executeUpdate();

            System.out.println(res > 0?"更新成功！":"更新失败！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void query(){
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from cymanagement";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                System.out.println(id + " , " + pwd);
            }
        } catch(SQLException e) {
            System.out.println("sql语句执行错误..");
        }
    }

    public static void disconnect() {
        if(conn != null) {
            try {
                conn.close();
                System.out.println("disconnecting..");
            } catch (SQLException e) {
                System.out.println("数据库连接关闭出错..");
            }
        }
    }
    public static void main(String[] args) {
        connect();
        //insertData(1001,"e246");
        //deleteData(1001);
        //updateData(1003,"7777");
        query();
        disconnect();
    }
}
