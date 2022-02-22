public class OperatorState implements State{
    CalcV2State cal2;

    public OperatorState(CalcV2State cal2) {
        this.cal2 = cal2;
    }

    @Override
    public void printOutResult() {
        System.out.println("잘못 입력했습니다.");
    }

    @Override
    public void processNumber(String ch) {
        cal2.operand2 = Integer.parseInt(ch);
        cal2.setState(cal2.SecondOperandState);
    }

    @Override
    public void processOperator(char ch) {
        System.out.println("숫자를 입력하세요.");
    }
}
