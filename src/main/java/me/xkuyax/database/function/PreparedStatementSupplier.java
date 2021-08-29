package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSupplier {

  PreparedStatement get(@NonNull Connection connection) throws SQLException;

}