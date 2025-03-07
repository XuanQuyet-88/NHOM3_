/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SanPham;

import MenuQuanLy.MenuForm;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QLySPForm extends javax.swing.JFrame {

    private ArrayList<SanPham> listSP = new SanPhamDAO().getListProduct();
    private DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form QLySPForm
     */
    public QLySPForm() {
        initComponents();
        initTable();
        fillTable();
        setLocationRelativeTo(null); // chinh cua so xuat hien chinh giua man hinh
        this.btnAdd.setBackground(new Color(23, 163, 233));
        this.btnUpdate.setBackground(Color.pink);
        this.btnClear.setBackground(Color.red);
        this.btnDelete.setBackground(Color.red);
    }

    private void fillTable() {
        tblModel.setRowCount(0);
        for (SanPham o : listSP) {
            tblModel.addRow(new String[]{o.getMaSP(), o.getTenSP(), o.getMoTa(), o.getKichThuoc(), String.valueOf(o.getSoLuong()), String.valueOf(o.getGia())});
        }
        tblModel.fireTableDataChanged();
    }

    private void initTable() {
        String[] columns = new String[]{"Mã SP", "Tên Sản Phẩm", "Mô tả", "Kích thước", "Số Lượng", "Giá Tiền"};
        tblModel.setColumnIdentifiers(columns);
        tblSP.setModel(tblModel);
        tblSP.getColumnModel().getColumn(0).setMaxWidth(100);
        tblSP.getColumnModel().getColumn(1).setMinWidth(150);
        tblSP.getColumnModel().getColumn(5).setMinWidth(100);
        tblSP.getColumnModel().getColumn(4).setMaxWidth(290);
    }

    private boolean dieukienSL(String SL) {
        String text = txtSL.getText();
        try {
            int value = Integer.parseInt(text);
            if (value < 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    private boolean dieukienGia(String SL) {
        String text = txtGia.getText();
        try {
            double value = Double.parseDouble(text);
            if (value < 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TableSP = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDvTinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setText("QUẢN LÝ SẢN PHẨM");

        tblSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên sản phẩm", "Mô tả", "Kích thước", "Số lượng", "Giá tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSP.setRowHeight(24);
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        TableSP.setViewportView(tblSP);
        if (tblSP.getColumnModel().getColumnCount() > 0) {
            tblSP.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        btnAdd.setBackground(new java.awt.Color(0, 102, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 153, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã sản phẩm: ");

        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên sản phẩm: ");

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mô tả: ");

        txtMoTa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Kích thước");

        txtDvTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng: ");

        txtSL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Giá tiền:");

        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtMoTa)
                            .addComponent(txtMaSP))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDvTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TableSP, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDvTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TableSP, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();

        if (txtMaSP.getText().equals("")) {
            sb.append("Mã sản phẩm không được để trống \n");
            txtMaSP.setBackground(Color.gray);
        } else {
            txtMaSP.setBackground(Color.white);
        }

        if (txtTenSP.getText().equals("")) {
            sb.append("Tên Sản Phẩm không được để trống \n");
            txtTenSP.setBackground(Color.gray);
        } else {
            txtTenSP.setBackground(Color.white);
        }

        if (txtMoTa.getText().equals("")) {
            sb.append("Mô tả không được để trống \n");
            txtMoTa.setBackground(Color.gray);
        } else {
            txtMoTa.setBackground(Color.white);
        }

        if (txtDvTinh.getText().equals("")) {
            sb.append("Đơn vị tính không được để trống \n");
            txtDvTinh.setBackground(Color.gray);
        } else {
            txtDvTinh.setBackground(Color.white);
        }

        if (txtSL.getText().equals("")) {
            sb.append("Số Lượng không được để trống \n");
            txtSL.setBackground(Color.gray);
        } else {
            txtSL.setBackground(Color.white);
        }

        if (txtGia.getText().equals("")) {
            sb.append("Giá tiền không được để trống \n");
            txtGia.setBackground(Color.gray);
        } else {
            txtGia.setBackground(Color.white);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int flag = -1;
        for (SanPham o : listSP) {
            if (o.getMaSP().equalsIgnoreCase(txtMaSP.getText())) {
                flag = 0;
                break;
            } else if (!dieukienSL(txtSL.getText())) {
                flag = 1;
                break;
            } else if (!dieukienGia(txtGia.getText())) {
                flag = 2;
                break;
            }
        }

        if (flag == -1) {
            SanPham a = new SanPham();
            a.setMaSP(txtMaSP.getText());
            a.setTenSP(txtTenSP.getText());
            a.setMoTa(txtMoTa.getText());
            a.setKichThuoc(txtDvTinh.getText());
            a.setSoLuong(Integer.parseInt(txtSL.getText()));
            a.setGia(Double.parseDouble(txtGia.getText()));

            listSP.add(a);
            fillTable();
            if(new SanPhamDAO().addProduct(a)){
                JOptionPane.showMessageDialog(rootPane, "Add Success!");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Fail");
            }
//            try {
//                FileWriter fw = new FileWriter("CSDL\\SanPham.txt", true);
//                BufferedWriter bw = new BufferedWriter(fw);
//                bw.write(a.toString());
//                bw.newLine();
//                bw.close();
//                fw.close();
//            } catch (IOException e) {
//            }
        } else if(flag == 0) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã sản phẩm này");
        } else if(flag == 1) {
            JOptionPane.showMessageDialog(null, "Số lượng phải là số nguyên dương");
        } else if(flag == 2) {
            JOptionPane.showMessageDialog(null, "Giá tiền không hợp lệ");
        }
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        StringBuilder sb = new StringBuilder();

        if (txtMaSP.getText().equals("")) {
            sb.append("Mã sản phẩm không được để trống \n");
            txtMaSP.setBackground(Color.gray);
        } else {
            txtMaSP.setBackground(Color.white);
        }

        if (txtTenSP.getText().equals("")) {
            sb.append("Tên Sản Phẩm không được để trống \n");
            txtTenSP.setBackground(Color.gray);
        } else {
            txtTenSP.setBackground(Color.white);
        }

        if (txtMoTa.getText().equals("")) {
            sb.append("Mô tả không được để trống \n");
            txtMoTa.setBackground(Color.gray);
        } else {
            txtMoTa.setBackground(Color.white);
        }

        if (txtDvTinh.getText().equals("")) {
            sb.append("Đơn vị tính không được để trống \n");
            txtDvTinh.setBackground(Color.gray);
        } else {
            txtDvTinh.setBackground(Color.white);
        }

        if (txtSL.getText().equals("")) {
            sb.append("Số Lượng không được để trống \n");
            txtSL.setBackground(Color.gray);
        } else {
            txtSL.setBackground(Color.white);
        }

        if (txtGia.getText().equals("")) {
            sb.append("Giá tiền không được để trống \n");
            txtGia.setBackground(Color.gray);
        } else {
            txtGia.setBackground(Color.white);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thông tin không? ", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }

        // neu chon khong thi tu doan nay se khong thuc hien
        for (SanPham sp : listSP) {
            if (sp.getMaSP().equals(txtMaSP.getText())) {
                sp.setTenSP(txtTenSP.getText());
                sp.setMoTa(txtMoTa.getText());
                sp.setKichThuoc(txtDvTinh.getText());
                sp.setSoLuong(Integer.parseInt(txtSL.getText()));
                sp.setGia(Double.parseDouble(txtGia.getText()));
                // ghi phan tu sua doi vao file
//                try {
//                    // mo file database
//                    BufferedReader reader = new BufferedReader(new FileReader("CSDL\\SanPham.txt"));
//                    // tao 1 mang de luu cac doi tuong trong database
//                    ArrayList<String> lines = new ArrayList<>();
//                    String line;
//                    while ((line = reader.readLine()) != null) {
//                        lines.add(line);
//                    }
//                    // sua phan tu can thay doi
//                    for (int i = 0; i < lines.size(); i++) {
//                        String[] parts = lines.get(i).split(",");
//                        if (parts[0].equalsIgnoreCase(txtMaSP.getText())) {
//                            parts[1] = txtTenSP.getText();
//                            parts[2] = txtMoTa.getText();
//                            parts[3] = txtDvTinh.getText();
//                            parts[4] = txtSL.getText();
//                            parts[5] = txtGia.getText();
//
//                            String newLine = String.join(",", parts);
//                            lines.set(i, newLine);
//                            break; // thoat sau khi sua
//                        }
//                    }
//                    // tao doi tuong de ghi lai vao database
//                    BufferedWriter writer = new BufferedWriter(new FileWriter("CSDL\\SanPham.txt"));
//                    for (String newLine : lines) {
//                        writer.write(newLine);
//                        writer.newLine();
//                    }
//                    reader.close();
//                    writer.close();
//                } catch (IOException e) {
//                }
                if(new SanPhamDAO().updateProduct(sp)){
                    JOptionPane.showMessageDialog(rootPane, "Fix Success!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Fail");
                }
                break;
            }
        }

        fillTable();
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        StringBuilder sb = new StringBuilder();

        if (txtMaSP.getText().equals("")) {
            sb.append("Mã sản phẩm không được để trống \n");
            txtMaSP.setBackground(Color.gray);
        } else {
            txtMaSP.setBackground(Color.white);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sản phẩm không? ", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }

        // neu chon khong thi tu doan nay se khong thuc hien
        for (SanPham o : listSP) {
            if (o.getMaSP().equalsIgnoreCase(txtMaSP.getText())) {
                listSP.remove(o);
                break;
            }
        }
        if(new SanPhamDAO().deleteProduct(txtMaSP.getText())){
            JOptionPane.showMessageDialog(rootPane, "Delete Success!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Mã sản phẩm chưa đúng!");
        }
        // ghi lai file sau khi xoa san pham
//        try {
//            FileWriter fw = new FileWriter("CSDL\\SanPham.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            for (SanPham o : listSP) {
//                bw.write(o.toString());
//                bw.newLine();
//            }
//            bw.close();
//            fw.close();
//        } catch (IOException e) {
//        }
        fillTable();
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtMoTa.setText("");
        txtDvTinh.setText("");
        txtSL.setText("");
        txtGia.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        int SelectedRow = tblSP.getSelectedRow();
        if (SelectedRow >= 0) {
            String maSP = (String) tblSP.getValueAt(SelectedRow, 0);
            for (SanPham sp : listSP) {
                if (maSP.equals(sp.getMaSP())) {
                    txtMaSP.setText(sp.getMaSP());
                    txtTenSP.setText(sp.getTenSP());
                    txtMoTa.setText(sp.getMoTa());
                    txtDvTinh.setText(sp.getKichThuoc());
                    txtSL.setText("" + sp.getSoLuong());
                    txtGia.setText("" + sp.getGia());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblSPMouseClicked

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuForm menuform = new MenuForm();
        menuform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

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
            java.util.logging.Logger.getLogger(QLySPForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLySPForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLySPForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLySPForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QLySPForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TableSP;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtDvTinh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
