import java.util.ArrayList;

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
public class Conversions {
    private double celcius;
    private double fahrenheit;
    private double kelvin;



    public double celciusToFahrenheit(){
       double result = (celcius * 9/5) + 32;
       return  result;
    }

    public double celciusToKelvin(){
        double result = celcius + 273.15;
        return result;
    }

    public double fahrenheitToCelcius(){
        double result = (fahrenheit - 32) * 5/9;
        return  result;
    }

    public double fahrenheitToKelvin(){
        //I am calling the fahrenheitToCeclius() and adding 273.15 because you first need to convert
        //fahrenheit to celcius and then add 273.15.
        double result = this.fahrenheitToCelcius() + 273.15;
        return result;
    }

    public double kelvinToCelcius(){
        double result = celcius - 273.15;
        return result;
    }

    public double kelvinToFahrenheit(){
        //You first will first convert kelvin to celcius, that's why I am using this method.
        double result = this.kelvinToCelcius() * 9/5 + 32;
        return result;
    }

    public Conversions(double c, double f, double k){
        celcius = c;
        fahrenheit = f;
        kelvin = k;
    }
}
