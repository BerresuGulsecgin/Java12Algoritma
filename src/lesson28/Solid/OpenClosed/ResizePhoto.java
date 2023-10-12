package lesson28.Solid.OpenClosed;

public class ResizePhoto {

	public void changeScaleRatio(Instagram instagram, String type) {
		if (type.equals("png")) {
			instagram.setScaleRatio(38);
		} else if (type.equals("jpeg")) {
			instagram.setScaleRatio(30);
		} else {
			instagram.setScaleRatio(40);
		}
	}

	// her yeni uygulamada metodu tekrar etmen gerkir
	public void changeScaleRatio(FaceBook faceBook, String type) {
		if (type.equals("png")) {
			faceBook.setScaleRatio(25);
		} else if (type.equals("jpeg")) {
			faceBook.setScaleRatio(45);
		} else {
			faceBook.setScaleRatio(50);
		}
	}

	public void changeScaleRatio(SocialMedia socialMedia, String type) {
		if (socialMedia instanceof Instagram) {
			if (type.equals("png")) {
				socialMedia.setScaleRatio(38);
			} else if (type.equals("jpeg")) {
				socialMedia.setScaleRatio(30);
			} else {
				socialMedia.setScaleRatio(40);
			}
		}

		if (socialMedia instanceof FaceBook) {
			if (type.equals("png")) {
				socialMedia.setScaleRatio(25);
			} else if (type.equals("jpeg")) {
				socialMedia.setScaleRatio(45);
			} else {
				socialMedia.setScaleRatio(50);
			}
		}
		if (socialMedia instanceof Twitter) {
			if (type.equals("png")) {
				socialMedia.setScaleRatio(77);
			} else if (type.equals("jpeg")) {
				socialMedia.setScaleRatio(33);
			} else {
				socialMedia.setScaleRatio(60);
			}
		}

	}

	public void resize(SocialMedia socialMedia, String type) {

		socialMedia.changeScaleRatio(type);

	}

}
