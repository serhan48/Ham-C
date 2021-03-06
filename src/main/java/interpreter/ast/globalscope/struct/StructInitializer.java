package interpreter.ast.globalscope.struct;

import interpreter.Visitor;
import interpreter.ast.expression.Expression;
import interpreter.ast.expression.ExpressionList;
import interpreter.ast.globalscope.AbstractGlobalScopeUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StructInitializer extends AbstractGlobalScopeUnit {

    private Expression expressions;

    public void accept(Visitor v) {
        v.visit(this);
    }
}
