package eeps;
    
import java.awt.*;
import javax.swing.*;

import javax.swing.*;

public class AddEngineer extends javax.swing.JFrame {
    private int framePositionX, framePositionY, mousePositionX, mousePositionY, newMousePositionX, newMousePositionY;
    public AddEngineer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        workingHours = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        Add = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(95, 158, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/remove-user.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 43, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/Home.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 38));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/add-user.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 43, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/edit-user.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 43, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/View.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 500));

        jPanel4.setBackground(new java.awt.Color(250, 243, 243));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/User.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, -10, 30, 60));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 10));

        jTextField1.setBackground(new java.awt.Color(250, 243, 243));
        jTextField1.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/Search.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/X.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 40));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/New Project.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 850, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 840, 40));

        name.setBackground(new java.awt.Color(250, 243, 243));
        name.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 12)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 20));

        workingHours.setBackground(new java.awt.Color(250, 243, 243));
        workingHours.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 12)); // NOI18N
        workingHours.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(workingHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, 20));

        position.setBackground(new java.awt.Color(250, 243, 243));
        position.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 12)); // NOI18N
        position.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 130, 20));

        age.setBackground(new java.awt.Color(250, 243, 243));
        age.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 12)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 130, 20));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(250, 243, 243));
        id.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 12)); // NOI18N
        id.setText("  ");
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 40, 30));

        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeps/Images/AddEngineer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 830, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        /*
        int xCordinate = evt.getXOnScreen();
        int yCordinate = evt.getYOnScreen();
        this.setLocation(xCordinate, yCordinate);
        */

    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        /*int x = evt.getX();
        int y = evt.getY();
        */
    }//GEN-LAST:event_jPanel4MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
           System.exit(0);
           
    }//GEN-LAST:event_jLabel6MouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        EngineerClass tempEng = new EngineerClass();
        GradeClass tempGrade = new GradeClass();
        tempGrade.setPosition(position.getText());
        tempEng.addEngineer(name.getText(), Integer.parseInt(age.getText()), Double.parseDouble(workingHours.getText()), tempGrade);
        id.setText(Integer.toString(tempEng.getId()));
    }//GEN-LAST:event_AddMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEngineer().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JTextField age;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField position;
    private javax.swing.JTextField workingHours;
    // End of variables declaration//GEN-END:variables
}
