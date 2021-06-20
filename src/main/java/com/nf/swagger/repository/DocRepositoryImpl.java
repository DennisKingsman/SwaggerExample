package com.nf.swagger.repository;

import com.nf.swagger.mapper.DocRowMapper;
import com.nf.swagger.model.Doc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Slf4j
@Transactional
@Repository
public class DocRepositoryImpl implements DocRepository{

    private static final String SELECT_BY_ID =
            "SELECT doc_title, doc_author, doc_text " +
                    "FROM T_DOCS " +
                    "WHERE doc_id = ?";

    private static final String UPDATE_DOC_BY_ID =
            "UPDATE T_DOCS SET \n" +
            "    doc_title = ?,\n" +
            "    doc_author = ?,\n" +
            "    doc_text = ?\n" +
            "WHERE doc_id = ?";

    private static final String SAVE_DOC =
            "INSERT INTO T_DOCS(doc_title, doc_author, doc_text) " +
                    "VALUES (?, ?, ?)";

    private static final String DELETE_DOC =
            "DELETE FROM T_DOCS WHERE doc_id = ?";

    private static final String DOC_EXISTS =
            "SELECT COUNT(doc_id) " +
                    "FROM T_DOCS " +
                    "WHERE doc_author = ? and doc_title = ?";

    private static final String DELETE_DOC_BY_AU = "DELETE FROM T_DOCS WHERE doc_author = ? and doc_title = ?";

    private static final String GET_BY_AU =
            "SELECT doc_title, doc_author, doc_text " +
                    "FROM T_DOCS " +
                    "WHERE doc_title = ? and doc_author = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Doc selectByDoc(Doc doc) {
        return jdbcTemplate
                .queryForObject(GET_BY_AU,
                        new DocRowMapper(),
                        doc.getTitle(),
                        doc.getAuthor());
    }

    @Override
    public int isDocExists(Doc doc) {
        return jdbcTemplate
                .queryForObject(DOC_EXISTS,
                        Integer.TYPE,
                        doc.getAuthor(),
                        doc.getTitle());
    }

    @Override
    public Doc selectDocById(Long docId) {
        return jdbcTemplate.queryForObject(SELECT_BY_ID, new DocRowMapper(), docId);
    }

    @Override
    public int updateDocById(Doc doc) {
        return jdbcTemplate
                .update(UPDATE_DOC_BY_ID,
                        doc.getTitle(),
                        doc.getAuthor(),
                        doc.getText(),
                        doc.getId());
    }

    @Override
    public int saveDoc(Doc doc) {
        log.info(doc.toString());
        return jdbcTemplate
                .update(SAVE_DOC,
                        doc.getTitle(),
                        doc.getAuthor(),
                        doc.getText());
    }

    @Override
    public int deleteDocById(Long docId) {
        return jdbcTemplate.update(DELETE_DOC, docId);
    }

    @Override
    public int deleteDoc(Doc doc) {
        return jdbcTemplate
                .update(DELETE_DOC_BY_AU,
                        doc.getAuthor(),
                        doc.getTitle());
    }

}
