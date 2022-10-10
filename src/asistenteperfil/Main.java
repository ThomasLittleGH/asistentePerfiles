package asistenteperfil;

import datahandler.datahandler;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.json.simple.JSONObject;

/**
 * @author Thomas Little
 */
public class Main extends javax.swing.JFrame implements ActionListener {

    String perfil = "perfil", perfilx = "";
    String[] loc = new String[1];
    boolean create = true;
    int questionID = 0;
    public static datahandler dh = new datahandler();
    public static ArrayList<String> array_perfiles = new ArrayList<>(), array_preguntas = new ArrayList<>(), array_respuestas = new ArrayList<>();
    public static ArrayList<String> preguntas_habilitadas = new ArrayList<>(), respuestas_habilitadas = new ArrayList<>();

    public Main() {
        create = true;
        setVisible(true);
        dh.changeTargetFile("data", "perfiles");
        initLaF();
        initComponents();
        importarPerfil();
    }

    public static void main(String args[]) {
        /* Se crea y se muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setLocationRelativeTo(null);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        eliminarPregunta = new javax.swing.JMenuItem();
        editarPregunta = new javax.swing.JMenuItem();
        panConfig = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        cmbPerfiles = new javax.swing.JComboBox<>();
        btnExport = new javax.swing.JButton();
        lblPreguntas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panPreguntas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaX = new javax.swing.JTable();
        lblNombre1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPregunta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JTextField();
        txtP3 = new javax.swing.JTextField();
        txtP4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNombrePerfil = new javax.swing.JTextField();
        cmbPerfil = new javax.swing.JComboBox<>();
        lblPerfil1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        btnCrearPerfil1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        eliminarPregunta.setText("Eliminar pregunta");
        popupMenu.add(eliminarPregunta);

        editarPregunta.setText("Editar pregunta");
        popupMenu.add(editarPregunta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistente");

        panConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Config"));

        lblNombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblPerfil.setText("Perfil:");

        cmbPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilesActionPerformed(evt);
            }
        });

        btnExport.setText("EXPORTAR");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        lblPreguntas.setText("Preguntas:");

        panPreguntas.setLayout(new java.awt.GridLayout(1, 0));

        tablaX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pregunta", "Habilitado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaX);

        panPreguntas.add(jScrollPane3);

        jScrollPane2.setViewportView(panPreguntas);

        lblNombre1.setText("RUT:");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panConfigLayout = new javax.swing.GroupLayout(panConfig);
        panConfig.setLayout(panConfigLayout);
        panConfigLayout.setHorizontalGroup(
            panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblPerfil)
                    .addComponent(lblNombre1)
                    .addComponent(lblPreguntas))
                .addGap(3, 3, 3)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRut)
                    .addComponent(cmbPerfiles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panConfigLayout.setVerticalGroup(
            panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre1)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil)
                    .addComponent(cmbPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConfigLayout.createSequentialGroup()
                        .addComponent(lblPreguntas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblPerfil.getAccessibleContext().setAccessibleName("");
        cmbPerfiles.getAccessibleContext().setAccessibleName("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de preguntas"));

        btnConfirmar.setText("Agregar pregunta");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblPregunta.setText("Pregunta:");

        txaPregunta.setColumns(20);
        txaPregunta.setRows(5);
        txaPregunta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaPregunta);

        jLabel1.setText("Alternativa a)");

        jLabel2.setText("Alternativa b)");

        jLabel3.setText("Alternativa c)");

        jLabel4.setText("Alternativa d)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(txtP2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(txtP3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPregunta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(txtP1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPregunta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de perfiles"));

        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        lblPerfil1.setText("Perfil:");

        lblNombre2.setText("Nombre:");

        btnCrearPerfil1.setText("Crear perfil");
        btnCrearPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPerfil1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Perfil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPerfil, 0, 292, Short.MAX_VALUE)
                            .addComponent(txtNombrePerfil)))
                    .addComponent(lblPerfil1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2)
                    .addComponent(btnCrearPerfil1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil1)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilesActionPerformed
        setUpTablax();
        tablaX.addMouseListener(new TableMouseListener(tablaX));
        tablaX.setComponentPopupMenu(popupMenu);
        setUpPopUp();
        panPreguntas.updateUI();

    }//GEN-LAST:event_cmbPerfilesActionPerformed

    public void setUpTablax() {
        perfil = cmbPerfiles.getSelectedItem().toString();
        loc[0] = "perfiles";
        array_preguntas = dh.readJson(loc, new String[]{perfil}, "question");
        array_respuestas = dh.readJson(loc, new String[]{perfil, "answers"}, "a", "b", "c", "d");

        MyTableModel tabla = new MyTableModel();
        // primero borra todos los botones en pantalla y luego, por cada alimento en el arreglo crea un boton con su nombre y lo muestra
        for (String pregunta : array_preguntas) {
            tabla.addRow(new Object[]{pregunta.split(" ")[0], false});
        }
        tablaX.setModel(tabla);
    }

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        String nombre = txtNombre.getText();
        String rut = txtRut.getText();

        String s = "";
        for (int i = 0; i < preguntas_habilitadas.size(); i++) {
            s += preguntas_habilitadas.get(i) + "\n\n";
            s += "a) " + respuestas_habilitadas.get((4 * i)) + "\n";
            s += "b) " + respuestas_habilitadas.get((4 * i + 1)) + "\n";
            s += "c) " + respuestas_habilitadas.get((4 * i + 2)) + "\n";
            if (!respuestas_habilitadas.get((4 * i + 3)).equals(" ")) {
                s += "d) " + respuestas_habilitadas.get((4 * i + 3)) + "\n\n";
            }

        }
        WordExport we = new WordExport();
        we.WordExport(perfil, nombre, rut, s);

        JOptionPane.showMessageDialog(null, "Documento exportado como " + nombre + ".docx", "Operacion Exitosa", JOptionPane.OK_OPTION);
        preguntas_habilitadas.clear();
        respuestas_habilitadas.clear();
        dispose();
        Main.main(null);
    }//GEN-LAST:event_btnExportActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String pregunta = txaPregunta.getText();
        String a = txtP1.getText();
        String b = txtP2.getText();
        String c = txtP3.getText();
        String d = txtP4.getText();
        

        JSONObject answers = new JSONObject();
        answers.put("a", a);
        answers.put("b", b);
        answers.put("c", c);
        answers.put("d", d);

        JSONObject preguntax = new JSONObject();
        preguntax.put("question", pregunta);
        preguntax.put("answers", answers);

        if (create) {
            dh.insertIntoJsonArray(preguntax, perfil, "perfiles");
        } else {
            dh.replaceObjectInJsonArray(preguntax, questionID, perfil, new String[]{"perfiles"});
            btnConfirmar.setText("Agregar pregunta");
            create = true;
        }
        JOptionPane.showMessageDialog(null, "Operacion exitosa");
        setUpTablax();
        resetQuestionData();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        perfilx = cmbPerfil.getSelectedItem().toString();
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void btnCrearPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPerfil1ActionPerformed
        try {
            dh.insertIntoJson(txtNombrePerfil.getText(), "perfiles");
            JOptionPane.showMessageDialog(null, "Operacion Exitosa");
        } catch (HeadlessException headlessException) {
            System.out.println(headlessException.getMessage());
        }
        dispose();
        Main.main(null);
    }//GEN-LAST:event_btnCrearPerfil1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int input = JOptionPane.showConfirmDialog(null,
                "Esta seguro que desea eliminar el perfil " + perfilx, "Seleccione una opcion", JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == 0) {
            dh.removeFromJson(perfilx, "perfiles");
            JOptionPane.showMessageDialog(null, "Operacion Exitosa");
        }
        dispose();
        Main.main(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCrearPerfil1;
    private javax.swing.JButton btnExport;
    private javax.swing.JComboBox<String> cmbPerfil;
    private static javax.swing.JComboBox<String> cmbPerfiles;
    private javax.swing.JMenuItem editarPregunta;
    private javax.swing.JMenuItem eliminarPregunta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private static javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfil1;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPreguntas;
    private javax.swing.JPanel panConfig;
    private javax.swing.JPanel panPreguntas;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTable tablaX;
    private javax.swing.JTextArea txaPregunta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombrePerfil;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
    private javax.swing.JTextField txtP3;
    private javax.swing.JTextField txtP4;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

    private void initLaF() {
        // Metodo que establece el LaF en modo claro
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Refresta Look and Feel del jFrame
        SwingUtilities.updateComponentTreeUI(this);
        this.pack();
    }

    public void importarPerfil() {
        array_perfiles = dh.getObjectsFromJson("perfiles");
        try {
            cmbPerfiles.removeAllItems();
            cmbPerfil.removeAllItems();

            for (String perfil : array_perfiles) {
                cmbPerfiles.addItem(perfil);
                cmbPerfil.addItem(perfil);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setUpPopUp() {
        eliminarPregunta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,
                        "Esta seguro que desea eliminar la pregunta", "Seleccione una opcion", JOptionPane.YES_NO_CANCEL_OPTION);
                if (input == 0) {
                    int id_pregunta = tablaX.getSelectedRow();
                    dh.removeFromJson(id_pregunta, perfil, loc);
                    JOptionPane.showMessageDialog(null, "Operacion exitosa");
                    setUpTablax();
                }
            }
        });

        editarPregunta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnConfirmar.setText("Confirmar edicion");
                create = false;
                questionID = tablaX.getSelectedRow();
                copyQuestionData();
            }
        });
    }

    private void copyQuestionData() {
        txaPregunta.setText(dh.getDataAt(new String[]{"perfiles"}, perfil, questionID, "question"));

        JSONObject obj = (JSONObject) dh.getObjectAt(new String[]{"perfiles"}, perfil, questionID, "answers");
        txtP1.setText(obj.get("a").toString());
        txtP2.setText(obj.get("b").toString());
        txtP3.setText(obj.get("c").toString());
        txtP4.setText(obj.get("d").toString());
    }
    
        private void resetQuestionData() {
        txaPregunta.setText("");
        txtP1.setText("");
        txtP2.setText("");
        txtP3.setText("");
        txtP4.setText("");
    }
    
}
