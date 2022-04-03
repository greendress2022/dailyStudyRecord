/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 //https://leetcode.com/problems/middle-of-the-linked-list/
 //876


struct ListNode* middleNode(struct ListNode* head){
    if(head == NULL|| head->next == NULL){
        return head;
    }
    //pointer fast moves twice the speed of pointer slow
    struct ListNode* fast = head;
    struct ListNode* slow = head;
    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast =fast->next->next;
    }
    return slow;
}
