/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jGraphprocessingsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Irwansyah
 */
public class Element {

    private final String objectID;
    private HashMap<String, Object> attributes;
    private boolean isEdge;

    public Element() {
        this.isEdge = false;
        attributes = new HashMap();
        this.objectID = Integer.toHexString(System.identityHashCode(this));
    }

    public void addAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public void removeAttribute(String key) {
        attributes.remove(key);
    }

    public void editAttribute(String key, Object value) {
        attributes.replace(key, value);
    }

    public void showAttributes() {
        System.out.println("ObjectID : " + objectID);
        for (Map.Entry<String, Object> entrySet : attributes.entrySet()) {
            String key = entrySet.getKey();
            Object value = entrySet.getValue();
            System.out.println("Key : " + key + " || Value : " + value);
        }
    }

    public Object get(String key) {
        return attributes.get(key);
    }
    
    public HashMap<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(HashMap<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getObjectID() {
        return objectID;
    }

    public boolean isEdge() {
        return isEdge;
    }

    public void setIsEdge(boolean isEdge) {
        this.isEdge = isEdge;
    }
    
}
