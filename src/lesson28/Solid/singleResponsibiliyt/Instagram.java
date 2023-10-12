package lesson28.Solid.singleResponsibiliyt;

import lesson28.Solid.Util.Notification;
import lesson28.Solid.Util.User;

public class Instagram {
	
	//Single Responsibilty

	public void sendNotification(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
		if (user.getEmail() != null) {
			Notification.sendSms(user.getEmail());
		}
	}

	public void sendEmail(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	public void sendSms(User user) {
		if (user.getPhone() != null) {
			Notification.sendSms(user.getEmail());
		}
	}
}
