public class StartState implements State{
    CalcV2State cal2;

    public StartState(CalcV2State cal2){
        this.cal2 = cal2;
    }

    @Override
    public void printOutResult() {
        System.out.println("잘못 입력했습니다.");
    }

    @Override
    public void processNumber(String ch) {
        cal2.operand1 = Integer.parseInt(ch);
        cal2.setState(cal2.FirstOperandState);
    }

    @Override
    public void processOperator(char ch) {
        System.out.println("숫자를 입력하세요.");
    }

}
