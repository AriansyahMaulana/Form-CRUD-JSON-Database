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

import com.arimaulana.akun.domain.Bbm;
import com.arimaulana.akun.domain.CloudStorage;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AriMaulana99
 */
public class CloudStorageTableModel extends AbstractTableModel {
    private final List<CloudStorage> cloudStorages;

    public CloudStorageTableModel(List<CloudStorage> listCloudStorage) {
        this.cloudStorages = listCloudStorage;
    }

    @Override
    public int getRowCount() {
        return cloudStorages.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CloudStorage cloudStorage = cloudStorages.get(rowIndex);
        switch (columnIndex) {
            case 0 : return cloudStorage.getId();
            case 1 : return cloudStorage.getEmail();
            case 2 : return cloudStorage.getUsrename();
            case 3 : return cloudStorage.getPassword();
            case 4 : return cloudStorage.getUrl();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID";
            case 1 : return "EMAIL";
            case 2 : return "USERNAME";
            case 3 : return "PASSWORD";
            case 4 : return "URL";
            default : return "";
        }
    }
}
