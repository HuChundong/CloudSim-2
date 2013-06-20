
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;


public class myCloudlet extends Cloudlet {
	
	private double waitTime;
	private double submitTime;
	
	public myCloudlet(
			int cloudletId, 
			long cloudletLength, 
			int pesNumber, 
			long cloudletFileSize, 
			long cloudletOutputSize,
			UtilizationModel utilizationModelCpu,
			UtilizationModel utilizationModelRam, 
			UtilizationModel utilizationModelBw){
		super(pesNumber, cloudletOutputSize, pesNumber, cloudletOutputSize, cloudletOutputSize, null, null, null);
		
		waitTime = 0;
	}
	
	public double getWaitTime(){
		return waitTime;
	}


}
