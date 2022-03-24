#include <stdio.h>
#include <stdlib.h>


typedef struct Node{
	int data;
	struct Node* left;
	struct Node* right;
}Node_t;

Node_t* createNode(int data){
	Node_t* newNode = (Node_t*)malloc(sizeof(Node_t));
	newNode->data = data;
	newNode->left = NULL;
	newNode->right = NULL;
	return newNode;
}

void preOrder(Node_t* node){
	if(node==NULL){return;}
	printf("%d",node->data);
	preOrder(node->left);
	preOrder(node->right);
}

int main(int argc, char **argv)
{
	Node_t* root = createNode(1);
	Node_t* lc=createNode(2); //or root->left=createNode(2);
	Node_t* rc =createNode(3);
	Node_t* rcc =createNode(4);
	root->left = lc;
	root->right =rc;
	root->right->right=rcc;
	printf("\nPreorder traversal of binary tree is \n");
	preOrder(root);
	getchar();

	return 0;
}
