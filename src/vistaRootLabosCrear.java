
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.InsertarDescargarEliminar;
import proyecto.seleccionar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flore
 */
public class vistaRootLabosCrear extends javax.swing.JFrame {

    /**
     * Creates new form vistaRootLabos
     */
    public vistaRootLabosCrear() {
        initComponents();
    }
    Object labo;
    
    public void laboSelecionado(){
       labo = jComboBox1.getSelectedItem(); 
       
       if(labo.equals("laboratorio1")){labo = 1;}
        if(labo.equals("laboratorio2")){labo = 2;}
        if(labo.equals("laboratorio3")){labo = 3;}
        if(labo.equals("laboratorio4")){labo = 4;}
        if(labo.equals("laboratorio5")){labo = 5;}
        if(labo.equals("laboratorio6")){labo = 6;}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar hora por ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 360, 160, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 174, -1));

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 21, -1, -1));

        jButton2.setText("vaciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 21, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unknown-01.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1308, 11, 57, 45));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laboratorio1", "laboratorio2", "laboratorio3", "laboratorio4", "laboratorio5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 22, 122, -1));

        jButton4.setText("buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 21, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Fecha", "Hora Ingreso", "Hora Salida", "Estado", "Descripcion Hora"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 74, 910, 563));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("horaingreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 161, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("horasalida");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 201, 100, -1));

        jTextField2.setText("00:00:00");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 158, 157, -1));

        jTextField3.setText("00:00:00");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 198, 157, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton5.setText("guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 202, 66));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setText("descripcion hora");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, -1));

        jLabel14.setText("fecha");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240, -1, -1));

        jLabel5.setText("estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "libre", "reservado" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new view 1-01-01.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Quiere cerrar la aplicacion?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String horaIngreso = jTextField2.getText();
        String horaSalida = jTextField3.getText();
        String estado = jComboBox2.getSelectedItem().toString();
        String descripcionHorario = jTextArea2.getText();
         
        Date fecha; 
        fecha = jDateChooser1.getDate();
        SimpleDateFormat  formato = new SimpleDateFormat("yyyy-MM-d");     
        String Fecha = formato.format(fecha);
        
        Object laboratorio = jComboBox1.getSelectedItem();
        
        if(laboratorio.equals("laboratorio1")){laboratorio = 1;}
        if(laboratorio.equals("laboratorio2")){laboratorio = 2;}
        if(laboratorio.equals("laboratorio3")){laboratorio = 3;}
        if(laboratorio.equals("laboratorio4")){laboratorio = 4;}
        if(laboratorio.equals("laboratorio5")){laboratorio = 5;} 
        if(laboratorio.equals("laboratorio6")){laboratorio = 6;}
        
        if (horaIngreso.equals (horaSalida)) {
            JOptionPane.showMessageDialog(null, "Hora de Ingreso y Salida Incorrectos");

        }else {
                
                         
            try {
                String Query;
                
                Query = "insert into estado( estado, descripcionHorario)"+" values('"+estado+"','"+descripcionHorario+"')";
                InsertarDescargarEliminar.setData(Query, "estado si");
                
                Query = "insert into fecha( fecha, ID_labo)"+" values('"+Fecha+"','"+laboratorio+"')";
                InsertarDescargarEliminar.setData(Query, "fecha si");
                
                ResultSet rs = seleccionar.getDatos("SELECT fecha.IDfecha, estado.IDestado\n" +
                                                    "FROM fecha,estado \n" +
                                                    "WHERE fecha.fecha='"+Fecha+"' and fecha.ID_labo="+laboratorio+"\n"+
                                                    "and estado.estado='"+estado+"' and estado.descripcionHorario= '"+descripcionHorario+"' \n");

                if (rs.next())
                {
                Query = "insert into hora( horaIngreso, horaSalida, ID_estado, ID_fecha)"+" values('"+horaIngreso+"','"+horaSalida+"',"+rs.getString(1)+","+rs.getString(2)+")";
                InsertarDescargarEliminar.setData(Query, "Registrado exitosamente");
                }
                setVisible(false);
                new vistaRootLabosCrear().setVisible(true);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID = jTextField1.getText();
        Object laboratorio = jComboBox1.getSelectedItem();
        
        if(laboratorio.equals("laboratorio1")){laboratorio = 1;}
        if(laboratorio.equals("laboratorio2")){laboratorio = 2;}
        if(laboratorio.equals("laboratorio3")){laboratorio = 3;}
        if(laboratorio.equals("laboratorio4")){laboratorio = 4;}
        if(laboratorio.equals("laboratorio5")){laboratorio = 5;}
        if(laboratorio.equals("laboratorio6")){laboratorio = 6;}
        
        ResultSet rs = seleccionar.getDatos("SELECT laboratorio.nombre,descripcion ,fecha.fecha, hora.horaIngreso,horaSalida,IDhora ,  estado.estado,descripcionHorario\n" +
                                            "FROM hora,laboratorio,fecha,estado\n" +
                                            "WHERE IDhora="+ID+" \n" +
                                            "AND fecha.ID_labo = laboratorio.ID and hora.ID_fecha = fecha.IDfecha and hora.ID_estado=estado.IDestado");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(6),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getString(8)});

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new vistaRootLabosCrear().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Object laboratorio = jComboBox1.getSelectedItem();
        
        if(laboratorio.equals("laboratorio1")){laboratorio = 1;}
        if(laboratorio.equals("laboratorio2")){laboratorio = 2;}
        if(laboratorio.equals("laboratorio3")){laboratorio = 3;}
        if(laboratorio.equals("laboratorio4")){laboratorio = 4;}
        if(laboratorio.equals("laboratorio5")){laboratorio = 5;}
        if(laboratorio.equals("laboratorio6")){laboratorio = 6;}
        
        ResultSet rs = seleccionar.getDatos("SELECT laboratorio.nombre,descripcion ,fecha.fecha, hora.horaIngreso,horaSalida,IDhora ,  estado.estado,descripcionHorario\n" +
                                            "FROM hora,laboratorio,fecha,estado\n" +
                                            "WHERE laboratorio.ID=1\n" +
                                            "AND fecha.ID_labo = laboratorio.ID and hora.ID_fecha = fecha.IDfecha and hora.ID_estado=estado.IDestado");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(6),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getString(8)});

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaRootLabosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRootLabosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRootLabosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRootLabosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRootLabosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
