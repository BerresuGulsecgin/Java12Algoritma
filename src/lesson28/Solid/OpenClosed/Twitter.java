package lesson28.Solid.OpenClosed;

public class Twitter extends SocialMedia {

	

	@Override
	public void changeScaleRatio(String type) {
		if (type.equals("png")) {
			setScaleRatio(77);
		} else if (type.equals("jpeg")) {
			setScaleRatio(33);
		} else {
			setScaleRatio(60);
		}

	}

}
