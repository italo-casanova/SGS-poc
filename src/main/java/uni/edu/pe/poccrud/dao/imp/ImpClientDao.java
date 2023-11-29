package uni.edu.pe.poccrud.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uni.edu.pe.poccrud.dao.ClientDao;
import uni.edu.pe.poccrud.dto.Client;
import uni.edu.pe.poccrud.dto.ClientForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

@Repository
public class ImpClientDao implements ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection connection;

    private void getConnection() {

        try {
            connection = Objects.requireNonNull(jdbcTemplate.getDataSource()).getConnection();
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
            String sql = """
                INSERT INTO Cliente (
                        id_cliente, cod_cliente, telefono, nomb_empresa, ruc, contraseña, direccion, dni_representante,
                        nombre_representante, apellido_representante, correo
                ) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
            """;
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, client.getClientId());
            st.setString(2, client.getClientCode());
            st.setString(3, client.getClientCellphone());
            st.setString(4, client.getCompanyName());
            st.setInt(5, client.getClientRuc());
            st.setString(6, client.getClientPassword());
            st.setString(7, client.getClientAddress());
            st.setInt(8, client.getCompanyRepresentativeDni());
            st.setString(9, client.getCompanyRepresentativeName());
            st.setString(10, client.getCompanyRepresentativeLastname());
            st.setString(11, client.getClientMail());
            affectedRows = st.executeUpdate();
            st.close();
            closeConnection();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return affectedRows;
    }

    @Override
    public int addClientInspection(Client client) {
        int affectedRows = 0;

        try{
            getConnection();
            String sql = """
               INSERT INTO cliente(cod_cliente, nomb_empresa, ruc, direccion)
               values(?, ?, ?, ?); 
            """;
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, client.getClientCode());
            st.setString(2, client.getCompanyName());
            st.setInt(3, client.getClientRuc());
            st.setString(4, client.getClientAddress());
            affectedRows = st.executeUpdate();
            st.close();
            closeConnection();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return affectedRows;
    }

    @Override
    public ClientForm getClientForInspection(int ruc) {
        ArrayList<ClientForm> clients = new ArrayList<>();
        try {
            getConnection();
            String sql = "SELECT * FROM cliente c WHERE c.ruc = ?;";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, ruc);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ClientForm c = new ClientForm(
                    rs.getString("cod_client"),
                    rs.getString("nomb_empresa"),
                    rs.getString("ruc")
                );

                clients.add(c);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return !clients.isEmpty() ? clients.get(0): null;
    }

    @Override
    public int updateClient(Client client, int id) {
        return 0;
    }
}
