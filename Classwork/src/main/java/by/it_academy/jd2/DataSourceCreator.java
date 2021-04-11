package by.it_academy.jd2;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

public class DataSourceCreator {
    private static DataSourceCreator instance;
    private ComboPooledDataSource cpds;

    private DataSourceCreator() throws IOException, SQLException, PropertyVetoException {
        cpds = new ComboPooledDataSource();
        cpds.setDriverClass("driver");
        cpds.setJdbcUrl("uri");
        cpds.setUser("user");
        cpds.setPassword("password");
        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMinPoolSize(20);
        cpds.setMaxStatements(180);
    }

    public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
        if (instance == null) {

            synchronized (DataSourceCreator.class) {
                if (instance == null) {

                    instance = new DataSourceCreator();

                }
            }
        }
            return instance.cpds;
        }

    }


