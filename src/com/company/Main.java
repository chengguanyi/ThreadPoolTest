package com.company;



public class Main {


    class newclass{

    }


    public static int[] twoSum(int[] nums, int target) {
        int[] targets = new int[2];

        for(int i = 0;i < nums.length-1; i++){
            System.out.println("+++++++++++++");
            for(int j = i+1;j < nums.length;j++){
                System.out.println("=============="+ j);
                if(nums[i] + nums[j] == target){
//                    System.out.println(i+","+j);
//                    System.out.println(nums[i]+","+nums[j]);
                    targets[0] = i;
                    targets[1] = j;
                }
            }
        }

        return targets;

    }

    public static void main(String[] args) {

        int[]  arr={3,3};

        int[] n = twoSum(arr,6);

        for (int i = 0;i < n.length; i++){
        System.out.println(n[i]);
        }

    }
}
