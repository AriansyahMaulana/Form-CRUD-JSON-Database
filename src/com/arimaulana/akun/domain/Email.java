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
package com.arimaulana.akun.domain;

/**
 *
 * @author AriMaulana99
 */
public class Email {

    private Long id;
    private String namaEmail;
    private String password;
    private String pertanyaanRahasia;

    public Email() {
    }

    public Email(Long id, String namaEmail, String password, String pertanyaanRahasia) {
        this.id = id;
        this.namaEmail = namaEmail;
        this.password = password;
        this.pertanyaanRahasia = pertanyaanRahasia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaEmail() {
        return namaEmail;
    }

    public void setNamaEmail(String namaEmail) {
        this.namaEmail = namaEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPertanyaanRahasia() {
        return pertanyaanRahasia;
    }

    public void setPertanyaanRahasia(String pertanyaanRahasia) {
        this.pertanyaanRahasia = pertanyaanRahasia;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", namaEmail=" + namaEmail + ", password=" + password + ", pertanyaanRahasia=" + pertanyaanRahasia + '}';
    }

}
