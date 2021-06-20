package com.nf.swagger.service;

import com.nf.swagger.model.Doc;

public interface DocService {

    Doc getById(Long id);

    Doc postDoc(Doc doc);

    Doc putDoc(Doc doc);

    Long deleteDoc(Long id);

}
