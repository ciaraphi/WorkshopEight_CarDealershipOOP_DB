package com.ps;

import java.sql.PreparedStatement;

public class SalesDAO {
    import com.pluralsight.dealership.models.SalesContract;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;

    public class SalesDao {
        private Connection connection;

        public SalesDao(Connection connection) {
            this.connection = connection;
        }

        public void save(SalesContract salesContract) throws SQLException {
            String sql = "Insert Into sales_contracts (vehicle_id, customer_name, sale_price, sales_tax) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, salesContract.getVehicleId());
                statement.setString(2, salesContract.getCustomerName());
                statement.setBigDecimal(3, salesContract.getSalePrice());
                statement.setBigDecimal(4, salesContract.getSalesTax());
                statement.executeUpdate();

            }
        }
    }
}
