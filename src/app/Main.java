package app;



public class Main {
	public static void main(String[] args){
		Veiculo kawasakininja= new Veiculo(new MotorKawasakiNinja());
		Veiculo hornet= new Veiculo(new MotorHornet());
		System.out.println(hornet.acelerar());
		System.out.println(kawasakininja.acelerar());
		Veiculo harleydavidson= new Veiculo(new MotorHarleyDavidson());
		Veiculo yamahaxt= new Veiculo(new MotorYamahaxt());
		System.out.println(harleydavidson.acelerar());
		System.out.println(yamahaxt.acelerar());
	}
}