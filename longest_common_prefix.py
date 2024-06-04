class Solution(object):
    def longestCommonPrefix(self, strs):
         if not strs:
           return ""

         strs.sort()

         first_str = strs[0]
         last_str = strs[-1]

         prefix = ""
         for i in range(len(first_str)):
                if first_str[i] == last_str[i]:
                    prefix += first_str[i]
                else:
                    break

         return prefix

test = ["flower","flow","flight"]
test.sort()
print(test)
print(Solution().longestCommonPrefix(test))
