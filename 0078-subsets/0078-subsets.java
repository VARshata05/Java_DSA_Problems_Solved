// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         List<Integer> subset=new ArrayList<>();
//         createSubset(nums,0,res,subset);
//         return res;
//     }
//     public void createSubset(int[] nums,int index,List<List<Integer>> res,List<Integer> subset){
//         if(index==nums.length){
//             res.add(new ArrayList<>(subset));
//             return;
//         }
//         subset.add(nums[index]);
//         createSubset(nums,index+1,res,subset);
//         subset.remove(subset.size()-1);
//         createSubset(nums,index+1,res,subset);
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}