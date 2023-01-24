//Copyright 2023 Apostolos Halis <tolishalis@gmail.com>
//Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
//documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
//rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
//permit persons to whom the Software is furnished to do so, subject to the following conditions:
//The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
//COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
// OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    private String toConvertOption;
    private String convertedOption;
    private double conv1;
    private double conv2;
    private String availableConversions[] = {"Celcius", "Fahrenheit", "Kelvin"};

    public UserInterface(){
        //setting up the necessary conditions for the app to work
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200, 600));
        setTitle("Temperature Conversion");

        //creating the JPanels
        JPanel titlePanel = new JPanel();
        JPanel optionsPanel = new JPanel();
        JPanel textfieldsPanel = new JPanel();
        textfieldsPanel.setLayout(new GridLayout(2, 2, 50, 50));
        JPanel convertPanel = new JPanel();

        //initializing the objects that will consist the content of the app
        JLabel titleOfTheApp = new JLabel("Welcome to the Apostolos's Temperature conversion app",JLabel.CENTER);
        JTextField toBeConverted = new JTextField(1);
        JTextField converted = new JTextField(1);
        JButton conversionButton = new JButton("Convert");
        JComboBox options1 = new JComboBox(availableConversions);
        JComboBox options2 = new JComboBox(availableConversions);

        //aesthetic settings
        Font bigFont = new Font("Sans Serif", Font.BOLD, 20);
        Font largeFont = new Font("Sans Serif", Font.BOLD, 100);
        titlePanel.setBackground(Color.DARK_GRAY);
        textfieldsPanel.setBackground(Color.DARK_GRAY);
        convertPanel.setBackground(Color.DARK_GRAY);
        titleOfTheApp.setFont(bigFont);
        titleOfTheApp.setForeground(Color.white);
        toBeConverted.setFont(largeFont);
        converted.setFont(largeFont);
        optionsPanel.setBackground(Color.GRAY);

        //Components to be added
        titlePanel.add(titleOfTheApp,JLabel.CENTER);
        textfieldsPanel.add(toBeConverted);
        textfieldsPanel.add(converted);
        optionsPanel.add(options1);
        optionsPanel.add(options2);
        convertPanel.add(conversionButton);

        //adding event listeners
       conversionButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               //getting what type of conversion do we want from the textfields
                toConvertOption = options1.getItemAt(options1.getSelectedIndex()).toString();
                convertedOption = options2.getItemAt(options2.getSelectedIndex()).toString();

                //getting the values of the prices that we want to convert
                conv1 = Double.parseDouble(toBeConverted.getText());

                //doing this so I don't have to check two thing in the if statement
                String joinedConversions = toConvertOption + convertedOption;

               if(joinedConversions.equals("CelciusFahrenheit")){
                  Conversions conversion = new Conversions(conv1, 0.0, 0.0);
                  double result = conversion.celciusToFahrenheit();
                  converted.setText(Double.toString(result));
               } else if (joinedConversions.equals("CelciusKelvin")) {
                   Conversions conversion = new Conversions(conv1, 0,0);
                   double result = conversion.celciusToKelvin();
                   converted.setText(Double.toString(result));
               } else if (joinedConversions.equals("FahrenheitCelcius")) {
                   Conversions conversion = new Conversions(0, conv1,0);
                   double result = conversion.fahrenheitToCelcius();
                   converted.setText(Double.toString(result));
                }else if (joinedConversions.equals("FahrenheitKelvin")){
                   Conversions conversions = new Conversions(0, conv1, 0);
                   double result = conversions.fahrenheitToKelvin();
                   converted.setText(Double.toString(result));
               } else if (joinedConversions.equals("KelvinCelcius")) {
                    Conversions conversions = new Conversions(0, 0, conv1);
                    double result = conversions.kelvinToCelcius();
                    converted.setText(Double.toString(result));
               } else if (joinedConversions.equals("KelvinFahrenheit")) {
                    Conversions conversions = new Conversions(0, 0, conv1);
                    double result = conversions.kelvinToFahrenheit();
                    converted.setText(Double.toString(result));
               }
           }});

        //settings that make the window visible (the JFrame to be exact)
        setVisible(true);
        add(titlePanel,BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.WEST);
        add(textfieldsPanel, BorderLayout.CENTER);
        add(convertPanel, BorderLayout.SOUTH);
        pack();
    }
}