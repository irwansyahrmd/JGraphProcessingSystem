/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jGraphprocessingsystem;

import java.util.HashMap;

/**
 *
 * @author Irwansyah
 */
public class GraphDataset {
    private HashMap<String, Element> Nodes = new HashMap<>();
    private HashMap<String, DirectedEdge> Relations = new HashMap<>();

    public GraphDataset() {
        setData();
    }

    public HashMap<String, Element> getNodes() {
        return Nodes;
    }

    public void setNodes(HashMap<String, Element> Nodes) {
        this.Nodes = Nodes;
    }

    public HashMap<String, DirectedEdge> getRelations() {
        return Relations;
    }

    public void setRelations(HashMap<String, DirectedEdge> Relations) {
        this.Relations = Relations;
    }
    
    public void setData(){
        //NODE 1
        Element ALI = new Element();
        ALI.addAttribute("Nama", "Ali");
        ALI.addAttribute("Jenis Kelamin", "Laki-Laki");
        ALI.addAttribute("Hobi", "Musik");
        ALI.addAttribute("Tanggal Lahir", "3-Maret-1990");
        ALI.showAttributes();
        System.out.println("");
        Nodes.put(ALI.getObjectID(), ALI);
        
        //NODE 2
        Element BUDI = new Element();
        BUDI.addAttribute("Nama", "Budi");
        BUDI.addAttribute("Jenis Kelamin", "Laki-Laki");
        BUDI.addAttribute("Hobi", "Membaca");
        BUDI.addAttribute("Tanggal Lahir", "12-April-1995");
        BUDI.showAttributes();
        System.out.println("");
        //NODE 3
        Element CINTA = new Element();
        CINTA.addAttribute("Nama", "Cinta");
        CINTA.addAttribute("Jenis Kelamin", "Perempuan");
        CINTA.addAttribute("Hobi", "Berenang");
        CINTA.addAttribute("Tanggal Lahir", "15-Mei-1997");
        CINTA.showAttributes();
        System.out.println("");
        //NODE 4
        Element DODI = new Element();
        DODI.addAttribute("Nama", "DODI");
        DODI.addAttribute("Jenis Kelamin", "Laki-Laki");
        DODI.addAttribute("Hobi", "Wisata");
        DODI.addAttribute("Tanggal Lahir", "12-Agustus-1985");
        DODI.showAttributes();
        System.out.println("");

        //EDGE 1
        Element FRIEND_OF = new Element();
        FRIEND_OF.addAttribute("Nama","FRIEND_OF");

        //RELATIONS
        Relations.put("1", new DirectedEdge("FRIEND_OF", ALI, FRIEND_OF, BUDI));
        Relations.put("2", new DirectedEdge("FRIEND_OF", ALI, FRIEND_OF, CINTA));
        Relations.put("3", new DirectedEdge("FRIEND_OF", CINTA, FRIEND_OF, BUDI));
        Relations.put("4", new DirectedEdge("FRIEND_OF", CINTA, FRIEND_OF, DODI));
    }
}
