CREATE SEQUENCE seq_doc_key
MINVALUE 1 START WITH 1 INCREMENT BY 1;

CREATE TABLE T_DOCS (
    doc_id NUMBER(19) DEFAULT seq_doc_key.nextval NOT NULL,
    doc_title VARCHAR(200) NOT NULL,
    doc_author VARCHAR(200) NOT NULL,
    doc_text VARCHAR(255),
    PRIMARY KEY (doc_id)
);

