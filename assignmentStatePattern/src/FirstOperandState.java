public class FirstOperandState implements State{
    CalcV2State cal2;

    public FirstOperandState(CalcV2State cal2){
        this.cal2 = cal2;
    }
    @Override
    public void printOutResult() {
        System.out.println("잘못 입력했습니다.");
    }

    @Override
    public void processNumber(String ch) {
        cal2.operand1 = Integer.parseInt(ch);
    }

    @Override
    public void processOperator(char ch) {
        cal2.operator = ch;
        cal2.setState(cal2.OperatorState);
    }
}
