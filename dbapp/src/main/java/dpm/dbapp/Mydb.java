/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpm.dbapp;
import java.sql.*;

/**
 *
 * @author sspmcoe
 */
public class Mydb {
    Connection connection;
    PreparedStatement st;
    ResultSet rs1,rs2;
    
    Mydb()
    {
        try {       
             Class.forName("com.mysql.jdbc.Driver");
                    connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prescrip_db",
                        "root", "");
               System.out.println("Connect");
            } catch (Exception e) {
                    System.out.println(e);
                }
            
    }
    public void insert(int Prescrip_ID,String Date, String Petition_Name, String Prescription, String Dr_Name, int Fee_amt)
    {
        try {
            st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO `petition` (`Prescrip_ID`, `Date`, `Petition_Name`, `Prescription` ,`Dr_Name`, `Fee_amt`) VALUES ('"+ Prescrip_ID + "', '" + Date + "', '" + Petition_Name + "', '" + Prescription + "', '" + Dr_Name + "', '" + Fee_amt + "')");
            System.out.println(st.execute());
            /*if(st.execute())
            {
                System.out.print("Insert");
                //JOptionPane.showMessageDialog(Mydb, "You have successfully inserted");
            } else {
                        //JOptionPane.showMessageDialog(Mydb, "Wrong input");
                        System.out.print("Insert failed");
                    }*/
        }
        catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
    }
    public static void main(String args[])
    {
        Mydb d =new Mydb();
        //d.insert(1,"13-10-2020","Rohit Desai","Medical Prescription","Dr Guruprasad",250);
        //d.insert(1005,"08-09-2023","Rutuja Khathrut","Medical Prescription","Dr Suryavansi",750);
        //d.insert(1523,"10-09-2023","Bhiva Jadhav","Complementry Medicines","Dr Guruprasad",550);
        //d.insert(1045,"12-09-2023","Sanjit Ingavle","Medical Prescription","Dr Pattansethi",750);
        //d.insert(1047,"12-09-2023","Pallavi Varake","Complementry Medicines","Dr Suryavansi",750);


    }
    
}
