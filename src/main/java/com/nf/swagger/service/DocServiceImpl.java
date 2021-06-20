package com.nf.swagger.service;

import com.nf.swagger.model.Doc;
import com.nf.swagger.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DocServiceImpl implements DocService{

    private DocRepository docRepository;

    @Autowired
    public void setDocRepository(DocRepository docRepository) {
        this.docRepository = docRepository;
    }

    @Override
    public Doc getById(Long id) {
        Doc doc = docRepository.selectDocById(id);
        return Objects.isNull(doc) ? new Doc() : doc;
    }

    @Override
    public Doc postDoc(Doc doc) {
        int findDoc = docRepository.isDocExists(doc);
        if (findDoc != 0) {
            docRepository.deleteDoc(doc);
        }

        int res = docRepository.saveDoc(doc);
        return res == 0 ? new Doc() : docRepository.selectByDoc(doc);
    }

    @Override
    public Doc putDoc(Doc doc) {
        int res = docRepository.updateDocById(doc);
        return res == 0 ? new Doc() : docRepository.selectByDoc(doc);
    }

    @Override
    public Long deleteDoc(Long id) {
        int res = docRepository.deleteDocById(id);
        return res == 0 ? -1 : id;
    }

}
