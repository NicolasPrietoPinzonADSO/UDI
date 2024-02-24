package VISTA;

import CONTROLADOR.ControladorDuplicidadDeVistas;
import java.awt.Color;
import Design.AnimateBTT;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import DAO.DocenteDao;

public class Menu extends javax.swing.JFrame {

    int xx, xy;
    AnimateBTT ColorOP = new AnimateBTT();

    public Menu() {
        initComponents();
        pestañas.setEnabledAt(0, false);
        pestañas.setEnabledAt(1, false);
        pestañas.setEnabledAt(2, false);
        pestañas.setEnabledAt(3, false);
        setBackground(new Color(0, 0, 0, 0));
        ColorOP.AnimattIni();

        TableCategoria.getTableHeader().setFont(new Font("Segue UI", Font.BOLD, 12));
        TableCategoria.getTableHeader().setOpaque(false);
        TableCategoria.getTableHeader().setBackground(new Color(32, 136, 203));
        TableCategoria.getTableHeader().setForeground(new Color(255, 255, 255));
        TableCategoria.setRowHeight(25);
        
        //-------------------TABLA DOCENTE--------------------------------------
        
        TableDocente.getTableHeader().setFont(new Font("Segue UI", Font.BOLD, 12));
        TableDocente.getTableHeader().setOpaque(false);
        TableDocente.getTableHeader().setBackground(new Color(32, 136, 203));
        TableDocente.getTableHeader().setForeground(new Color(255, 255, 255));
        TableDocente.setRowHeight(25);
        
        DefaultTableModel tablaModel = DocenteDao.cargarTabla();
        TableDocente.setModel(tablaModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressCircleUI1 = new Design.ProgressCircleUI();
        progressCircleUI2 = new Design.ProgressCircleUI();
        Menu = new Panel_redondo.PanelRound();
        Titulo = new javax.swing.JLabel();
        btt_inicio = new Panel_gradiend.PanelGradient();
        lbl_ini = new javax.swing.JLabel();
        btt_prueba = new Panel_gradiend.PanelGradient();
        lbl_prueba = new javax.swing.JLabel();
        btt_pruebaOne = new Panel_gradiend.PanelGradient();
        lbl_pruebaOne = new javax.swing.JLabel();
        btt_pruebaTwo = new Panel_gradiend.PanelGradient();
        lbl_pruebaTwo = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        btt_salir = new Panel_gradiend.PanelGradient();
        lbl_Salir = new javax.swing.JLabel();
        pestañas = new tabbed.MaterialTabbed();
        pageUna = new javax.swing.JPanel();
        pageDos = new javax.swing.JPanel();
        roundPanel1 = new Design.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCategoria = new javax.swing.JTable();
        AddCategoria = new javax.swing.JButton();
        DelateCategoria = new javax.swing.JButton();
        ViewCategoria = new javax.swing.JButton();
        pageTres = new javax.swing.JPanel();
        roundPanel2 = new Design.RoundPanel();
        AddDocente = new javax.swing.JButton();
        DelateDocente = new javax.swing.JButton();
        ViewDocente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableDocente = new javax.swing.JTable();
        pageCuatro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1180, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(23, 27, 36));
        Menu.setMinimumSize(new java.awt.Dimension(157, 550));
        Menu.setPreferredSize(new java.awt.Dimension(157, 550));
        Menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuMouseDragged(evt);
            }
        });
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("UDI");
        Menu.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 50, 149, -1));

        btt_inicio.setBackground(new java.awt.Color(23, 27, 36));
        btt_inicio.setToolTipText("");
        btt_inicio.setColorGradient(new java.awt.Color(23, 27, 36));
        btt_inicio.setRadius(10);
        btt_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_inicioMousePressed(evt);
            }
        });
        btt_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ini.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lbl_ini.setForeground(new java.awt.Color(166, 166, 166));
        lbl_ini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home-altV.png"))); // NOI18N
        lbl_ini.setText("   Inicio");
        lbl_ini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_iniMousePressed(evt);
            }
        });
        btt_inicio.add(lbl_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 129, 32));

        Menu.add(btt_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 120, 149, 32));

        btt_prueba.setBackground(new java.awt.Color(23, 27, 36));
        btt_prueba.setToolTipText("");
        btt_prueba.setColorGradient(new java.awt.Color(23, 27, 36));
        btt_prueba.setRadius(10);
        btt_prueba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_pruebaMousePressed(evt);
            }
        });
        btt_prueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_prueba.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lbl_prueba.setForeground(new java.awt.Color(166, 166, 166));
        lbl_prueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/users-altV.png"))); // NOI18N
        lbl_prueba.setText("   Categoria");
        lbl_prueba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_pruebaMousePressed(evt);
            }
        });
        btt_prueba.add(lbl_prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 129, 32));

        Menu.add(btt_prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 155, 149, 32));

        btt_pruebaOne.setBackground(new java.awt.Color(23, 27, 36));
        btt_pruebaOne.setToolTipText("");
        btt_pruebaOne.setColorGradient(new java.awt.Color(23, 27, 36));
        btt_pruebaOne.setRadius(10);
        btt_pruebaOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_pruebaOneMousePressed(evt);
            }
        });
        btt_pruebaOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_pruebaOne.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lbl_pruebaOne.setForeground(new java.awt.Color(166, 166, 166));
        lbl_pruebaOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/users-altV.png"))); // NOI18N
        lbl_pruebaOne.setText("   Docente");
        lbl_pruebaOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_pruebaOneMousePressed(evt);
            }
        });
        btt_pruebaOne.add(lbl_pruebaOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 129, 32));

        Menu.add(btt_pruebaOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 190, 149, 32));

        btt_pruebaTwo.setBackground(new java.awt.Color(23, 27, 36));
        btt_pruebaTwo.setToolTipText("");
        btt_pruebaTwo.setColorGradient(new java.awt.Color(23, 27, 36));
        btt_pruebaTwo.setRadius(10);
        btt_pruebaTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_pruebaTwoMousePressed(evt);
            }
        });
        btt_pruebaTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_pruebaTwo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lbl_pruebaTwo.setForeground(new java.awt.Color(166, 166, 166));
        lbl_pruebaTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/users-altV.png"))); // NOI18N
        lbl_pruebaTwo.setText("   Pagina4");
        lbl_pruebaTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_pruebaTwoMousePressed(evt);
            }
        });
        btt_pruebaTwo.add(lbl_pruebaTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 129, 32));

        Menu.add(btt_pruebaTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 225, 149, 32));

        Separator.setBackground(new java.awt.Color(51, 51, 51));
        Separator.setForeground(new java.awt.Color(71, 71, 71));
        Menu.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 135, 1));

        btt_salir.setBackground(new java.awt.Color(59, 57, 71));
        btt_salir.setColorGradient(new java.awt.Color(59, 57, 71));
        btt_salir.setRadius(10);
        btt_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Salir.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lbl_Salir.setForeground(new java.awt.Color(166, 166, 166));
        lbl_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Salir.setText("Salir");
        lbl_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_Salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseMoved(evt);
            }
        });
        lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_SalirMousePressed(evt);
            }
        });
        btt_salir.add(lbl_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 149, 32));

        Menu.add(btt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 500, 149, 32));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 167, 550));

        pestañas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        pestañas.setMinimumSize(new java.awt.Dimension(1180, 550));
        pestañas.setPreferredSize(new java.awt.Dimension(1180, 550));

        pageUna.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pageUnaLayout = new javax.swing.GroupLayout(pageUna);
        pageUna.setLayout(pageUnaLayout);
        pageUnaLayout.setHorizontalGroup(
            pageUnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1148, Short.MAX_VALUE)
        );
        pageUnaLayout.setVerticalGroup(
            pageUnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        pestañas.addTab("", pageUna);

        pageDos.setBackground(new java.awt.Color(153, 204, 255));
        pageDos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(204, 204, 204));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#ID", "Categoria", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCategoria.setFocusable(false);
        TableCategoria.setRowHeight(25);
        TableCategoria.setSelectionBackground(new java.awt.Color(255, 102, 102));
        TableCategoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableCategoria);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, 890, 390));

        AddCategoria.setText("Add");
        AddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoriaActionPerformed(evt);
            }
        });
        roundPanel1.add(AddCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        DelateCategoria.setText("Delate");
        roundPanel1.add(DelateCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        ViewCategoria.setText("View");
        roundPanel1.add(ViewCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        pageDos.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 980, 530));

        pestañas.addTab("", pageDos);

        pageTres.setBackground(new java.awt.Color(255, 204, 255));
        pageTres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(204, 204, 204));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddDocente.setText("Add");
        AddDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDocenteActionPerformed(evt);
            }
        });
        roundPanel2.add(AddDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        DelateDocente.setText("Delate");
        roundPanel2.add(DelateDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        ViewDocente.setText("View");
        roundPanel2.add(ViewDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        TableDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#ID", "Nombre", "Apellido", "Cedula", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDocente.setFocusable(false);
        TableDocente.setRowHeight(25);
        TableDocente.setSelectionBackground(new java.awt.Color(255, 102, 102));
        TableDocente.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TableDocente);

        roundPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, 890, 390));

        pageTres.add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 980, 530));

        pestañas.addTab("", pageTres);

        pageCuatro.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pagina4");

        javax.swing.GroupLayout pageCuatroLayout = new javax.swing.GroupLayout(pageCuatro);
        pageCuatro.setLayout(pageCuatroLayout);
        pageCuatroLayout.setHorizontalGroup(
            pageCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(pageCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pageCuatroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pageCuatroLayout.setVerticalGroup(
            pageCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
            .addGroup(pageCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pageCuatroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pestañas.addTab("", pageCuatro);

        getContentPane().add(pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btt_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_inicioMousePressed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattIni();
    }//GEN-LAST:event_btt_inicioMousePressed

    private void lbl_iniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniMousePressed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattIni();
    }//GEN-LAST:event_lbl_iniMousePressed

    private void lbl_pruebaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pruebaMousePressed
        pestañas.setSelectedIndex(1);
        ColorOP.AnimattPrueba();
    }//GEN-LAST:event_lbl_pruebaMousePressed

    private void btt_pruebaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_pruebaMousePressed
        pestañas.setSelectedIndex(1);
        ColorOP.AnimattPrueba();
    }//GEN-LAST:event_btt_pruebaMousePressed

    private void lbl_pruebaOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pruebaOneMousePressed
        pestañas.setSelectedIndex(2);
        ColorOP.AnimattPruebaOne();
    }//GEN-LAST:event_lbl_pruebaOneMousePressed

    private void btt_pruebaOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_pruebaOneMousePressed
        pestañas.setSelectedIndex(2);
        ColorOP.AnimattPruebaOne();
    }//GEN-LAST:event_btt_pruebaOneMousePressed

    private void lbl_pruebaTwoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pruebaTwoMousePressed
        pestañas.setSelectedIndex(3);
        ColorOP.AnimattPruebaTwo();
    }//GEN-LAST:event_lbl_pruebaTwoMousePressed

    private void btt_pruebaTwoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_pruebaTwoMousePressed
        pestañas.setSelectedIndex(3);
        ColorOP.AnimattPruebaTwo();
    }//GEN-LAST:event_btt_pruebaTwoMousePressed

    private void lbl_SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMousePressed
        this.dispose();
    }//GEN-LAST:event_lbl_SalirMousePressed

    private void lbl_SalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseMoved
        lbl_Salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_SalirMouseMoved

    private void lbl_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseExited
        lbl_Salir.setForeground(new Color(166, 166, 166));
    }//GEN-LAST:event_lbl_SalirMouseExited

    private void MenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_MenuMouseDragged

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_MenuMousePressed

    private void AddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoriaActionPerformed
        ControladorDuplicidadDeVistas ctrDuplicado = new ControladorDuplicidadDeVistas();
        ctrDuplicado.DuplicidadCategoria(this);
    }//GEN-LAST:event_AddCategoriaActionPerformed

    private void AddDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDocenteActionPerformed
        ControladorDuplicidadDeVistas ctrDuplicado = new ControladorDuplicidadDeVistas();
        ctrDuplicado.DuplicidadDocente(this);
    }//GEN-LAST:event_AddDocenteActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCategoria;
    private javax.swing.JButton AddDocente;
    private javax.swing.JButton DelateCategoria;
    private javax.swing.JButton DelateDocente;
    private Panel_redondo.PanelRound Menu;
    private javax.swing.JSeparator Separator;
    private javax.swing.JTable TableCategoria;
    private javax.swing.JTable TableDocente;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton ViewCategoria;
    private javax.swing.JButton ViewDocente;
    public static Panel_gradiend.PanelGradient btt_inicio;
    public static Panel_gradiend.PanelGradient btt_prueba;
    public static Panel_gradiend.PanelGradient btt_pruebaOne;
    public static Panel_gradiend.PanelGradient btt_pruebaTwo;
    private Panel_gradiend.PanelGradient btt_salir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lbl_Salir;
    public static javax.swing.JLabel lbl_ini;
    public static javax.swing.JLabel lbl_prueba;
    public static javax.swing.JLabel lbl_pruebaOne;
    public static javax.swing.JLabel lbl_pruebaTwo;
    private javax.swing.JPanel pageCuatro;
    private javax.swing.JPanel pageDos;
    private javax.swing.JPanel pageTres;
    private javax.swing.JPanel pageUna;
    private tabbed.MaterialTabbed pestañas;
    private Design.ProgressCircleUI progressCircleUI1;
    private Design.ProgressCircleUI progressCircleUI2;
    private Design.RoundPanel roundPanel1;
    private Design.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}
