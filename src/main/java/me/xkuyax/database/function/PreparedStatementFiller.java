package me.xkuyax.database.function;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementFiller {

  void fill(@NonNull PreparedStatement preparedStatement) throws SQLException;
}