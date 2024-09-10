package org.example;

public class Main {


    public static int sort(int low,int high,int [] array)
    {
        int pivot=array[high];
        int i=low-1;
        for (int j=low;j<=high-1;j++)
        {
            if(array[j]<pivot)
            {
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;
    }
    public static void recursion(int low,int high,int [] array){
        if(low<high) {
            int o = sort(low, high, array);
        recursion(low,o-1,array);
        recursion(o+1,high,array);
        }
    }
    public static void main(String[] args) {
        int[] a={3,41,1,2,5,6,15,14,17,26,11,21};
        recursion(0,a.length-1,a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}