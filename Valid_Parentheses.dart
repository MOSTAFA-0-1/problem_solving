class Solution {
  List<String> stack = [];
  int i = 0;
  bool isValid(String s) {
    for (i = 0; i < s.length; i++) {
      switch (s[i]) {
        case ")":
          if (stack.isNotEmpty && stack[stack.length - 1] == "(") {
            stack.removeLast();
          } else {
            return false;
          }

          break;
        case "}":
          if (stack.isNotEmpty && stack[stack.length - 1] == "{") {
            stack.removeLast();
          } else {
            return false;
          }
          ;
          break;
        case "]":
          if (stack.isNotEmpty && stack[stack.length - 1] == "[") {
            stack.removeLast();
          } else {
            return false;
          }
          ;
          break;
        default:
          stack.add(s[i]);
          break;
      }
    }
    if (stack.isEmpty) {
      return true;
    }
    return false;
  }
}

void main(List<String> args) {
  print(Solution().isValid("))"));
}
