package oose.dea.database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by tyskie on 4/5/17.
 */
public class DatabaseConnectionTest {
    @InjectMocks
    private DatabaseConnection databaseConnection;

    @Mock
    private Connection mockConnection;

    @Mock
    private Statement mockStatement;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConnection() throws SQLException {
        Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
        Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.any(String.class))).thenReturn(1);
        ResultSet rs = databaseConnection.getConnection().createStatement().executeQuery("SELECT 1");
        int value = 0;
        while(rs.next()){
            value = rs.getInt(1);
        }
        Assert.assertEquals(value, 1);
        Mockito.verify(mockConnection.createStatement(), Mockito.times(1));
    }
}
