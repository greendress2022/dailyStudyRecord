/*
//size_t unsigned int
void* p = malloc(4);
//print p  -> 208-212  byte as a unit in memory
int* p = malloc(sizeof(int)*10);
int* p = malloc(sizeof(int)*n);
*p = 2;
p[0] =2;
//mean the same, int* arr  =>  arr[0]=*arr
*(p+1)=3;
p[1]=3;

*/
//when use array as a function parameter,it is passing by reference,not by value
#include<stdio.h>
int sumOfElements(int* A, int size){
  int i;
  int sum = 0;
  //have to give size as parameter,can't use sizeof(A)here because A is apointer
  for(i= 0; i < size; i++){
    sum += A[i];
  }
  return sum;
}

int main(){
  int A[] = {1,2,3,4};
  int size = sizeof(A)/sizeof(A[0]);
  int total = sumOfElements(A,size);
  printf("total= %d ,size= %d",total,size);
}
