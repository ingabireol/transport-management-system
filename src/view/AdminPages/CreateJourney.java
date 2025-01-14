
package view.AdminPages;

import Dao.JourneyDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Journey;

/**
 *
 * @author ingab
 */
public class CreateJourney extends javax.swing.JInternalFrame {
    DefaultTableModel tableModel = new DefaultTableModel();

    /** Creates new form EmployeeMgt */
    public CreateJourney() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        JourneyDao dao = new JourneyDao();
        String id  = dao.generate_driverId();
        journIdtxt.setText(id);
        addTableColumnsHeader();
        addTableRowData();
    }
    private void addTableColumnsHeader(){        
        tableModel.addColumn("JourneyId");
        tableModel.addColumn("Date");
        tableModel.addColumn("destination");
        tableModel.addColumn("Source");
        tableModel.addColumn("DriverId");
        tableModel.addColumn("Departure");
        tableModel.addColumn("Arrival");
        tableModel.addColumn("Price");    
        tableModel.addColumn("busNo"); 
        JourneyTable.setModel(tableModel);
    }
    
    private void addTableRowData(){
        tableModel.setRowCount(0);
        JourneyDao jourdao = new JourneyDao();
        List<Journey> journeys = jourdao.retrieveJourney();
        for(Journey thejouney: journeys){
            tableModel.addRow(new Object[]{
                thejouney.getJourney_id(),
                thejouney.getJourney_date(),
                thejouney.getJour_dest_name(),
                thejouney.getJour_source_name(),
                thejouney.getDriver_id(),
                thejouney.getJour_departure_time(),
                thejouney.getJour_arrival_time(),
                thejouney.getPrice(),
                thejouney.getJour_bus_no()                
            });
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        departureTxt = new javax.swing.JTextField();
        arrivalTimeTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JourneyTable = new javax.swing.JTable();
        createJourneyBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchIdtxt = new javax.swing.JTextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        journIdtxt = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        driverIdTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bus_noTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 235, 216));

        jPanel1.setBackground(new java.awt.Color(255, 235, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Journey Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 89, -1, -1));

        jLabel4.setText("Destination ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 151, -1, -1));

        jLabel5.setText("Source");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, -1, -1));

        jLabel7.setText("Journey Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 37, -1, -1));

        jLabel8.setText("Price");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 292, -1, -1));

        jLabel9.setText("Departure Time");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 348, -1, -1));

        jLabel11.setText("Arrival Time: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 392, -1, -1));
        jPanel1.add(sourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));
        jPanel1.add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 148, 120, -1));
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, -1));

        departureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTxtActionPerformed(evt);
            }
        });
        jPanel1.add(departureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 345, 130, -1));
        jPanel1.add(arrivalTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 389, 130, -1));

        JourneyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JourneyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JourneyTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JourneyTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        createJourneyBtn.setText("Create");
        createJourneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJourneyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createJourneyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 616, -1, -1));

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 616, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));
        jPanel1.add(searchIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 118, -1));
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        journIdtxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(journIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 130, 30));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 616, -1, -1));

        jLabel12.setText("Driver Id :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        jPanel1.add(driverIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 130, -1));

        jLabel13.setText("Bus No :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));
        jPanel1.add(bus_noTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 130, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1186, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureTxtActionPerformed

    private void createJourneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJourneyBtnActionPerformed

        
        Journey journey = new Journey();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(dateTxt.getDate() == null || dateTxt.getDate().toString().trim().isEmpty()){
                   
            JOptionPane.showMessageDialog(this, "Date is Empty","Empty Date",JOptionPane.ERROR_MESSAGE);
            resetBtnActionPerformed(evt);

        }
        else if(destinationTxt.getText().trim().isEmpty() || sourceTxt.getText().trim().isEmpty() || priceTxt.getText().trim().isEmpty() || departureTxt.getText().trim().isEmpty() || arrivalTimeTxt.getText().trim().isEmpty() || bus_noTxt.getText().trim().isEmpty() || driverIdTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All Fields","Empty Filed",JOptionPane.ERROR_MESSAGE);
            resetBtnActionPerformed(evt);

            
        }
      else if(priceTxt.getText().matches("\\d+(\\.\\d+)?")){
          journey.setPrice(Double.parseDouble(priceTxt.getText()));
          journey.setDriver_id(driverIdTxt.getText());
          journey.setJour_bus_no(bus_noTxt.getText());
          journey.setJour_dest_name(destinationTxt.getText());
          journey.setJour_source_name(sourceTxt.getText());
          journey.setJour_departure_time(departureTxt.getText());
          journey.setJourney_id(journIdtxt.getText());
          String date = sdf.format(dateTxt.getDate());
          journey.setJourney_date(date);
          journey.setJour_arrival_time(arrivalTimeTxt.getText());
          JourneyDao jourdao = new JourneyDao();
          String feedback = jourdao.registerJourney(journey);
          JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
          addTableRowData();
          resetBtnActionPerformed(evt);
     }
        else
      {
          JOptionPane.showMessageDialog(this, "Price Is Digits Only","Price Field",JOptionPane.ERROR_MESSAGE);
      }
        
    }//GEN-LAST:event_createJourneyBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed

        JourneyDao dao  = new JourneyDao();
        journIdtxt.setText(dao.generate_driverId());
        departureTxt.setText("");
        sourceTxt.setText("");
        arrivalTimeTxt.setText("");
        destinationTxt.setText("");
        priceTxt.setText("");
        driverIdTxt.setText("");
        bus_noTxt.setText("");
        dateTxt.setDate(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
          Journey journey = new Journey();
          JourneyDao jourdao = new JourneyDao();

          String id = jourdao.generate_driverId();
          journey.setJourney_id(journIdtxt.getText());
          if(id.equals(journIdtxt.getText())){
              JOptionPane.showMessageDialog(this, "Please First Search For the Id","Error",JOptionPane.ERROR_MESSAGE);
          }
          else{
          int  option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this journey ?", "Confirm ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
          if(option == JOptionPane.YES_OPTION){
          String feedback = jourdao.deleteJourney(journey);
          JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
          addTableRowData();
          }
          resetBtnActionPerformed(evt);
          }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try{
        if(searchIdtxt.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Please Enter Id ","Empty Filed",JOptionPane.ERROR_MESSAGE);
        }
        else if(searchIdtxt.getText().length() == 5 && searchIdtxt.getText().contains("JN")){
            Journey journey = new Journey();
//            Journey journey1 = new Journey();

            JourneyDao jourdao = new JourneyDao();
            journey.setJourney_id(searchIdtxt.getText());
            journey = jourdao.searchJourney(journey);
            if(journey == null){
                System.out.println(searchIdtxt.getText());
                JOptionPane.showMessageDialog(this, "Id does not Exist", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                journIdtxt.setText(journey.getJourney_id());
                destinationTxt.setText(journey.getJour_dest_name());
                sourceTxt.setText(journey.getJour_source_name());
                departureTxt.setText(journey.getJour_departure_time());
                arrivalTimeTxt.setText(journey.getJour_arrival_time());
                String date = journey.getJourney_date();                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
                dateTxt.setDate(todate);
                driverIdTxt.setText(journey.getDriver_id());
                bus_noTxt.setText(journey.getJour_bus_no());
                priceTxt.setText(journey.getPrice().toString());
            }
            
        }
        }
        
        catch(Exception ex){
                
              ex.printStackTrace();
         }
            
    }//GEN-LAST:event_searchBtnActionPerformed

    private void JourneyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JourneyTableMouseClicked

        int i = JourneyTable.getSelectedRow();
        TableModel model  =  JourneyTable.getModel();
        journIdtxt.setText(model.getValueAt(i, 0).toString());
        destinationTxt.setText(model.getValueAt(i, 2).toString());
        sourceTxt.setText(model.getValueAt(i, 3).toString());
        departureTxt.setText(model.getValueAt(i, 5).toString());
        arrivalTimeTxt.setText(model.getValueAt(i, 6).toString());
        String date = model.getValueAt(i, 1).toString();                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try{
        Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
        dateTxt.setDate(todate);
        }catch(Exception ex){ex.printStackTrace();}

        driverIdTxt.setText(model.getValueAt(i, 4).toString());
        bus_noTxt.setText(model.getValueAt(i, 8).toString());
        priceTxt.setText(model.getValueAt(i, 7).toString());
                
    }//GEN-LAST:event_JourneyTableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        Journey journey = new Journey();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(dateTxt.getDate() == null || dateTxt.getDate().toString().trim().isEmpty()){
                   
            JOptionPane.showMessageDialog(this, "Date is Empty","Empty Date",JOptionPane.ERROR_MESSAGE);
            resetBtnActionPerformed(evt);

        }
        else if(destinationTxt.getText().trim().isEmpty() || sourceTxt.getText().trim().isEmpty() || priceTxt.getText().trim().isEmpty() || departureTxt.getText().trim().isEmpty() || arrivalTimeTxt.getText().trim().isEmpty() || bus_noTxt.getText().trim().isEmpty() || driverIdTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All Fields","Empty Filed",JOptionPane.ERROR_MESSAGE);
            resetBtnActionPerformed(evt);

            
        }
      else if(priceTxt.getText().matches("\\d+(\\.\\d+)?")){
          journey.setPrice(Double.parseDouble(priceTxt.getText()));
          journey.setDriver_id(driverIdTxt.getText());
          journey.setJour_bus_no(bus_noTxt.getText());
          journey.setJour_dest_name(destinationTxt.getText());
          journey.setJour_source_name(sourceTxt.getText());
          journey.setJour_departure_time(departureTxt.getText());
          journey.setJourney_id(journIdtxt.getText());
          String date = sdf.format(dateTxt.getDate());
          journey.setJourney_date(date);
          journey.setJour_arrival_time(arrivalTimeTxt.getText());
          JourneyDao jourdao = new JourneyDao();
          String feedback = jourdao.updateJourney(journey);
          JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
          addTableRowData();
          resetBtnActionPerformed(evt);
     }
        else
      {
          JOptionPane.showMessageDialog(this, "Price Is Digits Only","Price Field",JOptionPane.ERROR_MESSAGE);
      }
            

        
    }//GEN-LAST:event_UpdateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JourneyTable;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JTextField bus_noTxt;
    private javax.swing.JButton createJourneyBtn;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField departureTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField driverIdTxt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel journIdtxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdtxt;
    private javax.swing.JTextField sourceTxt;
    // End of variables declaration//GEN-END:variables

}
