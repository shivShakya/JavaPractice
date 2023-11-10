import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTwoPageApp {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public SimpleTwoPageApp() {
        frame = new JFrame("Simple Two-Page App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        createHomePage();
        createSettingsPage();

        frame.add(cardPanel);
        frame.setVisible(true);
    }

    private void createHomePage() {
        JPanel homePage = new JPanel();
        JButton goToSettingsButton = new JButton("Go to Settings");

        goToSettingsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Settings");
            }
        });

        homePage.add(new JLabel("Welcome to the Home Page"));
        homePage.add(goToSettingsButton);
        cardPanel.add(homePage, "Home");

    }

    private void createSettingsPage() {
        JPanel settingsPage = new JPanel();
        JButton goToHomePageButton = new JButton("Go to Home");

        goToHomePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Home");
            }
        });

        settingsPage.add(new JLabel("Settings Page"));
        settingsPage.add(goToHomePageButton);

        cardPanel.add(settingsPage, "Settings");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleTwoPageApp();
            }
        });
    }
}
