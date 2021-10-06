package org.example.storefinder;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRowMapper implements RowMapper {
    public Test mapRow(ResultSet rs, int rowNum) throws SQLException {
        Test c=new Test();
        c.setId(rs.getInt("id"));
        c.setName(rs.getString("name"));
        return c;
    }
}
