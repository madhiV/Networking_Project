package tabServer2;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.regex.*;
public class TabServer2 extends JFrame{
    static JTabbedPane tabs;
    static Connection conn;
    static Statement s;
    static String query,pass,email;
    JPanel panel1,panel2,panel3;
    JScrollPane jsp;
    private static Pattern pat;
    private static Matcher mat;
    ChatBox2 b;
    public TabServer2() throws Exception{
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","madhi","java");
            conn.setAutoCommit(true);
        }
        catch(Exception e){

        }
        setTitle("USER2's CHATBOX");
        setBounds(10,10,1000,1000);
        setLayout(new BorderLayout());
        setVisible(true);
        tabs=new JTabbedPane(JTabbedPane.LEFT);
        panel1=new LogIn2();
        panel2=new SignUp2();
        b=new ChatBox2();
        panel3=b;
        jsp=new JScrollPane(panel2);
        tabs.add("LOGIN",new JScrollPane(panel1));
        tabs.add("SIGN UP",jsp);
        tabs.add("CHATBOX",new JScrollPane(panel3));
        hideChatBox();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(tabs);
        b.establishConn();
        setResizable(false);
    }
    public static boolean isValidName(String name){
        pat=Pattern.compile("[a-zA-Z][a-zA-Z ]+");
        mat=pat.matcher(name);
        return mat.matches();
    }
    public static boolean isValidDate(String date){
        pat=Pattern.compile("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))");
        mat=pat.matcher(date);
        return mat.matches();
    }
    public static boolean isValidBloodGroup(String txt){
        pat=Pattern.compile("(A|B|AB|O)[+-]");
        mat=pat.matcher(txt);
        return mat.matches();
    }
    public static boolean isValidPhone(String txt){
        pat=Pattern.compile("[789][0-9]{9}");
        mat=pat.matcher(txt);
        return mat.matches();
    }
    public static boolean isValidEMail(String email){
        pat=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        mat=pat.matcher(email);
        return mat.matches();
    }
    public static boolean isValidPassword(String pass){
        pat=Pattern.compile("^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$");
        mat=pat.matcher(pass);
        return mat.matches();
    }
    public static boolean showChatBox(){
        tabs.setEnabledAt(2,true);
        return true;
    }
    public static boolean hideSignUp(){
        tabs.setEnabledAt(1,false);
        return true;
    }
    public static boolean isPresent(String email1){
        query="select * from netusers where email=email";
        try {
            s=conn.createStatement();
            ResultSet rs=s.executeQuery(query);
            if(rs.next()){
                email=email1;
                pass=rs.getString(12);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean hideChatBox(){
        tabs.setEnabledAt(2,false);
        return true;
    }
    public static boolean hideLogin(){
        tabs.setEnabledAt(0,false);
        return true;
    }
}