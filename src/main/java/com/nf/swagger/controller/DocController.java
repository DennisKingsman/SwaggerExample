package com.nf.swagger.controller;

import com.nf.swagger.model.Doc;
import com.nf.swagger.service.DocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/document")
public class DocController {

    private DocService docService;

    @Autowired
    public void setDocService(DocService docService) {
        this.docService = docService;
    }

    @GetMapping("/call/{id}")
    public Doc restCall(@PathVariable("id") Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String callUrl = "http://localhost:8080/document/get/" + id;
        return restTemplate.getForObject(callUrl, Doc.class);
    }

    @GetMapping(path = "/get/{id}")
    public Doc getDocument(@PathVariable("id") Long docId) {
        return docService.getById(docId);
    }

    @PostMapping("/post")
    public Doc postDoc(@RequestBody Doc doc) {
        return docService.postDoc(doc);
    }

    @PutMapping("/put")
    public Doc putDoc(@RequestBody Doc doc) {
        return docService.putDoc(doc);
    }

    @DeleteMapping("/delete/{id}")
    public Long deleteDoc(@PathVariable("id") Long docId) {
        return docService.deleteDoc(docId);
    }

}
