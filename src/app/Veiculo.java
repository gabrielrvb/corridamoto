package app;

public class Veiculo {
	MotorI motor;
	
	Veiculo(MotorI m){
		this.motor= m;
	}
	public String acelerar() {
		return this.motor.acelerar();
	}
}