import java.util.*;

public class LinkedStack<T> implements StackInterface<T>
{
    private Node topNode;

    public LinkedStack()
    {
        topNode = null;
    }
    
    private class Node
    {
        private T data;
        private Node next;
        private Node(T dataPortion)
        {
            this(dataPortion, null);
        }
        /** creates a node 
            @param T dataPortion the information inside of the node
            @param nextNode the node following the previous node */
        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        }//end Node

        /** retieved data in T node */
        private T getData()
        {
            return data;
        }// end getData

        /** sets the data in the new node
            @param newData gets data from note and sets it in data */
        private void setData(T newData)
        {
            data = newData;
        }//end setData

        /** finds the next node In the bag */
        private Node getNextNode()
        {
            return next;
        }//end getNextNode
    }//end class Node

    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
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

    public T pop()
    {
         T top  = peek();
         topNode = topNode.getNextNode();
         return top;
    }

    public T peek()
    {
        if(isEmpty())
        throw new EmptyStackException();
        else
        return topNode.getData();
    }
    
    public boolean isEmpty()
    {
        return topNode == null;
    }

    public void clear()
    {
        topNode = null;
    }
}
