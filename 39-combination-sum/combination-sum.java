class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(candidates, 0 , target , current , result);
        return result;
        
    }
    public void backtrack(int[] candidate , int index, int target , List<Integer> current ,List<List<Integer>> result ){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;

        }
        if(target < 0 || index ==candidate.length ){
            return;
        }
        current.add(candidate[index]);
        backtrack(candidate , index, target - candidate[index], current ,result);
        current.remove(current.size()  -1);
                backtrack(candidate , index+1 , target , current ,result);
    }
}