package ch07_ex02;

import ch07_ex03.Carculator;

//hw
public class CarculatorEx {

	public static void main(String[] args) {
		Carculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1"result1);
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x,y)
		System.out.println("result2"+result);
		
		myCalc.powerOff();

		}

	}

//
//전원을 켭니다.
//result1: 11
//result2: 2.5
//전원을 끕니다