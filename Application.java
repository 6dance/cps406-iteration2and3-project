import javax.swing.*;
import java.awt.*;


public class Application
{
    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initUI();
    }

    private static void initUI()
    {
        // Create window UI display
        JFrame display = new JFrame("Music Manager - CPS406")
        {
            {
                // Create toolbar menu
                JMenuBar MenuBar = new JMenuBar();

                // Add "File" menu option
                MenuBar.add(new JMenu("File")
                {
                    {
                        // Add File options
                        add(new JMenuItem("Add...")
                        {
                            {
                                addActionListener((x) -> System.exit(0));
                            }
                        });
                        add(new JSeparator());
                        add(new JMenuItem("Exit")
                        {
                            {
                                addActionListener((x) -> System.exit(0));
                            }
                        });
                    }
                });

                setSize(new Dimension(800, 600));
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                add(MenuBar, BorderLayout.NORTH);
                
                setVisible(true);
            }
        };
    }
}