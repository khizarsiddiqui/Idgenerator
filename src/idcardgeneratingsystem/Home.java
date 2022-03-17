/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idcardgeneratingsystem;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;


public class Home extends javax.swing.JFrame {


    private ImageIcon format=null;
    String fname=null;
    int s=0;
    byte[] pimage=null;
    int lvalue = 1000;
    
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        name_box = new javax.swing.JTextField();
        birthday_label = new javax.swing.JLabel();
        bdate_txt_box = new com.toedter.calendar.JDateChooser();
        address_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadress_box = new javax.swing.JTextArea();
        country_label = new javax.swing.JLabel();
        txtcountry = new javax.swing.JTextField();
        date_label = new javax.swing.JLabel();
        date_box = new com.toedter.calendar.JDateChooser();
        gender_label = new javax.swing.JLabel();
        gender_cmbo_box = new javax.swing.JComboBox();
        info_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinfo_area = new javax.swing.JTextArea();
        set_img_button = new javax.swing.JButton();
        gen_ID_Button = new javax.swing.JButton();
        print_button = new javax.swing.JButton();
        printtemplate_panel = new javax.swing.JPanel();
        panel1_frontside = new javax.swing.JPanel();
        panel2_frontside = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cntrylabel = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        niclabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panel1_backside = new javax.swing.JPanel();
        panel2_backside = new javax.swing.JPanel();
        namelabel_for_print = new javax.swing.JLabel();
        genderlabel_forprint = new javax.swing.JLabel();
        brthlabel_forprint = new javax.swing.JLabel();
        addrsslabel_forprint = new javax.swing.JLabel();
        cntrykabel_forprint = new javax.swing.JLabel();
        infolabel_forprint = new javax.swing.JLabel();
        lblname_default = new javax.swing.JLabel();
        lblgender_default = new javax.swing.JLabel();
        lblbday_default = new javax.swing.JLabel();
        lbladress_default = new javax.swing.JLabel();
        lblbcountry_default = new javax.swing.JLabel();
        lblinfo_default = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        name_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name_label.setText("Name");

        birthday_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        birthday_label.setText("Birthday");

        bdate_txt_box.setDateFormatString("yyyy-MM-dd");

        address_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address_label.setText("Address");

        txtadress_box.setColumns(20);
        txtadress_box.setRows(5);
        jScrollPane1.setViewportView(txtadress_box);

        country_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        country_label.setText("Country");

        date_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        date_label.setText("Issue Date");

        date_box.setDateFormatString("yyyy-MM-dd");

        gender_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender_label.setText("Gender");

        gender_cmbo_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "Male", "Female" }));
        gender_cmbo_box.setAutoscrolls(true);

        info_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        info_label.setText("Info");

        txtinfo_area.setColumns(20);
        txtinfo_area.setRows(5);
        jScrollPane2.setViewportView(txtinfo_area);

        set_img_button.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        set_img_button.setText("Set Image");
        set_img_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_img_buttonActionPerformed(evt);
            }
        });

        gen_ID_Button.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        gen_ID_Button.setText("Genarate ID");
        gen_ID_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_ID_ButtonActionPerformed(evt);
            }
        });

        print_button.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        print_button.setText("Print");
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(country_label)
                            .addComponent(date_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcountry)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthday_label)
                            .addComponent(name_label)
                            .addComponent(address_label))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(name_box)
                            .addComponent(bdate_txt_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender_label)
                            .addComponent(info_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender_cmbo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(gen_ID_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print_button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(set_img_button, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country_label)
                    .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_label)
                    .addComponent(date_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(birthday_label)
                    .addComponent(bdate_txt_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label)
                    .addComponent(gender_cmbo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(set_img_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gen_ID_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(print_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1_frontside.setBackground(new java.awt.Color(0, 102, 0));

        panel2_frontside.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pk.png"))); // NOI18N

        cntrylabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        cntrylabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cntrylabel.setText("Country Here");

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idcardgeneratingsystem/icon.png"))); // NOI18N

        niclabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        niclabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        niclabel.setText("NIC Number Here");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Date");

        lbldate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbldate.setText("Date Here");

        jLabel14.setText("Signature");

        jLabel15.setText(".........................");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("This ID is issued by Government");

        javax.swing.GroupLayout panel2_frontsideLayout = new javax.swing.GroupLayout(panel2_frontside);
        panel2_frontside.setLayout(panel2_frontsideLayout);
        panel2_frontsideLayout.setHorizontalGroup(
            panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_frontsideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2_frontsideLayout.createSequentialGroup()
                            .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_frontsideLayout.createSequentialGroup()
                            .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cntrylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2_frontsideLayout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel15))
                                    .addComponent(niclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_frontsideLayout.createSequentialGroup()
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_frontsideLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap())))
            .addGroup(panel2_frontsideLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel2_frontsideLayout.setVerticalGroup(
            panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2_frontsideLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cntrylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(niclabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1_frontsideLayout = new javax.swing.GroupLayout(panel1_frontside);
        panel1_frontside.setLayout(panel1_frontsideLayout);
        panel1_frontsideLayout.setHorizontalGroup(
            panel1_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1_frontsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2_frontside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1_frontsideLayout.setVerticalGroup(
            panel1_frontsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1_frontsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2_frontside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1_backside.setBackground(new java.awt.Color(0, 102, 0));

        panel2_backside.setBackground(new java.awt.Color(204, 255, 204));

        namelabel_for_print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namelabel_for_print.setText("Name");

        genderlabel_forprint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genderlabel_forprint.setText("Gender");

        brthlabel_forprint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        brthlabel_forprint.setText("Birthday");

        addrsslabel_forprint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addrsslabel_forprint.setText("Address");

        cntrykabel_forprint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cntrykabel_forprint.setText("Country");

        infolabel_forprint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        infolabel_forprint.setText("Info");

        lblname_default.setText("Name here");

        lblgender_default.setText("Gender here");

        lblbday_default.setText("Birthday here");

        lbladress_default.setText("Address here");

        lblbcountry_default.setText("Country here");

        lblinfo_default.setText("Info here");

        javax.swing.GroupLayout panel2_backsideLayout = new javax.swing.GroupLayout(panel2_backside);
        panel2_backside.setLayout(panel2_backsideLayout);
        panel2_backsideLayout.setHorizontalGroup(
            panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2_backsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelabel_for_print)
                    .addComponent(genderlabel_forprint)
                    .addComponent(brthlabel_forprint)
                    .addComponent(addrsslabel_forprint)
                    .addComponent(cntrykabel_forprint)
                    .addComponent(infolabel_forprint))
                .addGap(26, 26, 26)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblgender_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbday_default, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(lbladress_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbcountry_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblinfo_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2_backsideLayout.setVerticalGroup(
            panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2_backsideLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel_for_print)
                    .addComponent(lblname_default))
                .addGap(30, 30, 30)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlabel_forprint)
                    .addComponent(lblgender_default))
                .addGap(28, 28, 28)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brthlabel_forprint)
                    .addComponent(lblbday_default))
                .addGap(32, 32, 32)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrsslabel_forprint)
                    .addComponent(lbladress_default))
                .addGap(28, 28, 28)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cntrykabel_forprint)
                    .addComponent(lblbcountry_default))
                .addGap(29, 29, 29)
                .addGroup(panel2_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infolabel_forprint)
                    .addComponent(lblinfo_default))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1_backsideLayout = new javax.swing.GroupLayout(panel1_backside);
        panel1_backside.setLayout(panel1_backsideLayout);
        panel1_backsideLayout.setHorizontalGroup(
            panel1_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1_backsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2_backside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1_backsideLayout.setVerticalGroup(
            panel1_backsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1_backsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2_backside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout printtemplate_panelLayout = new javax.swing.GroupLayout(printtemplate_panel);
        printtemplate_panel.setLayout(printtemplate_panelLayout);
        printtemplate_panelLayout.setHorizontalGroup(
            printtemplate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printtemplate_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panel1_frontside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panel1_backside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        printtemplate_panelLayout.setVerticalGroup(
            printtemplate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printtemplate_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(printtemplate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1_backside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1_frontside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 67)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Card Generating System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(printtemplate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(printtemplate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void set_img_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_img_buttonActionPerformed
       JFileChooser fchoser=new JFileChooser();
        fchoser.showOpenDialog(null);
        File f=fchoser.getSelectedFile();
        fname=f.getAbsolutePath();
        ImageIcon micon=new ImageIcon(fname);        
        try {
            File image=new File(fname);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum; (readnum=fis.read(buf)) !=-1;)
            {            
                baos.write(buf,0,readnum);                
            }
            pimage=baos.toByteArray();
            lblimage.setIcon(resizeImage(fname, buf));
        } catch (Exception e) {
        }   
    }//GEN-LAST:event_set_img_buttonActionPerformed

    private void gen_ID_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_ID_ButtonActionPerformed
        String cou=txtcountry.getText();
        String date=((JTextField)date_box.getDateEditor().getUiComponent()).getText();
        String birthday=((JTextField)bdate_txt_box.getDateEditor().getUiComponent()).getText();
        String name= name_box.getText();
        String adress= txtadress_box.getText();
        String gender = gender_cmbo_box.getSelectedItem().toString();
        String info = txtinfo_area.getText();
        
        
        
        cntrylabel.setText(cou);
        lbldate.setText(date);
        lblbcountry_default.setText(cou);
        lblname_default.setText(name);
        lblbday_default.setText(birthday);
        lbladress_default.setText(adress);
        lblgender_default.setText(gender);
        lblinfo_default.setText(info);
        
        //id number generate
        String year= birthday.substring(2, 4);
       // JOptionPane.showMessageDialog(rootPane, year);
        int genvalue=0;
        if(gender.equals("Male"))
        {
            genvalue=100;
        }
        else{
            genvalue=500;
        }
        
        lvalue++;
        
        String gen = String.valueOf(genvalue);
        String las = String.valueOf(lvalue);
        String nic= year+gen+las+"V";
        
        niclabel.setText(nic);
        
        
        
        
        
    }//GEN-LAST:event_gen_ID_ButtonActionPerformed

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
         try {
            Toolkit tkp = printtemplate_panel.getToolkit();
    PrintJob pjp = tkp.getPrintJob(this, null, null);
    Graphics g = pjp.getGraphics();
    printtemplate_panel.print(g);
    g.dispose();
    pjp.end();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_print_buttonActionPerformed

     public ImageIcon resizeImage(String imagePath, byte[] pic){
          
        ImageIcon myImage=null;
        if(imagePath !=null)
        {
        myImage=new ImageIcon(imagePath);
        
        }else{
         myImage=new ImageIcon(pic);
        }
                
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(lblimage.getHeight(), lblimage.getWidth(),  Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    } 
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel addrsslabel_forprint;
    private com.toedter.calendar.JDateChooser bdate_txt_box;
    private javax.swing.JLabel birthday_label;
    private javax.swing.JLabel brthlabel_forprint;
    private javax.swing.JLabel cntrykabel_forprint;
    private javax.swing.JLabel cntrylabel;
    private javax.swing.JLabel country_label;
    private com.toedter.calendar.JDateChooser date_box;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton gen_ID_Button;
    private javax.swing.JComboBox gender_cmbo_box;
    private javax.swing.JLabel gender_label;
    private javax.swing.JLabel genderlabel_forprint;
    private javax.swing.JLabel info_label;
    private javax.swing.JLabel infolabel_forprint;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbladress_default;
    private javax.swing.JLabel lblbcountry_default;
    private javax.swing.JLabel lblbday_default;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblgender_default;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblinfo_default;
    private javax.swing.JLabel lblname_default;
    private javax.swing.JTextField name_box;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel namelabel_for_print;
    private javax.swing.JLabel niclabel;
    private javax.swing.JPanel panel1_backside;
    private javax.swing.JPanel panel1_frontside;
    private javax.swing.JPanel panel2_backside;
    private javax.swing.JPanel panel2_frontside;
    private javax.swing.JButton print_button;
    private javax.swing.JPanel printtemplate_panel;
    private javax.swing.JButton set_img_button;
    private javax.swing.JTextArea txtadress_box;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextArea txtinfo_area;
    // End of variables declaration//GEN-END:variables
}
