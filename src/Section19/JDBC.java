package Section19;

import java.sql.*;

public class JDBC {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\nbhai\\Downloads\\JavaCore\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/machouse/IdeaProjects/PrimitiveTypes/testjava.db");
        //            Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");

//             Statement statement = connection.createStatement()) {
//            statement.execute("create table contacts (name text, phone integer, email text)");
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();
            statement.execute("drop table if exists " + TABLE_CONTACTS);

            statement.execute("create table if not exists " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text " +
                    ")");

            insertContacts(statement, "tim", 343434, "tim@gmail.com");
            insertContacts(statement, "joe", 52346, "joe@gmail.com");
            insertContacts(statement, "jane", 79859, "jane@gmail.com");
            insertContacts(statement, "fido", 62464, "fido@gmail.com");


            statement.execute("update " + TABLE_CONTACTS + " set " +
                    COLUMN_PHONE + " =52346" +
                    " where " + COLUMN_NAME + "='jane'");

            statement.execute("delete from " + TABLE_CONTACTS +
                    " where " + COLUMN_NAME + "='joe'");


            ResultSet resultSet = statement.executeQuery("select * from " + TABLE_CONTACTS);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                        resultSet.getInt(COLUMN_PHONE) + " " +
                        resultSet.getString(COLUMN_EMAIL));
            }
            statement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("something went wrong " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void insertContacts(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("insert into " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + " ) " +
                "values('" + name + "', " + phone + ", '" + email + "')");
    }
}
