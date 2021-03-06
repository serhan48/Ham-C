package interpreter.ast.statement;

import interpreter.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatementList extends Statement {

    private Statement statement;
    private Statement statementList;

    public Object accept(Visitor v) {
        return v.visit( this);
    }
}
