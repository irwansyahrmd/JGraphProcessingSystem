/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jGraphprocessingsystem;

/**
 *
 * @author Irwansyah
 */
public final class DirectedEdge {

    private final Element from;
    private final Element to;
    private Element edge;
    private String name;

    public DirectedEdge(String name, Element from, Element edge, Element to) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.edge = edge;
    }

    public Element getFrom() {
        return from;
    }

    public Element getTo() {
        return to;
    }

    public Element getEdge() {
        return edge;
    }

    public void setEdge(Element edge) {
        this.edge = edge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
