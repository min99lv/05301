package ch08_ex01;

public interface Lenderable {
	int BORROW = 1;
	int NORMAL = 0;

	void checkOut(String borrower, String date);

	void checkin();

}

class SeperateVolume implements Lenderable {
	String title;
	String date;
	String borrower;
	int status;

	SeperateVolume(String title) {
		this.title = title;
	}

	public void checkOut(String borrower, String date) {
		if (status != NORMAL)
			return;
		this.date = date;
		this.borrower = borrower;
		status = BORROW;
		System.out.println(borrower + date + title);
	}

	@Override
	public void checkin() {
		if (status != BORROW)
			return;
		System.out.println(borrower + title);
		date = null;
		title = null;
		borrower = null;
		status = NORMAL;
	}
}
