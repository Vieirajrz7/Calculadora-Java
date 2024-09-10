/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 23012
 */
public class ScreenCalculator extends javax.swing.JFrame {

    double firstNumber = 0;
    double secondNumber;
    double result;
    String operation;
    double memoryReturn;

    /**
     * Creates new form ScreenCalculator
     */
    public ScreenCalculator() {
        initComponents();
        
        List<JButton> buttons = getButtons(getContentPane());
        for (JButton button : buttons)
        
        displayScreen.setFont(new Font("Arial", Font.PLAIN, 30));
    }

    public List<JButton> getButtons(Container container) {
        List<JButton> buttons = new ArrayList<>();
        Component[] components = container.getComponents();
        
        for (Component component : components) {
                if(component instanceof JButton) {
                    buttons.add((JButton) component);
            }
        }
     return buttons;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        displayScreen = new javax.swing.JTextField();
        buttonMemoryClear = new javax.swing.JButton();
        butttonMSum = new javax.swing.JButton();
        buttonMLess = new javax.swing.JButton();
        buttonMR = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonMoreLess = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonMulti = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonLess = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonSum = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();
        buttonPoint = new javax.swing.JButton();
        buttonZero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        displayScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonMemoryClear.setBackground(new java.awt.Color(94, 92, 92));
        buttonMemoryClear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonMemoryClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonMemoryClear.setText("MC");
        buttonMemoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMemoryClearActionPerformed(evt);
            }
        });

        butttonMSum.setBackground(new java.awt.Color(94, 92, 92));
        butttonMSum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butttonMSum.setForeground(new java.awt.Color(255, 255, 255));
        butttonMSum.setText("M+");
        butttonMSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonMSumActionPerformed(evt);
            }
        });

        buttonMLess.setBackground(new java.awt.Color(94, 92, 92));
        buttonMLess.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonMLess.setForeground(new java.awt.Color(255, 255, 255));
        buttonMLess.setText("M-");
        buttonMLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMLessActionPerformed(evt);
            }
        });

        buttonMR.setBackground(new java.awt.Color(94, 92, 92));
        buttonMR.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonMR.setForeground(new java.awt.Color(255, 255, 255));
        buttonMR.setText("MR");
        buttonMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMRActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(181, 176, 176));
        buttonClear.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("C");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonMoreLess.setBackground(new java.awt.Color(247, 150, 5));
        buttonMoreLess.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonMoreLess.setText("+/-");
        buttonMoreLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoreLessActionPerformed(evt);
            }
        });

        buttonDiv.setBackground(new java.awt.Color(247, 150, 5));
        buttonDiv.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonDiv.setText("/");
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });

        buttonMulti.setBackground(new java.awt.Color(247, 150, 5));
        buttonMulti.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        buttonMulti.setText("*");
        buttonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiActionPerformed(evt);
            }
        });

        buttonSeven.setBackground(new java.awt.Color(33, 32, 32));
        buttonSeven.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonSeven.setForeground(new java.awt.Color(255, 255, 255));
        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonNine.setBackground(new java.awt.Color(33, 32, 32));
        buttonNine.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonNine.setForeground(new java.awt.Color(255, 255, 255));
        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonLess.setBackground(new java.awt.Color(247, 150, 5));
        buttonLess.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        buttonLess.setText("-");
        buttonLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLessActionPerformed(evt);
            }
        });

        buttonEight.setBackground(new java.awt.Color(33, 32, 32));
        buttonEight.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonEight.setForeground(new java.awt.Color(255, 255, 255));
        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonFour.setBackground(new java.awt.Color(33, 32, 32));
        buttonFour.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonFour.setForeground(new java.awt.Color(255, 255, 255));
        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonFive.setBackground(new java.awt.Color(33, 32, 32));
        buttonFive.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonFive.setForeground(new java.awt.Color(255, 255, 255));
        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonSum.setBackground(new java.awt.Color(247, 150, 5));
        buttonSum.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonSum.setText("+");
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }
        });

        buttonSix.setBackground(new java.awt.Color(33, 32, 32));
        buttonSix.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonSix.setForeground(new java.awt.Color(255, 255, 255));
        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonTwo.setBackground(new java.awt.Color(33, 32, 32));
        buttonTwo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonTwo.setForeground(new java.awt.Color(255, 255, 255));
        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonThree.setBackground(new java.awt.Color(33, 32, 32));
        buttonThree.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonThree.setForeground(new java.awt.Color(255, 255, 255));
        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonOne.setBackground(new java.awt.Color(33, 32, 32));
        buttonOne.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonOne.setForeground(new java.awt.Color(255, 255, 255));
        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonEquals.setBackground(new java.awt.Color(247, 150, 5));
        buttonEquals.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        buttonEquals.setText("=");
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });

        buttonPoint.setBackground(new java.awt.Color(33, 32, 32));
        buttonPoint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonPoint.setForeground(new java.awt.Color(255, 255, 255));
        buttonPoint.setText(".");
        buttonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPointActionPerformed(evt);
            }
        });

        buttonZero.setBackground(new java.awt.Color(33, 32, 32));
        buttonZero.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonZero.setForeground(new java.awt.Color(255, 255, 255));
        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Produced by Marcelo Gonçalves");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayScreen)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMemoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butttonMSum, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMLess, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMR, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMoreLess, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMemoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butttonMSum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMLess, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMR, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMoreLess, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonZero.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonZeroActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonThree.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonOne.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonTwo.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonFour.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonFive.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonSix.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonSeven.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonEight.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonNine.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPointActionPerformed
        // TODO add your handling code here:
        String input;
        input = displayScreen.getText() + buttonPoint.getText();
        displayScreen.setText(input);
    }//GEN-LAST:event_buttonPointActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        displayScreen.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumActionPerformed
        if (displayScreen.getText().equals("")) {

        } else {
            firstNumber = Double.parseDouble(displayScreen.getText());
            System.out.println("rodou");
            displayScreen.setText("");
            operation = "+";

        }

    }//GEN-LAST:event_buttonSumActionPerformed

    private void buttonLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLessActionPerformed
        if (displayScreen.getText().equals("")) {

        } else {
            firstNumber = Double.parseDouble(displayScreen.getText());
            displayScreen.setText("");
            operation = "-";

        }
    }//GEN-LAST:event_buttonLessActionPerformed

    private void buttonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiActionPerformed
        if (displayScreen.getText().equals("")) {

        } else {
            firstNumber = Double.parseDouble(displayScreen.getText());
            displayScreen.setText("");
            operation = "*";
        }
    }//GEN-LAST:event_buttonMultiActionPerformed

    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
        if (displayScreen.getText().equals("")) {
        } else {
            firstNumber = Double.parseDouble(displayScreen.getText());
            displayScreen.setText("");
            operation = "/";

        }
    }//GEN-LAST:event_buttonDivActionPerformed

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        if (operation != null) {

            String resultFormated;
            secondNumber = Double.parseDouble(displayScreen.getText());
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    firstNumber = 0;
                    secondNumber = 0;
                    resultFormated = String.format("%.2f", result);
                    displayScreen.setText(resultFormated);
                    memoryReturn = result;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    resultFormated = String.format("%.2f", result);
                    displayScreen.setText(resultFormated);
                    memoryReturn = result;
                    break;

                case "/":
                    if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    resultFormated = String.format("%.4f", result);
                    displayScreen.setText(resultFormated);
                    break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Divisão por zero não é permitido");
                    }
                    

                case "*":
                    result = firstNumber * secondNumber;
                    resultFormated = String.format("%.2f", result);
                    displayScreen.setText(resultFormated);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_buttonEqualsActionPerformed

    private void buttonMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMRActionPerformed
        displayScreen.setText("" + memoryReturn);
    }//GEN-LAST:event_buttonMRActionPerformed

    private void buttonMoreLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoreLessActionPerformed
        double resultFormated = Double.parseDouble(String.valueOf(displayScreen.getText()));
        resultFormated = resultFormated * (-1);
        displayScreen.setText(String.valueOf(resultFormated));
    }//GEN-LAST:event_buttonMoreLessActionPerformed

    private void buttonMemoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMemoryClearActionPerformed
        memoryReturn = 0;
        displayScreen.setText("");
    }//GEN-LAST:event_buttonMemoryClearActionPerformed

    private void butttonMSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonMSumActionPerformed
        double memoryResult;
        String resultFormated;
        double memoryMore = Double.parseDouble(displayScreen.getText());
        memoryResult = memoryReturn + memoryMore;
        resultFormated = String.format("%2.f", memoryResult);
        displayScreen.setText(resultFormated);
        memoryReturn = memoryResult;
        
    }//GEN-LAST:event_butttonMSumActionPerformed

    private void buttonMLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMLessActionPerformed
        double memoryResult;
        String resultFormated;
        double memoryMore = Double.parseDouble(displayScreen.getText());
        memoryResult = memoryReturn - memoryMore;
        resultFormated = String.format("%2.f", memoryResult);
        displayScreen.setText(resultFormated);
        memoryReturn = memoryResult;
    }//GEN-LAST:event_buttonMLessActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEquals;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonLess;
    private javax.swing.JButton buttonMLess;
    private javax.swing.JButton buttonMR;
    private javax.swing.JButton buttonMemoryClear;
    private javax.swing.JButton buttonMoreLess;
    private javax.swing.JButton buttonMulti;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonPoint;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonSum;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton buttonZero;
    private javax.swing.JButton butttonMSum;
    private javax.swing.JTextField displayScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
