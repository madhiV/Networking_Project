package tabServer1;
import tabServer2.ChatBox2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChatBox1 extends JPanel implements Runnable{
    final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    TextArea txt_ar1;
    Label lbl_1;
    TextField txt_fld_1;
    ServerSocket server;
    Socket client;
    Button btn;
    Thread t;
    ChatBox1() throws Exception {
        setBounds(10,10,1000,1000);
        setFont(new Font("Times New Roman",Font.BOLD,18));
        setLayout(null);

        btn=new Button("Send");
        btn.setBounds(800,800,120,50);

        add(btn);

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
        btn.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new DataOutputStream(client.getOutputStream()).writeUTF(txt_fld_1.getText());
                    txt_ar1.setText(txt_ar1.getText()+"/nYOU : "+txt_fld_1.getText());
                    txt_fld_1.setText("");
                }
                catch(Exception de){

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
        setVisible(true);
    }
    public void createSocket() throws Exception{
        t=new Thread(){
            @Override
            public void run() {
                try {
                    server=new ServerSocket(500);
                    client=server.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        t.join();
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        String msg;
        try{
            while(true){
                msg=br.readLine();
                receivedText(msg);
            }
        }
        catch(Exception e){

        }
    }
    public void receivedText(String msg){
        txt_ar1.setText(txt_ar1.getText()+"/nHIM : "+msg);
    }
}
