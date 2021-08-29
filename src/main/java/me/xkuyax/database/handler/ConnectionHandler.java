package me.xkuyax.database.handler;

import lombok.NonNull;
import me.eptiiix.general.database.SqlDatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionHandler {

  void init(@NonNull SqlDatabaseConnection sqlDatabaseConnection);

  void preConnect();

  Connection openConnection() throws SQLException;

  void updateConnection();

  Connection connection();

  void finishConnection(@NonNull Connection connection);

}