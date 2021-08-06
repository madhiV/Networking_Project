package tabServer2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ChatBox2 extends JPanel{
    TextArea txt_ar1;
    Label lbl_1;
    TextField txt_fld_1;

    ChatBox2(){
        setBounds(10,10,1000,100);
        setVisible(true);
        setFont(new Font("Times New Roman",Font.BOLD,18));
        setLayout(null);

        lbl_1=new Label("History:");
        lbl_1.setBounds(20,50,100,50);

        txt_ar1=new TextArea();
        txt_ar1.setBounds(20,100,500,500);

        txt_fld_1=new TextField("Enter your message here...");
        txt_fld_1.setBounds(20,600,1000,200);

        txt_fld_1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txt_fld_1.getText().equals("Enter your message here...")){
                    txt_fld_1.setText("");
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
        add(txt_ar1);
        add(txt_fld_1);
    }
}
