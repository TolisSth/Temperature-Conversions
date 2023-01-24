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

public class UserInterface extends JFrame {
    public UserInterface(){
        //setting up the necessary conditions for the app to work
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(480, 480));
        setMaximumSize(new Dimension(480, 480));
        setTitle("Temperature Conversion");

        //creating the JPanel
        JPanel panel = new JPanel();

        //aesthetic settings
        Font bigFont = new Font("Sans Serif", Font.BOLD, 20);
        panel.setBackground(Color.DARK_GRAY);

        //content of the app
        JLabel titleOfTheApp = new JLabel("Welcome to the Apostolos's Temperature conversion app");
        titleOfTheApp.setForeground(Color.white);

        //Components to be added & fonts to be applied
        add(titleOfTheApp, BorderLayout.CENTER);
        titleOfTheApp.setFont(bigFont);
        //settings that make the window visible (the JFrame to be exact)
        setVisible(true);
        add(panel);
        pack();
    }
}