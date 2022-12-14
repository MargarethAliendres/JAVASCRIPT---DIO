
package View;



import java.awt.Color;
import java.awt.Font;



public final class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateJTableTasks();    // chamada do metodo que fizemos final da pagina//
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6EmptyList = new javax.swing.JPanel();
        jLabel7EmptyListIcon = new javax.swing.JLabel();
        jLabel8EmptyListTitle = new javax.swing.JLabel();
        jLabel9EmptyListSubTitle = new javax.swing.JLabel();
        jPanel1Tollbar = new javax.swing.JPanel();
        jLabel1ToobarTitle = new javax.swing.JLabel();
        jLabel2ToolBarSubtitle = new javax.swing.JLabel();
        jPanel2Project = new javax.swing.JPanel();
        jLabel3ProjetctTitle = new javax.swing.JLabel();
        jLabel5ProjectAdd = new javax.swing.JLabel();
        jPanel3Tasks = new javax.swing.JPanel();
        jLabel4TasksTitle = new javax.swing.JLabel();
        jLabel6TasksAdd = new javax.swing.JLabel();
        jPanel4ProjectList = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1Tasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jPanel6EmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7EmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lists.png"))); // NOI18N

        jLabel8EmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8EmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8EmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8EmptyListTitle.setText("Nenhuma tarefa por aqui.");

        jLabel9EmptyListSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9EmptyListSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9EmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9EmptyListSubTitle.setText("Clique no botao mmais para adicionar uma nova tarefa.");

        javax.swing.GroupLayout jPanel6EmptyListLayout = new javax.swing.GroupLayout(jPanel6EmptyList);
        jPanel6EmptyList.setLayout(jPanel6EmptyListLayout);
        jPanel6EmptyListLayout.setHorizontalGroup(
            jPanel6EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7EmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8EmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9EmptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6EmptyListLayout.setVerticalGroup(
            jPanel6EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6EmptyListLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel7EmptyListIcon)
                .addGap(18, 18, 18)
                .addComponent(jLabel8EmptyListTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel9EmptyListSubTitle)
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1Tollbar.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1Tollbar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1ToobarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1ToobarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1ToobarTitle.setText("TodoApp");

        jLabel2ToolBarSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2ToolBarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2ToolBarSubtitle.setText("N?o deixe de anotar nada.");

        javax.swing.GroupLayout jPanel1TollbarLayout = new javax.swing.GroupLayout(jPanel1Tollbar);
        jPanel1Tollbar.setLayout(jPanel1TollbarLayout);
        jPanel1TollbarLayout.setHorizontalGroup(
            jPanel1TollbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1TollbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1TollbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1ToobarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1TollbarLayout.createSequentialGroup()
                        .addComponent(jLabel2ToolBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1TollbarLayout.setVerticalGroup(
            jPanel1TollbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1TollbarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1ToobarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2ToolBarSubtitle)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2Project.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2Project.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3ProjetctTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3ProjetctTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3ProjetctTitle.setText("Projetos");

        jLabel5ProjectAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5ProjectAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5ProjectAdd.setIcon(new javax.swing.ImageIcon("C:\\Profiss?o\\Meusprojetos\\aulaJavaScript\\JAVASCRIPT---DIO\\JAVA-START CAPGEMINI\\TodoApp\\src\\main\\resourses\\add.png")); // NOI18N
        jLabel5ProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5ProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2ProjectLayout = new javax.swing.GroupLayout(jPanel2Project);
        jPanel2Project.setLayout(jPanel2ProjectLayout);
        jPanel2ProjectLayout.setHorizontalGroup(
            jPanel2ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2ProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3ProjetctTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5ProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2ProjectLayout.setVerticalGroup(
            jPanel2ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2ProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5ProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3ProjetctTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3Tasks.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4TasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4TasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4TasksTitle.setText("Tarefas");

        jLabel6TasksAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6TasksAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6TasksAdd.setIcon(new javax.swing.ImageIcon("C:\\Profiss?o\\Meusprojetos\\aulaJavaScript\\JAVASCRIPT---DIO\\JAVA-START CAPGEMINI\\TodoApp\\src\\main\\resourses\\add.png")); // NOI18N

        javax.swing.GroupLayout jPanel3TasksLayout = new javax.swing.GroupLayout(jPanel3Tasks);
        jPanel3Tasks.setLayout(jPanel3TasksLayout);
        jPanel3TasksLayout.setHorizontalGroup(
            jPanel3TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3TasksLayout.createSequentialGroup()
                .addComponent(jLabel4TasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6TasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3TasksLayout.setVerticalGroup(
            jPanel3TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3TasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6TasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4TasksTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4ProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4ProjectList.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4ProjectListLayout = new javax.swing.GroupLayout(jPanel4ProjectList);
        jPanel4ProjectList.setLayout(jPanel4ProjectListLayout);
        jPanel4ProjectListLayout.setHorizontalGroup(
            jPanel4ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel4ProjectListLayout.setVerticalGroup(
            jPanel4ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri??o", "Prazo", "TarefaConcluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 255, 102));
        jScrollPane1Tasks.setViewportView(jTableTasks);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1Tasks)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1Tollbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2Project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1Tollbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2Project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5ProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5ProjectAddMouseClicked
 
    }//GEN-LAST:event_jLabel5ProjectAddMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1ToobarTitle;
    private javax.swing.JLabel jLabel2ToolBarSubtitle;
    private javax.swing.JLabel jLabel3ProjetctTitle;
    private javax.swing.JLabel jLabel4TasksTitle;
    private javax.swing.JLabel jLabel5ProjectAdd;
    private javax.swing.JLabel jLabel6TasksAdd;
    private javax.swing.JLabel jLabel7EmptyListIcon;
    private javax.swing.JLabel jLabel8EmptyListTitle;
    private javax.swing.JLabel jLabel9EmptyListSubTitle;
    private javax.swing.JPanel jPanel1Tollbar;
    private javax.swing.JPanel jPanel2Project;
    private javax.swing.JPanel jPanel3Tasks;
    private javax.swing.JPanel jPanel4ProjectList;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6EmptyList;
    private javax.swing.JScrollPane jScrollPane1Tasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

   
        
       
         private void decorateJTableTasks() {
        //To style table header//
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setOpaque(false);
        jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));

        //criamos sort automatico para as clonas da table//
        jTableTasks.setAutoCreateRowSorter(true);  //ele possibilita que ordene os itens das colunas //
   
        
        // concluido esse metod ir la encima no construtor para chamar esse metodo//
         
         }


}

