package lesson28.Solid.OpenClosed;

public abstract class SocialMedia {

	private int scaleRatio;

	public abstract void changeScaleRatio(String type);

	public SocialMedia() {

	}

	public static void sendEmail(String email) {
		System.out.println(email + " meiline gönderiliyor...");
	}

	public static void sendSms(String sms) {
		System.out.println(sms + " telefonuna sms gönderiliyor...");
	}

	public int getScaleRatio() {
		return scaleRatio;
	}

	public void setScaleRatio(int scaleRatio) {
		this.scaleRatio = scaleRatio;
	}

}
