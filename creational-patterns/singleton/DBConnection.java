public class DBConnection {
    private static DBConnection connObject = new DBConnection();
    // Object (instance of the class) can only be created from within the class
    private DBConnection(){};
    public static DBConnection getInstance(){
        return connObject;
    }
}