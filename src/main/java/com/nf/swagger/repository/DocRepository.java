package com.nf.swagger.repository;

import com.nf.swagger.model.Doc;

public interface DocRepository {

    Doc selectDocById(Long docId);

    int updateDocById(Doc doc);

    int saveDoc(Doc doc);

    int deleteDocById(Long docId);

    int isDocExists(Doc doc);

    int deleteDoc(Doc doc);

    Doc selectByDoc(Doc doc);

}
