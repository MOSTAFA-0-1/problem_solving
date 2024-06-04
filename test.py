from ast import List


class Solution(object):
    def twoSum(self,nums, target):
      
        hashmap = {}
        
        
        for i in range(len(nums)):
           
            complement = target - nums[i]
            if complement in hashmap:
               
                return [hashmap[complement], i]
           
            hashmap[nums[i]] = i
        
     
        return None

sl = Solution()    
print(str(sl.twoSum([3,2,4], 6)))