import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle {
	
	private double radius;
	public double getCircumference;
	private String getFormattedCircumference;
	public double getArea;
	private String getFormattedArea;
	
	public static int Counter = 0;
	
	public Circle (double radius){
		Counter++;
		this.radius = radius;
	}
	
	public double getCircumference(){
		getCircumference = 2 * Math.PI * radius;
		return getCircumference;
	}
	
	public String getFormattedCircumference(){
		getFormattedCircumference = formatNumber(getCircumference());
		return getFormattedCircumference;
	}
	
	public double getArea(){
		getArea = Math.PI * Math.pow(radius, 2);
		return getArea;
	}
	
	public String getFormattedArea(){
		getFormattedArea = formatNumber(getArea());
		return getFormattedArea;
	}
	
	private String formatNumber(double number){
		DecimalFormat f = new DecimalFormat("#.00");
		f.setRoundingMode(RoundingMode.HALF_EVEN);
		return f.format(number);
	}
	
	
	
}
