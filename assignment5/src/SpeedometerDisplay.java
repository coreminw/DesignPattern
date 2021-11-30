import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class SpeedometerDisplay extends DisplayDecorator {
    Display displayComponent;
    JPanel panel;
    LabelPanel labelPanel;

    SpeedometerDisplay(Display display, int width, int height){
        super(display, width,height);
        this.displayComponent=display;

    }

    public JPanel create(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
    }
    public void show(){
        displayComponent.show();
        Date date = new Date();
        labelPanel.updateText(date.toString());
    }
    public int getHeight(){
        return displayComponent.getHeight() + super.getHeight();
    }
    public int getWidth() {
        return displayComponent.getHeight() + super.getHeight();
    }
}
