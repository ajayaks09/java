package studentDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {

public static Connection getCon(){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1806");
    }catch(Exception e){System.out.println(e);}
    return con;
}
public static int insert(get u){
    int status=0;
    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement(
        "insert into getData(name,pass,date,sec,age) values(?,?,?,?,?)");
        ps.setString(1,u.getName());
        ps.setString(2,u.getPass());
        ps.setString(3,u.getDate());
        ps.setString(4,u.getSec());
        ps.setInt(5,u.getAge());
        status=ps.executeUpdate();
    }catch(Exception e){System.out.println(e);}
    return status;
}
public static List<get> Records(){
    List<get> list=new ArrayList<>();

    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement("select * from getData");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            get u=new get();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setPass(rs.getString("pass"));
            u.setDate(rs.getString("date"));
            u.setSec(rs.getString("sec"));
            u.setAge(rs.getInt("age"));
            list.add(u);
        }
    }catch(Exception e){System.out.println(e);}
    return list;
}
public static int delete(int id) throws SQLException {
	Connection con=getCon();
	PreparedStatement ps=con.prepareStatement("delete from getData where id=?");
	ps.setInt(1,id);
	int result=ps.executeUpdate();
	return result;

}
public static List<get> edit(int id){
    List<get> list=new ArrayList<>();

    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement("select * from getData where id=?");
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            get u=new get();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setPass(rs.getString("pass"));
            u.setDate(rs.getString("date"));
            u.setSec(rs.getString("sec"));
            u.setAge(rs.getInt("age"));
            list.add(u);
        }
    }catch(Exception e){System.out.println(e);}
    return list;
}
public static int Update(get u){
    int status=0;
    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement(
        "UPDATE getData SET name=?,pass=?,date=?,sec=?,age=? where id=?");
        ps.setString(1,u.getName());
        ps.setString(2,u.getPass());
        ps.setString(3,u.getDate());
        ps.setString(4,u.getSec());
        ps.setInt(5,u.getAge());
        ps.setInt(6,u.getId());
        status=ps.executeUpdate();
    }catch(Exception e){System.out.println(e);}
    return status;
}
}
