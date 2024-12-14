/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhaCungCap;

import MenuQuanLy.MenuForm;
import SanPham.SanPham;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QLyNCCForm extends javax.swing.JFrame {

    private ArrayList<NCC> listNCC = NCC.getNCCList();
    private ArrayList<SanPham> listSP = SanPham.getSanPhamList();
    private DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form QLyNCC
     */
    public QLyNCCForm() {
        initComponents();
        initTable();
        fillTable();
        setLocationRelativeTo(null);
        this.btnDelete.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnUpdate.setBackground(Color.pink);
        this.btnAdd.setBackground(new Color(23, 163, 233));
    }

    private void fillTable() {
        tblModel.setRowCount(0);
        for (NCC o : listNCC) {
            tblModel.addRow(new String[]{o.getMaNCC(), o.getTenNCC(), o.getDiaChi(), o.getSoDT(), String.valueOf(o.getSoLuongNhap()), o.getMaSP()});
        }
        tblModel.fireTableDataChanged();
    }

    private void initTable() {
        String[] columns = new String[]{"Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điện thoại", "Số Lượng Nhập", "Mã sản phẩm"};
        tblModel.setColumnIdentifiers(columns);
        tblNCC.setModel(tblModel);
    }

    private boolean dieukienSLN(String SLN) {
        String text = txtSLN.getText();
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

    private int tongMaSP(String MaSP) {
        int countMaSP = 0;
        for (SanPham sp : listSP) {
            if (!sp.getMaSP().equalsIgnoreCase(txtMaSPNCC.getText())) {
                countMaSP += 1;
            }
        }
        return countMaSP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtSLN = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TableSP = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        txtTenNCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtdcNCC = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtSoDT = new javax.swing.JTextField();
        Jlabel6 = new javax.swing.JLabel();
        txtMaSPNCC = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClear.setBackground(new java.awt.Color(153, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng nhập: ");

        txtSLN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã nhà cung cấp:");

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setText("QUẢN LÝ NHÀ CUNG CẤP");

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên nhà cung cấp: ");

        tblNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
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
                "", "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCCMouseClicked(evt);
            }
        });
        TableSP.setViewportView(tblNCC);

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Địa chỉ: ");

        btnAdd.setBackground(new java.awt.Color(51, 153, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtdcNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(153, 153, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Số điện thoại: ");

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtSoDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDTActionPerformed(evt);
            }
        });

        Jlabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jlabel6.setText("Mã sản phẩm: ");

        txtMaSPNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaSPNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPNCCActionPerformed(evt);
            }
        });

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
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaNCC)
                                    .addComponent(txtTenNCC)
                                    .addComponent(txtdcNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSLN)
                            .addComponent(txtSoDT)
                            .addComponent(txtMaSPNCC))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Title)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TableSP, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSLN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(txtdcNCC)
                            .addComponent(Jlabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaSPNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TableSP, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLNActionPerformed

    private void tblNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCCMouseClicked
        int SelectedRow = tblNCC.getSelectedRow();
        if (SelectedRow >= 0) {
            String maNCC = (String) tblNCC.getValueAt(SelectedRow, 0);
            String maSPNCC = (String) tblNCC.getValueAt(SelectedRow, 5);
            for (NCC ncc : listNCC) {
                if (maNCC.equals(ncc.getMaNCC()) && maSPNCC.equalsIgnoreCase(ncc.getMaSP())) {
                    txtMaNCC.setText(ncc.getMaNCC());
                    txtTenNCC.setText(ncc.getTenNCC());
                    txtdcNCC.setText(ncc.getDiaChi());
                    txtSoDT.setText(ncc.getSoDT());
                    txtSLN.setText("" + ncc.getSoLuongNhap());
                    txtMaSPNCC.setText("" + ncc.getMaSP());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblNCCMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        StringBuilder sb = new StringBuilder();

        if (txtMaNCC.getText().equals("")) {
            sb.append("Mã nhà cung cấp không được để trống \n");
            txtMaNCC.setBackground(Color.gray);
        } else {
            txtMaNCC.setBackground(Color.white);
        }

        if (txtTenNCC.getText().equals("")) {
            sb.append("Tên nhà cung cấp không được để trống \n");
            txtTenNCC.setBackground(Color.gray);
        } else {
            txtTenNCC.setBackground(Color.white);
        }

        if (txtdcNCC.getText().equals("")) {
            sb.append("Địa chỉ nhà cung cấp không được để trống \n");
            txtdcNCC.setBackground(Color.gray);
        } else {
            txtdcNCC.setBackground(Color.white);
        }

        if (txtSoDT.getText().equals("")) {
            sb.append("Số điện thoại nhà cung cấp không được để trống \n");
            txtSoDT.setBackground(Color.gray);
        } else  {
            String soDT = txtSoDT.getText().trim();
            if (!soDT.matches("\\d{10}")) {
                sb.append("Số điện thoại phải là 10 chữ số. Vui lòng nhập lại \n");
                txtSoDT.setBackground(Color.gray);
            } else {
                txtSoDT.setBackground(Color.white);
            }
        }

        if (txtSLN.getText().equals("")) {
            sb.append("Số Lượng nhập không được để trống \n");
            txtSLN.setBackground(Color.gray);
        } else {
            txtSLN.setBackground(Color.white);
        }

        if (txtMaSPNCC.getText().equals("")) {
            sb.append("Mã sản phẩm nhập không được để trống \n");
            txtMaSPNCC.setBackground(Color.gray);
        } else {
            txtMaSPNCC.setBackground(Color.white);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int flag = -1;
        for (NCC o : listNCC) {
            if (o.getMaNCC().equalsIgnoreCase(txtMaNCC.getText()) || o.getTenNCC().equalsIgnoreCase(txtTenNCC.getText())) {
                flag = 0;
                break;
            } else if (!dieukienSLN(txtSLN.getText())) {
                flag = 1;
                break;
            } else if (!dieukienSLN(txtSLN.getText())) {
                flag = 1;
                break;
            } else if (tongMaSP(txtMaSPNCC.getText()) == listSP.size()) {
                flag = 2;
                break;
            }
        }

        if (flag == -1) {
            NCC a = new NCC();
            a.setMaNCC(txtMaNCC.getText());
            a.setTenNCC(txtTenNCC.getText());
            a.setDiaChi(txtdcNCC.getText());
            a.setSoDT(txtSoDT.getText());
            a.setSoLuongNhap(Integer.parseInt(txtSLN.getText()));
            a.setMaSP(txtMaSPNCC.getText());

            listNCC.add(a);
            fillTable();

            try {
                FileWriter fw = new FileWriter("CSDL\\NCC.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(a.toString());
                bw.newLine();
                bw.close();
                fw.close();
            } catch (IOException e) {
            }
        } else if (flag == 0) {
            JOptionPane.showMessageDialog(null, "Mã nhà cung cấp hoặc tên nhà cung cấp đã tồn tại");
        } else if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Số lượng nhập phải là số nguyên dương");
        } else if (flag == 2) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm này không hợp lệ ( mã sản phẩm phải trùng với các mã sản phẩm đã có )");
        }
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        StringBuilder sb = new StringBuilder();

        if (txtMaNCC.getText().equals("")) {
            sb.append("Mã nhà cung cấp không được để trống \n");
            txtMaNCC.setBackground(Color.gray);
        } else {
            txtMaNCC.setBackground(Color.white);
        }

        if (txtTenNCC.getText().equals("")) {
            sb.append("Tên nhà cung cấp không được để trống \n");
            txtTenNCC.setBackground(Color.gray);
        } else {
            txtTenNCC.setBackground(Color.white);
        }

        if (txtdcNCC.getText().equals("")) {
            sb.append("Địa chỉ nhà cung cấp không được để trống \n");
            txtdcNCC.setBackground(Color.gray);
        } else {
            txtdcNCC.setBackground(Color.white);
        }

        if (txtSoDT.getText().equals("")) {
            sb.append("Số điện thoại nhà cung cấp không được để trống \n");
            txtSoDT.setBackground(Color.gray);
        } else {
            String soDT = txtSoDT.getText().trim();
            if (!soDT.matches("\\d{10}")) {
                sb.append("Số điện thoại phải là 10 chữ số. Vui lòng nhập lại \n");
                txtSoDT.setBackground(Color.gray);
            } else {
                txtSoDT.setBackground(Color.white);
            }
        }

        if (txtSLN.getText().equals("")) {
            sb.append("Số Lượng nhập không được để trống \n");
            txtSLN.setBackground(Color.gray);
        } else {
            txtSLN.setBackground(Color.white);
        }

        if (txtMaSPNCC.getText().equals("")) {
            sb.append("Mã sản phẩm nhập không được để trống \n");
            txtMaSPNCC.setBackground(Color.gray);
        } else {
            txtMaSPNCC.setBackground(Color.white);
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
        for (NCC ncc : listNCC) {
            if (ncc.getMaNCC().equals(txtMaNCC.getText())) {
                ncc.setTenNCC(txtTenNCC.getText());
                ncc.setDiaChi(txtdcNCC.getText());
                ncc.setSoDT(txtSoDT.getText());
                ncc.setSoLuongNhap(Integer.parseInt(txtSLN.getText()));
                ncc.setMaSP(txtMaSPNCC.getText());
                // ghi phan tu sua doi vao file
                try {
                    // mo file database
                    BufferedReader reader = new BufferedReader(new FileReader("CSDL\\NCC.txt"));
                    // tao 1 mang de luu cac doi tuong trong database
                    ArrayList<String> lines = new ArrayList<>();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
                    }
                    // sua phan tu can thay doi
                    for (int i = 0; i < lines.size(); i++) {
                        String[] parts = lines.get(i).split(",");
                        if (parts[0].equalsIgnoreCase(txtMaNCC.getText())) {
                            parts[1] = txtTenNCC.getText();
                            parts[2] = txtdcNCC.getText();
                            parts[3] = txtSoDT.getText();
                            parts[4] = txtSLN.getText();
                            parts[5] = txtMaSPNCC.getText();

                            String newLine = String.join(",", parts);
                            lines.set(i, newLine);
                            break; // thoat sau khi sua
                        }
                    }
                    // tao doi tuong de ghi lai vao database
                    BufferedWriter writer = new BufferedWriter(new FileWriter("CSDL\\NCC.txt"));
                    for (String newLine : lines) {
                        writer.write(newLine);
                        writer.newLine();
                    }
                    reader.close();
                    writer.close();
                } catch (IOException e) {
                }

                break;
            }
        }

        fillTable();
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        StringBuilder sb = new StringBuilder();

        if (txtMaNCC.getText().equals("")) {
            sb.append("Mã nhà cung cấp không được để trống \n");
            txtMaNCC.setBackground(Color.gray);
        } else {
            txtMaNCC.setBackground(Color.white);
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá nhà cung cấp không? ", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }

        // neu chon khong thi tu doan nay se khong thuc hien
        for (NCC o : listNCC) {
            if (o.getMaNCC().equalsIgnoreCase(txtMaNCC.getText())) {
                listNCC.remove(o);
                break;
            }
        }
        // ghi lai file sau khi xoa san pham
        try {
            FileWriter fw = new FileWriter("CSDL\\NCC.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (NCC o : listNCC) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        fillTable();
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtdcNCC.setText("");
        txtSoDT.setText("");
        txtSLN.setText("");
        txtMaSPNCC.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtMaSPNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPNCCActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuForm menuform = new MenuForm();
        menuform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDTActionPerformed
        // TODO add your handling code here:
        String soDT = txtSoDT.getText().trim();
        if (soDT.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại hợp lệ.");
        } else {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ. Vui lòng nhập lại (10 chữ số).");
            txtSoDT.setText("");
            txtSoDT.requestFocus();
        }
    }//GEN-LAST:event_txtSoDTActionPerformed

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
            java.util.logging.Logger.getLogger(QLyNCCForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLyNCCForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLyNCCForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLyNCCForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QLyNCCForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel6;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtMaSPNCC;
    private javax.swing.JTextField txtSLN;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtdcNCC;
    // End of variables declaration//GEN-END:variables
}
