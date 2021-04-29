package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation(){
        List<String> result = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select breed, expected, actual from dinosaur");
             ResultSet rs = stmt.executeQuery())
        {
            while (rs.next()){
                if(rs.getInt(2) < rs.getInt(3)){
                    result.add(rs.getString(1));
                }
            }
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect to database", sqlException);
        }
        Collections.sort(result);
        return result;
    }


}
