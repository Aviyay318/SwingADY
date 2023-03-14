import javax.swing.*;

public class NovoWindow extends JFrame {
    private int counter;

    public NovoWindow() {
        this.counter=0;
        this.setSize(800,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Novo's Calculator");
        this.setVisible(true);

        JLabel title= new JLabel("Enter your numbers!");
        this.add(title);
        title.setBounds(0,0,600,30);
        title.setVisible(true);

        JLabel sum = new JLabel("Total:");
                this.add(sum);
                sum.setBounds(0,120,40,30);
                sum.setVisible(true);

        JButton numberOne = new JButton("1");
        this.add(numberOne);
        numberOne.setBounds(0,30,40,30);
        numberOne.setVisible(true);
        numberOne.addActionListener(e -> {
            this.counter+=1;
            sum.setText(this.counter+ "");
        });


        JButton numberTwo= new JButton("2");
        this.add(numberTwo);
        numberTwo.setBounds( 40, 30, 40 ,30);
        numberTwo.setVisible(true);
        numberTwo.addActionListener(e -> {
            this.counter+=2;
            sum.setText(this.counter+ "");
        });

        JButton numberThree = new JButton("3");
        this.add(numberThree);
        numberThree.setBounds(80,30,40,30);
        numberThree.setVisible(true);
        numberThree.addActionListener(e -> {
            this.counter+=3;
            sum.setText(this.counter+ "");
        });

        JButton numberFour= new JButton("4");
        this.add(numberFour);
        numberFour.setBounds(0,60,40,30);
        numberFour.setVisible(true);
        numberFour.addActionListener(e -> {
            this.counter+=4;
            sum.setText(this.counter+ "");
        });

        JButton numberFive = new JButton("5");
        this.add(numberFive);
        numberFive.setBounds(40,60,40,30);
        numberFive.setVisible(true);
        numberFive.addActionListener(e -> {
            this.counter+=5;
            sum.setText(this.counter+ "");
        });

        JButton numberSix = new JButton("6");
        this.add(numberSix);
        numberSix.setBounds(80,60,40,30);
        numberSix.setVisible(true);
        numberSix.addActionListener(e -> {
            this.counter+=6;
            sum.setText(this.counter+ "");
        });

        JButton numberSeven = new JButton("7");
        this.add(numberSeven);
        numberSeven.setBounds(0,90,40,30);
        numberSeven.setVisible(true);
        numberSeven.addActionListener(e -> {
            this.counter+=7;
            sum.setText(this.counter+ "");
        });



        JButton numberEight = new JButton("8");
        this.add(numberEight);
        numberEight.setBounds(40,90,40,30);
        numberEight.setVisible(true);
        numberEight.addActionListener(e -> {
            this.counter+=8;
            sum.setText(this.counter+ "");
        });

        JButton numberNine = new JButton("9");
        this.add(numberNine);
        numberNine.setBounds(80,90,40,30);
        numberNine.setVisible(true);
        numberNine.addActionListener(e -> {
            this.counter+=9;
            sum.setText(this.counter+ "");
        });




    }
}
