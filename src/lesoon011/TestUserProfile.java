package lesoon011;

public class TestUserProfile {

	public static void main(String[] args) {

		UserProfile profile1 = new UserProfile();
		profile1.name = "Berresu";
		profile1.surname = "Gulsecgin";
		profile1.usarname = "Berre";
		profile1.followers = 224;
		profile1.following = 200;
		profile1.postCount = 120;

		System.out.println(profile1.name);
		System.out.println(profile1.surname);
		System.out.println(profile1.usarname);
		System.out.println(profile1.followers);
		System.out.println(profile1.following);

		profile1.editProfile();
		profile1.createPost();
		profile1.addFriend();
		profile1.getInformation();

		System.out.println(profile1);

		UserProfile profile2 = new UserProfile();
		profile2.name = "Berresu";
		profile2.surname = "Gulsecgin";
		profile2.usarname = "Berre";
		profile2.followers = 224;
		profile2.following = 200;
		profile2.postCount = 120;
		System.out.println(profile2);
		
		UserProfile profile3 = new UserProfile();
		
		profile3=profile2;
		System.out.println(profile3);
		
		profile3.postCount=800;
		System.out.println(profile2.postCount);

	}

}
