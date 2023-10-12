package lesson28.Solid.OpenClosed;

public class FaceBook extends SocialMedia{

	
//	private int scaleRatio;
//
//	public FaceBook(int scaleRatio) {
//		super();
//		this.scaleRatio = scaleRatio;
//	}
//
//	public int getScaleRatio() {
//		return scaleRatio;
//	}
//
//	public void setScaleRatio(int scaleRatio) {
//		this.scaleRatio = scaleRatio;
//	}

	@Override
	public void changeScaleRatio(String type) {
		if (type.equals("png")) {
			setScaleRatio(25);
		} else if (type.equals("jpeg")) {
			setScaleRatio(45);
		} else {
			setScaleRatio(50);
		}
		
	}
}
