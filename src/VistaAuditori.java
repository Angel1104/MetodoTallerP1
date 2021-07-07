
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import proyecto.InsertarDescargarEliminar;
import proyecto.ProveedorConecciones;
import proyecto.seleccionar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DESTOCK
 */
public class VistaAuditori extends javax.swing.JFrame {
Connection con;
Statement st;
ResultSet rs;
    /**
     * Creates new form VistaAuditori
     */
    public VistaAuditori() {
        initComponents();
        
        con = ProveedorConecciones.getConexion();
        this.setLocationRelativeTo(null);
    }
    private void aumentarhoras(){
        laboSeleccionado();
    ResultSet rso = seleccionar.getDatos("SELECT * FROM laboratorio WHERE laboratorio.idLabo = '"+laboratorio+"' ");
        try {
             if(rso.next()){
                 double HoraReloj = rso.getInt(5)+90;
                 double HoraAcademica = rso.getInt(4)+67.5;
                 InsertarDescargarEliminar.setData("update laboratorio set horaReloj ='"+HoraReloj+"',horaAcademica = '"+HoraAcademica+"' WHERE laboratorio.idLabo = '"+laboratorio+"'", "reserva");
            }
        } catch (Exception e) {
        }
    }
    Object laboratorio;
    private Object laboSeleccionado(){
       laboratorio = jComboBox3.getSelectedIndex()+5; 
       return laboratorio;
    
    }
    Object horaIngreso;
    private Object horaIngreso(){
       horaIngreso = jComboBox1.getSelectedIndex()+1; 
       return horaIngreso;
    
    }
    Object horaSalida;
    private Object horaSalida(){
       horaSalida = jComboBox2.getSelectedIndex()+1; 
       return horaSalida;
    
    }
    int semana;
    private int semana(){
       Date date = jDateChooser2.getDate();

        Calendar calendario = Calendar.getInstance(); 
        calendario.setTime(date);
        semana = calendario.get(Calendar.WEEK_OF_MONTH);
        
        return semana;
        
    }
    int mes;
    private int mes(){
        Date date = jDateChooser2.getDate();

        Calendar calendario = Calendar.getInstance(); 
        calendario.setTime(date);
        mes = calendario.get(Calendar.MONTH)+1;
        
        return mes;
    }
    
    int diaDeSemana;
    private int diaDeSemana (){
       Date date = jDateChooser2.getDate();

        Calendar calendario = Calendar.getInstance(); 
        calendario.setTime(date);
        diaDeSemana = calendario.get(Calendar.DAY_OF_WEEK) -1;
        
        return diaDeSemana; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unknown-01.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 140, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CARTA DE RESERVA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 520, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 80, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de celular");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA RESERVA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 170, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45", "8:15", "9:45", "11:15", "12:45", "14:15", "15:45", "17:15", "18:45", "20:15", " ", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45", "8:15", "9:45", "11:15", "12:45", "14:15", "15:45", "17:15", "18:45", "20:15" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 150, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laboratorio de redes", "auditorio" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 310, 20));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 240, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("C.I.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RESERVA DE AUDITORIO o LABORATORIO DE REDES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 720, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 650, 220));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hora Ingreso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora Salida");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 80, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 160, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unknown-01.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 57, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111-01.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ResultSet rsp = seleccionar.getDatos("SELECT * FROM sistema");
        try {
            if(rsp.next()){
                if(rsp.getString(2).equals("ON")){
                
                
                String nombre = jTextField1.getText();
                String apellido = jTextField2.getText();
                String celular = jTextField3.getText();
                String ci = jTextField4.getText();
                String carta = jTextArea1.getText();
         
                diaDeSemana();
                mes();
                semana();
                laboSeleccionado();
                horaIngreso();
                horaSalida();
                
                if (horaIngreso.equals (horaSalida)) {
                    JOptionPane.showMessageDialog(null, "Hora de Ingreso y Salida Incorrectos");

                }else {
                    String sesion = "select * from usuarioactivo";
                    ResultSet rs = seleccionar.getDatos(sesion);
                    try{
                    if(rs.next()){
                        if(rs.getString(2).equals("activo")){
                            String Query;
                            Query = "insert into formularioauditorioyredes (nombreForm, apellidoForm, ci, celular, carta, idDocenteF)" + " values('"+nombre+"','"+apellido+"','"+ci+"','"+celular+"', '"+carta+"','"+rs.getString(3)+"')";
                            InsertarDescargarEliminar.setData(Query, "Registrado con exito");
                            
                            aumentarhoras();
                            ResultSet rs1 = seleccionar.getDatos("select * from formularioauditorioyredes where ci='"+ci+"' ");
                            while(rs1.next()){
                                Query = "insert into reservaperiodo (diaRP, mesRP, semanaRP,horaIniRP,horaFinRP,docenteRP,laboRP,descripcionRP,formularioRP)"+"values('"+diaDeSemana+"','"+mes+"','"+semana+"','"+horaIngreso+"', '"+horaSalida+"', '"+rs.getString(3)+"','"+laboratorio+"','"+carta+"','"+rs1.getString(1)+"')";
                            InsertarDescargarEliminar.setData(Query, "Registrado con exito");
                            }rs.close();
                        }else{
                            String Query;
                            Query = "insert into formularioauditorioyredes (nombreForm, apellidoForm, ci, celular, carta)" + " values('"+nombre+"','"+apellido+"','"+ci+"','"+celular+"', '"+carta+"')";
                            InsertarDescargarEliminar.setData(Query, "Registrado con exito");
                            
                            aumentarhoras();
                            ResultSet rs1 = seleccionar.getDatos("select * from formularioauditorioyredes where ci='"+ci+"' ");
                            while(rs1.next()){
                                Query = "insert into reservaperiodo (diaRP, mesRP, semanaRP,horaIniRP,horaFinRP,laboRP,descripcionRP,formularioRP)"+"values('"+diaDeSemana+"','"+mes+"','"+semana+"','"+horaIngreso+"', '"+horaSalida+"','"+laboratorio+"','"+carta+"','"+rs1.getString(1)+"')";
                            InsertarDescargarEliminar.setData(Query, "Registrado con exito");
                            }rs.close();
                        }
                    }rs.close();
                    } catch (Exception e) {}
        
                }
            }else{
                JOptionPane.showMessageDialog(null,"El sistema no esta abierto");
            }
        }rsp.close();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Quiere cerrar la aplicacion?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Quiere cerrar la aplicacion?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ResultSet rs = seleccionar.getDatos("Select * From usuarioactivo");
                try {
                    if(rs.next()){
                        if(rs.getString(2).equals("activo")){
                            new vistaDocente().setVisible(true);
                        }else{
                            new Home().setVisible(true);
                        }
                    }
                } catch (Exception e) {}
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAuditori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAuditori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAuditori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAuditori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAuditori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
