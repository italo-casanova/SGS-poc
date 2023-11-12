package uni.edu.pe.poccrud.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uni.edu.pe.poccrud.dao.ClientDao;
import uni.edu.pe.poccrud.dto.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class ImpClientDao implements ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection connection;

    private void getConnection() {

        try {
            connection = jdbcTemplate.getDataSource().getConnection();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        try {
            connection.close();
            connection = null;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public int addClient(Client client) {
        int affectedRows = 0;

        try{
            getConnection();
            String sql = "INSERT INTO Cliente VALUES(?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, client.getName());
            st.setString(2, client.getSurname());
            st.setString(3, client.getAddress());
            st.setString(4, client.getDNI());
            st.setString(5, client.getEmail());
            st.setString(6, client.getRUC());
            st.setString(7, client.getDNI());
            affectedRows = st.executeUpdate();
            st.close();
            closeConnection();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return affectedRows;
    }

    @Override
    public int updateClient(Client client, int id) {
        return 0;
    }
}
