package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q3 {
    public static int frequencySort(int[] nums)
    {
        Map<Integer, Integer> map= new HashMap<>();//data -- frequency
        for(int data: nums)//calculating and putting the frequency of data
            map.put(data, map.getOrDefault(data, 0)+1);

        PriorityQueue<Map.Entry<Integer, Integer>> heap= new PriorityQueue<>((a, b)->{
            return (a.getValue() == b.getValue())? b.getKey() - a.getKey() : a.getValue() - b.getValue();//maxHeap(data) (when frequency are same)//false impression tro priority Queue || minHeap(frequency)
        });

        for(Map.Entry<Integer, Integer> entry: map.entrySet())//putting all the Entry into the heap
            heap.offer(entry);

        int index= 0;//index is for inserting into the same array
        int sum = 0;// sum is for the sum fo repeated number
        while(heap.size() != 0)//doing the operation till the heapis Empty
        {
            Map.Entry<Integer, Integer> temp= heap.poll();//getting the min frequency Entry

            int val= temp.getKey();//extracting the data from the Entry
            int freq= temp.getValue();//extracting the frequency of the data from the Entry
            if (freq >= 2){
                sum += val;
            }
        }

        return sum;//returning the resultant array
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,3,4,-1};
        System.out.println(frequencySort(nums));
    }
}
