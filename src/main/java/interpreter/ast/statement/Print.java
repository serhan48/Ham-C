package interpreter.ast.statement;

import interpreter.Visitor;
import interpreter.ast.expression.Expression;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Print extends Statement {

    private Expression expression;

    public Print(Expression expression) {
        this.expression = expression;
    }

    public Object accept(Visitor v) {
         return v.visit(this);
    }
}
