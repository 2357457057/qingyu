package com.hwua.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;

public class C3P0Util {
      private static DataSource dataSource;
      private static Connection conn;
      static {
          dataSource = new ComboPooledDataSource();
      }
      public static DataSource getDataSource(){
          return dataSource;
      }

      public static QueryRunner getQueryRunner(){
          return new QueryRunner(dataSource);
      }
}
