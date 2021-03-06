package me.xkuyax.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import javax.sql.DataSource;
import java.util.Calendar;

@UtilityClass
public class JdbcDataSourceCreator {

  public final String OPTIONS =
      (
          "?jdbcCompliantTruncation=false&useUnicode=true&characterEncoding=utf8"
          + "&serverTimezone={timezone}&zeroDateTimeBehavior=convertToNull&autoReconnect=true"
          + "&zeroDateTimeBehavior=convertToNull&max_allowed_packet=512M")
          .replace("{timezone}", Calendar.getInstance().getTimeZone().getID());

  public DataSource createSource(@NonNull String host, @NonNull String port, @NonNull String data) {
    return createSource(host, port, data, OPTIONS);
  }

  public DataSource createSource(
      @NonNull String host,
      @NonNull String port,
      @NonNull String data,
      @NonNull String options) {
    MysqlDataSource mysqlDataSource = new MysqlDataSource();
    mysqlDataSource.setUrl("jdbc:mysql://" + host + ":" + port + "/" + data + options);
    return mysqlDataSource;
  }

}
