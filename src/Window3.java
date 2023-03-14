import javax.swing.*;

public class Window3 extends JFrame {

//    public static final int START_X=0;
//    public static final int START_Y=0;
//    public static final int ELEMENT_WIDTH=200;
//    public static final int ELEMENT_HEIGHT=20;
//
//
//

    private int number;
    public Window3(){
//        this.setSize(500,500);
//        this.setVisible(true);
//      //  this.setResizable(false);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
//        this.setTitle("yosef's window :) ");
//        this.setLayout(null);
//
//
//        JLabel myText=new JLabel("follow the instructions!");
//        this.add(myText);
//        myText.setBounds(START_X,START_Y,ELEMENT_WIDTH,ELEMENT_HEIGHT);
//        myText.setVisible(true);
//        //
//        JLabel okMessage=new JLabel("Good job!");
//        this.add(okMessage);
//        okMessage.setVisible(false);
//
//
//        JButton myButton=new JButton("click on me");
//        this.add(myButton);
//        myButton.setBounds(myText.getX(), myText.getY()+myText.getHeight(), 150,15);
//        okMessage.setBounds(myButton.getX(), myButton.getY()+myButton.getHeight(), 100,15);
//        myButton.addActionListener((event)->{
//            okMessage.setVisible(!okMessage.isVisible());
//        });
//




    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setLocationRelativeTo(null);
    this.setTitle("Now it will work!");

    this.number=0;
    JLabel result=new JLabel(number+"");
    this.add(result);
    result.setVisible(true);
    result.setBounds(0,0,40,10);

    JButton up=new JButton("+1");
    this.add(up);
    up.setVisible(true);
    up.setBounds(0,30,40,10);
    up.addActionListener((event)->{
        this.number++;
      result.setText(number+"");
    });

    }
}
