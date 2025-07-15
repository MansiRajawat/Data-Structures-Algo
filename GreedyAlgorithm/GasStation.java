package GreedyAlgorithm;

public class GasStation{
    public static void main(String[] args) {
        //There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
        //You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the
        // ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
        //Given two integer arrays gas and cost, return the starting gas station's index if you can
        // travel around the circuit once in the clockwise direction, otherwise return -1.
        // If there exists a solution, it is guaranteed to be unique.
        int [] gas = {1,2,4,5,9};
        int [] cost = {3,4,1,10,1};

        int totalGas = 0; int totalCost = 0;
        for(int i =0; i < gas.length; i++){
            totalGas += gas[i];
        }

        for(int i=0; i < cost.length ; i++){
            totalCost += cost[i];
        }

        if(totalGas < totalCost){
            System.out.println("false");
        }

        int start =0 , currentGas = 0;

        for(int i =0; i < gas.length; i++){
            currentGas += (gas[i]  - cost[i]);

            if(currentGas < 0){
                start = i+1;
                currentGas = 0;
            }
        }

        System.out.println(start);
    }
}
