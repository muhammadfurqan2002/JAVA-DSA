package com.company.DSA.Sortings;

public class QuickSort {
    public static void  main(String args[]){
        int []array={2,4,6,8,1};
        quickSort(array,0, array.length-1);
        display(array);
    }

    public static void quickSort(int[]array,int start,int end){
        if (start<=end){
            int pivot=Pivot(array,start,end);
            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }
    public static int Pivot(int array[],int start,int end){
            int p=array[start];
            int i=start,j=end;
            while (i<=j){
                if (array[i]<=p){
                    i++;
                }else if (array[j]>p){
                    j--;
                }
                if (i<j){
                    swap(array,i,j);
                }
            }

            swap(array,start,j);
            return j;
    }
    public static void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void display(int []array){
        for (int i:array){
            System.out.println(i);
        }
    }
}
