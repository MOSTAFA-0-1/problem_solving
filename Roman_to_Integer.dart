class Solution {
  Map<String, int> romanData = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000,
  };
  int result = 0;
  int romanToInt(String s) {
    for (int i = 0; i < s.length; i++) {
      if ( i<s.length-1 && romanData[s[i]]! < romanData[s[i + 1]]!) {
        result -= romanData[s[i]]!;
      } else {
        result += romanData[s[i]]!;
      }
    }
    return result;
  }
}

void main(List<String> args) {
   String s = "MCMXCIV";
    print(   Solution().romanToInt(s));
}
