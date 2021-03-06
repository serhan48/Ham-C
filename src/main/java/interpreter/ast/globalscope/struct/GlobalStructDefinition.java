package interpreter.ast.globalscope.struct;

import interpreter.Visitor;
import interpreter.ast.globalscope.AbstractGlobalScopeUnit;
import interpreter.ast.statement.VariableDeclarationStatement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GlobalStructDefinition extends AbstractGlobalScopeUnit {

  private String structId;
  private String structInstanceId;
  private Set<VariableDeclarationStatement> statements;
  private Object constToken;

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
