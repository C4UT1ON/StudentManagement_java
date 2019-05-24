/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RICK
 */
public class DbConnection {    

    public static Connection getConnection() {
        MysqlDataSource dbInfo = new MysqlDataSource();
        dbInfo.setURL("jdbc:mysql://localhost:3306/school_sample?zeroDateTimeBehavior=convertToNull");
        dbInfo.setUser("root");
        dbInfo.setPassword("");
            try {
//                Class.forName("com.mysql.jdbc.Driver");
                return dbInfo.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

}
