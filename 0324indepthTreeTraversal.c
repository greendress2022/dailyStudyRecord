#include<stdio.h>
typedef struct TreeNode{
  char data;
  struct TreeNode* left;
  struct TreeNode* right;
}TreeNode_t;
void preorder(TreeNode_t* start){
  if(start == NULL){return;} //took me a while
  printf("%c", start->data);
  preorder(start->left);
  preorder(start->right);
}

void inOrder(TreeNode_t* root){
  if(root == NULL){return;}
  inOrder(root->left);
  printf("%c", root->data);
  inOrder(root->right);

}
void postOrder(TreeNode_t* root){
  if(root == NULL){return;}
  inOrder(root->left);
  inOrder(root->right);
  printf("%c", root->data);

}
