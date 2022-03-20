#include<stdio.h>
typedef struct BstNode{
  int data;
  BstNode* left;
  BstNode* right;
}BstNode_t;
//nodes are created on dynamic memory(heap,resize)
//malloc in c = new in c++,return a pointer to the object in heap
//any object created on heap can not have a name/identifier
//it has to be accessed through a pointer
//first declare a node to the root of the tree
//this is a root pointer, a local/global variable,not a root itself
//root = NULL; this tree is empty
//created an empty tree, use a function to add nodes


BstNode_t* getNewNode(int data){
//  BstNode_t* newNode = new BstNode();
 BstNode_t* newNode =(BstNode_t*)malloc(sizeof(BstNode_t));
 //(*newNode).data = data;
 newNode->data = data;
 newNode->left = newNode->right = NULL;
 //a tree with only root is created
 return newNode;
}
// we use a pointer to a pointer or declare it as glable variable
BstNode_t* insert(BstNode_t* root, int data){
  if(root==NULL){
   root = getNewNode(data);   //this root is local variable,we want root in line 39 to be modified

 }else if(data <= root->data){
   root->left = insert(root->left,data);//?
 }else{
   root->right = insert(root->right,data);
 }
  return root;
}


int main(){
  BstNode_t* root;
  root = NULL;// this tree is empty
  root =insert(root, 15);
  root =insert(root, 19);

}
