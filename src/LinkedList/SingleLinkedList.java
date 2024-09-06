/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author ACER NITRO 5
 */
public class SingleLinkedList {
    class Node{
        private int data;
        private Node next;
        
        
        public Node(int Data){
            this.data = Data;
            this.next = null;
        }
//        public void setNextNode(Node node){
//            this.next = node;
//        }
//        public Node getNextNode(){
//            return this.next;
//        }
    
    }
    
    private Node head = null;
    private Node tail = null;
    
    public void addNode(int addValue){
        Node value = new Node(addValue);
        if(head == null){
           head = value;
           tail = value;
        }else{
            tail.next = value;
            tail = value;
        }
       
    }
    public void removeFirstNode(){
        if (head == null){
            System.out.println("the First Node id Deleted");
        }else{
            head = head.next;
            if(head == null){
                tail=null;
            }
        }
    }
    public void removeLastNode(){
        if (head == null){
            System.out.println("the last node is remove");
        }else if(head == tail){
            head = tail = null;
            
        }else{
            Node node = head;
            while(node.next != tail){
                node = node.next;
                
            }
            node.next = null;
            tail = node;
        }
    }
    public int removeAnywhere(int value){
        if(head == null){
            System.out.println("walay sulod ");
        }else if(head.data == value){
            removeFirstNode();
        }else{
            Node current = head;
            Node preview = tail;
            while(current != null && current.data != value){
                preview = current;
                current = current.next;
                
            }
            if(current == null){
                System.out.println("wala sya dira");
            }else{
                preview.next = current.next;
            }
            if(current == tail){
                tail = preview;
                
            }
            
        }
        return value;
    }
    public void Display(){
        Node current = head;
        if(head == null){
            
        }else{
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    
    
}
