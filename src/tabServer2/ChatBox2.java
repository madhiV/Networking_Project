package tabServer2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChatBox2 extends JPanel implements Runnable{
    TextArea txt_ar1;
    Label lbl_1;
    TextField txt_fld_1;
    Socket client;
    Button btn;
    String msg;
    BufferedReader br;
    BufferedWriter bw;
    ChatBox2(){
        setBackground(Color.RED);
        setBounds(10,10,1000,1000);
        setVisible(true);
        setFont(new Font("Times New Roman",Font.BOLD,18));
        setLayout(null);

        btn=new Button("Send");

        lbl_1=new Label("History:");
        lbl_1.setBounds(20,50,100,50);

        txt_ar1=new TextArea();
        txt_ar1.setBounds(20,100,800,500);

        txt_fld_1=new TextField("Enter your message here...");
        txt_fld_1.setBounds(20,600,800,200);

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
        btn.setBounds(500,800,100,50);
        btn.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                msg=txt_fld_1.getText();
                txt_ar1.setText(txt_ar1.getText()+"\n"+"YOU : "+msg);
                try {
                    bw.write(msg);
                    bw.newLine();
                    bw.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                txt_fld_1.setText("");
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
        txt_fld_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    msg=txt_fld_1.getText();
                    txt_ar1.setText(txt_ar1.getText()+"\n"+"YOU : "+msg);
                    bw.write(msg);
                    bw.newLine();
                    bw.flush();
                    txt_fld_1.setText("");
                }
                catch(Exception de){

                }
            }
        });
        add(lbl_1);
        add(txt_ar1);
        add(txt_fld_1);
        add(btn);
    }

    @Override
    public void run() {
        try {
            client = new Socket("127.0.0.1", 500);
            br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        }
        catch(Exception d){

        }
    }
    public void establishConn() throws Exception{
        Thread t=new Thread(this);
        t.start();
        t.join();
        t= new Thread(() -> {
            try{
                while(true){
                    receivedTxt(br.readLine());
                }
            }
            catch(Exception e){

            }
        });
        t.start();
    }
    public void receivedTxt(String msg){
        txt_ar1.setText(txt_ar1.getText()+"\nHIM : "+msg);
    }
}
