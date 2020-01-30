package singelton;

public class DBConnection {
	
	private static DBConnection dbConnection;
	
	private DBConnection(){}
	
	public static DBConnection getInstance(){
		if(dbConnection==null){
			dbConnection=new DBConnection();
		}
		return dbConnection;
	}
	
	public static void main(String[] args) {
		DBConnection dbConn=DBConnection.getInstance();
	}
}
