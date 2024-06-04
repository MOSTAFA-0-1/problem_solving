class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    
    def hasCycle(self,head):
        if not head:
            return False

        slow = head
        fast = head.next

        while fast and fast.next:
            if slow == fast:
                return True

            slow = slow.next
            fast = fast.next.next

        return False
    

n1 = ListNode(1)    
n2 = ListNode(2)
n3 = ListNode(3)    
n4 = ListNode(4)
n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n1

test = Solution().hasCycle(n1)
print(test)


    