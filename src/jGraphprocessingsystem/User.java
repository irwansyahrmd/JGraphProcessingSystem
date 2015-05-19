/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jGraphprocessingsystem;

import java.util.List;

/**
 *
 * @author Irwansyah
 */
class User {

    private String username;
    private String nama;
    private String jenis_kelamin;
    private String hobi;
    private String tanggal_lahir;
    private List<Object> friends;

    public void view() {
        System.out.println("Username      : " + username);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenis_kelamin);
        System.out.println("Hobi          : " + hobi);
        System.out.println("Tanggal Lahir : " + tanggal_lahir);
        System.out.println("Friends       : ");
        for (Object friend : friends) {
            System.out.println("                " + friend);
        }
        System.out.println("");
    }
    
    public String getView(){
        String text = "";
        text += "Username      : " + username +"\n";
        text += "Nama          : " + nama +"\n";
        text += "Jenis Kelamin : " + jenis_kelamin +"\n";
        text += "Hobi          : " + hobi +"\n";
        text += "Tanggal Lahir : " + tanggal_lahir +"\n";
        text += "Friends       : " +"\n";
        for (Object friend : friends) {
            text += "                " + friend +"\n";
        }
        return text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public List<Object> getFriends() {
        return friends;
    }

    public void setFriends(List<Object> friends) {
        this.friends = friends;
    }
    
}
