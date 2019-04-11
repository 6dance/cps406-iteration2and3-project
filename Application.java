import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application
{	
	
    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initUI();
    }

    private static void initUI()
    {
    	//Instance Variables
    	User currentUser = new User();
    	currentUser.setUsername("Bob");
    	currentUser.addSongPlayed(new Song("Hi", 5, "Billy", "Screamo"));
    	
        // Create window UI display
        JFrame display = new JFrame("Music Manager - CPS406")
        {
            {
                setSize(new Dimension(800, 600));
                setLayout(new BorderLayout());
                
                // Create top toolbar menu
                add(new JMenuBar()
                {
                    {
                        // Add "File" menu option
                        add(new JMenu("File")
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
                                add(new JMenuItem("User Stats")
                                {
                                    {
                                        addActionListener(new userStatsListener());
                                    }
                                    class userStatsListener implements ActionListener
                            		{
                            			// When button is pressed, clears then displays all checkout text
                            			public void actionPerformed(ActionEvent e)
                            			{
                            				String statsAsString = "Most Played Song: " + currentUser.getMostPlayedSong() + "\n"
                            				 + "Favorite Artist:        " + currentUser.getMostFreqArtist() + "\n"
                            				 + "Favorite Genre:       " + currentUser.getMostFreqGenre();
                            				
                            				JOptionPane.showMessageDialog(null, statsAsString, currentUser.getUsername() + " Stats", JOptionPane.INFORMATION_MESSAGE);
                            			}
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
                    }
                }, BorderLayout.NORTH);

                // Create bottom toolbar menu
                add(new JMenuBar()
                {
                    {
                        add(new JLabel("User: "));
                        add(new JComboBox());

                        add(new JLabel("Currently viewing: "));
                        add(new JComboBox());

                        add(new JButton("New playlist"));
                    }
                }, BorderLayout.SOUTH);

                // Create centre table which displays songs in database/playlist
                final String TABLE_HEADERS[] = {"Name", "Length", "Artist", "Genre"};
                Object TABLE_DATA[][] = { {"", "", "", ""} };
                add(new JScrollPane(new JTable(TABLE_DATA, TABLE_HEADERS)), BorderLayout.CENTER);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                setVisible(true);
            }
        };
    }
}