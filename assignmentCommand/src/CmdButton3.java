import javax.swing.*;

public class CmdButton3 extends CmdButton{
    private JButton cmdButton;
    Calculator calculator;

    public CmdButton3(Calculator calculator) {
        super(calculator);
    }
    @Override
    public void execute() {
        if (getCalculator().isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            getCalculator().setOperator(getText().charAt(0));
            getCalculator().setOperatorSet(true);
        }
    }
}
