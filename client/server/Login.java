import javax.swing.*;
import java.awt.*;

class Login extends JFrame {

    private JButton jb_loggin;
    private JLabel jl_user, jl_port, jl_title;
    private JTextField jt_user, jt_port;

    public Login() {
        super("Login");
        initComponnets();
        configComponnets();
        insertComponnets();
        insertActions();
        start();
    }

    public void initComponnets() {
        jb_loggin = new JButton("Entrar");
        jl_user = new JLabel("Apelido");
        jl_port = new JLabel("Porta");
        jl_title = new JLabel();
        jt_user = new JTextField();
        jt_port = new JTextField();
    }

    public void configComponnets() {
        this.setLayout(null);
        this.setMinimumSize(new Dimension(400, 300));
        this.setResizable(false);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContantPane().setBackground(Color.WHITE);
    
        jl_title.setBounds(10,10, 375, 100)
        
    }

    private void insertComponnets() {

    }

    private void insertActions() {

    }

    private void start() {
        this.pack();
        this.setVisible(true);
    }

}