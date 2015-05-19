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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Irwansyah
 */
public class JSONTest {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        JsonStreamParser parser = new JsonStreamParser(new FileReader("C:\\Users\\Irwansyah\\Documents\\dummyData.json"));
        int i = 1;
        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> username = new ArrayList<>();
        
        while (parser.hasNext()) {
            User user = gson.fromJson(parser.next(), User.class);
            users.add(user);
            username.add(user.getUsername());
        }
        
        for (User user : users) {
            List<Object> listOfFriend = user.getFriends();
            for (Object friend : listOfFriend) {
                if (!username.contains(friend.toString())) {
                    System.out.println("Username : " + user.getUsername());
                    System.out.println("Friend   : " + friend);
                }
            }
        }
        
        FileWriter writer = null;
        try {
            writer = new FileWriter("D:\\GSON.json");
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
