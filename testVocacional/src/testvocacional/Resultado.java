/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testvocacional;

/**
 *
 * @author sweet
 */
public class Resultado extends javax.swing.JFrame {

    /**
     * Creates new form Resultado
     */
    public Resultado() {
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

        primerboton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        segundoboton = new javax.swing.JButton();
        tercerboton = new javax.swing.JButton();
        cuartoboton = new javax.swing.JButton();
        quintoboton = new javax.swing.JButton();
        primera = new javax.swing.JLabel();
        segunda = new javax.swing.JLabel();
        tercera = new javax.swing.JLabel();
        cuarta = new javax.swing.JLabel();
        quinta = new javax.swing.JLabel();
        textores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(215, 227, 255));
        getContentPane().setLayout(null);

        primerboton.setText("carreras relacionadas");
        getContentPane().add(primerboton);
        primerboton.setBounds(221, 93, 155, 35);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 113, 0, 35);

        segundoboton.setText("carreras relacionadas");
        getContentPane().add(segundoboton);
        segundoboton.setBounds(221, 134, 155, 35);

        tercerboton.setText("carreras relacionadas");
        getContentPane().add(tercerboton);
        tercerboton.setBounds(221, 175, 155, 35);

        cuartoboton.setText("carreras relacionadas");
        getContentPane().add(cuartoboton);
        cuartoboton.setBounds(221, 216, 155, 35);

        quintoboton.setText("carreras relacionadas");
        getContentPane().add(quintoboton);
        quintoboton.setBounds(221, 257, 155, 35);

        primera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(primera);
        primera.setBounds(49, 93, 116, 35);

        segunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(segunda);
        segunda.setBounds(49, 134, 116, 35);

        tercera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tercera);
        tercera.setBounds(49, 175, 116, 35);

        cuarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cuarta);
        cuarta.setBounds(49, 216, 116, 35);

        quinta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(quinta);
        quinta.setBounds(49, 257, 116, 35);

        textores.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        textores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textores.setText("LOS RESULTADOS  DE SU TEST SON...");
        getContentPane().add(textores);
        textores.setBounds(0, 40, 410, 30);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuarta;
    private javax.swing.JButton cuartoboton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel primera;
    private javax.swing.JButton primerboton;
    private javax.swing.JLabel quinta;
    private javax.swing.JButton quintoboton;
    private javax.swing.JLabel segunda;
    private javax.swing.JButton segundoboton;
    private javax.swing.JLabel tercera;
    private javax.swing.JButton tercerboton;
    private javax.swing.JLabel textores;
    // End of variables declaration//GEN-END:variables
}
