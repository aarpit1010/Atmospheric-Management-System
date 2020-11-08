/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreenForm;

/**
 *
 * @author akhil
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AQI_data3 extends javax.swing.JFrame {

	/**
	 * Creates new form AQI_data3
	 */
	public AQI_data3() {
		initComponents();
	}
        Sensor_choice sens = new Sensor_choice();

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 =  new JPanel() {  
            public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                    AQI_data3.class.getResource("/images/img1.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
        }; ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        detect_data = new javax.swing.JButton();
        no2_data = new javax.swing.JTextField();
        pm10_data = new javax.swing.JTextField();
        o3_data = new javax.swing.JTextField();
        pm25_data = new javax.swing.JTextField();
        temp_data = new javax.swing.JTextField();
        hum_data = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        res_aqi_data = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        qlty_data = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cool_sys_data = new javax.swing.JTextField();
        sub_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GUPTAJI CANTEEN Sensor Data");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("<html>Hourly Pollutant Gas Density (in µg/m<sup>3</sup>)</html>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("<html>NO<sub>2</sub></html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("<html>PM<sub>10</sub></html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("<html>O<sub>3</sub></html>");
        jLabel4.setToolTipText("<html>O<sub>3</sub></html>\n");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("<html>PM<sub>2.5</sub></html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("<html>Temperature<br>(°C)</html>");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("<html>Humidity<br>(%)</html>");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Guptaji Canteen");

        detect_data.setBackground(new java.awt.Color(0, 102, 153));
        detect_data.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        detect_data.setForeground(new java.awt.Color(204, 255, 255));
        detect_data.setText("Detect Data");
        detect_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detect_data.setNextFocusableComponent(cancel_btn);
        detect_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detect_dataActionPerformed(evt);
            }
        });
        detect_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                detect_dataKeyPressed(evt);
            }
        });

        no2_data.setText("                 ");

        pm10_data.setText("                 ");

        o3_data.setText("                  ");

        pm25_data.setText("                  ");

        temp_data.setText("                  ");

        hum_data.setText("                  ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Qualitative Name");

        res_aqi_data.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        res_aqi_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        res_aqi_data.setText("                                   ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Resultant AQI");

        qlty_data.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        qlty_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qlty_data.setText("                                    ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("<html>Central Cooling<br>System Settings</html>");

        cool_sys_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cool_sys_data.setText("                                     ");

        sub_btn.setBackground(new java.awt.Color(0, 102, 153));
        sub_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sub_btn.setForeground(new java.awt.Color(204, 253, 253));
        sub_btn.setText("SUBMIT");
        sub_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btnActionPerformed(evt);
            }
        });
        sub_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sub_btnKeyPressed(evt);
            }
        });

        reset_btn.setBackground(new java.awt.Color(0, 102, 153));
        reset_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        reset_btn.setForeground(new java.awt.Color(204, 255, 255));
        reset_btn.setText("RESET to Default");
        reset_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        reset_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reset_btnKeyPressed(evt);
            }
        });

        cancel_btn.setBackground(new java.awt.Color(0, 102, 153));
        cancel_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(204, 255, 255));
        cancel_btn.setText("CANCEL");
        cancel_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        cancel_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancel_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pm10_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(no2_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addComponent(o3_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pm25_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hum_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(temp_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(res_aqi_data)
                            .addComponent(qlty_data)
                            .addComponent(cool_sys_data)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detect_data, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(sub_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(detect_data, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no2_data, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pm10_data, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qlty_data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(o3_data, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(res_aqi_data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pm25_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temp_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cool_sys_data, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hum_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_btn)
                    .addComponent(reset_btn)
                    .addComponent(cancel_btn))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hum_data, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, no2_data, pm10_data, pm25_data, temp_data});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel9, qlty_data});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, res_aqi_data});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
        private class canteen_sensorData{
                DecimalFormat df = new DecimalFormat("0.00");
                double rand_no2;
                double rand_pm10;
                double rand_o3;
                double rand_pm25;
                double rand_temp;
                double rand_hum;
                double no2, pm10, o3, pm25, temp, hum, aqi_idx, avg_aqi;
                
                public void randGen() {
                        Random rand = new Random();
                        rand_no2 = 500*rand.nextDouble();
                        rand_pm10 = 300*rand.nextDouble();
                        rand_o3 = 360*rand.nextDouble();
                        rand_pm25 = 200*rand.nextDouble();
                        rand_temp = -5 + 60*rand.nextDouble();
                        rand_hum = 100*rand.nextDouble();
                        avg_aqi = (rand_no2 + rand_pm10 + 
                                        rand_o3 + rand_pm25)/4;
                }
                
                public void dataValue() {
                        no2 = Double.parseDouble(df.format(rand_no2));
                        pm10 = Double.parseDouble(df.format(rand_pm10));
                        o3 = Double.parseDouble(df.format(rand_o3));
                        pm25 = Double.parseDouble(df.format(rand_pm25));
                        temp = Double.parseDouble(df.format(rand_temp));
                        hum = Double.parseDouble(df.format(rand_hum));

                        no2_data.setText("" + no2);
                        pm10_data.setText("" + pm10);
                        o3_data.setText("" + o3);
                        pm25_data.setText("" + pm25);
                        temp_data.setText("" + temp);
                        hum_data.setText("" + hum);
                        res_aqi_data.setText("");
                        qlty_data.setText("");
                        qlty_data.setForeground(Color.white);
                        cool_sys_data.setText("");
                }
                
                public void decision(){
                       aqi_idx = Double.parseDouble(df.format(avg_aqi));
                       res_aqi_data.setText("" + aqi_idx);

                       if(aqi_idx>0 && aqi_idx<=50){
                           qlty_data.setText("GOOD");
                           qlty_data.setForeground(Color.green);
                       }
                       else if(aqi_idx>50 && aqi_idx<=100){
                           qlty_data.setText("MODERATE");
                           qlty_data.setForeground(Color.yellow);
                       }
                       else if(aqi_idx>100 && aqi_idx<=150){
                           qlty_data.setText("UNHEALTHY");
                           qlty_data.setForeground(Color.blue);
                       }
                       else if(aqi_idx>150 && aqi_idx<=200){
                           qlty_data.setText("VERY UNHEALTHY");
                           qlty_data.setForeground(Color.red);
                       }
                       else{
                           qlty_data.setText("HAZARDOUS");
                           qlty_data.setForeground(Color.magenta);
                       }

                       if(temp<=18 && hum>70) {
                           cool_sys_data.setText("Increase A/C Temp");
                       }
                       else if((temp>=25 && hum>40) || temp>=40) {
                           cool_sys_data.setText("Lower A/C Temp");
                       }
                       else {
                           cool_sys_data.setText("Default Setting");
                       }
                       if (aqi_idx > 200) {
                           JOptionPane.showMessageDialog(null,"Very High AQI. "
                                   + "Stay Indoors. E-mail sent to authority"
                                   + " to take appropriate steps."
                                   ,"WARNING: HAZARDOUS AIR QUALITY"
                                   ,JOptionPane.WARNING_MESSAGE);
                       }
                }
                
                public void resetData() {
                    no2_data.setText("");
                    pm10_data.setText("");
                    o3_data.setText("");
                    pm25_data.setText("");
                    temp_data.setText("");
                    hum_data.setText("");
                    res_aqi_data.setText("");
                    qlty_data.setText("");
                    qlty_data.setForeground(Color.white);
                    cool_sys_data.setText("");
                }
                
        }
        
        canteen_sensorData canteen = new canteen_sensorData();
        
        private void sub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btnActionPerformed
                canteen.decision();
        }//GEN-LAST:event_sub_btnActionPerformed

        private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
                sens.setVisible(true);
                dispose();
        }//GEN-LAST:event_cancel_btnActionPerformed

    private void detect_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detect_dataActionPerformed
              canteen.randGen();
              canteen.dataValue();
    }//GEN-LAST:event_detect_dataActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
              canteen.resetData();
    }//GEN-LAST:event_reset_btnActionPerformed

    private void detect_dataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detect_dataKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
                canteen.dataValue();
        }
    }//GEN-LAST:event_detect_dataKeyPressed

    private void cancel_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancel_btnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
                sens.setVisible(true);
                dispose();
        }
    }//GEN-LAST:event_cancel_btnKeyPressed

    private void reset_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reset_btnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
                canteen.resetData();
        }
    }//GEN-LAST:event_reset_btnKeyPressed

    private void sub_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sub_btnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
                canteen.decision();
        }
    }//GEN-LAST:event_sub_btnKeyPressed

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
			java.util.logging.Logger.getLogger(AQI_data3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AQI_data3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AQI_data3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AQI_data3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AQI_data3().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField cool_sys_data;
    private javax.swing.JButton detect_data;
    private javax.swing.JTextField hum_data;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField no2_data;
    private javax.swing.JTextField o3_data;
    private javax.swing.JTextField pm10_data;
    private javax.swing.JTextField pm25_data;
    private javax.swing.JTextField qlty_data;
    private javax.swing.JTextField res_aqi_data;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton sub_btn;
    private javax.swing.JTextField temp_data;
    // End of variables declaration//GEN-END:variables
}
