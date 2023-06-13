class Solution {
  int i = 0;
  RegExp nonAlphanumeric = RegExp(r'[^a-zA-Z0-9]');
  bool isPalindrome(String s) {
    s = s.replaceAll(nonAlphanumeric, "").toLowerCase();
    for (i = 0; i < s.length; i++) {
      if (s[i] == s[s.length - i - 1]) {
        continue;
      } else {
        return false;
      }
    }
    return true;
  }
}

void main(List<String> args) {
  String s = "sj";
  print(Solution().isPalindrome(s));
}
