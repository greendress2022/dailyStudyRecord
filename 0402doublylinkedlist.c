#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node* next;
  struct node* prev;
};
struct node* head;//global variable
struct node* createNode(int x){  //use this function to avoid duplication
  struct node* temp=  (struct node*)malloc(sizeof(struct node)); //create a node in heap
  temp->data=x;
  temp->prev = NULL;
  temp->next =NULL;
  return temp;
}
void insertAtHead(int x){
   struct node* newNode = createNode(x);
   if(head==NULL){ //null is address 0
     head = newNode; // set head as the address of newNode,initializing this head
     return;
   }
   head->prev = newNode;
   newNode->next=head;
   head = newNode;
}

void print(){
  struct node* it = head;
  while(it!=NULL){
    printf("%d ",it->data);
    it = it->next;
  }
  printf("\n");
}

void reverseList(){
   struct node* temp = head;
   if(temp == NULL){
     return;
   }
   while(temp->next!=NULL){ //when temp->next ==NULL, while loop ends
     temp = temp->next;
   }// traverse forward to the end of the list
   printf("Reverse: ");
   while(temp!=NULL){
     printf("%d  ",temp->data);
     temp = temp->prev;// key
   }
     printf("\n");

}
int main(){
  head = NULL;
  insertAtHead(1); print();reverseList();
  insertAtHead(3); print();reverseList();
  insertAtHead(5); print();reverseList();

}
