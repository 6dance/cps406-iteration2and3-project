import javax.swing.*;
import java.awt.*;


public class Application
{
    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        initUI();
    }

    private static void initUI()
    {
        JFrame display = new JFrame("Music Manager - CPS406")
        {
            {
                setSize(new Dimension(800, 600));
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }
        };
    }
}