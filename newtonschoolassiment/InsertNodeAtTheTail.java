package newtonschoolassiment;
package Newtonschoolassiment;
// Insert node at the tail
// easy
// asked in interviews by 1 company
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a singly linked list and an element K, your task is to insert the element at the tail of the linked list.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node and the integer K as a parameter.

// Constraints:
// 1 <=N<= 1000
// 1 <=K, value<= 1000
// Output
// Return the head of the modified linked list
// Example
// Sample Input:-
// 5 2
// 1 2 3 4 5

// Sample Output:
// 1 2 3 4 5 2




/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
    Node temp=new Node(k);
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=temp;
    return head;
}