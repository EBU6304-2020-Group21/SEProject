package main.views;
/**
 * This Class is ManagerStartPanel to ask you to choose the function of manager syster.
 * @ClassName ManagerStartPanel
 * @author Kai Yan
 * @version 3.0
 * @date 2020/04/01
 */
import javax.swing.*;
import java.awt.*;



public class ManageStartPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton ModifyMenu = new JRadioButton("Modify the menu");
    public JRadioButton SeeSales = new JRadioButton("See the Sales");
    public ManageStartPanel() {init();}
    public void init() {

        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top Panel
        JLabel lab1 = new JLabel("Management System");
        JLabel icon = new JLabel();
        icon.setIcon(new ImageIcon("Files/Logo/RamenRestaurant.png"));
        Font font1 = new Font("Arial",Font.BOLD,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(ModifyMenu);
        bg.add(SeeSales);
        ModifyMenu.setFont(font1);
        SeeSales.setFont(font1);
        lab1.setFont(font1);
        lab1.setForeground(Color.BLUE);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.2;
        topPanel.add(icon);
        top.gridy = 1;
        topPanel.add(lab1,top);

        top.gridy = 2;
        top.weighty = 0.3;
        topPanel.add(ModifyMenu,top);

        top.gridy = 3;
        top.weighty = 0.3;
        top.anchor = GridBagConstraints.NORTH;
        topPanel.add(SeeSales,top);
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150, 0));
        confirm.setPreferredSize(new Dimension(150, 0));
        botPanel.add(back, BorderLayout.WEST);
        botPanel.add(confirm, BorderLayout.EAST);
        //Set the layout and initialize this panel
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.85;
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.15;
        this.add(botPanel, c);
    }
}
