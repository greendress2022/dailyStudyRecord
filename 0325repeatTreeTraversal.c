#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
	int data;
	struct Node* left;
	struct Node* right;
}Node_t;
// object is a reference type,address,so *

Node_t* createNode(int data){
  Node_t* newNode = (Node_t*)malloc(sizeof(Node_t));
  newNode->data = data;
  newNode->left = NULL;
  newNode->left = NULL;
  return newNode;
}

//cmd+delete->line
void freeTree(Node_t* root){
  if(root==NULL){
    return;
  }
  freeTree(root->left);
  freeTree(root->right);

}
void preOrder(Node_t* root){
  if(root==NULL){
    return;
  }
  printf("%d\n", root->data);
  preOrder(root->left);
  preOrder(root->right);
}

int main(){
  Node_t* root = createNode(3);
  Node_t* lc = createNode(4);
  Node_t* rc = createNode(5);
  Node_t* lclc = createNode(8);
  Node_t* rcrc = createNode(10);
  root->left = lc;
  root->right = rc;
  lc->left = lclc;
  rc->right = rcrc;
  preOrder(root);
  freeTree(root);
  return 0;

}
