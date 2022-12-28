# global _TOP, _CAPACITY
def IsEmpty(stack):
    return (len(stack) == 0)

def StackPush(element, stack):
    stack.append(element)
    print(stack)

def StackPop(stack):
    if (IsEmpty(stack)):
        print("Empty")
    else:
        stack.pop()
        print(stack)

# def StackPeek(stack):

if __name__ == "__main__":
    # _TOP = -1
    # _CAPACITY = int(input("Enter Size : ")) 
    # stack = [0] * _CAPACITY
    stack = []
    print(stack)
    StackPush(3, stack)
    StackPush(4, stack)
    StackPush(5, stack)
    StackPush(8, stack)
    StackPush(7, stack)
    StackPush(1, stack)
    StackPop(stack)
    StackPop(stack)

