import javax.swing.*;

public abstract class CmdButton extends JButton implements Command {
    private Calculator calculator;

    public CmdButton(Calculator calculator) {
        this.calculator = calculator;
    }
    public Calculator getCalculator(){
        return calculator;
    }
    @Override
    public abstract void execute();

}
