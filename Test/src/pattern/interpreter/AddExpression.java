package pattern.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        int leftValue = super.left.interpreter(var);
        int rightValue = super.right.interpreter(var);
        return leftValue + rightValue;
    }

}
