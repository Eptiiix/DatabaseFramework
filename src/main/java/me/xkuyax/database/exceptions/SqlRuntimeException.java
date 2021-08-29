package me.xkuyax.database.exceptions;

import org.jetbrains.annotations.Nullable;

import java.sql.SQLException;

public class SqlRuntimeException extends RuntimeException {

  public SqlRuntimeException(@Nullable SQLException exception) {
    super(exception);
  }

}
