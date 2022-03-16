#include<stdio.h>
#include<stdlib.h>
//define nodes
typedef struct node{ //node is a structure not a method, no()
  int wins;
  int years;
  struct node* next; //I lost struct
} node_t;
//create nodes and return the linked list= return head
node_t* create_list(){
  int years[5]={2001,2002,2003,2004,2005};
  int wins[5]={1,2,3,4,5};
  node_t* node[5];// need to be initialized
  //malloc space for nodes
  int i;
  for(i=0;i<5;i++){
    node[i] =(node_t*)malloc(sizeof(node_t));   //why use equals
    if(node[i]==NULL){
      printf("cannot malloc enough space");
      exit(0);
    }
    node[i]->wins= wins[i];
    node[i]->years = years[i];
  }
  //connect these nodes
  for ( i = 0; i < 4; i++) {
    node[i]->next = node[i+1];
  }
  node[4]->next = NULL;
  return node[0];
}
//prnit data
void print_list(node_t* head){
  node_t* iterator = head;
  while(iterator!= NULL){
    printf("%d,%d wins\n",iterator->years,iterator->wins);
    iterator = iterator->next;
  }
}
//free list
void free_list(node_t* head){
  node_t* iterator = head;
  node_t* temp;
  while(iterator!= NULL){
    temp = iterator->next;
    free(iterator);  //update the iterator to free one by one
    iterator = temp;
  }
}

int main(){
  node_t* head = NULL;
  head = create_list();
  print_list(head);
  free_list(head);
  return 0;
}
