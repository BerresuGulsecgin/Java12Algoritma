package lesson28.Solid.OpenClosed;

public class Instagram extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equals("png")) {
			setScaleRatio(38);
		} else if (type.equals("jpeg")) {
			setScaleRatio(30);
		} else {
			setScaleRatio(40);
		}

	}

	/*
	 * Instagram vardı FaceBook ile anlaştığını varsay
	 */

//	private int scaleRatio;
//
//	public Instagram(int scaleRatio) {
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

}
