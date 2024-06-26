
package testvocacional;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author sweet
 */
public class Preguntas extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    public Preguntas() {
        initComponents();
        //te odio java, que suma int como si fueran strings
        int num = Lector.numPregunta + 1; //esto es simplemente porque si los sumo se suman como String a pesar de ser int
        this.jLabel1.setText("Pregunta " + num + "/" + Lector.cantPreguntas);
        //logo
        ImageIcon icono = new ImageIcon("src/resource/logo.png");
        this.setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciado = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        no = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregunta 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setMinimumSize(new java.awt.Dimension(200, 100));

        enunciado.setEditable(false);
        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enunciado.setLineWrap(true);
        enunciado.setRows(5);
        enunciado.setText(Lector.preguntas[Lector.numPregunta]);
        enunciado.setWrapStyleWord(true);
        enunciado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enunciado.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jScrollPane1.setViewportView(enunciado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        buttonGroup1.add(no);
        no.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        no.setText("No me interesa");
        no.setActionCommand("0");

        buttonGroup1.add(si);
        si.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        si.setText("Me interesa");
        si.setActionCommand("1");
        si.setMaximumSize(new java.awt.Dimension(130, 30));
        si.setMinimumSize(new java.awt.Dimension(130, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(no)
                .addGap(50, 50, 50)
                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 400));

        siguiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(anterior)
                .addGap(113, 113, 113)
                .addComponent(siguiente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        setSize(new java.awt.Dimension(606, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if (buttonGroup1.getSelection() == null) { //si no selecciona opcion dar advertencia
            JOptionPane.showMessageDialog(null,"Porfavor seleccionar una de las opciones antes de continuar", "Advertencia",JOptionPane.ERROR_MESSAGE);
        } else {
            if (Lector.numPregunta == (Lector.cantidadPreguntas(Lector.rutaArchivo) - 1)) { //Compara si la pregunta es la ultima
                new Resultado().setVisible(true);
                int seleccion = Integer.parseInt(buttonGroup1.getSelection().getActionCommand()); //El valor de seleccion sera 0 si NO y 1 si SI
                Lector.controladorResultados[Lector.numPregunta][0] = seleccion;
                Lector.numPregunta++;
                this.dispose();
            } else {
                int seleccion = Integer.parseInt(buttonGroup1.getSelection().getActionCommand()); //El valor de seleccion sera 0 si NO y 1 si SI
                Lector.controladorResultados[Lector.numPregunta][0] = seleccion;
                Lector.numPregunta++;
                refrescar();
                //Para que permanezca seleccionado el boton
                int respuesta = Lector.controladorResultados[Lector.numPregunta][0];
                switch (respuesta) {
                    case 0:
                        no.setSelected(true);
                        break;
                    case 1:
                        si.setSelected(true);
                        break;
                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        
        if (Lector.numPregunta == 0) {
            JOptionPane.showMessageDialog(null, "Estas en la primera pregunta, no puedes retroceder mas","Advertencia",JOptionPane.ERROR_MESSAGE);
        } else {
            Lector.numPregunta--;
            refrescar();
            //Mantener seleccionado boton
            int respuesta = Lector.controladorResultados[Lector.numPregunta][0];
            switch (respuesta) {
                case 0:
                    no.setSelected(true);
                    break;
                case 1:
                    si.setSelected(true);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_anteriorActionPerformed

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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    private void refrescar(){
        this.enunciado.setText(Lector.preguntas[Lector.numPregunta]);
        this.enunciado.setLineWrap(true);
        int num = Lector.numPregunta + 1; //esto es simplemente porque si los sumo se suman como String a pesar de ser int
        this.jLabel1.setText("Pregunta " + num + "/" + Lector.cantPreguntas);
        this.buttonGroup1.clearSelection();
        if (num == Lector.cantidadPreguntas(Lector.rutaArchivo)) {
            this.siguiente.setText("Finalizar Test");
        } else {
            this.siguiente.setText("Siguiente");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton si;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
