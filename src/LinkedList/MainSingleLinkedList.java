/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author ACER NITRO 5
 */
public class MainSingleLinkedList {
    public static void main (String[] args){
        SingleLinkedList link = new SingleLinkedList();
        link.addNode(100);
        link.addNode(50);
        link.addNode(10);
        link.addNode(1);
        
        System.out.println("Display Nodes");
        link.Display();
        System.out.println("");
        link.removeFirstNode();
        System.out.println("remove first Node");
        link.Display();
        System.out.println("");
        link.removeLastNode();
        System.out.println("remove last node");
        link.Display();
        System.out.println("");
        link.removeAnywhere(10);
        System.out.println("picked the node i remove (i remove the 10)");
        link.Display();
        System.out.println("");
        System.out.println("final output");
        link.Display();
        
    }
}
