package org.example.storefinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private JdbcTemplate ex;
    private static final String msg = "Success";


    @GetMapping("/api/test")
    public Response test() {
        return new Response(msg);

    }

    @GetMapping("/api/sql")
    public Response sql(){
         System.out.println("abc");
        List<Test> tlist = ex.query("SELECT * FROM test", new TestRowMapper());

        System.out.println(tlist);

        return new Response(tlist.toString());
    }
}
