public class SecondOperandState implements State{
    CalcV2State cal2;

    public SecondOperandState(CalcV2State cal2) {
        this.cal2 = cal2;
    }

    @Override
    public void printOutResult() {
        switch (cal2.operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", cal2.operand1, cal2.operand2, cal2.operand1 + cal2.operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", cal2.operand1, cal2.operand2, cal2.operand1 - cal2.operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", cal2.operand1, cal2.operand2, cal2.operand1 * cal2.operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", cal2.operand1, cal2.operand2, cal2.operand1 / cal2.operand2);
                break;
        }
    }

    @Override
    public void processNumber(String ch) {
        cal2.operand2 = Integer.parseInt(ch);
    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            cal2.printOutResult();
            cal2.setState(cal2.StartState);
        }
        else{
            System.out.println("다시 입력하세요.");
        }
    }
}
