package com.wangzhiyuan.ch1;

import com.sun.org.glassfish.gmbal.ManagedOperation;


public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,33,24,11,23,44,32,67,54,32,65,34,56};
		kuaipai(array);
		for(int i:array){
			System.out.println(i);
		}
		System.out.println(erfen(array,0,array.length-1,65));
	}
	//冒泡排序
	public static int[] maopao(int[] array){
		if(array==null)
			return null;
		int length = array.length-1;
		for(int i = length;i>0;i--){
			for(int j = i-1;j >=0 ;j--){
				if(array[j]>array[i]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		
		return array;
	}
	
	//快速排序
	public static void kuaipai(int[] array){
		if(array == null)
			return;
		kuaipailist(array, 0, array.length-1);
	}
	
	public static void kuaipailist(int[] array,int start,int end){
		if(array==null)
			return;
		int index = array[start];
		int left = start+1;
		int right = end;
		int temp = 0;
		while(left<right){
			while(array[left]<=index&&left<right){
				left++;
			}
			temp = array[left];
			array[left] = array[index];
			array[index] = temp;
			while(array[right]>=array[index]&&left<right){
				
				right--;
			}
			temp = array[right];
			array[right] = array[index];
			array[index] = temp;
		}
		
		kuaipailist(array,start,left);
		kuaipailist(array,right, end);
	}

	//堆排序
	
	//二分查找
	
	public static int erfen(int[] array,int start,int end,int target){
		
		while(start<end){
			int index = (end - start)/2 + start;
			if(array[index] == target)
				return index;
			if(array[index]>target){
				end = index-1; 
				
			}else if(array[index]<target){
				start = index+1;
			}
			
		}
		return -1;
		
		
	}
	
}















