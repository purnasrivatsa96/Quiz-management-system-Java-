/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhiram
 */

import java.awt.*;
import java.awt.event.*;
public class Login extends java.awt.Frame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserId = new java.awt.Label();
        lblPassword = new java.awt.Label();
        txtUserId = new java.awt.TextField();
        txtPassword = new java.awt.TextField();
        btnLogin = new java.awt.Button();

        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        setLayout(new FlowLayout());
        setSize(1000,1000);

        lblUserId.setText("User ID");
        add(lblUserId);
        lblUserId.setBounds(81, 73, 54, 20);

        lblPassword.setText("Password");
        add(lblPassword);
        lblPassword.setBounds(81, 155, 60, 20);
        add(txtUserId);
        txtUserId.setBounds(242, 73, 116, 20);
        add(txtPassword);
        txtPassword.setBounds(242, 155, 116, 20);

        btnLogin.setActionCommand("Login");
        btnLogin.addActionListener(new ButtonClickListener());
        btnLogin.setLabel("Login");
        add(btnLogin);
        btnLogin.setBounds(167, 222, 47, 24);

        
        setLayout(null);
    }// </editor-fold>                        

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private java.awt.Label lblPassword;
    private java.awt.Label lblUserId;
    private java.awt.TextField txtPassword;
    private java.awt.TextField txtUserId;
    String UserId = "";
    String Password = "";
    // End of variables declaration//GEN-END:variables

    public class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            btnLogin.getParent().setVisible(false);
            new Subject().setVisible(true);

        }

    }
}
