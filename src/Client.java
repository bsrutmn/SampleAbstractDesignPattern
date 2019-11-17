
public class Client {

	public void doSomeClientJob(String model) {
		Tire tire = FactoryMaker.getFactory(model).makeTire();
		System.out.println(tire.getTireModel());
		HeadLight headLight = FactoryMaker.getFactory(model).makeHeadLight();
		System.out.println(headLight.getHeadLightModel());
	}
	
}
