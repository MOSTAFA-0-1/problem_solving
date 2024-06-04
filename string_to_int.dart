import 'dart:math';

class Solution {
  int i = 0;
  bool isPositive = true;
  String intString = "";
  int num = 0;
  int myAtoi(String s) {
    s = s.replaceAll(" ", "");
    for (i = 0; i < s.length; i++) {
      try {
        int.parse(s[i]);
        intString += s[i];
      } catch (e) {
        if (s[i] == "-" && i != s.length - 1) {
          isPositive = !isPositive;
        } else if (s[i] == "+") {
        } else {
          if (intString == "") {
            return 0;
          } else {
            num = int.parse(intString);
            if (isPositive) {
              if (num < (pow(2, 31) - 1)) {
                return num;
              } else {
                return (pow(2, 31) - 1).toInt();
              }
            } else {
              if (-num > (-pow(2, 31))) {
                return -num;
              } else {
                return (-pow(2, 31)).toInt();
              }
            }
          }
        }
      }
    }
    num = int.parse(intString);
    if (isPositive) {
      if (num < (pow(2, 31) - 1)) {
        return num;
      } else {
        return (pow(2, 31) - 1).toInt();
      }
    } else {
      if (-num > (-pow(2, 31))) {
        return -num;
      } else {
        return (-pow(2, 31)).toInt();
      }
    }
  }
}

void main(List<String> args) {
  String str = "-91283472332";
  print(Solution().myAtoi(str));
}
