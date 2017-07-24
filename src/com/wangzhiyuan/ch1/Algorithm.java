package com.wangzhiyuan.ch1;

public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//2.二维数组的查找，从左到右增大，从上倒下增大，查找某个数是否在数组中
	
	public boolean Find(int target, int[][] array) {
        if(array == null){
            return false;
        }
        int width = array.length - 1;
        
        int height = array[0].length - 1;
        
        int i = 0;
        
        while((width>=0)&&(i<=height)){
            if(array[width][i]>target){
                width--;
            }else if(array[width][i]<target){
                i++;
            }else{
                return true;
            }
        }
        
		return false;
    }
	
	//3.请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	public class Solution {
	    public String replaceSpace(StringBuffer str) {
	        if(str==null){
	            return null;
	        }
	       StringBuilder newStr = new StringBuilder();
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)==' '){
	                newStr.append('%');
	                newStr.append('2');
	                newStr.append('0');
	            }else{
	                newStr.append(str.charAt(i));
	            }
	        }
	        return newStr.toString();
	    }
	}
	
	//4.反转链表
	/**
	*    public class ListNode {
	*        int val;
	*        ListNode next = null;
	*
	*        ListNode(int val) {
	*            this.val = val;
	*        }
	*    }
	*
	*/

//	    public ArrayList<Integer> printListFromTailToHead(ListNode n) {
//	        ArrayList<Integer> al=new ArrayList<Integer>();
//	        ListNode p=n;
//	        xx(al,n);
//	        return al;
//	         
//	    }
//	     
//	    public void xx(ArrayList<Integer> al,ListNode n){
//	        if(n!=null){
//	            xx(al,n.next);
//	             al.add(n.val);
//	        }
//	    }

//5.输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
	
}
//class Solution {
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        if(pre==null || in== null || pre.length!=in.length){
//            return null;
//        }
//        java.util.HashMap<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
//        
//        for(int i = 0 ;i<in.length;i++){
//            map.put(in[i],i);
//        }
//        return reBuilder(pre,0,pre.length-1,in,0,in.length-1,map);
//    }
//    
//    public TreeNode reBuilder(int [] pre,int pi,int pj,int[] in,int ni,int nj,java.util.HashMap<Integer,Integer> map){
//        if(pi > pj){
//            return null;
//        }
//        TreeNode root = new TreeNode(pre[pi]);
//        int index = map.get(pre[pi]);
//        root.left = reBuilder(pre,pi+1,pi+index-ni,in,ni,index-1,map);
//        root.right = reBuilder(pre,pi+index-ni+1,pj,in,1+index,nj,map);
//        return root;
//    }
//}	   
//1.singleton模式

class Singleton{
	private static Singleton mSingleton;
	private Singleton(){
			
	}
	public Singleton getInstance(){
		if(mSingleton == null){
			synchronized(Singleton.this){
				if(mSingleton == null){
					mSingleton = new Singleton();
					return mSingleton;
				}
			}
		}
		return mSingleton;
	}
		
}