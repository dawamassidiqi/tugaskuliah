/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author USER
 */
public class Node {
    String data;
    Node next;

    public Node(String data, Node berikutnya) {
        this.data = data;
        this.next = berikutnya;
    }
}
