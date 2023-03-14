import javax.swing.*;

public class Window2 extends JFrame {
    private int counter;
    private boolean isName;
    private boolean isPassword;

    public Window2(){
        this.counter=0;
        this.setSize(700,700);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("The Best Button On Earth");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JLabel sum= new JLabel("Empty");
        this.add(sum);
        sum.setBounds(0,20,90,30);
        sum.setVisible(true);

        JButton greatButton = new JButton("+10");
        this.add(greatButton);
        greatButton.setBounds(0,50,90,30);
        greatButton.setVisible(true);
        greatButton.addActionListener(e -> {
            this.counter+=10;
            sum.setText(this.counter+"");
        });

        JButton badButton = new JButton("-10");
        this.add(badButton);
        badButton.setBounds(0,100,90,30);
        badButton.setVisible(true);
        badButton.addActionListener(e -> {
        this.counter-=10;
        sum.setText(this.counter+"");
        });

        JButton clear= new JButton("Clear");
        this.add(clear);
        clear.setBounds(0,150,90,30);
        clear.setVisible(true);
        clear.addActionListener(e -> {
            this.counter=0;
            sum.setText(this.counter+"");
        });
















//        JButton theButton = new JButton("Novo");
//        this.add(theButton);
//        theButton.setBounds(60,60,150,30);
//        theButton.setVisible(true);
//        theButton.addActionListener(e ->{
//            this.counter++;
//            theButton.setText(this.counter+"");
//
//        } );
//        JTextField myName = new JTextField("Enter your name");
//        this.add(myName);
//        myName.setBounds(10,20,300,20);
//        myName.addActionListener((event) ->{
//
//        });
//        JTextField myPass = new JTextField("Enter your password!");
//        this.add(myPass);
//        myPass.setBounds(10,50,300,20);
//        myPass.addActionListener(e -> {
//
//        });
//
//        JButton logInButton= new JButton("Log In:");
//        this.add(logInButton);
//        logInButton.setVisible(true);
//        logInButton.setBounds(10,100,150,30);
//        logInButton.addActionListener(e -> {
//        // (myName.)
//    });



//        JButton myB = new JButton("Aviya");
//        this.add(myB);
//        myB.setBounds(5,20,200,30);
//        myB.setVisible(true);
//        myB.addActionListener((event) ->{
//          myB.setText("I hate you");
//        });
//    }



}}
