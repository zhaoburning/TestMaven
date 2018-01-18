package com.zbn.d0522;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分,
 * 空间复杂度是O（1）。
 * Created by lianxiang on 2017/6/4.
 */
public class OrderArr {
    public void order(int[] arr){
        if(arr == null)
            return;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(isEven(arr[i]) && !isEven(arr[j])){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
            else if(!isEven(arr[i]) && isEven(arr[j])){
                i++;
            }
            else if(isEven(arr[i]) && isEven(arr[j])){
                j--;
            }else{
                i++;
                j--;
            }
        }
    }
    public boolean isEven(int n){
        return (n & 1) == 0;
    }
    public static void main(String[] args){
        OrderArr test = new OrderArr();
        int[] arr= {1,2,3,4,5,6,12,7,8,9,10};
        test.order(arr);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]+",");
        }
    }
}
