/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author 15-CW0001la
 */
public class frmFichaClinica extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFichaClinica
     */
    public frmFichaClinica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel12 = new JLabel();
        jLabel2 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel13 = new JLabel();
        jLabel31 = new JLabel();
        jLabel19 = new JLabel();
        jLabel24 = new JLabel();
        jLabel14 = new JLabel();
        jLabel27 = new JLabel();
        jLabel15 = new JLabel();
        jLabel28 = new JLabel();
        jLabel20 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel17 = new JLabel();
        jLabel29 = new JLabel();
        jLabel18 = new JLabel();
        jLabel30 = new JLabel();
        jLabel22 = new JLabel();
        jTextField3 = new JTextField();
        jLabel16 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jButton1 = new JButton();
        jLabel21 = new JLabel();
        jTextField1 = new JTextField();
        jLabel23 = new JLabel();
        jTextField2 = new JTextField();
        jLabel33 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jLabel32 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jList2 = new JList<>();
        BtnCerrar = new JButton();
        jButton2 = new JButton();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();

        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new Color(157, 34, 202));
        jPanel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        jPanel1.setBackground(new Color(204, 153, 255));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(51, 0, 51)));

        jLabel12.setFont(new Font("Ubuntu", 0, 24)); // NOI18N
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("Ficha clínica");

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/fichaclinica.png"))); // NOI18N

        jLabel13.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("Nombre:");

        jLabel31.setBackground(new Color(0, 0, 0));
        jLabel31.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel31.setText("Tb_mascota");

        jLabel19.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel19.setForeground(new Color(255, 255, 255));
        jLabel19.setText("Animal:");

        jLabel24.setBackground(new Color(0, 0, 0));
        jLabel24.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel24.setText("Tb_mascota");

        jLabel14.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Edad:");

        jLabel27.setBackground(new Color(0, 0, 0));
        jLabel27.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel27.setText("Tb_propietario");

        jLabel15.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText("Propietario:");

        jLabel28.setBackground(new Color(0, 0, 0));
        jLabel28.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel28.setText("Tb_propietario");

        jLabel20.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel20.setForeground(new Color(255, 255, 255));
        jLabel20.setText("Rescatado:");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "No", "Si", " " }));

        jLabel25.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel25.setForeground(new Color(255, 255, 255));
        jLabel25.setText("DUI:");

        jLabel26.setBackground(new Color(0, 0, 0));
        jLabel26.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel26.setText("Tb_propietario");

        jLabel17.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setText("Dirección:");

        jLabel29.setBackground(new Color(0, 0, 0));
        jLabel29.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel29.setText("Tb_propietario");

        jLabel18.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel18.setForeground(new Color(255, 255, 255));
        jLabel18.setText("Teléfono:");

        jLabel30.setBackground(new Color(0, 0, 0));
        jLabel30.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel30.setText("Tb_propietario");

        jLabel22.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel22.setForeground(new Color(255, 255, 255));
        jLabel22.setText("Frecuencia:");

        jTextField3.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField3.setBorder(BorderFactory.createEtchedBorder());

        jLabel16.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText("Medicinas:");

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setText("Guardar");

        jLabel21.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel21.setForeground(new Color(255, 255, 255));
        jLabel21.setText("Tratamiento:");

        jTextField1.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField1.setBorder(BorderFactory.createEtchedBorder());

        jLabel23.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel23.setForeground(new Color(255, 255, 255));
        jLabel23.setText("Dosis:");

        jTextField2.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField2.setBorder(BorderFactory.createEtchedBorder());

        jLabel33.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel33.setForeground(new Color(255, 255, 255));
        jLabel33.setText("Consultas:");

        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel32.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel32.setForeground(new Color(255, 255, 255));
        jLabel32.setText("Citas:");

        jList2.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        BtnCerrar.setIcon(new ImageIcon(getClass().getResource("/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton1))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel28)
                                                            .addComponent(jLabel29)
                                                            .addComponent(jLabel27)
                                                            .addComponent(jLabel30)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel31))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel33)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3))
                            .addComponent(jScrollPane2, GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel26))
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnCerrar, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(98, 98, 98)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel24)
                                                .addGap(88, 88, 88)
                                                .addComponent(jLabel2)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(401, 401, 401))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(jLabel19))))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCerrar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel28))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(jLabel25)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel27))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel18))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel26)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton2.setFont(new Font("Ubuntu Mono", 0, 14)); // NOI18N
        jButton2.setIcon(new ImageIcon(getClass().getResource("/Guardar.png"))); // NOI18N
        jButton2.setText("Guardar ");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 709, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator3)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton2)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422)
                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BtnCerrar;
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JList<String> jList1;
    private JList<String> jList2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
