import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.event.KeyAdapter;
import javax.swing.*;


public class Test implements ActionListener{
    public static void main(String[] args) {
        new Test();
    }
    public Test()
    {
        SwingUtilities.invokeLater(
                this::createGUI
        );
    }
    protected void createGUI() {
        //tworzenie ramki
        JFrame frame = new JFrame("Simple Swing App");
        JTextArea tekst = new JTextArea("Obszar tekstowy typu JTextArea");
        JScrollPane scrollPane = new JScrollPane(tekst);
        frame.add(scrollPane);
        tekst.setBounds(0, 50, 600, 200);
        //dodawanie przyciskow
        JButton btn1 = new JButton("FR");
        btn1.setBounds(5, 5, 60, 30);
        btn1.setBackground(Color.RED);
        JButton btn2 = new JButton("FG");
        btn2.setBounds(75, 5, 60, 30);
        btn2.setBackground(Color.GREEN);
        JButton btn3 = new JButton("FB");
        btn3.setBounds(140, 5, 60, 30);
        btn3.setBackground(Color.BLUE);
        JButton btn4 = new JButton("A");
        btn4.setBounds(430, 5, 45, 30);
        JButton btn5 = new JButton("B");
        btn5.setBounds(480, 5, 45, 30);
        JButton btn6 = new JButton("C");
        btn6.setBounds(530, 5, 45, 30);
        JButton btn7 = new JButton("1");
        btn7.setBounds(5, 280, 40, 25);
        JButton btn8 = new JButton("2");
        btn8.setBounds(46, 280, 40, 25);
        JButton btn9 = new JButton("3");
        btn9.setBounds(87, 280, 40, 25);
        JButton btn10 = new JButton("4");
        btn10.setBounds(5, 306, 40, 25);
        JButton btn11 = new JButton("5");
        btn11.setBounds(46, 306, 40, 25);
        JButton btn12 = new JButton("6");
        btn12.setBounds(87, 306, 40, 25);
        JButton btn13 = new JButton("7");
        btn13.setBounds(5, 332, 40, 25);
        JButton btn14 = new JButton("8");
        btn14.setBounds(46, 332, 40, 25);
        JButton btn15 = new JButton("9");
        btn15.setBounds(87, 332, 40, 25);
        Border border = BorderFactory.createLineBorder(Color.CYAN);
        //dodawanie pol tekstowych
        JTextField poletekstowe1 = new JTextField("Pole tekstowe 1 typu JTextField");
        poletekstowe1.setBounds(350, 270, 240, 30);
        poletekstowe1.setBorder(border);
        JTextField poletekstowe2 = new JTextField("Pole tekstowe 2 typu JTextField");
        poletekstowe2.setBounds(350, 301, 240, 30);
        poletekstowe2.setBorder(border);
        JTextField poletekstowe3 = new JTextField("Pole tekstowe 3 typu JTextField");
        poletekstowe3.setBounds(350, 332, 240, 30);
        poletekstowe3.setBorder(border);

        //inicjalizowania zmiany kolorow poprzez przyciski
        btn1.addActionListener(e -> tekst.setForeground(Color.RED));
        btn2.addActionListener(e -> tekst.setForeground(Color.GREEN));
        btn3.addActionListener(e -> tekst.setForeground(Color.BLUE));

        //dodawanie jtextfiled do jtextarea
        poletekstowe1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    tekst.append("\n"+"\n"+poletekstowe1.getText());
                }
            }

        });

        poletekstowe2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    tekst.append("\n"+"\n"+poletekstowe2.getText());
                }
            }

        });

        poletekstowe3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    tekst.append("\n"+"\n"+poletekstowe3.getText());
                }
            }

        });


        //dodawanie wszystkiego do frame-a
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
        frame.add(btn11);
        frame.add(btn12);
        frame.add(btn13);
        frame.add(btn14);
        frame.add(btn15);
        frame.add(tekst);
        frame.add(poletekstowe1);
        frame.add(poletekstowe2);
        frame.add(poletekstowe3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.pack();
        frame.setSize(600, 400);
        frame.setResizable(true);
        frame.setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jb = (JButton)(e.getSource());
        System.out.println(jb.getText());
    }
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("es");
        }
    }
}