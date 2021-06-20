package com.nf.swagger.mapper;

import com.nf.swagger.model.Doc;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DocRowMapper implements RowMapper<Doc> {

    @Override
    public Doc mapRow(ResultSet resultSet, int i) throws SQLException {
        Doc doc = new Doc();
        doc.setTitle(resultSet.getString("doc_title"));
        doc.setAuthor(resultSet.getString("doc_author"));
        doc.setText(resultSet.getString("doc_text"));
        return doc;
    }

}
