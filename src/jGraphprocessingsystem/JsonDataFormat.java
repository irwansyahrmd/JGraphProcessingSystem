/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jGraphprocessingsystem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonStreamParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Irwansyah
 */
public class JsonDataFormat {

    private final Gson gson;

    public JsonDataFormat() {
        gson = new GsonBuilder().create();
    }

    public ArrayList<User> getData(String directory) {
        ArrayList<User> listUser = new ArrayList<>();
        try {
            JsonStreamParser parser = new JsonStreamParser(new FileReader(directory));
            while (parser.hasNext()) {
                User user = gson.fromJson(parser.next(), User.class);
                listUser.add(user);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonDataFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }

    public void saveData(ArrayList<User> users, String directory) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(directory);
        } catch (IOException ex) {
            Logger.getLogger(JSONTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (User user : users) {
            String json = gson.toJson(user);
            try {
                writer.write(json); 
            } catch (IOException ex) {
                Logger.getLogger(JsonDataFormat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonDataFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
