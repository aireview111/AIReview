 public void executeSqlOperations() throws SQLException 

        Connection conn1 = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Connection conn2 = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // Get user input directly 
        String userInput = "John'; DROP TABLE users;--"; 


        String sql1 = "SELECT * FROM users WHERE username = '" + userInput + "'";
        String sql2 = "SELECT * FROM users WHERE username = '" + userInput + "'"
