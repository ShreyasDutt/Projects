import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
abstract class main {
    abstract void login_page();
    abstract void homepage();
    abstract void SelectSeats();
}
class movie_ticket_booking extends main implements ActionListener{
    JFrame print;

    String Save_Cinema,Save_Time,Save_Day,Save_Movie_Name;
    JLabel Enter_phone, Info1,Info2,Info3, verify;
    JLabel tiger3_label, hungerGames_label, twelvthFail_label, movieFour;
    JTextField Input_phone;
    JButton Check_phone, Download_receipt;
    int totalSeats,silverPrice,goldPrice,platinumPrice;
    JFrame timing_frame =new JFrame();
    JFrame seats_frame = new JFrame("Seats");
    JFrame homepage_frame =new JFrame();
    String selected_city,selected;
    String city_selecteddd;
    JLabel movie1_label,l2,l3,l4,homepage_title, seats;
    JRadioButton r1,r2,r3,today_rb,tomorrow_rb,dtomorrow_rb, timing2_rb, timing3_rb, timing4_rb,timing1_rb;

    JButton next,movie1_button,movie2_button,movie3_button,movie4_button,timing_previous_b,seats_previous_b,seats_homepage_b;
    String[] City = {"Select Your City","Chandigarh", "Mohali", "Patiala","Panchkula","Rajpura"};
    JComboBox<String> cities = new JComboBox<>(City);
    //Cinema Radio button Group
    ButtonGroup movie_bg,day_bg,timing_bg;
    Font font3=new Font(" ",Font.BOLD,40);
    Font font1=new Font(" ",Font.BOLD,22);
    Font font2=new Font(" ",Font.ITALIC,16);
    //Movie posters------------------------------
    ImageIcon image=new ImageIcon("icon.jpg");
    ImageIcon tiger3image=new ImageIcon("Tiger3.png");
    ImageIcon HGimage=new ImageIcon("HungerGames.png");
    ImageIcon Failimage=new ImageIcon("12thFail.png");
    ImageIcon movie_4=new ImageIcon("movie4.png");
    //Seating Panels-------------------
    JPanel silver = new JPanel();
    JPanel Gold = new JPanel();
    JPanel Platinum = new JPanel();
    //Silver Buttons
    JButton S1 = new JButton("S1");
    JButton S2 = new JButton("S2");
    JButton S3 = new JButton("S3");
    JButton S4 = new JButton("S4");
    JButton S5 = new JButton("S5");
    JButton S6 = new JButton("S6");
    JButton S7 = new JButton("S7");
    JButton S8 = new JButton("S8");
    //Gold Buttons
    JButton G1 = new JButton("G1");
    JButton G2 = new JButton("G2");
    JButton G3 = new JButton("G3");
    JButton G4 = new JButton("G4");
    JButton G5 = new JButton("G5");
    JButton G6 = new JButton("G6");
    JButton G7 = new JButton("G7");
    JButton G8 = new JButton("G8");
    //Platinum Buttons
    JButton P1 = new JButton("P1");
    JButton P2 = new JButton("P2");
    JButton P3 = new JButton("P3");
    JButton P4 = new JButton("P4");
    JButton P5 = new JButton("P5");
    JButton P6 = new JButton("P6");
    JButton P7 = new JButton("P7");
    JButton P8 = new JButton("P8");
    //----------ActionButtons--------
    JButton Reset = new JButton("Reset");
    JButton Confirm = new JButton("Confirm");
    JTextField selectedSeats = new JTextField();
    JPanel Screen = new JPanel();
    JLabel ScreenText = new JLabel("Screen");
    MenuBar menu_bar= new MenuBar();
    Menu home_menu=new Menu("Home");
    int totalPrice;
    JFrame Payment_Portal = new JFrame("Payment Portal");
    JTextField Total_Price = new JTextField();
    Font font7 = new Font("",Font.BOLD,30);
    JButton UPI = new JButton("UPI");
    JButton Card = new JButton("Card");
    JButton Cash = new JButton("Net Banking");
    JButton Next = new JButton("Next");
    JLabel Status = new JLabel();
    JFrame loginFrame = new JFrame();
    char c;
    JLabel loginTitle, loginPhoneNumberLabel, loginOTPLabel, loginERR;
    JLabel Info4, Info5,Info6,Info7,Info8;
    JButton loginSendOTPButton, loginButton, loginResendOTP, loginChangeNumber;
    JTextField Phone_number, loginOTPInput;
    int loginOTP, loginINTOTPInput = 0, k = 0;
    Random r = new Random();

    @Override
    void login_page() {
        //      login frame
        loginFrame.setVisible(true);
        loginFrame.setSize(360, 550);
        loginFrame.setLayout(null);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setTitle("Login Page");
        loginFrame.getContentPane().setBackground(new Color(106, 112, 173));
        loginFrame.setIconImage(image.getImage());



        Phone_number = new JTextField(12);
        loginOTPInput = new JTextField(7);

        loginSendOTPButton = new JButton("Send OTP");
        loginSendOTPButton.addActionListener(this::login_main_page);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this::login_main_page);
        loginResendOTP = new JButton("Resend OTP");
        loginResendOTP.addActionListener(this::login_main_page);
        loginChangeNumber = new JButton("Change Number");
        loginChangeNumber.addActionListener(this::login_main_page);

        loginTitle = new JLabel("Welcome to BookMyShow!");
        loginPhoneNumberLabel = new JLabel("Phone Number: ");
        loginOTPLabel = new JLabel("Enter OTP: ");
        loginERR = new JLabel(" ");

        loginOTPLabel.setVisible(false);
        loginButton.setVisible(false);
        loginOTPInput.setVisible(false);
        loginResendOTP.setVisible(false);
        loginChangeNumber.setVisible(false);

        loginSendOTPButton.setBounds(100, 200, 150, 25);
        loginButton.setBounds(100, 300, 150, 25);
        loginResendOTP.setBounds(25, 200, 150, 25);
        loginChangeNumber.setBounds(175, 200, 150, 25);
        loginTitle.setBounds(100, 50, 150, 25);
        loginPhoneNumberLabel.setBounds(25, 150, 150, 25);
        loginOTPLabel.setBounds(25, 250, 150, 25);
        loginERR.setBounds(25, 350, 200, 25);
        Phone_number.setBounds(125, 150, 200, 25);
        loginOTPInput.setBounds(125, 250, 150, 25);

        loginFrame.add(loginSendOTPButton);
        loginFrame.add(loginButton);
        loginFrame.add(loginResendOTP);
        loginFrame.add(loginChangeNumber);
        loginFrame.add(loginTitle);
        loginFrame.add(loginPhoneNumberLabel);
        loginFrame.add(loginOTPLabel);
        loginFrame.add(loginERR);
        loginFrame.add(Phone_number);
        loginFrame.add(loginOTPInput);

        menu_bar.add(home_menu);

    }

    @Override
    void homepage() {

        //download reciept frame
        print = new JFrame();
        print.setLayout(null);
        print.setSize(500, 500);
        print.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        print.setTitle("Recipt");
        print.getContentPane().setBackground(new Color(106, 112, 173));
        print.setIconImage(image.getImage());

        tiger3_label = new JLabel("Tiger - 3");
        hungerGames_label = new JLabel("Hunger Games");
        twelvthFail_label = new JLabel("12th Fail");
        movieFour = new JLabel("Maujaan hi Maujaan!");

        Enter_phone = new JLabel("Enter your Phone number: ");
        Enter_phone.setBounds(10, 10, 200, 50);

        Input_phone = new JTextField();
        Input_phone.setBounds(170, 15, 90, 40);

        Check_phone = new JButton("Submit");
        Check_phone.setBounds(170, 70, 100, 40);
        Check_phone.addActionListener(this::print_reciept);

        Info1 = new JLabel(" ");
        Info1.setBounds(100, 20, 400, 300);

        Info2 = new JLabel(" ");
        Info2.setBounds(100, 40, 400, 300);

        Info3 = new JLabel(" ");
        Info3.setBounds(100, 60, 400, 300);

        Info4 = new JLabel(" ");
        Info4.setBounds(100, 80, 400, 300);

        Info5 = new JLabel(" ");
        Info5.setBounds(100, 100, 400, 300);

        Info6 = new JLabel(" ");
        Info6.setBounds(100, 120, 400, 300);

        Info7 = new JLabel(" ");
        Info7.setBounds(100, 140, 400, 300);

        Info8 = new JLabel(" ");
        Info8.setBounds(100, 160, 400, 300);



        Download_receipt = new JButton("Download receipt");
        Download_receipt.setBounds(160, 350, 200, 50);
        Download_receipt.addActionListener(this::download_receipt);
        Download_receipt.setVisible(false);

        verify = new JLabel(" ");
        verify.setBounds(180, 400, 300, 50);

        print.add(Enter_phone);
        print.add(Input_phone);
        print.add(Check_phone);
        print.add(Info1);
        print.add(Info2);
        print.add(Info3);
        print.add(Info4);
        print.add(Info5);
        print.add(Info6);
        print.add(Info7);
        print.add(Info8);


        print.add(Download_receipt);
        print.add(verify);

//homepage frame
        homepage_frame.setSize(1920,1080);
        homepage_frame.setLayout(null);
        homepage_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homepage_frame.setTitle("Book My Show/Home");
        homepage_frame.setIconImage(image.getImage());
        homepage_frame.getContentPane().setBackground(new Color(21, 21, 21));
        homepage_frame.setMenuBar(menu_bar);

        homepage_title=new JLabel("BOOK MY SHOW");
        homepage_title.setFont(font3);
        homepage_title.setBounds(30,20,400,80);
        homepage_title.setForeground(Color.white);


        movie1_button =new JButton(tiger3image);
        movie1_button.setBounds(60,200,300,500);
        movie1_button.addActionListener(this::First_Frame);
        movie2_button =new JButton(HGimage);
        movie2_button.setBounds(445,200,300,500);
        movie2_button.addActionListener(this::First_Frame);
        movie3_button=new JButton(Failimage);
        movie3_button.setBounds(830,200,300,500);
        movie3_button.addActionListener(this::First_Frame);
        movie4_button=new JButton(movie_4);
        movie4_button.setBounds(1185,200,300,500);
        movie4_button.addActionListener(this::First_Frame);

        tiger3_label.setBounds(150, 710, 100, 50);
        tiger3_label.setForeground(Color.WHITE);
        tiger3_label.setFont(new Font("Arial", Font.BOLD, 24));

        hungerGames_label.setBounds(520, 710, 200, 50);
        hungerGames_label.setForeground(Color.WHITE);
        hungerGames_label.setFont(new Font("Arial", Font.BOLD, 24));

        twelvthFail_label.setBounds(920, 710, 100, 50);
        twelvthFail_label.setForeground(Color.WHITE);
        twelvthFail_label.setFont(new Font("Arial", Font.BOLD, 24));

        movieFour.setBounds(1220, 710, 300, 50);
        movieFour.setForeground(Color.WHITE);
        movieFour.setFont(new Font("Arial", Font.BOLD, 24));


        homepage_frame.add(movie1_button);
        homepage_frame.add(movie2_button);
        homepage_frame.add(movie3_button);
        homepage_frame.add(movie4_button);
        homepage_frame.add(homepage_title);
        homepage_frame.add(tiger3_label);
        homepage_frame.add(hungerGames_label);
        homepage_frame.add(twelvthFail_label);
        homepage_frame.add(movieFour);


        //timing frame
        timing_frame.setSize(450,650);
        timing_frame.setLayout(null);
        timing_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        timing_frame.setTitle("Timings");
        timing_frame.setIconImage(image.getImage());
        timing_frame.getContentPane().setBackground(new Color(106, 112, 173));

        movie1_label =new JLabel("TIGER 3-HINDI");
        movie1_label.setBounds(10,30,350,30);
        movie1_label.setFont(font1);

        cities.setBounds(15,80,120,30);
        cities.addActionListener(this::errors);

        l3=new JLabel("Select Cinema for the Show");
        l3.setFont(font2);
        l3.setBounds(10,125,250,50);
        r1=new JRadioButton("X Cinema");
        r1.setBackground(new Color(106, 112, 173));
        r1.setBounds(10,170,120,50);
        r1.addActionListener(this::First_Frame);
        r2=new JRadioButton("Y Cinema");
        r2.setBackground(new Color(106, 112, 173));
        r2.setBounds(127,170,120,50);
        r2.addActionListener(this::First_Frame);
        r3=new JRadioButton("Z Cinema");
        r3.setBackground(new Color(106, 112, 173));
        r3.setBounds(243,170,120,50);
        r3.addActionListener(this::First_Frame);
        movie_bg =new ButtonGroup();
        movie_bg.add(r1);
        movie_bg.add(r2);
        movie_bg.add(r3);

        l2=new JLabel("Select Day for the Show");
        l2.setBounds(10,235,190,50);
        l2.setFont(font2);
        today_rb= new JRadioButton("Today");
        today_rb.setBounds(10,280,70,30);
        today_rb.setBackground(new Color(106, 112, 173));
        today_rb.addActionListener(this::First_Frame);
        tomorrow_rb= new JRadioButton("Tomorrow");
        tomorrow_rb.setBounds(90,280,100,30);
        tomorrow_rb.setBackground(new Color(106, 112, 173));
        tomorrow_rb.addActionListener(this::First_Frame);
        dtomorrow_rb= new JRadioButton("Day After Tomorrow");
        dtomorrow_rb.setBounds(200,280,160,30);
        dtomorrow_rb.setBackground(new Color(106, 112, 173));
        dtomorrow_rb.addActionListener(this::First_Frame);

        day_bg=new ButtonGroup();
        day_bg.add(today_rb);
        day_bg.add(tomorrow_rb);
        day_bg.add(dtomorrow_rb);

        l4=new JLabel("Select Timing for the Show");
        l4.setBounds(10,345,210,50);
        l4.setFont(font2);
        timing1_rb= new JRadioButton("11:00 AM");
        timing1_rb.setBounds(10,390,100,30);
        timing1_rb.setBackground(new Color(106, 112, 173));
        timing1_rb.addActionListener(this::First_Frame);
        timing2_rb = new JRadioButton("3:00 PM");
        timing2_rb.setBounds(130,390,100,30);
        timing2_rb.setBackground(new Color(106, 112, 173));
        timing2_rb.addActionListener(this::First_Frame);
        timing3_rb = new JRadioButton("7:00 PM");
        timing3_rb.setBounds(10,430,100,30);
        timing3_rb.setBackground(new Color(106, 112, 173));
        timing3_rb.addActionListener(this::First_Frame);
        timing4_rb = new JRadioButton("10:30 PM");
        timing4_rb.setBounds(130,430,100,30);
        timing4_rb.setBackground(new Color(106, 112, 173));
        timing4_rb.addActionListener(this::First_Frame);

        timing_bg=new ButtonGroup();
        timing_bg.add(timing1_rb);
        timing_bg.add(timing2_rb);
        timing_bg.add(timing3_rb);
        timing_bg.add(timing4_rb);

        timing_previous_b =new JButton("Previous");
        timing_previous_b.setBounds(80,490,100,40);
        timing_previous_b.addActionListener(this::restartApplication);

        next=new JButton("Next");
        next.setBounds(210,490,80,40);
        next.addActionListener(this::errors);



        timing_frame.add(r1);
        timing_frame.add(r2);
        timing_frame.add(r3);
        timing_frame.add(cities);
        timing_frame.add(l3);
        timing_frame.add(l4);
        timing_frame.add(timing1_rb);
        timing_frame.add(timing2_rb);
        timing_frame.add(timing3_rb);
        timing_frame.add(timing4_rb);
        timing_frame.add(next);
        timing_frame.add(l2);
        timing_frame.add(today_rb);
        timing_frame.add(tomorrow_rb);
        timing_frame.add(dtomorrow_rb);
        timing_frame.add(timing_previous_b);
        timing_frame.add(movie1_label);
    }
    void SelectSeats(){
        //Seating Arrangement Frame
        seats_frame.setLayout(null);
        seats_frame.getContentPane().setBackground(new Color(106, 112, 173));
        seats_frame.setSize(700,600);
        seats_frame.setIconImage(image.getImage());
//        Seats.setVisible(false);
        seats_frame.getContentPane().setBackground(Color.WHITE);
        S1.setBounds(60,30,50,50);
        S2.setBounds(120,30,50,50);
        S3.setBounds(180,30,50,50);
        S4.setBounds(240,30,50,50);
        S5.setBounds(300,30,50,50);
        S6.setBounds(360,30,50,50);
        S7.setBounds(420,30,50,50);
        S8.setBounds(480,30,50,50);

        G1.setBounds(60,30,50,50);
        G2.setBounds(120,30,50,50);
        G3.setBounds(180,30,50,50);
        G4.setBounds(240,30,50,50);
        G5.setBounds(300,30,50,50);
        G6.setBounds(360,30,50,50);
        G7.setBounds(420,30,50,50);
        G8.setBounds(480,30,50,50);

        P1.setBounds(60, 30, 50, 50);
        P2.setBounds(120, 30, 50, 50);
        P3.setBounds(180, 30, 50, 50);
        P4.setBounds(240, 30, 50, 50);
        P5.setBounds(300, 30, 50, 50);
        P6.setBounds(360, 30, 50, 50);
        P7.setBounds(420, 30, 50, 50);
        P8.setBounds(480, 30, 50, 50);

        ScreenText.setForeground(Color.WHITE);
        Screen.add(ScreenText);
        Screen.setBackground(new Color(0, 162, 35, 255));
        Screen.setBounds(90,10,500,30);

        Reset.setBounds(40,400,90,40);
        selectedSeats.setBounds(180,400,320,40);
        selectedSeats.setEditable(false);
        Confirm.setBounds(550,400,90,40);
        Confirm.addActionListener(this::Confirm);

        seats_previous_b=new JButton("Previous");
        seats_previous_b.setBounds(40,470,90,40);
        seats_previous_b.addActionListener(this::restartApplication);
        seats_homepage_b=new JButton("Home Page");
        seats_homepage_b.setBounds(550,470,110,40);
        seats_homepage_b.addActionListener(this::restartApplication);

        seats=new JLabel();
        seats.setBounds(180,450,320,60);
        seats.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        seats.setHorizontalAlignment(JLabel.CENTER);
        seats.setVerticalAlignment(JLabel.CENTER);

        silver.setBackground(new Color(80, 85, 89));
        silver.setLayout(null);
        silver.setBounds(40,40,600,100);
        S1.addActionListener(this);
        S2.addActionListener(this);
        S3.addActionListener(this);
        S4.addActionListener(this);
        S5.addActionListener(this);
        S6.addActionListener(this);
        S7.addActionListener(this);
        S8.addActionListener(this);
        G1.addActionListener(this);
        G2.addActionListener(this);
        G3.addActionListener(this);
        G4.addActionListener(this);
        G5.addActionListener(this);
        G6.addActionListener(this);
        G7.addActionListener(this);
        G8.addActionListener(this);
        P1.addActionListener(this);
        P2.addActionListener(this);
        P3.addActionListener(this);
        P4.addActionListener(this);
        P5.addActionListener(this);
        P6.addActionListener(this);
        P7.addActionListener(this);
        P8.addActionListener(this);

        Reset.addActionListener(this::ResetButton);
        silver.add(S1);
        silver.add(S2);
        silver.add(S3);
        silver.add(S4);
        silver.add(S5);
        silver.add(S6);
        silver.add(S7);
        silver.add(S8);

        Gold.setBackground(new Color(245, 221, 98));
        Gold.setLayout(null);
        Gold.setBounds(40,160,600,100);
        Gold.add(G1);
        Gold.add(G2);
        Gold.add(G3);
        Gold.add(G4);
        Gold.add(G5);
        Gold.add(G6);
        Gold.add(G7);
        Gold.add(G8);

        Platinum.setBackground(new Color(183, 183, 183));
        Platinum.setLayout(null);
        Platinum.setBounds(40,280,600,100);
        Platinum.add(P1);
        Platinum.add(P2);
        Platinum.add(P3);
        Platinum.add(P4);
        Platinum.add(P5);
        Platinum.add(P6);
        Platinum.add(P7);
        Platinum.add(P8);

        seats_frame.add(silver);
        seats_frame.add(Gold);
        seats_frame.add(Platinum);
        seats_frame.add(Reset);
        seats_frame.add(selectedSeats);
        seats_frame.add(Confirm);
        seats_frame.add(Screen);
        seats_frame.add(seats_homepage_b);
        seats_frame.add(seats_previous_b);
        seats_frame.add(seats);
        seats_frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        //Payment Portal Frame
        Payment_Portal.setSize(500,500);
        Payment_Portal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Payment_Portal.setLayout(null);
        Payment_Portal.setIconImage(image.getImage());
        Payment_Portal.getContentPane().setBackground(new Color(106, 112, 173));
        Total_Price.setBounds(10,50,470,70);
        UPI.setBounds(10,200,200,80);
        Card.setBounds(260,200,200,80);
        Cash.setBounds(10,300,200,80);
        Next.setBounds(260,300,200,80);
        Status.setBounds(200,400,200,60);
        Total_Price.setFont(font7);
        Total_Price.setEditable(false);
        UPI.addActionListener(this::PaymentButtons);
        Card.addActionListener(this::PaymentButtons);
        Cash.addActionListener(this::PaymentButtons);
        Next.addActionListener(this::PaymentButtons);

        Payment_Portal.add(Total_Price);
        Payment_Portal.add(UPI);
        Payment_Portal.add(Card);
        Payment_Portal.add(Cash);
        Payment_Portal.add(Next);
        Payment_Portal.add(Status);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == S1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S1");
            S1.setEnabled(false);
        }
        else if (e.getSource() == S2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S2");
            S2.setEnabled(false);
        }
        else if (e.getSource() == S3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S3");
            S3.setEnabled(false);
        }
        else if (e.getSource() == S4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S4");
            S4.setEnabled(false);
        }
        else if (e.getSource() == S5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S5");
            S5.setEnabled(false);
        }
        else if (e.getSource() == S6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S6");
            S6.setEnabled(false);
        }
        else if (e.getSource() == S7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S7");
            S7.setEnabled(false);
        }
        else if (e.getSource() == S8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected+" "+"S8");
            S8.setEnabled(false);
        }
        else if (e.getSource() == G1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G1");
            G1.setEnabled(false);
        } else if (e.getSource() == G2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G2");
            G2.setEnabled(false);
        } else if (e.getSource() == G3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G3");
            G3.setEnabled(false);
        } else if (e.getSource() == G4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G4");
            G4.setEnabled(false);
        } else if (e.getSource() == G5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G5");
            G5.setEnabled(false);
        } else if (e.getSource() == G6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G6");
            G6.setEnabled(false);
        } else if (e.getSource() == G7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G7");
            G7.setEnabled(false);
        } else if (e.getSource() == G8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "G8");
            G8.setEnabled(false);
        }
        else if (e.getSource() == P1) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P1");
            P1.setEnabled(false);
        } else if (e.getSource() == P2) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P2");
            P2.setEnabled(false);
        } else if (e.getSource() == P3) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P3");
            P3.setEnabled(false);
        } else if (e.getSource() == P4) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P4");
            P4.setEnabled(false);
        } else if (e.getSource() == P5) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P5");
            P5.setEnabled(false);
        } else if (e.getSource() == P6) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P6");
            P6.setEnabled(false);
        } else if (e.getSource() == P7) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P7");
            P7.setEnabled(false);
        } else if (e.getSource() == P8) {
            selected = selectedSeats.getText();
            selectedSeats.setText(selected + " " + "P8");
            P8.setEnabled(false);
        }
    }
    public void print_reciept(ActionEvent print) {
        if (print.getSource() == Check_phone) {
            String number = (Input_phone.getText());
            if (number.equalsIgnoreCase(Phone_number.getText())) {
//                Phone_number is the number that the user have

                Info1.setText("Phone Number: "+Phone_number.getText());
                Info2.setText("City: "+city_selecteddd);
                Info3.setText("Cinema: "+ Save_Cinema);
                Info4.setText("Day: "+Save_Day);
                Info5.setText("Time: "+Save_Time);
                Info6.setText("Movie: "+Save_Movie_Name);
                Info7.setText("Total Cost: $"+ totalPrice);
                Info8.setText("Total Seats: "+totalSeats);

                Download_receipt.setVisible(true);
                Input_phone.setEditable(false);
            }
            else
            {
                Info1.setText("Invalid Phone Number");
                Input_phone.setText(null);
                Download_receipt.setVisible(false);
            }
        }
    }
    public void download_receipt(ActionEvent print) {

        if (print.getSource() == Download_receipt)
        {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(Phone_number.getText()+".txt"))){

//                        Change Accordingly

                writer.write("Phone Number: "+ Phone_number.getText() +"\n");
                writer.write("City: "+ city_selecteddd +"\n");
                writer.write("Cinema: "+ Save_Cinema +"\n");
                writer.write("Day: "+ Save_Day +"\n");
                writer.write("Time: "+ Save_Time+"\n");
                writer.write("Movie: "+ Save_Movie_Name +"\n");
                writer.write("Total Cost: $"+ totalPrice +"\n");
                writer.write("Total Seats: "+ totalSeats +"\n");

                verify.setText("Output Saved successfully");

            } catch (IOException ex) {
                verify.setText("Error while generating file!");
            }
        }
    }
    public void login_main_page(ActionEvent loginAE) {
        if(loginAE.getSource() == loginSendOTPButton) {
            if (Phone_number.getText().length() == 10) {
                try {
                    for (int i = 0; i < 10 ; i++) {
                        String str = Phone_number.getText().toLowerCase();
                        c = str.charAt(i);

                        for (char j = 'a'; j <='z' ; j++) {
                            if (c==j || c==' '){
                                loginERR.setText("Please Enter a Valid Number");
                                loginSendOTPButton.setVisible(true);
                                loginButton.setVisible(false);
                                loginResendOTP.setVisible(false);
                                loginChangeNumber.setVisible(false);
                                loginOTPInput.setVisible(false);
                                loginOTPLabel.setVisible(false);
                                Phone_number.setEnabled(true);
                                Phone_number.setEditable(true);
                                Phone_number.setText("");
                                loginOTPInput.setText("");
                                k = 1;
                            }
                        }
                    }
                }
                catch (Exception e) {
                    System.out.print("");
                    loginERR.setText("Please Enter a Valid Number");
                }
                if (k == 0) {
                    loginOTP = r.nextInt(100000, 999999);
                    System.out.println("OTP is: " + loginOTP);
                    loginERR.setText("Please enter the OTP recieved.");
                    Phone_number.setEditable(false);
                    Phone_number.setEnabled(false);
                    loginSendOTPButton.setVisible(false);
                    loginResendOTP.setVisible(true);
                    loginOTPLabel.setVisible(true);
                    loginButton.setVisible(true);
                    loginOTPInput.setVisible(true);
                    loginChangeNumber.setVisible(true);
                }
            }
            else {
                loginERR.setText("Please Enter a Valid Number");
            }
            k = 0;
        }
        else if (loginAE.getSource() == loginButton) {
            try {
                loginINTOTPInput = Integer.parseInt(loginOTPInput.getText());
            }
            catch (Exception loginE) {
                loginERR.setText("Incorrect OTP");
                loginOTPInput.setText("");
            }
            if (loginINTOTPInput == loginOTP) {
                loginERR.setText("Logged in");
                loginFrame.dispose();
                homepage_frame.setVisible(true);
            }
            else {
                loginERR.setText("Incorrect OTP");
                loginOTPInput.setText("");
            }
        }
        else if (loginAE.getSource() == loginResendOTP) {
            System.out.println("OTP is: " + loginOTP);
            loginERR.setText("The OTP has been resent.");
        }
        else if (loginAE.getSource() == loginChangeNumber) {
            loginERR.setText("Please enter the contact number.");
            loginSendOTPButton.setVisible(true);
            loginButton.setVisible(false);
            loginResendOTP.setVisible(false);
            loginChangeNumber.setVisible(false);
            loginOTPInput.setVisible(false);
            loginOTPLabel.setVisible(false);
            Phone_number.setEnabled(true);
            Phone_number.setEditable(true);
            Phone_number.setText("");
            loginOTPInput.setText("");
            k = 0;
        }
    }
    public void ResetButton(ActionEvent e){
        if (e.getSource()==Reset){
            selectedSeats.setText(null);
            S1.setEnabled(true);
            S2.setEnabled(true);
            S3.setEnabled(true);
            S4.setEnabled(true);
            S5.setEnabled(true);
            S6.setEnabled(true);
            S7.setEnabled(true);
            S8.setEnabled(true);
            G1.setEnabled(true);
            G2.setEnabled(true);
            G3.setEnabled(true);
            G4.setEnabled(true);
            G5.setEnabled(true);
            G6.setEnabled(true);
            G7.setEnabled(true);
            G8.setEnabled(true);
            P1.setEnabled(true);
            P2.setEnabled(true);
            P3.setEnabled(true);
            P4.setEnabled(true);
            P5.setEnabled(true);
            P6.setEnabled(true);
            P7.setEnabled(true);
            P8.setEnabled(true);
        }
    }
    public void Confirm(ActionEvent e) {
        if (selectedSeats.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Payment_Portal, "Please Select a Seat !!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String[] selectedSeatsArray = selectedSeats.getText().trim().split(" ");
            totalSeats = selectedSeatsArray.length;
            silverPrice = 10; // Set the price for silver panel
            goldPrice = 15;   // Set the price for gold panel
            platinumPrice = 20; // Set the price for platinum panel
            totalPrice = 0;

            for (String seat : selectedSeatsArray) {
                if (seat.startsWith("S")) {
                    totalPrice += silverPrice;
                } else if (seat.startsWith("G")) {
                    totalPrice += goldPrice;
                } else if (seat.startsWith("P")) {
                    totalPrice += platinumPrice;
                }
            }
            Payment_Portal.setVisible(true);
            Total_Price.setText("$"+totalPrice);
            Next.setEnabled(false);
            seats.setText("Total Number of Seats: " + (totalSeats));
        }
    }
    public void First_Frame(ActionEvent e) {
//        Image Poster 1 | Tiger3
        if (e.getSource()== movie1_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            Save_Movie_Name="Tiger-Hindi";
        }
//        Image Poster 2 | Hunger games
        else if (e.getSource()== movie2_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("THE HUNGER GAMES-ENGLISH");
            Save_Movie_Name="The Hunger Games-English";
        }
//        Image poster 3 | 12th Fail
        else if (e.getSource()==movie3_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("12TH FAIL-HINDI");
            Save_Movie_Name="12th Fail-Hindi";
        }
//        Image poster 4
        else if (e.getSource()==movie4_button) {
            timing_frame.setVisible(true);
            homepage_frame.dispose();
            movie1_label.setText("MAUJAN HI MAUJAN-PUNJABI");
            Save_Movie_Name="Maujan Hi Maujan-Punjabi";
        }

        if (e.getSource() == r1) {
            Save_Cinema = "X Cinema";
        }
        else if (e.getSource() == r2) {
            Save_Cinema = "Y Cinema";
        }
        else if (e.getSource() == r3) {
            Save_Cinema = "Z Cinema";
        }
        else if (e.getSource() == today_rb) {
            Save_Day = "Today";
        }
        else if (e.getSource() == tomorrow_rb) {
            Save_Day = "Tomorrow";
        }
        else if (e.getSource() == dtomorrow_rb) {
            Save_Day = "Day after Tomorrow";
        }
        else if (e.getSource() == timing1_rb) {
            Save_Time = "11:00 AM";
        }
        else if (e.getSource() == timing2_rb) {
            Save_Time = "3:00 PM";
        }
        else if (e.getSource() == timing3_rb) {
            Save_Time = "7:00 PM";
        }
        else if (e.getSource() == timing4_rb) {
            Save_Time = "10:30 PM";
        }
    }
    public void errors(ActionEvent e) {
        if (e.getSource()== next) {
            selected_city=(String) cities.getSelectedItem();
            if (selected_city.equals("Select Your City")) {
                JOptionPane.showMessageDialog(timing_frame, "Please Select your City",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!r1.isSelected() && !r2.isSelected() && !r3.isSelected()) {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Cinema for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!today_rb.isSelected() && !tomorrow_rb.isSelected() && !dtomorrow_rb.isSelected())
            {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Day for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!timing1_rb.isSelected() && !timing2_rb.isSelected() && !timing3_rb.isSelected() && !timing4_rb.isSelected())
            {
                JOptionPane.showMessageDialog(timing_frame, "Please Select Timing for the show",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!selected_city.equals("Select Your City") && !(!r1.isSelected() && !r2.isSelected()
                    && !r3.isSelected()) && !(!today_rb.isSelected() && !tomorrow_rb.isSelected() && !dtomorrow_rb.isSelected())
            ) {
                seats_frame.setVisible(true);

                city_selecteddd = (String) cities.getSelectedItem();
                timing_frame.dispose();
            }
        }
    }
    private void restartApplication(ActionEvent e) {
        if (e.getSource()== timing_previous_b) {
            timing_frame.dispose();
            homepage_frame.dispose();
            seats_frame.dispose();
            movie_ticket_booking newApp = new movie_ticket_booking();
            newApp.homepage();
            homepage_frame.setVisible(true);
            newApp.SelectSeats();
        }
        else if (e.getSource()== seats_homepage_b) {
            seats_frame.dispose();
            timing_frame.dispose();
            homepage_frame.dispose();
            movie_ticket_booking newApp = new movie_ticket_booking();
            newApp.homepage();
            homepage_frame.setVisible(true);
            newApp.SelectSeats();
        }
        else if (e.getSource()== seats_previous_b) {
            seats_frame.dispose();
            timing_frame.setVisible(true);
        }
    }
    public void PaymentButtons (ActionEvent e) {
        if (e.getSource() == UPI || e.getSource() == Card || e.getSource() == Cash) {
            int option = JOptionPane.showConfirmDialog(Payment_Portal, "Pay: $" + totalPrice, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(Payment_Portal, "Paid:  $" + totalPrice);
                UPI.setEnabled(false);
                Card.setEnabled(false);
                Cash.setEnabled(false);
                Next.setEnabled(true);
                Status.setFont(font7);
                Status.setForeground(new Color(0, 0, 0));
                Status.setText("Paid");
            }
        }
        else if (e.getSource()==Next)
        {
            print.setVisible(true);
            seats_frame.dispose();
            Payment_Portal.dispose();
        }
    }
    public static void main(String[] args) {
        movie_ticket_booking a=new movie_ticket_booking();
        a.login_page();
        a.homepage();
        a.SelectSeats();
    }
}
