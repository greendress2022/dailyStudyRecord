package com.company;

import java.util.Arrays;
import java.util.Random;



public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]= random.nextInt(10);
        }
        System.out.println("before:"+ Arrays.toString(nums));
        mergesort(nums);
        System.out.println("after:"+ Arrays.toString(nums));

    }


    private static void mergesort(int[] inputArray) {
        int length = inputArray.length;
        if(length < 2){ //recursion ends,only one element
            return;
        }
        int mid= length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];
        for (int i = 0; i < mid; i++) {  //split into two sub-arrays
            leftArray[i]=inputArray[i];

        }
        for (int i = mid; i < length; i++) {
            rightArray[i-mid]=inputArray[i];
        }
        mergesort(leftArray);
        mergesort(rightArray);
        //we have two sorted halves=>one element only
        merge(inputArray,leftArray,rightArray);
    }

    private static void merge(int inputArray[],int[]leftArray, int[]rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        //need three pointers
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftSize && j < rightSize){
            if(leftArray[i] <= rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            }else{
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            inputArray[k]= leftArray[i];
            i++;
            k++;
        }
        while(j < rightSize){
            inputArray[k]= rightArray[j];
            j++;
            k++;
        }

    }
}