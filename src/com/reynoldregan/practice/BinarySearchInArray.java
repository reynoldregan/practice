package com.reynoldregan.practice;

public class BinarySearchInArray {

    public static void main(String[]args){
        BinarySearchInArray x = new BinarySearchInArray();
        int[] a = new int[]{2,4,6,8,10,12,14,16,18,20};
        System.out.print(x.search(a, 6));
        System.out.print(x.search(a, -1));
        System.out.print(x.search(a, 18));
        System.out.print(x.search(a, 25));
    }

    public int search( int[] a, int b){
        int l= 0;
        int r = a.length-1;
        if(l==r){
            if(a[l] == b){ return l;}
            return -1;
        }
        while(l<=r){
            int mid = (l+r)/2;
            System.out.println("Mid : "+mid);
            if(a[mid] == b){
                return mid;
            }else if(a[mid] > b){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }


}
