import javax.swing.*;


public class Window extends JFrame {
    public static final int START_X = 0;
    public static final int START_Y = 0;
    public static final int ELEMENT_WIDTH = 200;
    public static final int ELEMENT_HEIGHT = 20;
    private int counter;
    public Window(){

            this.setSize(400, 400);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setTitle("My app");
            this.setLayout(null);

            JLabel title = new JLabel("This is some text");
            title.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
            this.add(title);

            JLabel title2 = new JLabel("Counter: " + this.counter);
            title2.setVisible(false);
            title2.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
            this.add(title2);


            JButton myButton = new JButton("click advance");
            this.add(myButton);
            myButton.setBounds(title.getX(), title.getY() + title.getHeight(), title.getWidth(), title.getHeight());
            myButton.addActionListener((event) -> {
                title.setVisible(!title.isVisible());
                title2.setVisible(!title2.isVisible());
            });
            JButton oops = new JButton(String.valueOf(this.counter));
            oops.setBounds(title.getX(), title.getY() + title.getHeight(), title.getWidth(), title.getHeight());
            oops.addActionListener((event) -> {
                this.counter++;
                oops.setText(String.valueOf(this.counter));
            });


            JButton myButton2 = new JButton("Advance");
            this.add(myButton2);
            myButton2.setBounds(myButton.getX(), myButton.getY() + myButton.getHeight(), myButton.getWidth(), myButton.getHeight());
            myButton2.addActionListener((event) -> {
                this.remove(myButton);
                this.add(oops);
            });
        }


    }


