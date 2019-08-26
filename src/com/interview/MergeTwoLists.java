package com.interview;

/**
 * @ClassName MergeTwoLists
 * @Description TODO
 * @Author cgy
 * @Date 2019-08-06 22:59
 * @Version 1.0
 */

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            sb.append(cur.val + "->");
            cur =cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }


    public ListNode(int[] nums){
        if (nums == null || nums.length == 0){
            throw new IllegalArgumentException("arr can not null");
        }
        this.val = nums[0];
        ListNode curr = this;
        for (int i =1 ; i < nums.length ;i++){
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
    }

}

public class MergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val){
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }else {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
    }


    public static void main(String[] args) {

        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};

        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        System.out.println(mergeTwoLists.mergeTwoLists(l1,l2));

    }

}
