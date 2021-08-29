package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementExecutor<T> {

  T execute(@NonNull PreparedStatement preparedStatement) throws SQLException;

}