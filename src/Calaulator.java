import javax.swing.*;

public class Calaulator extends JFrame {

    private int resultNumber=0;
public Calaulator(){

    this.setLayout(null);
    this.setSize(900,1000);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setTitle("My calculator");

    JLabel resultLabel=new JLabel(this.resultNumber+"");
    this.add(resultLabel);
    resultLabel.setVisible(true);
    resultLabel.setBounds(50,0,40,20);


    JButton one=new JButton("1");
    one.setBounds(0,25,40,20);
    this.add(one);
    one.setVisible(true);
    one.addActionListener((event)->{
        this.resultNumber+=1;
    resultLabel.setText(resultLabel+"");
    });

    JButton two=new JButton("2");
    two.setBounds(45,25,40,20);
    this.add(two);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=2;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton three=new JButton("3");
    three.setBounds(90,25,40,20);
    this.add(three);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=3;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton fore=new JButton("4");
    three.setBounds(0,50,40,20);
    this.add(fore);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=4;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton five=new JButton("5");
    three.setBounds(45,50,40,20);
    this.add(five);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=5;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton six=new JButton("6");
    three.setBounds(90,50,40,20);
    this.add(six);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=6;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton seven=new JButton("7");
    three.setBounds(0,75,40,20);
    this.add(seven);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=7;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton eight=new JButton("8");
    three.setBounds(45,75,40,20);
    this.add(eight);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=8;
        resultLabel.setText(resultLabel+"");
    } ));

    JButton nine=new JButton("9");
    three.setBounds(90,75,40,20);
    this.add(nine);
    two.setVisible(true);
    two.addActionListener((e ->{
        this.resultNumber+=9;
        resultLabel.setText(resultLabel+"");
    } ));


}

}
