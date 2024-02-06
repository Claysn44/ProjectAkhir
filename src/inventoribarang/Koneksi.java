package inventoribarang;

import java.sql.*;
   
public class Koneksi {
    private Connection con;    
    public Connection con(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/inventori", "root", "");
            if(con!=null){
                System.out.println("Koneksi berhasil...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}