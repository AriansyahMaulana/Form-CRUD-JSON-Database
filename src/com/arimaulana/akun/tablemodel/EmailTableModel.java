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
package com.arimaulana.akun.tablemodel;

import com.arimaulana.akun.domain.Email;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AriMaulana99
 */
public class EmailTableModel extends AbstractTableModel {
    private final List<Email> emails;

    public EmailTableModel(List<Email> listEmail) {
        this.emails = listEmail;
    }

    @Override
    public int getRowCount() {
        return emails.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Email email = emails.get(rowIndex);
        switch (columnIndex) {
            case 0 : return email.getId();
            case 1 : return email.getNamaEmail();
            case 2 : return email.getPassword();
            case 3 : return email.getPertanyaanRahasia();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID";
            case 1 : return "NAMA EMAIL";
            case 2 : return "PASSWORD";
            case 3 : return "PERTANYAAN RAHASIA";
            default : return "";
        }
    }
}
