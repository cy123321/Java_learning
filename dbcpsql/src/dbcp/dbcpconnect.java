package dbcp;

import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class dbcpconnect {
    private static DataSource ds = null;
    static {
        try {
            //加载配置文件
            InputStream in = dbcpconnect.class.getClassLoader().getResourceAsStream("dbcpconfigure.properties");
            //加载输入流
            Properties prop = new Properties();
            prop.load(in);
            //创建数据源
            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取DataSource
    public static DataSource getDataSource() {
        return ds;
    }

    //获取连接
    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    //释放连接
    public static void releaseConnection(Connection conn, PreparedStatement pstat, ResultSet rs) {
        try {
            if(rs != null) {
                rs.close();
            }
            if(pstat != null) {
                pstat.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        String sql = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        try {
            conn = dbcpconnect.getConnection();
            sql = "select * from cymanagement;";
            pstat = conn.prepareStatement(sql);
            rs = pstat.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("pwd"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                dbcpconnect.releaseConnection(conn,pstat,rs);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
