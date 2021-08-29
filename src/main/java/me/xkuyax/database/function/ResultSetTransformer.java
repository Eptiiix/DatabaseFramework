package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public interface ResultSetTransformer<T> {

  T transform(@NonNull ResultSet resultSet) throws SQLException;

  static long ms(@NonNull ResultSet resultSet, @NonNull String name) throws SQLException {
    Timestamp timestamp = resultSet.getTimestamp(name);
    return timestamp == null ? 0 : timestamp.getTime();
  }

}