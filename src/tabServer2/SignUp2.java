package tabServer2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class SignUp2 extends JPanel{
    Label lbl_1,lbl_2,lbl_3,lbl_4,lbl_5,lbl_6,lbl_7,lbl_8,lbl_9,lbl_10,lbl_11,lbl_12,lbl_13;
    TextField txt_1,txt_2,txt_3,txt_4,txt_5,txt_6,txt_7,txt_8,txt_9,txt_10;
    Button btn_1;
    JRadioButton radBtn_1,radBtn_2,radBtn_3;
    JComboBox<Integer> list_1;
    JComboBox<String> list_2;
    ButtonGroup btn_grp;
    SignUp2() throws Exception{
        setBounds(10,10,1000,5000);
        setVisible(true);
        setFont(new Font("Times New Roman",Font.BOLD,20));
        setLayout(null);
        //Label
        lbl_1=new Label("FirstName : ");
        lbl_2=new Label("LastName : ");
        lbl_3=new Label("DOB : ");
        lbl_4=new Label("Gender : ");
        lbl_5=new Label("Blood group : ");
        lbl_6=new Label("College : ");
        lbl_7=new Label("Course : ");
        lbl_8=new Label("Graduation year : ");
        lbl_9=new Label("Phone number : ");
        lbl_10=new Label("Nationality : ");
        lbl_11=new Label("Email : ");
        lbl_12=new Label("Password : ");
        lbl_13=new Label("Re-enter password : ");

        //Setting label bounds
        lbl_1.setBounds(20,50,200,50);
        lbl_2.setBounds(20,100,200,50);
        lbl_3.setBounds(20,150,200,50);
        lbl_4.setBounds(20,200,200,50);
        lbl_5.setBounds(20,250,200,50);
        lbl_6.setBounds(20,300,200,50);
        lbl_7.setBounds(20,350,200,50);
        lbl_8.setBounds(20,400,200,50);
        lbl_9.setBounds(20,450,200,50);
        lbl_10.setBounds(20,500,200,50);
        lbl_11.setBounds(20,550,200,50);
        lbl_12.setBounds(20,600,200,50);
        lbl_13.setBounds(20,650,200,50);

        //TextFields
        txt_1=new TextField();
        txt_2=new TextField();
        txt_3=new TextField();
        txt_4=new TextField();
        txt_5=new TextField();
        txt_6=new TextField();
        txt_7=new TextField();
        txt_8=new TextField();
        txt_9=new TextField();
        txt_10=new TextField();

        //SetBounds of textfields
        txt_1.setBounds(220,50,200,50);//FirstName
        txt_2.setBounds(220,100,200,50);//LastName
        txt_3.setBounds(220,150,200,50);//DOB
        txt_4.setBounds(220,250,200,50);//BloodGroup
        txt_5.setBounds(220,300,200,50);//College
        txt_6.setBounds(220,350,200,50);//Course
        txt_7.setBounds(220,450,200,50);//PhoneNumber
        txt_8.setBounds(220,550,200,50);//Email
        txt_9.setBounds(220,600,200,50);//Pass
        txt_10.setBounds(220,650,200,50);//Re enter pass
        txt_9.setEchoChar('*');
        txt_10.setEchoChar('*');

        //RadioButton
        radBtn_1=new JRadioButton("Male");
        radBtn_2=new JRadioButton("Female");
        radBtn_3=new JRadioButton("Others");

        //setBounds for radButton
        radBtn_1.setBounds(220,200,200,50);
        radBtn_2.setBounds(440,200,200,50);
        radBtn_3.setBounds(660,200,200,50);

        //ButtonGroup
        btn_grp=new ButtonGroup();
        btn_grp.add(radBtn_1);
        btn_grp.add(radBtn_2);
        btn_grp.add(radBtn_3);

        //List
        list_1=new JComboBox<>(new Integer[]{2021,2022,2023,2024,2025,2026});
        list_2=new JComboBox<>(new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"});

        //List Bounds
        list_1.setBounds(220,400,200,50);//Year
        list_2.setBounds(220,500,200,50);//Nation

        //Button
        btn_1=new Button("SIGN UP");
        btn_1.setBounds(220,700,200,50);

        btn_1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!TabServer2.isValidName(txt_1.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid firstname...");
                    return;
                }
                if(!TabServer2.isValidName(txt_2.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid lastname...");
                    return;
                }
                if(!TabServer2.isValidDate(txt_3.getText())){
                    JOptionPane.showMessageDialog(null,"Enter DOB in YYYY-MM-DD format...");
                    return;
                }
                if(btn_grp.getSelection()==null){
                    JOptionPane.showMessageDialog(null,"Select gender...");
                    return;
                }
                if(!TabServer2.isValidBloodGroup(txt_4.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid blood group...");
                    return;
                }
                if(!TabServer2.isValidName(txt_5.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid college name...");
                    return;
                }
                if(!TabServer2.isValidName(txt_6.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid course...");
                    return;
                }
                if(!TabServer2.isValidPhone(txt_7.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid phone number...");
                    return;
                }
                if(!TabServer2.isValidEMail(txt_8.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a valid email...");
                    return;
                }
                if(!TabServer2.isValidPassword(txt_9.getText())){
                    JOptionPane.showMessageDialog(null,"Enter a strong password...");
                    return;
                }
                if(!txt_10.getText().equals(txt_9.getText())){
                    JOptionPane.showMessageDialog(null,"Passwords doesn't match...");
                    return;
                }
                String query,gender,email;
                email=txt_8.getText();
                try {
                    Statement st = TabServer2.conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from netusers where email='"+email+"'");

                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Email already registered...");
                        return;
                    }
                }
                catch(Exception d){

                }
                if(radBtn_1.isSelected()){
                    gender="male";
                }
                else if(radBtn_2.isSelected()){
                    gender="female";
                }
                else{
                    gender="others";
                }
                try {//TO_DATE('1989-12-09','YYYY-MM-DD')
                    query="{call insertnetusers('"+txt_1.getText()+"','"+txt_2.getText()+"',TO_DATE('"+txt_3.getText()+"','YYYY-MM-DD'),'"+gender+"','"+txt_4.getText()+"','"+txt_5.getText()+"','"+txt_6.getText()+"','"+list_1.getItemAt(list_1.getSelectedIndex())+"','"+txt_7.getText()+"','"+list_2.getItemAt(list_2.getSelectedIndex())+"','"+txt_8.getText()+"','"+txt_10.getText()+"')}";
                    CallableStatement statement= TabServer2.conn.prepareCall(query);
                    statement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"User registration success....");
                }
                catch(Exception d){

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
        add(lbl_3);
        add(lbl_4);
        add(lbl_5);
        add(lbl_6);
        add(lbl_7);
        add(lbl_8);
        add(lbl_9);
        add(lbl_10);
        add(lbl_11);
        add(lbl_12);
        add(lbl_13);
        add(txt_1);
        add(txt_2);
        add(txt_3);
        add(txt_4);
        add(txt_5);
        add(txt_6);
        add(txt_7);
        add(txt_8);
        add(txt_9);
        add(txt_10);
        add(list_1);
        add(list_2);
        add(btn_1);
        add(radBtn_1);
        add(radBtn_2);
        add(radBtn_3);
    }
}
