package tabServer1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class LogIn1 extends JPanel{
    TextField txt_fld1,txt_fld2;
    Button btn;
    Label lbl_1,lbl_2;
    LogIn1(){
        setBackground(Color.RED);
        setBounds(10,10,1000,1000);
        setLayout(null);
        setVisible(true);
        setFont(new Font("Times New Roman",Font.BOLD,18));

        //Label
        lbl_1=new Label("Email : ");
        lbl_2=new Label("Password : ");

        lbl_1.setBounds(20,50,200,50);
        lbl_2.setBounds(20,100,200,50);

        //TextField
        txt_fld1=new TextField();
        txt_fld2=new TextField();

        txt_fld1.setBounds(220,50,200,50);
        txt_fld2.setBounds(220,100,200,50);
        txt_fld2.setEchoChar('*');
        //Button
        btn=new Button("Login");

        btn.setBounds(220,150,200,50);
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(TabServer1.isPresent(txt_fld1.getText())){
                    if(txt_fld2.getText().equals(TabServer1.pass)){
                        JOptionPane.showMessageDialog(null,"Login Success");
                        TabServer1.showChatBox();
                        TabServer1.hideSignUp();
                        TabServer1.hideLogin();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Wrong Password");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid email...");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(lbl_1);
        add(lbl_2);
        add(btn);
        add(txt_fld1);
        add(txt_fld2);
    }
}