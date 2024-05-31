package ch08_robot;

import ch08_robot.actions.FireNo;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {

	public CheapRobot() {
	flyAction = new FlyNo();
	fireAction = new FireNo();
	knifeAction = new KnifeNo();
	}

	@Override
	public void Shape() {
		System.out.println("기본적으로 팔, 다리, 몸통, 존재. 그리고 걸을 수 있습니다.");
	}

}
