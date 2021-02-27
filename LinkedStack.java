public class LinkedStack<T> implements StackInterface<T>
{
    private Node topNode;

    public LinkedStack()
    {
        topNode = null;
    }
    
    private class Node
    {

    }
    
    public static void convertToPostfix(infix)
    {
        operatorStack = STACK.empty();
        String postfix = new String("");
        while (true)
        {
            nextCharacter = next nonblank character of infix
            switch (nextCharacter)
            {
                case variable:
                {
                    Append nextCharacter to postfix
                    break;
                }
                case '^' :
                {
                    operatorStack.push(nextCharacter)
                    break;
                }
                case '+' : case '-' : case '*' : case '/' :
                {
                    while (!operatorStack.isEmpty() and precedence of nextCharacter <= precedence of operatorStack.peek());
                    {
                        Append operatorStack.peek() to postfix
                        operatorStack.pop()
                    }
                    operatorStack.push(nextCharacter)
                    break;
                }
                case '(' :
                {
                    operatorStack.push(nextCharacter)
                    break;
                }
                case ')' : // Stack is not empty if infix expression is valid
                {
                    topOperator = operatorStack.pop()
                    while (topOperator != '(')
                    {
                        Append topOperator to postfix
                        topOperator = operatorStack.pop()
                    }
                    break;
                }
                default: break // Ignore unexpected characters
            }
        }
        while (!operatorStack.isEmpty())
        {
            topOperator = operatorStack.pop()
            Append topOperator to postfix
        }
        return postfix
    }

}
