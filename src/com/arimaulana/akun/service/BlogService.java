/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arimaulana.akun.service;

import com.arimaulana.akun.domain.Blog;
import com.arimaulana.crudjson.abstrct.AbstractService;

/**
 *
 * @author ariansyahPC
 */
public class BlogService extends AbstractService {

    public BlogService() {
        this.domainClass = Blog.class;
    }

}
