/*
 * Copyright (c) 2017 ARIANSYAH MAULANA
 *
 * Anda diperkenankan mengedit isi dari source code ini
 * asalkan tetap menyertakan copyright ini.
 *
 * File ini dibuat menggunakan :
 * Editor     : NetBeans IDE 8.0.2
 * NoteBook   : ASUS Notebook K42F
 * OS         : Windows 10 Pro 64bit
 * Compiler   : JDK 8 update 18
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 *      http://www.apache.org/licenses/LICENSE-2.0
 */
package com.arimaulana.akun.service;

import com.arimaulana.akun.domain.Email;
import com.arimaulana.crudjson.abstrct.AbstractService;

/**
 *
 * @author AriMaulana99
 */
public class EmailService extends AbstractService {

    public EmailService() {
        this.domainClass = Email.class;
    }

}
