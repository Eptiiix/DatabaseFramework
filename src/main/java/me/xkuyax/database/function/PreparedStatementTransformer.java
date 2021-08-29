package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementTransformer<T, K> {

  T transform(@NonNull PreparedStatement preparedStatement, @NonNull K k) throws SQLException;

}