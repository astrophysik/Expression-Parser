package expression.operations;

import expression.parser.GenericTripleExpression;
import expression.generic.Calc;

public class Multiply<T> extends AbstractBinaryOperation<T> {
    public Multiply(GenericTripleExpression<T> left, GenericTripleExpression<T> right, Calc<T> calc) {
        this.left = left;
        this.right = right;
        this.calculator = calc;
    }

    public T evaluate(int x, int y, int z) {
        return calculator.multiply(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}
