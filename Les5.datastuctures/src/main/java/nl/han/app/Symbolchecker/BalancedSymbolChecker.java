package nl.han.app.Symbolchecker;

import nl.han.app.Datastructures.HANStack;
import nl.han.app.Symbolchecker.Interfaces.IBalancedSymbolChecker;

public class BalancedSymbolChecker implements IBalancedSymbolChecker {

    private HANStack<Character> stack;

    public boolean addSymbols(String characters) {
        stack = new HANStack<Character>();
        for(int i = 0; i< characters.length(); i++){
            char c = characters.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')'){
                if(stack.getSize() == 0 || stack.pop() != '('){
                    return false;
                }
            } else if ( c == ']'){
                if(stack.getSize() == 0 || stack.pop() != '['){
                    return false;
                }
            } else if(c == '}'){
                if(stack.getSize() == 0 || stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.getSize() == 0;
    }
}
