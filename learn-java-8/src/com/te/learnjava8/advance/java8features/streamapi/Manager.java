package com.te.learnjava8.advance.java8features.streamapi;

import java.time.LocalDate;

public class Manager {
	private String mId;
	private String mName;
	private int mAge;
	private LocalDate mDataOfJoining;
	private double mSalary;

	public Manager() {
		super();
	}

	public Manager(String mId, String mName, int mAge, LocalDate mDataOfJoining, double mSalary) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mAge = mAge;
		this.mDataOfJoining = mDataOfJoining;
		this.mSalary = mSalary;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public LocalDate getmDataOfJoining() {
		return mDataOfJoining;
	}

	public void setmDataOfJoining(LocalDate mDataOfJoining) {
		this.mDataOfJoining = mDataOfJoining;
	}

	public double getmSalary() {
		return mSalary;
	}

	public void setmSalary(double mSalary) {
		this.mSalary = mSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mAge;
		result = prime * result + ((mDataOfJoining == null) ? 0 : mDataOfJoining.hashCode());
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		long tm;
		tm = Double.doubleToLongBits(mSalary);
		result = prime * result + (int) (tm ^ (tm >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (mAge != other.mAge)
			return false;
		if (mDataOfJoining == null) {
			if (other.mDataOfJoining != null)
				return false;
		} else if (!mDataOfJoining.equals(other.mDataOfJoining))
			return false;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (Double.doubleToLongBits(mSalary) != Double.doubleToLongBits(other.mSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", mName=" + mName + ", mAge=" + mAge + ", mDataOfJoining="
				+ mDataOfJoining + ", mSalary=" + mSalary + "]";
	}

}
