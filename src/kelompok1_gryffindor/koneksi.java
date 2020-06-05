/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok1_gryffindor;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;//mengimpor class com.mysql.jdbc
import java.sql.Connection;//mengimpor java.sql.connection
import java.sql.SQLException;//mengimpor java.sql.sqlexception

public class koneksi {//nama file koneksi

    static Connection con;//deklarasi variabel con

    public static Connection connection() {//method yang dapat diakses tanpa menginisiasikan class tersebut
        if (con == null) {//jika variabel con sama dengan null
            MysqlDataSource data = new MysqlDataSource();//membuat objek data
            data.setDatabaseName("tokobuku");//mengambil nama database
            data.setUser("root");//mengambil nama user
            data.setPassword("");//mengambil data password
            try {
                con = data.getConnection();//koneksi akan tersambung
            } catch (SQLException ex) {
                ex.printStackTrace();//output yang keluar jika tidak terhubung
            }
        }
        return con;//mengembalikan nilai pada variabel con
    }
}
