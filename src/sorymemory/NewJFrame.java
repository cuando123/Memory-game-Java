package sorymemory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Dawid Lubomski
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        super("Gra Memory");
        initComponents();
        ikonki();
        setVisible(true);
        setResizable(false);
        jLabel5.setText("15");
        jLabel6.setText("0");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                butontiklama(evt);
            }
        });

        jButton37.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton37.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton37.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton38.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton38.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton38.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton39.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton39.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton39.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton40.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton40.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton40.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton41.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton41.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton41.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton2.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton42.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton42.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton42.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton43.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton43.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton43.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton44.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton44.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton44.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton45.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton45.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton45.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton46.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton46.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton46.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton47.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton47.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton47.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton48.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton48.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton48.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton49.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton49.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton49.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton50.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton50.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton50.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton3.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton51.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton51.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton51.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton52.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton52.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton52.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton53.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton53.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton53.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton4.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton54.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton54.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton54.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton55.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton55.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton55.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton56.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton56.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton56.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton57.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton57.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton57.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton58.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton58.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton58.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton5.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton5.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton59.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton59.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton59.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton60.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton60.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton60.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jButton61.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton61.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton61.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butontiklama(evt);
            }
        });

        jLabel3.setText("Liczba prob:");

        jLabel4.setText("Pozostalo:");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel5");

        jMenu1.setText("Gra");

        jMenuItem1.setText("Nowa gra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Wyjście");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pomoc");

        jMenuItem3.setText("Pomoc");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("O autorze");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(5, 5, 5))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton37, jButton38, jButton39, jButton4, jButton40, jButton41, jButton42, jButton43, jButton44, jButton45, jButton46, jButton47, jButton48, jButton49, jButton5, jButton50, jButton51, jButton52, jButton53, jButton54, jButton55, jButton56, jButton57, jButton59, jButton60, jButton61});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    JButton przycisk;
    JButton poprzedni_przycisk;
    boolean jest_otwarty = false;
    boolean kliknieto = false;
    int liczba_prob = 0, pozostalo=15;
    
    String sprawdz_ikone;
    Timer t1 = new Timer(100, new ActionListener() {//czas gdy zatwierdzi takie same - wylacza przyciski
        @Override
        public void actionPerformed(ActionEvent e) {
         przycisk.setEnabled(false);
         poprzedni_przycisk.setEnabled(false);
         kliknieto=false;
         jest_otwarty=false;
         pozostalo--;
         liczba_prob++;
         jLabel5.setText(""+pozostalo);
         jLabel6.setText(""+liczba_prob);
         if (pozostalo==0){
                 String wynik = "Twoj wynik to: "+liczba_prob+" prob.";
                JOptionPane.showMessageDialog(rootPane, wynik, "Wynik", JOptionPane.PLAIN_MESSAGE, null);
         }
        }
    });
     Timer t2 = new Timer(500, new ActionListener() {//czas po wcisnieciu 2 obrazkow
        @Override
        public void actionPerformed(ActionEvent e) {
         przycisk.setIcon(null);
         poprzedni_przycisk.setIcon(null);
         kliknieto=false;
         jest_otwarty=false;
         liczba_prob++;
         jLabel6.setText(""+liczba_prob);
        }
    });
    //pomoc
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    String pomoc = "Gra memory\nWersja V1.0\n :D";
    JOptionPane.showMessageDialog(rootPane, pomoc, "Pomoc", JOptionPane.PLAIN_MESSAGE, null);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //wyjscie
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed
    //funkcja porownujaca
    private void butontiklama(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butontiklama
        
        if(kliknieto==false){ //jestli nie klikniety
            przycisk = (JButton) evt.getSource(); //pobranie zrodla
        if(jButton1.equals(przycisk)){ //porownywanie z przyciskiem (chodzi o miejsce bo randomowo wyswietla)
            jButton1.setIcon(ikona[tablica[0]]);  //pokazanie ikony po kliknieciu
            if (jest_otwarty==false){ //jesli 1 wcisniety a drugi nie 
                sprawdz_ikone=ikona[tablica[0]].toString(); //przypisanie do zmiennej zrodla ikony
                jest_otwarty=true; //przycisk jest otwarty
                poprzedni_przycisk = przycisk; //przypisanie do tej zmiennej otwartego przycisku
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){ //jestli 1 jest otwarty i drugi jest otwarty:
                kliknieto=true; //ustalamy ze kliknieto (2)
                if(sprawdz_ikone == ikona[tablica[0]].toString()){ //jesli zrodlo ikony jest takie samo jak z porownywanym przyciskiem to:
                    t1.setRepeats(false); //ustalamy ze t1 pojdzie 1 raz 
                    t1.start();// wlaczenie funkcji timer t1. ktora wylacza przyciski (i robia sie szare)
                }else //jesli zrodla nie beda takie same to:
                {
                    t2.setRepeats(false); //jak wyzej
                    t2.start(); //funkcja wylaczy ikony i ustawi ze przyciski sa nie klikniete (znowu beda szare)
                } //analogicznie przez nastepne 30 ifow ... :D 
            }
        }
        else if(jButton2.equals(przycisk)){
            jButton2.setIcon(ikona[tablica[1]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[1]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[1]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }
                else if(jButton3.equals(przycisk)){
            jButton3.setIcon(ikona[tablica[2]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[2]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[2]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton4.equals(przycisk)){
            jButton4.setIcon(ikona[tablica[3]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[3]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[3]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton5.equals(przycisk)){
            jButton5.setIcon(ikona[tablica[4]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[4]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[4]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton37.equals(przycisk)){
            jButton37.setIcon(ikona[tablica[5]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[5]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[5]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton38.equals(przycisk)){
            jButton38.setIcon(ikona[tablica[6]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[6]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[6]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton39.equals(przycisk)){
            jButton39.setIcon(ikona[tablica[7]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[7]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[7]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton40.equals(przycisk)){
            jButton40.setIcon(ikona[tablica[8]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[8]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[8]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton41.equals(przycisk)){
            jButton41.setIcon(ikona[tablica[9]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[9]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[9]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton42.equals(przycisk)){
            jButton42.setIcon(ikona[tablica[10]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[10]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[10]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton43.equals(przycisk)){
            jButton43.setIcon(ikona[tablica[11]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[11]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[11]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton44.equals(przycisk)){
            jButton44.setIcon(ikona[tablica[12]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[12]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[12]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton45.equals(przycisk)){
            jButton45.setIcon(ikona[tablica[13]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[13]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[13]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton46.equals(przycisk)){
            jButton46.setIcon(ikona[tablica[14]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[14]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[14]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton47.equals(przycisk)){
            jButton47.setIcon(ikona[tablica[15]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[15]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[15]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton48.equals(przycisk)){
            jButton48.setIcon(ikona[tablica[16]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[16]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[16]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton49.equals(przycisk)){
            jButton49.setIcon(ikona[tablica[17]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[17]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[17]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton50.equals(przycisk)){
            jButton50.setIcon(ikona[tablica[18]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[18]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[18]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton51.equals(przycisk)){
            jButton51.setIcon(ikona[tablica[19]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[19]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[19]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton52.equals(przycisk)){
            jButton52.setIcon(ikona[tablica[20]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[20]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[20]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton53.equals(przycisk)){
            jButton53.setIcon(ikona[tablica[21]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[21]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[21]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton54.equals(przycisk)){
            jButton54.setIcon(ikona[tablica[22]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[22]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[22]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton55.equals(przycisk)){
            jButton55.setIcon(ikona[tablica[23]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[23]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[23]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton56.equals(przycisk)){
            jButton56.setIcon(ikona[tablica[24]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[24]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[24]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton57.equals(przycisk)){
            jButton57.setIcon(ikona[tablica[25]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[25]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[25]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton58.equals(przycisk)){
            jButton58.setIcon(ikona[tablica[26]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[26]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[26]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton59.equals(przycisk)){
            jButton59.setIcon(ikona[tablica[27]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[27]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[27]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton60.equals(przycisk)){
            jButton60.setIcon(ikona[tablica[28]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[28]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[28]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }        else if(jButton61.equals(przycisk)){
            jButton61.setIcon(ikona[tablica[29]]);
            if (jest_otwarty==false){
                sprawdz_ikone=ikona[tablica[29]].toString();
                jest_otwarty=true;
                poprzedni_przycisk = przycisk;
            }else if(jest_otwarty==true && !poprzedni_przycisk.equals(przycisk)){
                kliknieto = true;
                if(sprawdz_ikone == ikona[tablica[29]].toString()){
                    t1.setRepeats(false);
                    t1.start();
                }else
                {
                    t2.setRepeats(false);
                    t2.start();
                }
            }
        }       
        
        }
    }//GEN-LAST:event_butontiklama
    // nowa gra
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        setVisible(true);
         kliknieto=false;
         jest_otwarty=false;
        jButton1.setIcon(null);
        jButton2.setIcon(null);
        jButton3.setIcon(null);
        jButton4.setIcon(null);
        jButton5.setIcon(null);
        jButton37.setIcon(null);
        jButton38.setIcon(null);
        jButton39.setIcon(null);
        jButton40.setIcon(null);
        jButton41.setIcon(null);
        jButton42.setIcon(null);
        jButton43.setIcon(null);
        jButton44.setIcon(null);
        jButton45.setIcon(null);
        jButton46.setIcon(null);
        jButton47.setIcon(null);
        jButton48.setIcon(null);
        jButton49.setIcon(null);
        jButton50.setIcon(null);
        jButton51.setIcon(null);
        jButton52.setIcon(null);
        jButton53.setIcon(null);
        jButton54.setIcon(null);
        jButton55.setIcon(null);
        jButton56.setIcon(null);
        jButton57.setIcon(null);
        jButton58.setIcon(null);
        jButton59.setIcon(null);
        jButton60.setIcon(null);
        jButton61.setIcon(null);
        pozostalo=15;
        liczba_prob=0;
        jLabel5.setText("15");
        jLabel6.setText("0");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton37.setEnabled(true);
        jButton38.setEnabled(true);
        jButton39.setEnabled(true);
        jButton40.setEnabled(true);
        jButton41.setEnabled(true);
        jButton42.setEnabled(true);
        jButton43.setEnabled(true);
        jButton44.setEnabled(true);
        jButton45.setEnabled(true);
        jButton46.setEnabled(true);
        jButton47.setEnabled(true);
        jButton48.setEnabled(true);
        jButton49.setEnabled(true);
        jButton50.setEnabled(true);
        jButton51.setEnabled(true);
        jButton52.setEnabled(true);
        jButton53.setEnabled(true);
        jButton54.setEnabled(true);
        jButton55.setEnabled(true);
        jButton56.setEnabled(true);
        jButton57.setEnabled(true);
        jButton58.setEnabled(true);
        jButton59.setEnabled(true);
        jButton60.setEnabled(true);
        jButton61.setEnabled(true);
         ikonki();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    // o autorze
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         String autor = "Dawid Lubomski 17709\nProgramowanie Obiektowe 2\nPWSZ Elblag 2017";
         JOptionPane.showMessageDialog(rootPane, autor, "Autor", JOptionPane.PLAIN_MESSAGE, null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code2-JButtons"> 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
   // </editor-fold>  
    
    ImageIcon [] ikona = new ImageIcon[30];
    int [] tablica = new int[30];
    
    // <editor-fold defaultstate="collapsed" desc="Funkcja ikonki"> 
    private void ikonki() {
        //przypisanie do tablicy zrodel ikonek
        ikona[0]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\bmw1.png");
        ikona[1]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\bmw1.png");
        ikona[2]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\bmw2.png");
        ikona[3]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\bmw2.png");
        ikona[4]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\harley1.png");
        ikona[5]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\harley1.png");
        ikona[6]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\honda1.png");
        ikona[7]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\honda1.png");
        ikona[8]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\honda2.png");
        ikona[9]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\honda2.png");
        ikona[10]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\husqvarna1.png");
        ikona[11]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\husqvarna1.png");
        ikona[12]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\husqvarna2.png");
        ikona[13]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\husqvarna2.png");
        ikona[14]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\kawasaki1.png");
        ikona[15]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\kawasaki1.png");
        ikona[16]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\kawasaki2.png");
        ikona[17]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\kawasaki2.png");
        ikona[18]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\ktm1.png");
        ikona[19]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\ktm1.png");
        ikona[20]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\ktm2.png");
        ikona[21]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\ktm2.png");
        ikona[22]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\suzuki1.png");
        ikona[23]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\suzuki1.png");
        ikona[24]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\suzuki2.png");
        ikona[25]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\suzuki2.png");
        ikona[26]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\yamaha1.png");
        ikona[27]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\yamaha1.png");
        ikona[28]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\yamaha2.png");
        ikona[29]= new ImageIcon("C:\\Users\\Cuando\\Documents\\NetBeansProjects\\sorymemory\\src\\icon\\yamaha2.png");
        //losowanie liczb 0-29 i przypisywanie ich do tablicy, (nie moga sie powtarzac)
        Random losuj = new Random();
        int losowa_liczba = losuj.nextInt(29)+1;

        tablica[0]=losowa_liczba;
        for(int i = 1; i<tablica.length; i++){
            losowa_liczba=losuj.nextInt(30);
            for(int j=0;j<i;j++){
                if(tablica[j]==losowa_liczba){
                    i--;
                    break;
                }else{
                    tablica[i]=losowa_liczba;
                }
            }
        }        
        
      
                
        //ustalenie ikonek randomowych
        jButton1.setIcon(ikona[tablica[0]]);
        jButton2.setIcon(ikona[tablica[1]]);
        jButton3.setIcon(ikona[tablica[2]]);
        jButton4.setIcon(ikona[tablica[3]]);
        jButton5.setIcon(ikona[tablica[4]]);
        jButton37.setIcon(ikona[tablica[5]]);
        jButton38.setIcon(ikona[tablica[6]]);
        jButton39.setIcon(ikona[tablica[7]]);
        jButton40.setIcon(ikona[tablica[8]]);
        jButton41.setIcon(ikona[tablica[9]]);
        jButton42.setIcon(ikona[tablica[10]]);
        jButton43.setIcon(ikona[tablica[11]]);
        jButton44.setIcon(ikona[tablica[12]]);
        jButton45.setIcon(ikona[tablica[13]]);
        jButton46.setIcon(ikona[tablica[14]]);
        jButton47.setIcon(ikona[tablica[15]]);
        jButton48.setIcon(ikona[tablica[16]]);
        jButton49.setIcon(ikona[tablica[17]]);
        jButton50.setIcon(ikona[tablica[18]]);
        jButton51.setIcon(ikona[tablica[19]]);
        jButton52.setIcon(ikona[tablica[20]]);
        jButton53.setIcon(ikona[tablica[21]]);
        jButton54.setIcon(ikona[tablica[22]]);
        jButton55.setIcon(ikona[tablica[23]]);
        jButton56.setIcon(ikona[tablica[24]]);
        jButton57.setIcon(ikona[tablica[25]]);
        jButton58.setIcon(ikona[tablica[26]]);
        jButton59.setIcon(ikona[tablica[27]]);
        jButton60.setIcon(ikona[tablica[28]]);
        jButton61.setIcon(ikona[tablica[29]]);
        
        Timer t = new Timer(3000, new ActionListener(){//3 sekundy przed startem zeby cos zapamietac
            @Override
            public void actionPerformed(ActionEvent e){
        jButton1.setIcon(null);
        jButton2.setIcon(null);
        jButton3.setIcon(null);
        jButton4.setIcon(null);
        jButton5.setIcon(null);
        jButton37.setIcon(null);
        jButton38.setIcon(null);
        jButton39.setIcon(null);
        jButton40.setIcon(null);
        jButton41.setIcon(null);
        jButton42.setIcon(null);
        jButton43.setIcon(null);
        jButton44.setIcon(null);
        jButton45.setIcon(null);
        jButton46.setIcon(null);
        jButton47.setIcon(null);
        jButton48.setIcon(null);
        jButton49.setIcon(null);
        jButton50.setIcon(null);
        jButton51.setIcon(null);
        jButton52.setIcon(null);
        jButton53.setIcon(null);
        jButton54.setIcon(null);
        jButton55.setIcon(null);
        jButton56.setIcon(null);
        jButton57.setIcon(null);
        jButton58.setIcon(null);
        jButton59.setIcon(null);
        jButton60.setIcon(null);
        jButton61.setIcon(null);
            }
            });
    t.setRepeats(false);//odpalenie tego wyzej i wylaczenie ikon
    t.start();
    }
// </editor-fold> 
    
    }