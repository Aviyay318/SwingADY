import javax.swing.*;

public class AviyaWindow extends JFrame {
    private int sum;
    private boolean isPlus;
    public AviyaWindow(){
        this.sum=0;
        this.isPlus=true;
        this.setLayout(null);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Aviya Window");
        this.setLocationRelativeTo(null);
        JLabel result = new JLabel(sum+"");
        this.add(result);
        result.setVisible(true);
        result.setBounds(75,150,150,20);

        JButton plus = new JButton("+");
        this.add(plus);
        plus.setVisible(true);
        plus.setBounds(10,180,50,30);
        plus.addActionListener((event) ->{
            this.isPlus=true;
        });

        JButton minus = new JButton("-");
        this.add(minus);
        minus.setVisible(true);
        minus.setBounds(80,180,50,30);
        minus.addActionListener(e ->{
            this.isPlus=false;

        } );

        JButton equals = new JButton("=");
        this.add(equals);
        equals.setVisible(true);
        equals.setBounds(150, 180, 50,30);
        equals.addActionListener(e -> {
            result.setText(sum + "");
        });

        JButton clear = new JButton("clr");
        this.add(clear);
        clear.setVisible(true);
        clear.setBounds(240,180,50,30);
        clear.addActionListener(e -> {
            this.sum=0;
            this.isPlus=true;
            result.setText(sum +"");
        });

        JButton one = new JButton("1");
        this.add(one);
        one.setBounds(10,10,40,30);
        one.setVisible(true);
        one.addActionListener((event) -> {
            if (this.isPlus){
                sum+=1;
            }else {
                sum-=1;
            }
        });

        JButton four = new JButton("4");
        this.add(four);
        four.setBounds(10,50,40,30);
        four.setVisible(true);
        four.addActionListener((event) -> {
            if (this.isPlus){
                sum+=4;
            }else {
                sum-=4;
            }
        });

        JButton seven = new JButton("7");
        this.add(seven);
        seven.setBounds(10,90,40,30);
        seven.setVisible(true);
        seven.addActionListener((event) -> {
            if (this.isPlus){
                sum+=7;
            }else {
                sum-=7;
            }
        });

        JButton two = new JButton("2");
        this.add(two);
        two.setBounds(60,10,40,30);
        two.setVisible(true);
        two.addActionListener((event) -> {
            if (this.isPlus){
                sum+=2;
            }else {
                sum-=2;
            }
        });

        JButton five = new JButton("5");
        this.add(five);
        five.setBounds(60,50,40,30);
        five.setVisible(true);
        five.addActionListener((event) -> {
            if (this.isPlus){
                sum+=5;
            }else {
                sum-=5;
            }
        });
        JButton eight = new JButton("8");
        this.add(eight);
        eight.setBounds(60,90,40,30);
        eight.setVisible(true);
        eight.addActionListener((event) -> {
            if (this.isPlus){
                sum+=8;
            }else {
                sum-=8;
            }
        });

        JButton tree = new JButton("3");
        this.add(tree);
        tree.setBounds(110,10,40,30);
        tree.setVisible(true);
        tree.addActionListener((event) -> {
            if (this.isPlus){
                sum+=3;
            }else {
                sum-=3;
            }
        });
        JButton six = new JButton("6");
        this.add(six);
        six.setBounds(110,50,40,30);
        six.setVisible(true);
        six.addActionListener((event) -> {
            if (this.isPlus){
                sum+=6;
            }else {
                sum-=6;
            }
        });
        JButton nine = new JButton("9");
        this.add(nine);
        nine.setBounds(110,90,40,30);
        nine.setVisible(true);
        nine.addActionListener((event) -> {
            if (this.isPlus){
                sum+=9;
            }else {
                sum-=9;
            }
        });
    }
}
