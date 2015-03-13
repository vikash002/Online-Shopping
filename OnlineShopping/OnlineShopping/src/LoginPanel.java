/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vaibhavatul47
 */
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    Image img;
    Person person;
    public LoginPanel() {
        initComponents();
        //lpPasswordField.setEchoChar('.');
	
	 
        ImageIcon ic = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        img = ic.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        
    }
    
    public void setPerson(Person p) {
        person = p;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawImage(img, 0, 0, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lpSignupLabel = new javax.swing.JLabel();
        lpPasswordLabel = new javax.swing.JLabel();
        lpSubmitButton = new javax.swing.JButton();
        lpForgotPasswordLabel = new javax.swing.JLabel();
        lpEmailLabel = new javax.swing.JLabel();
        lpUsernameTextField = new javax.swing.JTextField();
        lpPasswordField = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();

        setLayout(null);

        lpSignupLabel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        lpSignupLabel.setForeground(new java.awt.Color(204, 0, 153));
        lpSignupLabel.setText("Sign Up");
        lpSignupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lpSignupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpSignupLabelMouseClicked(evt);
            }
        });
        add(lpSignupLabel);
        lpSignupLabel.setBounds(410, 340, 70, 20);

        lpPasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lpPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lpPasswordLabel.setText("Password ");
        add(lpPasswordLabel);
        lpPasswordLabel.setBounds(310, 290, 80, 30);

        lpSubmitButton.setText("Go");
        lpSubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpSubmitButtonMouseClicked(evt);
            }
        });
        add(lpSubmitButton);
        lpSubmitButton.setBounds(660, 290, 100, 30);

        lpForgotPasswordLabel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        lpForgotPasswordLabel.setForeground(new java.awt.Color(153, 102, 255));
        lpForgotPasswordLabel.setText("Forgot Password");
        lpForgotPasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lpForgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpForgotPasswordLabelMouseClicked(evt);
            }
        });
        add(lpForgotPasswordLabel);
        lpForgotPasswordLabel.setBounds(560, 340, 120, 30);

        lpEmailLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lpEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lpEmailLabel.setText("Email ID ");
        add(lpEmailLabel);
        lpEmailLabel.setBounds(310, 250, 80, 30);

        lpUsernameTextField.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        lpUsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        add(lpUsernameTextField);
        lpUsernameTextField.setBounds(400, 250, 250, 30);

        lpPasswordField.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lpPasswordField.setEchoChar('.');
        lpPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpPasswordFieldActionPerformed(evt);
            }
        });
        add(lpPasswordField);
        lpPasswordField.setBounds(400, 290, 250, 30);

        backButton.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 153, 0));
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        add(backButton);
        backButton.setBounds(680, 390, 80, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void lpSignupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpSignupLabelMouseClicked
        
        // get a reference to the Main Frame and then call its changeBanner method. ;-)
        LoginFrame lframe = (LoginFrame)this.getTopLevelAncestor();
        lframe.changeBanner();
        
        reset();
        CardLayout crd = (CardLayout) getParent().getLayout();
        crd.show(getParent(), "signupCard");
        
        
    }//GEN-LAST:event_lpSignupLabelMouseClicked

    private void lpSubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpSubmitButtonMouseClicked
        // TODO add your handling code here:
        startVerification();
    }//GEN-LAST:event_lpSubmitButtonMouseClicked

    private void lpForgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpForgotPasswordLabelMouseClicked
        // TODO add your handling code here:
        ((LoginFrame)this.getTopLevelAncestor()).resetPleaseLabelForgotPanel();
        reset();
        CardLayout crd = (CardLayout) getParent().getLayout();
        crd.show(getParent(), "forgotCard");
    }//GEN-LAST:event_lpForgotPasswordLabelMouseClicked

    private void lpPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpPasswordFieldActionPerformed
        // TODO add your handling code here:
        startVerification();
    }//GEN-LAST:event_lpPasswordFieldActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        ((LoginFrame)this.getTopLevelAncestor()).initialisePerson();
        reset();
        CardLayout card = (CardLayout) getParent().getLayout();
        card.show(getParent(), "startCard");        
    }//GEN-LAST:event_backButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel lpEmailLabel;
    private javax.swing.JLabel lpForgotPasswordLabel;
    private javax.swing.JPasswordField lpPasswordField;
    private javax.swing.JLabel lpPasswordLabel;
    private javax.swing.JLabel lpSignupLabel;
    private javax.swing.JButton lpSubmitButton;
    private javax.swing.JTextField lpUsernameTextField;
    // End of variables declaration//GEN-END:variables
    void hideSignupLabel() {
        lpSignupLabel.setVisible(false);
    }
    void showSignupLabel() {
        lpSignupLabel.setVisible(true);
    }
    void startVerification() {
        person.uName = lpUsernameTextField.getText();
        person.pass = lpPasswordField.getText();
        if (person.isValidUser()) {
            // Change frame.
            JOptionPane.showMessageDialog(this, "Hello, " + person.name, "MCU", JOptionPane.DEFAULT_OPTION);
            reset();
            ((LoginFrame)this.getTopLevelAncestor()).changeFrame();
        }
        else {
            /*
             * --- Commented because the person object will tell what the error is. ----
             * JOptionPane.showMessageDialog(this, "Invalid Username/Password", " Error", JOptionPane.DEFAULT_OPTION);
             */ 
            lpPasswordField.setText("");
        }
    }
    
    void reset() {
        lpUsernameTextField.setText("");
        lpPasswordField.setText("");
        lpUsernameTextField.requestFocus();
    }
    
    public void resetFocus() {
        lpUsernameTextField.requestFocus();
    }
    
    
   
}
