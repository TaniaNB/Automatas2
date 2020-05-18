
package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jesus
 */
public class ProgramInterfaz extends javax.swing.JFrame {

    JFileChooser seleccion = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    ArrayList<SimobolosValores> valores = new ArrayList<>();
    
    public String AbrirArchivo(File archivo){
    
        //Pasando todo el txt y retornandolo como String
        String codigo="";
        try{
            entrada = new FileInputStream(archivo);
            int lectura;
            while((lectura=entrada.read())!=-1){
                char caracter=(char) lectura;
                codigo+=caracter;
                
                }
            }
        
        catch (Exception e){ 
        } return codigo;
        
    }
    /**
     * Creates new form NewJFrame
     */
    public ProgramInterfaz() {
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

        btnAbrir = new javax.swing.JButton();
        btnAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTable = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tSimbolos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaBytecode = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        TriplosTexto = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnAnalisis.setText("Comienza Análisis");
        btnAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisActionPerformed(evt);
            }
        });

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Token", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tTable);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tabla de Símbolos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Código Fuente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tabla de Tokens");

        tSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Símbolo", "Tipo de Dato", "Linea", "Alcance", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tSimbolos);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Código byteCode");

        areaBytecode.setColumns(20);
        areaBytecode.setRows(5);
        jScrollPane4.setViewportView(areaBytecode);

        TriplosTexto.setColumns(20);
        TriplosTexto.setRows(5);
        jScrollPane5.setViewportView(TriplosTexto);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Triplos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAbrir)
                        .addGap(62, 62, 62)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(245, 245, 245)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalisis)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalisis)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAbrir))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Variable que recibirá el codigo
    static String codigo;
    
    //Acciones del boton ABRIR
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        
        if(seleccion.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccion.getSelectedFile();
            if(archivo.canRead()) {
                if(archivo.getName().endsWith("txt")){
                    codigo =AbrirArchivo(archivo);
                    areaTexto.setText(codigo);
                    }
                else {
                    JOptionPane.showMessageDialog(null, "Archivo incompatible");
                    }
                }
            }
            
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisActionPerformed
        // TODO add your handling code here:
        Parser p = new Parser(areaTexto.getText());
        

        //Asignando a matriz "t" datos de Parser Lista de DToken
        ArrayList<DToken> t = p.mandarTabla();
        String matriz [][] = new String [t.size()][3];
        
        //Pasando los datos de la matriz "t" a la matriz de String
        for (int i = 0; i < t.size(); i++) {
                
            matriz[i][0] = Integer.toString(t.get(i).getNo());
            matriz[i][1] = t.get(i).getTok();
            matriz[i][2] = t.get(i).getTipoTok();
        }
        
        for (int i = 0; i < t.size(); i++) 
        {
            if (t.get(i).getTipoTok().equals("Identificador"))
            {
                if(t.get(i+1).getTipoTok().equals("Operador") && t.get(i+1).getTok().equals("="))
                {
                    if (t.get(i+2).getTipoTok().equals("Integer")||t.get(i+2).getTipoTok().equals("Boolean"))
                    {
                        SimobolosValores valor = new SimobolosValores(t.get(i).getTok(),t.get(i+2).getTok());
                        valores.add(valor);
                    }
                    else if(t.get(i+2).getTipoTok().equals("Identificador"))
                    {
                        if(t.get(i+3).getTipoTok().equals("Operador"))
                        {
                            if(t.get(i+4).getTipoTok().equals("Identificador"))
                            {
                                int i1 = Integer.parseInt(buscarValores(t.get(i+2).getTok()));
                                int i2 = Integer.parseInt(buscarValores(t.get(i+4).getTok()));
                                int i3;
                                SimobolosValores valor;
                                switch (t.get(i+3).getTok())
                                {
                                    case "+":
                                        i3 = i1 + i2;
                                        valor = new SimobolosValores(t.get(i).getTok(),
                                        Integer.toString(i3));
                                        valores.add(valor);
                                        break;
                                        
                                    case "*":
                                        i3 = i1 * i2;
                                        valor = new SimobolosValores(t.get(i).getTok(),
                                        Integer.toString(i3));
                                        valores.add(valor);
                                        break;
                                        
                                    case "-":
                                        i3 = i1 - i2;
                                        valor = new SimobolosValores(t.get(i).getTok(),
                                        Integer.toString(i3));
                                        valores.add(valor);
                                        break;
                               }
                           }
                           
                       }
                    }
                    
                }
            }
        }
        //MEDIDAS de la tTable
        tTable.setRowHeight(25);
       
        TableColumnModel columnas = tTable.getColumnModel();
        columnas.getColumn(0).setPreferredWidth(20);
        columnas.getColumn(1).setPreferredWidth(160);
        columnas.getColumn(2).setPreferredWidth(180);
        
        //Impresión de matriz a la tabla
        tTable.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "No.", "Token", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        //IMPRESION DE LA TABLA DE SIMBOLOS --->
        //Asignando a matriz "ts" datos de Parser Lista de DSimbolos
        ArrayList<DSimbolos> ts = p.mandaSimbolos();
        String matrizS [][] = new String [ts.size()][6];
        
        //Pasando los datos de la matriz "ts" a la matriz de String
        for (int i = 0; i < ts.size(); i++) {
                            
            matrizS[i][0] = Integer.toString(ts.get(i).getNo());
            matrizS[i][1] = ts.get(i).getSimbolo();
            matrizS[i][2] = ts.get(i).getTipoSimbolo();
            matrizS[i][3] = ""+(ts.get(i).getLinea()+1);
            matrizS[i][4] = "Publica";
            matrizS[i][5] = buscarValores(ts.get(i).getSimbolo());
            
        }
        
        //Impresión de matriz a la tabla
        tSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            matrizS,
            new String [] {
                "No.", "Símbolo", "Tipo de Dato", "Posicion", "Alcance", "Valor"
            }
        ) {
            
            
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        areaBytecode.setText(p.getBytecode());
        TriplosTexto.setText(p.getTriplos());
        //Si se presentan errores, no mostrar NADA en las tablas ni en la Seccion de Bytecode
        if(p.informeErrores()) {
        
            areaBytecode.setText("");
        
        //Vaciando tabla de tokens y tabla de simbolos
        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Token", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        tSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Símbolo", "Tipo de Dato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
            
        }
        
    }//GEN-LAST:event_btnAnalisisActionPerformed
    public String buscarValores(String identificador)
    {
        for (int i = 0; i < valores.size(); i++) 
        {
            if (valores.get(i).Variable.equals(identificador))
            {
            return valores.get(i).Valor;
            }
        }
    return "NULL";
    }
    //Acciones del Botón LIMPIAR
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        areaTexto.setText("");
        areaBytecode.setText("");
        
        //Vaciando tabla de tokens y tabla de simbolos
        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Token", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        tSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Símbolo", "Tipo de Dato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramInterfaz().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TriplosTexto;
    private javax.swing.JTextArea areaBytecode;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalisis;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tSimbolos;
    private javax.swing.JTable tTable;
    // End of variables declaration//GEN-END:variables
}
