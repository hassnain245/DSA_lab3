/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

public class Linkedlist {
    public class Node{
        int data;
        Node next;
        Node(int data){
         this.data=data;
         this.next=null;
        }  
    }
    private Node head;
    Linkedlist(){
       this.head=null;
    }
    public void insertatstart(int data){
      Node newnode=new Node(data);
      newnode.next=head;
      head=newnode;
        
        
    }
public void insertatmid(int data, int position){
 int count=0;
 Node newnode=new Node(data);
 Node current=head;
 Node temp;
while(current!=null){
    count++;
if(position==count){
  temp=current.next;  
  current.next=newnode;
  newnode.next=temp;
  return;
}
    current=current.next;
    
}    
        
    }
    public void insertatlast(int data){
      Node newnode=new Node(data);
     if(head==null){
         head=newnode;
         return;
     }
    Node curr=head;
    while(curr.next!=null){
    curr=curr.next;
    }
    curr.next=newnode;    
        
    }
    
        public void deleteatstart(){
      if(head==null){
          System.out.println("Deleted");
          return;
      }
      head=head.next;
}
 public void Search(int key){
     boolean found=false;
 Node current=head;
 while(current!=null){
     if(key==current.data){
         found=true;
        
     
     }
     current=current.next;
    
 }
  if(found==true) {
      System.out.println("Found");
  }else{
      System.out.println("Not found");
  }  
 }
    public void printall(){
    Node current=head;
while(current!=null){
    System.out.println(current.data);
    current=current.next;
}       
    }
    public void Size(){
   int size=0;
   Node current=head;
   while(current!=null){
      size++;
      current=current.next;
   }
        System.out.println("The Size of the Array is: "+size);     
    }
   public static void main(String[] args) {
     Linkedlist linkedlist1=new Linkedlist();
     linkedlist1.insertatstart(10);
     linkedlist1.insertatstart(20);
      linkedlist1.insertatstart(30);
  // linkedlist1.deleteatstart();
      //linkedlist1.printall();
   // linkedlist1.printall();
  linkedlist1.insertatmid(44, 2);
   linkedlist1.insertatlast(40);
  linkedlist1.insertatlast(50);
   linkedlist1.printall();
   linkedlist1.Search(44);
   linkedlist1.Size();
    }
    
}
