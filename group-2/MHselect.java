package RG;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.king.student.entity.book;对应函数名;
//import com.king.student.sql.SqlUtility;数据库连接文件名;

public class MHselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static List<Book> getBookByFuzzyQuery(String key){
			try {
				String sql = "select * from student where "
						+ "id like binary '%"+key+"%' or "
						+ "name like binary '%"+key+"%' or "
						+ "work like binary '%"+key+"%' or "
						+ "outtimes like binary '%"+key+"%' or "
						+ "retime like binary '%"+key+"%'";
				PreparedStatement ps = SqlUtility.getConnection().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				List<Book> list = new ArrayList<>();
				while(rs.next()){
					Book book = new Book();
					book.setid(rs.getInt("id"));
					book.setname(rs.getString("name"));
					book.setwork(rs.getString("work"));
					book.setouttimes(rs.getString("outtimes"));
					book.setretime(rs.getString("retime"));
					list.add(book);
				}
				return list;
			} catch (SQLException e) {
			}
			return Collections.emptyList();
		}

	}

}
