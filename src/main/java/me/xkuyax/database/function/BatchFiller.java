package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface BatchFiller<T> {

  void fill(@NonNull PreparedStatement preparedStatement, @NonNull T type) throws SQLException;
}