/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Selahattin
 */
public class currentUser{

    private static Connector db=new Connector();

    public static int getAccount_id(){
        try{
            int account_id = -1;
            String query = "SELECT * FROM accounts where account_online = 1";
            db.preState=db.con.prepareStatement(query);
            ResultSet rs=db.preState.executeQuery();
        
            if(rs != null){
                rs.next();    
                account_id = rs.getInt("account_emp_id");
            }
            return account_id;
        }
        catch (SQLException ex) {
            return -1;
        }
    }
    
    public static void main(String args[]) {
        System.out.println(currentUser.getAccount_id());
    }
    
}