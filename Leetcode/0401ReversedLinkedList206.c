/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
//https://leetcode.com/problems/reverse-linked-list/

struct ListNode* reverseList(struct ListNode* head){
if(head==NULL){
    printf("list not found");
    return NULL;
  }
  struct ListNode* temp ;
  //keep the address in next before turning head->next to NULL
  temp = head->next;
  head->next=NULL;
  struct ListNode* temp2;
  while(temp !=NULL){
    //keep the address in next before turning temp->next to head
    temp2 = temp ->next;
    temp->next = head;
    head = temp;
    temp = temp2; //continue to iterate
  }
  return head;

}
