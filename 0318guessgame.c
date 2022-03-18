#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    int i;
    int answer;
    int user;
    int count =0;
    int sum = 0;
    int temp;
    
    srand(time(NULL)); 
   
    for(i=0;i<5;i++){
         answer= rand()%10+1;
         printf("answer=%d \n",answer);
        while(1){
            printf("give a num from 1-10: ");
            scanf("%d",&user);
            count++; //store count of each round
            temp= count;//save count so that it can be printed out in line 35
            sum = count+ sum;//store total count
            if(user==answer){
               // printf("great!%d round took %d times\n",i+1,count);
                printf("___________\n");
                count=0;  //remember to set it to 0,so we can count times in each round
                break;
            }else if(user>answer){
                printf("guess lower\n");
            }else{
                printf("guess higher\n");
            }

        }
       printf("great!%d round took %d times\n",i+1,temp);
    }
printf("****game ends,took %d times in total****\n",sum);
return 0;  
}