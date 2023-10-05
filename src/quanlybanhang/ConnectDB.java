/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybanhang;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import  java.sql.PreparedStatement;
public class ConnectDB {
    public static Connection getConnection(){
       final String url="jdbc:mysql:/localhost:3306??//quanlybanhang";
       final String user="root";
       final String password="";
        
        Connection connection=null;
        
        try
        {
            connection=DriverManager.getConnection(url,user,password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return  connection;
    }
    
    public static List<Sanpham> findAll()
    {
        List<Sanpham> listSP=new ArrayList<>();
        String query="select*from Sanpham";
        
        try {
            Connection connection=getConnection();
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                Sanpham sp=new Sanpham(rs.getInt("IdSanPham"),rs.getString("TenSanPham"),rs.getFloat("Gia"));
                listSP.add(sp);
            
            }
        
        
        } catch (Exception e) {
        }
        return listSP;
    }
    
    public static void Insert(Sanpham sp)
    {
        String query="insert into Sanpahm(IdSanPham,TenSanPham,Gia) values(?,?,?)";
                
        try {
            Connection connection=getConnection();
            PreparedStatement pstmt=connection.prepareStatement(query);
            pstmt.setString(1,sp.getTenSanPham());
            pstmt.setFloat(2, sp.getGia());
            pstmt.execute();
        
        } catch (Exception e) {
        }
    }
    
    public static void Delete(Sanpham sp)
    {
        String query="delete from Sanpham where IdSanPham='"+sp.getIdSanPham()+"'";
                
        try {
            Connection connection=getConnection();
            PreparedStatement pstmt=connection.prepareStatement(query);
            
            pstmt.executeUpdate();
        
        } catch (Exception e) {
        }
    }
    
    public static void Update(Sanpham sp)
    {
        String query="update Sanpham set TenSanPham=?,Gia=? where IdSanPham='"+sp.getIdSanPham()+"'";
                
        try {
            Connection connection=getConnection();
            PreparedStatement pstmt=connection.prepareStatement(query);
            pstmt.setString(1,sp.getTenSanPham());
            pstmt.setFloat(2, sp.getGia());
            pstmt.executeUpdate();
        
        } catch (Exception e) {
        }
    }
    
    public static  List<Sanpham> findById(Sanpham s)
    {
       
        String query="select*from Sanpham where IdSanPham='"+s.getIdSanPham()+"'";
          List<Sanpham> listSP=new ArrayList<>();
        
        try {
            Connection connection=getConnection();
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                Sanpham sp=new Sanpham(rs.getInt("IdSanPham"),rs.getString("TenSanPham"),rs.getFloat("Gia"));
                listSP.add(sp);
            
            }
        
        
        } catch (Exception e) {
        }
        return listSP;
    }
    
        
    
    
}


