package pattern.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        int leftValue = super.left.interpreter(var);
        int rightValue = super.right.interpreter(var);
        return leftValue - rightValue;
    }

}
