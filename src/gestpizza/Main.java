
package gestpizza;


import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.net.*;
import javax.swing.*;

import java.io.*;
import java.util.*;

public class Main extends javax.swing.JFrame {

    String  targetURL = "http://localhost:8080/GestPren"; //cambiare indirizzo con quello 
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnElenco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstElenco = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnElimina = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnAggiungi = new javax.swing.JButton();
        btnAggiorna = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnElenco.setBackground(new java.awt.Color(80, 139, 191));
        btnElenco.setForeground(new java.awt.Color(200, 200, 200));
        btnElenco.setText("Elenco prenotazioni");
        btnElenco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElencoActionPerformed(evt);
            }
        });

        lstElenco.setBackground(new java.awt.Color(80, 139, 191));
        lstElenco.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstElencoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstElenco);

        jPanel1.setBackground(new java.awt.Color(80, 139, 191));

        jLabel1.setFont(new java.awt.Font("Caladea", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 200, 200));
        jLabel1.setText("Gestione Prenotazioni");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(80, 139, 191));

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Caladea", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 200, 200));
        jLabel3.setText("Numero Prenotazione:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Caladea", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setText("Nominativo:");

        jLabel5.setFont(new java.awt.Font("Caladea", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setText("Data:");

        txtNome.setPreferredSize(new java.awt.Dimension(80, 26));

        btnAggiungi.setText("Aggiungi");
        btnAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiActionPerformed(evt);
            }
        });

        btnAggiorna.setText("Aggiorna");
        btnAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Caladea", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 200, 200));
        jLabel7.setText("Editor Prenotazioni");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Caladea", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 200, 200));
        jLabel6.setText("Ora:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAggiungi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnAggiorna)
                        .addGap(29, 29, 29)
                        .addComponent(btnElimina))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(txtData)
                            .addComponent(txtOra))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAggiungi)
                    .addComponent(btnAggiorna)
                    .addComponent(btnElimina))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnElenco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnElenco)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElencoActionPerformed

        try{
            URL restServiceURL = new URL(targetURL);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Accept", "application/json");
            if (httpConnection.getResponseCode()!=200) {
                throw new RuntimeException("HTTP GET Request faild with Error Code:" + httpConnection.getResponseCode());
            }
            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            String output="";
            String jsondata="";
            while( (output = responseBuffer.readLine()) != null) {
                jsondata += output;
            }
            httpConnection.disconnect();
            lstElenco.setModel(parseJsonToListModel(jsondata));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
               
    }//GEN-LAST:event_btnElencoActionPerformed

    private void lstElencoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstElencoValueChanged

            String pizza = lstElenco.getSelectedValue();
            StringTokenizer st = new StringTokenizer(pizza);
            String id = st.nextToken();
            String nome = st.nextToken();
            this.txtId.setText(id);
            this.txtData.setText("");
            this.txtOra.setText("");
            this.txtNome.setText(nome);     
    }//GEN-LAST:event_lstElencoValueChanged

    private void btnAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaActionPerformed

             ObjectMapper mapper = new ObjectMapper();
             ObjectNode p = mapper.createObjectNode();
            p.put("prezzo", this.txtData.getText());
            try {
            URL restServiceURL = new URL(targetURL+"/"+this.txtId.getText());
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("PUT");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            String input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p);

		OutputStream os = httpConnection.getOutputStream();
		os.write(input.getBytes());
		os.flush();
            if (httpConnection.getResponseCode() != 204) {
                throw new RuntimeException("HTTP POST Request Failed with Error code : "
                        + httpConnection.getResponseCode());
            }
            httpConnection.disconnect();
            JOptionPane.showMessageDialog(this,"Prezzo aggiornato. Ricaricare i dati,");
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e.getMessage());
          }
            
    }//GEN-LAST:event_btnAggiornaActionPerformed

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiActionPerformed

             ObjectMapper mapper = new ObjectMapper();
             ObjectNode p = mapper.createObjectNode();
            p.put("id",this.txtId.getText());
            p.put("nome",this.txtNome.getText());
            p.put("data", this.txtData.getText());
            p.put("ora", this.txtOra.getText());
            try {
            URL restServiceURL = new URL(targetURL);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            String input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p);

		OutputStream os = httpConnection.getOutputStream();
		os.write(input.getBytes());
		os.flush();
            if (httpConnection.getResponseCode() != 201) {
                throw new RuntimeException("HTTP POST Request Failed with Error code : "
                        + httpConnection.getResponseCode());
            }
            httpConnection.disconnect();
            JOptionPane.showMessageDialog(this,"Pizza aggiunta. Ricaricare i dati,");
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e.getMessage());
          }
            
    }//GEN-LAST:event_btnAggiungiActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed

        try {
            String pizza = lstElenco.getSelectedValue();
            StringTokenizer st = new StringTokenizer(pizza);
            String id = st.nextToken();
            URL restServiceURL = new URL(targetURL+"/"+id);
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod("DELETE");
            if (httpConnection.getResponseCode() != 204) {
                throw new RuntimeException("HTTP DELETE Request Failed with Error code : "
                        + httpConnection.getResponseCode());
            }
            httpConnection.disconnect();
            JOptionPane.showMessageDialog(this, "La prenotazione"
                    + "La prenotazione è stata eliminata.");
               }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private DefaultListModel parseJsonToListModel(String jsondata)
    {
            // Elabora oggetto JSON e restituisce i dati per l'elenco
           DefaultListModel listModel = new DefaultListModel();
          
           ObjectMapper parser = new ObjectMapper();
        
        try {
                JsonNode jsonObject = parser.readValue(jsondata, JsonNode.class);
                ArrayNode listaPrenotazioni = (ArrayNode) jsonObject.get("prenotazioni");;
               				
                JsonNode Prenotazioni;
                String nome;
                long id;
                for(int i=0; i<listaPrenotazioni.size(); i++){
                    Prenotazioni = (JsonNode) listaPrenotazioni.get(i);
                    nome = (String) Prenotazioni.get("nome").asText();;
                    id = (long) Prenotazioni.get("id").asInt();
                    listModel.addElement(id + " " + nome);
                }	
           }
           catch (Exception e)
           {
           }
           return listModel;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiorna;
    private javax.swing.JButton btnAggiungi;
    private javax.swing.JButton btnElenco;
    private javax.swing.JButton btnElimina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstElenco;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOra;
    // End of variables declaration//GEN-END:variables
}
