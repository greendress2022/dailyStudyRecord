// Yuan Kuang
// March 28
//
// Include our header file for our my_bst.c
#include "my_bst.h"

// Include any other libraries needed
#include <stdio.h>
#include <stdlib.h>

// Creates a BST
// Returns a pointer to a newly created BST.
// The BST should be initialized with data on the heap.
// The BST fields should also be initialized to default values(i.e. size=0).
bst_t* bst_create(){
    // Modify the body of this function as needed.
    bst_t* myBST= (bst_t*)malloc(sizeof(bst_t));  //this is the root
    if(myBST == NULL){
      return NULL;
    }
    myBST->root = NULL;   //@@@
    myBST->size= 0;   //head declared,no default if not initialized
    return myBST;
}

// BST Empty
// Check if the BST is empty
// Returns 1 if true (The BST is completely empty)
// Returns 0 if false (the BST has at least one element)
int bst_empty(bst_t* t){
    //return t->root == NULL ? 1 : 0;
    return t->size == 0 ? 1 : 0;
}

// Adds a new node containng item to the BST
// The item is added in the correct position in the BST.
//  - If the data is less than or equal to the current node we traverse left
//  - otherwise we traverse right.
// The bst_function returns '1' upon success
//  - bst_add should increment the 'size' of our BST.
// Returns a -1 if the operation fails.
//      (i.e. the memory allocation for a new node failed).
// Your implementation should should run in O(log(n)) time.
//  - A recursive imlementation is suggested.
int bst_add(bst_t* t, int item){
  if(t==NULL){
    return -1;
  }
  if(t->root == NULL){
    bstnode_t* nroot = (bstnode_t* )malloc(sizeof(bstnode_t));
    if(nroot == NULL){
      return -1;
    }
    nroot->leftChild = NULL;
    nroot->rightChild = NULL;
    nroot->data = item;
    t->root = nroot;
    t->size = 1;
    return 1;
  }
  bstnode_t* p = t->root;
  while(1){
    if(p->data >= item){
      if(p->leftChild == NULL){
        bstnode_t* nroot = (bstnode_t* )malloc(sizeof(bstnode_t));
        if(nroot == NULL){
          return -1;
        }
        nroot->leftChild = NULL;
        nroot->rightChild = NULL;
        nroot->data = item;
        p->leftChild = nroot; // connect
        t->size++;
        return 1;
      }else{
        p = p->leftChild;
      }
    }else{ //p->value < item
      if(p->rightChild == NULL){
        bstnode_t* nroot = (bstnode_t* )malloc(sizeof(bstnode_t));
        if(nroot == NULL){
          return -1;
        }
        nroot->leftChild = NULL;
        nroot->rightChild = NULL;
        nroot->data = item;
        p->rightChild = nroot; // connect
        t->size++; //!!!!!!!!!!!!!!!!!!!!!!!!!
        return 1;
      }else{
        p = p->rightChild;
      }
    }
}
}




void bst_print_helper(bstnode_t *t, int order){
    if(t == NULL){
        return;
    }
    if(order==0){
      //in-order dfs
      bst_print_helper(t->leftChild,order);
      printf("in-order traversal ascending result:\n");
      printf(" %d", t->data);
      bst_print_helper(t->rightChild,order);
    }else{
      bst_print_helper(t->rightChild,order);
      printf("in-order traversal descending result:\n");
      printf(" %d", t->data);
      bst_print_helper(t->leftChild,order);
    }
}
// Prints the tree in ascending order if order = 0, otherwise prints in descending order.
// A BST that is NULL should print "(NULL)"
// It should run in O(n) time.
void bst_print(bst_t *t, int order){
    if(NULL == t){
        printf("(NULL)");
        return;
    }
    bst_print_helper(t->root, order);  //return

}

int bst_sum_helper(bstnode_t *t){    //visit each node exactly once.
  if(t==NULL){
    return 0;
  }
  return t->data +  bst_sum_helper(t->leftChild)+  bst_sum_helper(t->rightChild);
}
// Returns the sum of all the nodes in the bst.
// A BST that is NULL exits the program.
// It should run in O(n) time.
int bst_sum(bst_t *t){    //visit each node exactly once.
  if(t==NULL){
    exit(1);
  }
 return bst_sum_helper(t->root);
}
int bst_find_helper(bstnode_t * t, int value){
  if(t==NULL){
    return 0;
  }
  if(t->data==value){
    return 1;
  }
  if(bst_find_helper(t->leftChild, value)){
    return 1;
  }
  return bst_find_helper(t->rightChild,value);
}     //!!!!
// Returns 1 if value is found in the tree, 0 otherwise.
// For NULL tree -- exit the program.
// It should run in O(log(n)) time.
int bst_find(bst_t * t, int value){
  if(t==NULL){
    exit(1);
  }
  return bst_find_helper(t->root, value);
}

// Returns the size of the BST
// A BST that is NULL exits the program.
// (i.e. A NULL BST cannot return the size)
unsigned int bst_size(bst_t* t){
  if(t==NULL){
    exit(1);
  }
  // if(t->root==NULL){
  //   return 0;
  // }
  // return 1 + bst_size(t->root->leftChild) + bst_size(t->root->rightChild);
  return t->size;

}

void bst_free_helper(bstnode_t* t){
  if(t == NULL){
    return;
  }
  bst_free_helper(t->leftChild);
  bst_free_helper(t->rightChild);
  free(t);
}

// Free BST
// Removes a BST and ALL of its elements from memory.
// This should be called before the proram terminates.
void bst_free(bst_t* t){
  if(t == NULL){
    return;
  }
  bst_free_helper(t->root);
  free(t);
}
