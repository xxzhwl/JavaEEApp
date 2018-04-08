package ccc.edu.hut.database;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ccc.edu.hut.bean.LyTable;
import ccc.edu.hut.bean.User;
public class DB {
	private static Connection ct;	
	private PreparedStatement pstm;
	public DB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "123456");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public User checkUser(String username, String password) {
		try {
			pstm = ct.prepareStatement("select * from userTable where username=? and password=?");
			pstm.setString(1, username);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			User user = new User();
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;
			}
			return null;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public String getUserName(int id) {
		String username = null;
		try {
			pstm = ct.prepareStatement("select username from userTable where id = ?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				username = rs.getString(1);
			}
			return username;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<LyTable> findLyInfo() {
		try {
			ArrayList<LyTable> al = new ArrayList<LyTable>();
			pstm = ct.prepareStatement("select * from lyTable");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				LyTable ly = new LyTable();
				ly.setId(rs.getInt(1));
				ly.setUserId(rs.getInt(2));
				ly.setDate(rs.getDate(3));
				ly.setTitle(rs.getString(4));
				ly.setContent(rs.getString(5));				
				al.add(ly);
			}
			return al;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}		
	}
	
	// ÃÌº”¡Ù—‘
	public boolean addInfo(LyTable ly) {
		try {
			pstm = ct.prepareStatement("insert into lyTable values(?, ?, ?, ?, ?)");
			pstm.setNull(1, java.sql.Types.INTEGER);
			pstm.setInt(2, ly.getUserId());
			pstm.setDate(3, ly.getDate());
			pstm.setString(4, ly.getTitle());
			pstm.setString(5, ly.getContent());			
			pstm.executeUpdate();
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
		
	public boolean insertUser(String username, String pwd) {
		try {
			pstm = ct.prepareStatement("insert into userTable values(?, ?, ?)");
			pstm.setNull(1, java.sql.Types.INTEGER);
			pstm.setString(2, username);
			pstm.setString(3, pwd);
			pstm.executeUpdate();
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
