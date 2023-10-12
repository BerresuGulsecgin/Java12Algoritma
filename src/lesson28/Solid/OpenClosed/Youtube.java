package lesson28.Solid.OpenClosed;

public class Youtube extends SocialMedia {

	

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
