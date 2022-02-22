import javax.swing.*;

public class CmdButton2 extends CmdButton{
    private JLabel display;

    public CmdButton2(Calculator calculator, JLabel display) {
        super(calculator);
        this.display = display;
    }

    @Override
    public void execute() {
        int result = 0;
        Calculator calculator = getCalculator();
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            int operand1 = calculator.getOperand1();
            int operand2 = calculator.getOperand2();
            char op = calculator.getOperator();

            if (op == '+') {
                result = operand1 + operand2;
            }
            else if (op == '-') {
                result = operand1 - operand2;
            }
            else if (op == '*') {
                result = operand1 * operand2;
            }
            else if (op == '/') {
                result = operand1 / operand2;
            }
        }
        display.setText("" + result);
        calculator.clearFlags();
    }
}
