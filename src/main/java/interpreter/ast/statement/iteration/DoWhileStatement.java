package interpreter.ast.statement.iteration;

import interpreter.Visitor;
import interpreter.ast.expression.Expression;
import interpreter.ast.statement.Statement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class DoWhileStatement extends IterationStatement {

    public DoWhileStatement(Expression boolExpression, Statement iterationBody) {
        super(boolExpression, iterationBody);
    }

    @Override
    public Object accept(Visitor v) {
        v.visit(this);
        return null;
    }
}
