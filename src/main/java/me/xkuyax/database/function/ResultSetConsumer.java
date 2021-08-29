package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetConsumer {

  void consume(@NonNull ResultSet resultSet) throws SQLException;

}