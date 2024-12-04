package com.ps;
import com.pluaralsight.dealership.models.Leasecontract;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaseDao {
    private Connection connection;
    public LeaseDao(Connection connection) {
        this.connection = connection;
    }
    public void save(LeaseContract leaseContract) throws SQLException {
        String sql = "INSERT INTO lease_contracts (vehicle_id, customer_name, monthly_payment, lease_duration) VALUES (?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, leaseContract.getVehicleId());
            statement.setString(2, leaseContract.getVehicleId());
            statement.setBigDecimal(3, leaseContract.getmonthlyPayment());
            statement.setInt(4, leaseContract.getLeaseDuration());
            statement.execute();
        }
    }
}
